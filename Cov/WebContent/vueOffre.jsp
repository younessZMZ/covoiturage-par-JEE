<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Offrir un trajet</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>

</head>
<p><c:out value="Salut ${ sessionScope.login }"/></p>
<body>
	<p><?php echo $_GET['login']; ?></p>
	<form class="cherche" action="controleur" method="post">
			<div>
				<table>
			
					<tr>
						<td>Départ: </td>
						<td><input type="text" name="depart" value="${depart}"/></td>
						
					</tr>
					<tr>
						<td>Destination: </td>
						<td><input type="text" name="dest" value="${destination}"/></td>
						
					</tr>
					<tr>
						<td>Date: </td>
						<td><input type="date"  name="date" value="${ date }" ></td>
						
					</tr>
					<tr>
						<td>Heure: </td>
						<td><input type="time" name="heure" value="${heure }" /></td>
						
					</tr>
					<tr>
						<td></td>
						<td><input class="button1" type="submit" value="Offrir" name="action"></td>
						<td></td>
					</tr>
				</table>
			</div>
	</form>
	<div class="footer">
	    <a class="retour" href="vueAcceuil.jsp">Retour</a>
	    <a class="logout" href="Login.jsp">Logout</a>
	</div>
</body>
</html>