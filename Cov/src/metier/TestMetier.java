package metier;

import java.util.List;



public class TestMetier {

	public static void main(String[] args) {
		ICatalogueMetier metier=new CatalogueMetierImpl();
		List<Personne> p = metier.getTrajets();
		for(Personne e:p){
			System.out.println(e.getNom());
		}
  
	}

}
