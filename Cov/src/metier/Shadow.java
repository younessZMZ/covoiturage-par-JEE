package metier;

public class Shadow {
private String id;
private String login;
private String passwd;
public Shadow() {
	super();
	// TODO Auto-generated constructor stub
}

public Shadow(String id, String login, String passwd) {
	super();
	this.id = id;
	this.login = login;
	this.passwd = passwd;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPasswd() {
	return passwd;
}

public void setPasswd(String passwd) {
	this.passwd = passwd;
}



}