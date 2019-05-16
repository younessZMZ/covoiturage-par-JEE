<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recherche de trajet</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<p><c:out value="Salut ${ sessionScope.login }"/></p>
<body>
	
	<form  class="cherche" action="controleur" method="post">
			<div>
				<table>
					<tr>
						<td>Départ: </td>
						<td><input type="text" placeholder="Search depart" name="depart" value="${depart}"/></td>
						
					</tr>
					<tr>
						<td>Destination: </td>
						<td><input type="text" placeholder="Search destination" name="dest" value="${destination}"/></td>
						
					</tr>
					
					<tr>
						<td></td>
						<td><input class="button1" type="submit" value="Chercher" name="action"></td>
						<td></td>
					</tr>
				</table>
			</div>
	</form>
	<section class="cherche2">
	<div>
		${model.errors}
	</div>
	<div>
			<table class="tab">
				<caption>Voila les offres disponibles</caption>
				
				
				<tr>
					<th>Nom</th>
					<th>Prénoms</th>
					<th>Numéro téléphone</th>
					<th>Heure de départ</th>
					<th>Date</th>
				</tr>
				
				  <c:forEach items="${listpersonne}"  var="p" >
					<tr>
						<td>${p.nom}</td>
						<td>${p.prenom}</td>
						<td>${p.tel}</td>
						<td>${p.heure}</td>
						<td>${p.date}</td>
						<td><button onclick="msg()">Accepter</button></td>
					
					</tr>
				   </c:forEach>
			</table>
		</div>
	</section>	
	
		<div class="footer">
			<a class="retour" href="vueAcceuil.jsp">Retour</a>
			<a class="logout" href="Login.jsp">Logout</a>
		</div>
	<script>function msg() {alert("vous avez accepter l'offre de Youness, vos informations lui seront envoyées");}
	</script>
</body>
</html>