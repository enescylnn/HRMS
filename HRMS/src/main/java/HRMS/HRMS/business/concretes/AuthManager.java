package HRMS.HRMS.business.concretes;

import HRMS.HRMS.business.abstracts.AuthService;
import HRMS.HRMS.business.abstracts.UserService;
import HRMS.HRMS.business.abstracts.VerificationService;
import HRMS.HRMS.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	private VerificationService verificationService;
	
	public AuthManager(UserService userservice, VerificationService verificationService) {
		
		this.userService = userservice;
		this.verificationService = verificationService;
	}
	
	@Override
	public boolean login(User user) {
		
		User userToCheck = this.userService.getByMail(user.getMail());
		if(userToCheck == null) {
			System.out.println("Registered user not found");
			return false;
		}if(!user.getPassword().equals(userToCheck.getPassword())) {
			System.out.println("Password is incorrect");
			return false;
		}if(user.getPassword() != user.getRePassword()) {
			System.out.println("Passwords do not match");
			return false;
		}
		System.out.println("Login successfull...");
		return true;
		
	}

	@Override
	public boolean register(User user) {
		
		if(!(this.userService.checkMailCorrect(user.getMail()) &&
				this.userService.getByMail(user.getMail()) == null)) {
			
			System.out.println("Login failed...");
			return false;
		}
		System.out.println("Mail sending...");
		if(!verificationService.verificate(user.getMail())) {
			System.out.println("Verification code is incorrect !");
			return false;
		}
		System.out.println("Your account has been approved and you registered.");
		this.userService.add(user);
		return true;
	}

}
