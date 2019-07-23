package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="accountController")
@SessionScoped
public class AccountController {
	private String username;
	private String password;
	private String message ="";
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login(){
		if(this.username.equals("Manish")&&
				this.password.equals("1234"))
					return "welcome";
		else{
			this.message="Account is invalid";
			return "index";
		}
	}

}
