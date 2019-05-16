package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.CatalogueMetierImpl;
import metier.Personne;
import metier.ICatalogueMetier;


@WebServlet("/ControleurServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ICatalogueMetier metier;
	String login;
	public void init() throws ServletException{
		metier=new CatalogueMetierImpl();
	}
   
    public ControleurServlet() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	              doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String action=request.getParameter("action");
		ModelPers model1= new ModelPers();
		request.setAttribute("login", login);
		
		if(action!=null){
			if(action.equals("connexion")){
				try{
					
				    login=request.getParameter("login");
				    session.setAttribute("login", login);
				    String passwd=request.getParameter("passwd");
				    String mess=metier.verify(login,passwd);
				    if(mess.equals("Votre login ou mot de passe est incorrect!!!")){
				    	model1.setError(mess);
			      	}else{
			      	request.setAttribute("login", login);
			      	request.getRequestDispatcher("vueAcceuil.jsp").forward(request, response);
					model1.setError(mess);
				  }}catch(Exception e){}
					
			}
		 if(action.equals("Inscription")){
			 Personne p=new Personne();
			 List<Personne> lisPers=new ArrayList<Personne>();
			
				    String id=request.getParameter("id");
				    String nom=request.getParameter("nom");
				    String prenom=request.getParameter("prenom");
				    String tel=request.getParameter("tel");
				    String email=request.getParameter("email");
				    String login=request.getParameter("login");
				    String passwd=request.getParameter("passwd");
				    String sexe=request.getParameter("sexe");
				    
				    lisPers=metier.getTrajets();
				    int n1=lisPers.size();
				    int n=++n1;
				    id=""+n;
				    p.setId(id);
				    p.setNom(nom);
				    p.setPrenom(prenom);
				    p.setTel(tel);
				    p.setEmail(email);
				    p.setLogin(login);
				    p.setPasswd(passwd);
				    p.setSexe(sexe);
				    p.setDepart("");
				    p.setDest("");
				    p.setDate("");
				    p.setHeure("");
				    metier.addPers(p);
	  
				    
				 
		 }if(action.equals("Offrir")){
				String depart = request.getParameter("depart");
				String destination = request.getParameter("dest");
				String date = request.getParameter("date");
				String heure = request.getParameter("heure");
				List<Personne> listpersonne = metier.getTrajets();
				for(Personne p:listpersonne){
					if(p.getLogin().equals(login)){
						p.setDepart(depart);
						p.setDate(date);
						p.setDest(destination);
						p.setHeure(heure);
						metier.addTrajet(p);
					}
				}
				request.setAttribute("depart", depart);
				request.setAttribute("destination", destination);
				request.setAttribute("date", date);
				request.setAttribute("heure", heure);
		      	request.getRequestDispatcher("vueOffre.jsp").forward(request, response);


		 }if(action.equals("Chercher")){
			 
			 	String depart = request.getParameter("depart");
				String destination = request.getParameter("dest");
				if(!(depart.equals("")||destination.equals(""))){
					List<Personne> listpersonne = metier.getTrajetParDestDep(destination, depart);
					request.setAttribute("depart", depart);
					request.setAttribute("destination", destination);
					request.setAttribute("listpersonne", listpersonne);
			      	
				}
				request.getRequestDispatcher("vueRecherche.jsp").forward(request, response);
		 }
		
		
	}
		request.getRequestDispatcher("Login.jsp").forward(request, response);
}
}
