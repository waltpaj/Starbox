package se.starbox.models;

public class UserModel {

	private int id;
	public UserModel() {
		
	}
	
	public String[] getUsers() {
		String[] users = new String[2];
		users[1] = "User1";
		users[2] = "User2";
		return users; //TODO Should not be a string! 
	}
	
	public boolean updateUser(){
		return true;
	}
	
	public String getEmail(String userID) {
		return "testemail" + userID + "@smallstars.se";
	}
	
	public int getID() {
		return id;
	}
	
	public boolean deleteUser() {
		return true;
	}
	
	public String createUser(String ip) {
		return ip;
	}
	
}
