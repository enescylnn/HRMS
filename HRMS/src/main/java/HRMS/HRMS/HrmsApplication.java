package HRMS.HRMS;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import HRMS.HRMS.business.abstracts.UserService;
import HRMS.HRMS.business.concretes.AuthManager;
import HRMS.HRMS.business.concretes.UserManager;
import HRMS.HRMS.business.concretes.VerificationManager;
import HRMS.HRMS.core.services.VerificationMailSender;
import HRMS.HRMS.dataAccess.concretes.UserInMemoryDao;

@SpringBootApplication
public class HrmsApplication {
	
	static boolean loggedIn;
	static Scanner scan = new Scanner(System.in);
	static UserService userService = new UserManager();
	//static AuthManager authManager = new AuthManager(userService, new VerificationManager(new VerificationMailSender()));
		
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		SpringApplication.run(HrmsApplication.class, args);
		
		String mainMessage = "\t******  Welcome To Hrms  ******\n\n"+
				"1- Login\n"+
				"2- Register\n"+
				"3- Log out\n"+
				"0- Show main message\n\n"+
				"\t\tRequirements\n\n"+
				"E-mail address must be in the correct format ==> test@test.com\n";
		
		String loggedMessage = "\t******  Welcome To Hrms  ******\n\n"+
				"1- Delete my account\n"+
				"2- Log out\n"+
				"0- Show the message\n"+
				"***********************************";
		
		System.out.println(mainMessage);
	
		int key;
		while(true) {
			System.out.println("Please select action");
			key = scan.nextInt();
			switch (key) {
			case 1:
				login();
				break;
			case 2:
				register();
				break;
			case 3:
				return;
			case 0:
				System.out.println(mainMessage);
				break;
			default:
				System.out.println("Make the right choice");
				
				
			
			}
		}
	}

	private static void register() {
		// TODO Auto-generated method stub
		
	}

	private static void login() {
		// TODO Auto-generated method stub
		
	}

}
