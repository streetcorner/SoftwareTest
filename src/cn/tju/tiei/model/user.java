package cn.tju.tiei.model;

public class user {
	private int id;
	private String username;
	private String password;
	private String nickname;
	
	public user(){
		super();
	}
	public user(String username, String password, String nickname){
		super();
		this.username= username;
		this.password= password;
		this.nickname = nickname;
	}
	
	public user(int id, String username, String password, String nickname){
		super();
		this.id= id;
		this.username= username;
		this.password= password;
		this.nickname = nickname;
	}
	
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id= id;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username= username;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password= username;
	}
	
	
}
