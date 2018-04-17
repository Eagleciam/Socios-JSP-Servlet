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
		
		 <td> Socio que realiza el prestamo</td>
		 <td> Cuota mensual</td>
		 <td> Pago total</td>
		 <td>Tasa de interes Mensual</td>
		 
		</tr>
		
			<tr>
				<td><c:out value="${prestamo.socio.nombre}"/></td>
				<td>$ <c:out value="${prestamo.pagoMensual}"/></td>
				<td>$ <c:out value="${prestamo.pagoTotal}"/></td>
				<td><c:out value="${prestamo.socio.tasa}"/> %</td>
									
			</tr>
		
	</table>
	
	<% 
            
            if(request.getAttribute("prestamo")==null){ 
                %> 
                <h1>NO HAY SOCIO DISPONIBLE</h1>
                <% 
            }else{ 
                %> 
               <h1> </h1>
                <% 
            } 
        %>  
	
	
</body>
</html>