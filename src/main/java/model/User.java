package model;

import java.util.Date;

public class User {
	private int id;
	private String fullname;
	private String username;
	private String password;
	private String email;
	private Date startDate;
	private Date endDate;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(int id, String fullname, String email, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public User(int id, String fullname, String username, String password, String email, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	

	public User(int id, String fullname, String email) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
	}

	public User(String fullname, String username, String password, String email) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public User(int id, String username) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
