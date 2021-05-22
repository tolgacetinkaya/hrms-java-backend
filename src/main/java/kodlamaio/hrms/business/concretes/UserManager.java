package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.User;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;

@Service
public class UserManager implements UserService{

	private UserDao userdao;
	
	@Autowired
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public List<User> getAll() {
		return this.userdao.findAll();
	}

	@Override
	public User getById(int id) {
		return this.userdao.getById(id);
	}



}
