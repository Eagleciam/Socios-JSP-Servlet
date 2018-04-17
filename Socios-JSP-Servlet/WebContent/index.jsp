<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FINANCIA SAS</title>
</head>
<body>

<div style="background: #E0E0E0; text-align: center; height: 70px; padding: 5px;">
  <div>
      <h1>FINANCIADORA SAS</h1>
  </div>
 </div>
	<h1>Administrar Cotizacion</h1>
	<form action="adminSocio?action=cotizar" method="post">
		<table border="1" align="center">
		<tr>
			<td>Valor del prestamo: </a></td>		
			<td><input type="text" name="monto"/></td>	
		</tr>
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="COTIZAR" name="cotizar"></td>	
		</tr>
	
	</form>
	
	
	<div  style="background: #E0E0E0; text-align: center; padding: 1px; margin-top: 10px;">
  Realiza tu cotizacion
</div>
	
</body>
</html>