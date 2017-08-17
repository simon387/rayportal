package it.simonecelia.rayportal.dao;

import it.simonecelia.rayportal.model.Login;
import it.simonecelia.rayportal.model.User;

public interface UserDao {

	void register(User user);
	
	User validateUser(Login login);
}
