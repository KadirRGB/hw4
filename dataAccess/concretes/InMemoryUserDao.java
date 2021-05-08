package hwSeven.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import hwSeven.dataAccess.abstracts.UserDao;
import hwSeven.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("added to db");
	}

	@Override
	public void update(User user) {
		System.out.println("update to db");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("remove from db");
		
	}

	@Override
	public User get(int id) {
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
}
