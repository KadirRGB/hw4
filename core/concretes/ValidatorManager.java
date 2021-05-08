package hwSeven.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hwSeven.core.abstracts.ValidatorService;
import hwSeven.dataAccess.abstracts.UserDao;
import hwSeven.entities.concretes.User;
//"[a-z0-9&&[^çðýöþü]]+[@].(com|org|net|edu|gov|biz|info|io)"
//^(.+)@(.+)$
public class ValidatorManager implements ValidatorService {

	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);

	public ValidatorManager() {
		
	}
	public ValidatorManager(UserDao userDao) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean userMailCheck(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		if (user.getEmail().matches(regex)) {

			return true;
		}

		else {
			System.out.println("You have not entered a valid e-mail address.");
			return false;
		}
		
	}

	@Override
	public boolean userNameCheck(User user) {
		if (user.getName().length() >= 2) {
			return true;
		}

		else {
			System.out.println("your name must be more than 2 letters");
		}
		return false;
	}

	@Override
	public boolean passwordCheck(User user) {
		if (user.getPassword().length() >= 5) {
			return true;

		} else {
			System.out.println("your password must be more than 5 letters");
		}
		return false;
	}

}