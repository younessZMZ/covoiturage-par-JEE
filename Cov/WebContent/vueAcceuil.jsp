<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>

<p><c:out value="Salut ${ sessionScope.login }"/></p>


	<div>
		<center>
			
			<h1>Bienvenue au Pip_trajet</h1>
			
			<table class="bien">
				<tr>
					<td><a href="vueRecherche.jsp"><input class="button1" type="submit" value="Chercher un trajet"></a></td>
					<td></td>
					<td><a href="vueOffre.jsp?login=${login}"><input class="button2" type="submit" value="Offrir un trajet"></a></td>
				</tr>
				
				
			</table>
			
		</center>
		
	</div>
	<div class="footer">
		<a class="retour" href="Login.jsp">Retour</a>
		<a class="logout" href="Login.jsp">Logout</a>
	</div>

	
</body>
</html>