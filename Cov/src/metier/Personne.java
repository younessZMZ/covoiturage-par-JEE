package metier;

import java.io.Serializable;

public class Personne implements Serializable{
private String id;
private String nom;
private String prenom;
private String tel;
private String email;
private String login;
private String passwd;
private String sexe;
private String depart;
private String dest;
private String date;
private String heure;

public Personne() {
	super();
	// TODO Auto-generated constructor stub
}



public String getHeure() {
	return heure;
}



public void setHeure(String heure) {
	this.heure = heure;
}



public Personne(String id, String nom, String prenom, String tel, String email, String login, String passwd,
		String sexe, String depart, String dest, String date, String heure) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.tel = tel;
	this.email = email;
	this.login = login;
	this.passwd = passwd;
	this.sexe = sexe;
	this.depart = depart;
	this.dest = dest;
	this.date = date;
	this.heure	= heure;
}



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
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

public String getDepart() {
	return depart;
}

public void setDepart(String depart) {
	this.depart = depart;
}

public String getDest() {
	return dest;
}

public void setDest(String dest) {
	this.dest = dest;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}



public String getSexe() {
	return sexe;
}



public void setSexe(String sexe) {
	this.sexe = sexe;
}


}
