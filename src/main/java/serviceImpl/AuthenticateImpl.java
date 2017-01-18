package serviceImpl;

import service.Authenticate;

public class AuthenticateImpl implements Authenticate{

	public boolean check(String user, String pass){
			
			if(("admin".equals(user))&& ("test123".equals(pass))){
				
				return true;
			}
			
			return false;
		}
}
