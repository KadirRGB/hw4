package hwSeven.business.abstracts;

import java.util.List;

import hwSeven.entities.concretes.User;


public interface UserService {
	void register(User user);
	void login(User user);
	List<User> getAll();

}
