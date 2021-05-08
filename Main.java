package hwSeven;

import hwSeven.business.concretes.UserManager;
import hwSeven.core.abstracts.ValidatorService;
import hwSeven.core.concretes.ValidatorManager;
import hwSeven.dataAccess.abstracts.UserDao;
import hwSeven.dataAccess.concretes.InMemoryUserDao;
import hwSeven.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(2, "kadir","sesiz","user@email.com","saf12");
		UserManager userManager = new UserManager(new InMemoryUserDao(), new ValidatorManager());
		
		userManager.register(user);
		userManager.login(user);
		userManager.getAll();//->this method is not working.
		
			
			
		
	}

}
