package hwSeven.dataAccess.abstracts;

import java.util.List;

import hwSeven.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void remove(User user);
	
	User get(int id);
	List<User> getAll();
}
