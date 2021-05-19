package HRMS.HRMS.business.abstracts;

import java.util.List;

import HRMS.HRMS.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	
	List<User> getAll();
	
	boolean checkMailCorrect(String mail);
	User getByMail(String mail);
	boolean isVerified(User user);
	void verificate(User user);
	User get(int id);
}
