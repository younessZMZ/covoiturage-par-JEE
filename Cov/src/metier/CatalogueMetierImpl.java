package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CatalogueMetierImpl implements ICatalogueMetier{


	public String verify(String login, String passwd) {
		Connection conn=SingletonConnection.getConnection();
		List<Shadow> lisMP= new ArrayList<Shadow>();
		try{ 
			PreparedStatement ps= conn.prepareStatement("select id, login, passwd from personne");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Shadow sh=new Shadow();
				sh.setId(rs.getString("id"));
				sh.setLogin(rs.getString("login"));
				sh.setPasswd(rs.getString("passwd"));
				lisMP.add(sh);}
				ps.close();
		}catch(SQLException e){e.printStackTrace();}
		
		String test="Votre login ou mot de passe est incorrect!!!";
		for(Shadow sh: lisMP ){
			if(sh.getLogin().equals(login)&&sh.getPasswd().equals(passwd))
				test=sh.getId();}
			return test;
	}

	@Override
	public void addPers(Personne p) {
		Connection conn=SingletonConnection.getConnection();
		try{ 
			
			PreparedStatement ps= conn.prepareStatement("insert into personne(id,nom,prenom,tel,email,login,passwd,sexe,depart,dest,date,heure) values (?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());
			ps.setString(4, p.getTel());
			ps.setString(5, p.getEmail());
			ps.setString(6, p.getLogin());
			ps.setString(7, p.getPasswd());
			ps.setString(8, p.getSexe());
			ps.setString(9, p.getDepart());
			ps.setString(10, p.getDest());
			ps.setString(11, p.getDate());
			ps.setString(12, p.getHeure());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){e.printStackTrace();}
	}

	@Override
	public List<Personne> getTrajets() {
		
		List<Personne> lisPers= new ArrayList<Personne>();
		Connection conn=SingletonConnection.getConnection();
		try{ 
			if(conn==null) {
				return lisPers;
			}
			PreparedStatement ps= conn.prepareStatement("select * from personne");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Personne p=new Personne();
			p.setId(rs.getString("id"));
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
			p.setTel(rs.getString("tel"));
			p.setEmail(rs.getString("email"));
			p.setLogin(rs.getString("login"));
			p.setPasswd(rs.getString("passwd"));
			p.setSexe(rs.getString("sexe"));
			p.setDepart(rs.getString("depart"));
			p.setDest(rs.getString("dest"));
			p.setDate(rs.getString("date"));
			p.setHeure(rs.getString("heure"));
			lisPers.add(p);}
			ps.close();
		}catch(SQLException e){e.printStackTrace();}
		
		return lisPers;
	}

	@Override
	public List<Personne> getTrajetParDestDep(String dest, String depart) {
		List<Personne> lisPers= new ArrayList<Personne>();
		Connection conn=SingletonConnection.getConnection();
		try{ 
			PreparedStatement ps= conn.prepareStatement("select * from personne where dest= ? and depart= ?");
			ps.setString(1, dest);
			ps.setString(2, depart);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Personne p=new Personne();
				p.setId(rs.getString("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				p.setTel(rs.getString("tel"));
				p.setEmail(rs.getString("email"));
				p.setLogin(rs.getString("login"));
				p.setPasswd(rs.getString("passwd"));
				p.setSexe(rs.getString("sexe"));
				p.setDepart(rs.getString("depart"));
				p.setDest(rs.getString("dest"));
				p.setDate(rs.getString("date"));
				p.setHeure(rs.getString("heure"));
				lisPers.add(p);}
				ps.close();
		}catch(SQLException e){e.printStackTrace();}
		if(lisPers.size()==0){System.out.println("Aucune proposition pour la destination " + dest);}
		return lisPers;
		 
			
	}

	@Override
	public void addTrajet(Personne p) {
		Connection conn=SingletonConnection.getConnection();
		try{ 
			PreparedStatement ps= conn.prepareStatement("update personne set nom=?,prenom=?,tel=?,email=?,login=?,passwd=?,sexe=?,depart=?,dest=?,date=?,heure=? where id=?");
			ps.setString(1, p.getNom());
			ps.setString(2, p.getPrenom());
			ps.setString(3, p.getTel());
			ps.setString(4, p.getEmail());
			ps.setString(5, p.getLogin());
			ps.setString(6, p.getPasswd());
			ps.setString(7, p.getSexe());
			ps.setString(8, p.getDepart());
			ps.setString(9, p.getDest());
			ps.setString(10, p.getDate());
			ps.setString(11, p.getHeure());
			ps.setString(12, p.getId());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){e.printStackTrace();}
		
	}

}
