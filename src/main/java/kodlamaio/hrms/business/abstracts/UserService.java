package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.User;

public interface UserService {
	List<User> getAll();
	User getById(int id);
	
}
