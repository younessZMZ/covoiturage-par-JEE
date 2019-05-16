package web;

import java.util.List;

import metier.Personne;

public class ModelPers {
	private String page;
	private String error;
	private Personne p;
	private List<Personne> listPers;
	
	public ModelPers() {
		super();
		
	}
	
	
	
	public ModelPers(String page, String error, Personne p, List<Personne> listPers) {
		super();
		this.page = page;
		this.error = error;
		this.p = p;
		this.listPers = listPers;
	}



	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Personne getP() {
		return p;
	}
	public void setP(Personne p) {
		this.p = p;
	}
	public List<Personne> getListPers() {
		return listPers;
	}
	public void setListPers(List<Personne> listPers) {
		this.listPers = listPers;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
	
	

}
