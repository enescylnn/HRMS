package HRMS.HRMS.business.concretes;

import java.util.List;

import HRMS.HRMS.business.abstracts.UserService;
import HRMS.HRMS.entities.concretes.User;

public class UserManager implements UserService {

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkMailCorrect(String mail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isVerified(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verificate(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
