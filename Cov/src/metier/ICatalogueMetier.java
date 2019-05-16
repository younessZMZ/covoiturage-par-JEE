package metier;

import java.util.List;

public interface ICatalogueMetier {
	  public String verify(String login, String passwd);
	  public void addPers(Personne p);
	  public List<Personne> getTrajets();
	  public List<Personne>  getTrajetParDestDep(String dest, String depart);
	  public void addTrajet(Personne p);

}
