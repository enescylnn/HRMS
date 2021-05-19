package HRMS.HRMS.business.abstracts;

import HRMS.HRMS.entities.concretes.User;

public interface AuthService {
	
	boolean login(User user);
	boolean register(User user);
}
