package desktop.model;

public class Login_ {

	public boolean login_(String User, String Pass) {
		String User_ = "fluke", Pass_ = "1234";
		boolean User_check = User.equals(User_);
		boolean Pass_check = Pass.equals(Pass_);

		if (User_check & Pass_check) {
			return true;
		} else {
			return false;
		}
	}
}
