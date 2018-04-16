<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar Socios</title>
</head>
<body>
	<h1>Lista  Socios</h1>
	<table>
		<tr>
			<td><a href="adminSocio?action=index" >Ir al inicio</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		
		 <td> ID</td>
		 <td> NOMBRE</td>
		 <td> TASA</td>
		 <td>MONTO MAXIMO</td>
		 
		</tr>
		<c:forEach var="socio" items="${lista}">
			<tr>
				<td><c:out value="${socio.id}"/></td>
				<td><c:out value="${socio.nombre}"/></td>
				<td><c:out value="${socio.tasa}"/></td>
				<td><c:out value="${socio.montoMaximo}"/></td>
									
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>