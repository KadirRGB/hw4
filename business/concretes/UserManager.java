package hwSeven.business.concretes;

import java.util.List;

import hwSeven.business.abstracts.UserService;
import hwSeven.core.abstracts.ValidatorService;
import hwSeven.dataAccess.abstracts.UserDao;
import hwSeven.entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	ValidatorService validatorService;

	public UserManager(UserDao userDao, ValidatorService validatorService) {
		this.userDao = userDao;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (this.validatorService.userMailCheck(user) && this.validatorService.passwordCheck(user)
				&& this.validatorService.userNameCheck(user)) {
			System.out.println("registration is completed!");
			userDao.add(user);
		}
	}
	@Override
	public void login(User user) {
		for(User u:userDao.getAll()) {
			if(u==user) {
				System.out.println("giriþ yapýldý.");
			}
		}
	}

	@Override
	public List<User> getAll() {		
		return userDao.getAll();
	}

}
