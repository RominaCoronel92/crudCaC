<%@page import="java.util.List"%>
<%@page import="dto.JugadoresDTO"%>
<html>
	<head>
		<%@include file="head.jsp" %>	
	</head>
	
	<body>
		<!-- ACA VA EL NAVBAR  -->
		<%@include file="navbar.jsp" %>
		<main>
			<div class="container">
				<section>
					<h1>Listado</h1>
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">NOMBRE</th>
					      <th scope="col">APELLIDO</th>
					      <th scope="col">DNI</th>
					      <th scope="col">DOMICILIO</th>
					      <th scope="col">TELEFONO</th>
					      <th scope="col">CATEGORIA</th>
					      
					    </tr>
					  </thead>
					  <% 
					  	//codigo java
					  	//obtener el listado desde el request
					  	//se guardo bajo el nombre de "listado"
					  	List<JugadoresDTO> listado = (List<JugadoresDTO>)request.getAttribute("listado");
					  %>
					  <tbody>
					   <!-- ESTO SE REPITE TANTA CANDTIDAD DE VECES COMO ARTICULOS TENGA -->
					   <%
					   	for( JugadoresDTO  unjugador : listado) {
					   %>
					    <tr>
					      <th scope="row"> <%=unjugador.getIdJugadores()%> </th>
					      <td><%=unjugador.getNombre() %></td>
					      <td><%=unjugador.getApellido() %></td>
					      <td><%=unjugador.getDni() %></td>
					      <td><%=unjugador.getDomicilio() %></td>
					      <td><%=unjugador.getTelefono() %></td>
					       <td><%=unjugador.getIdCategoria()%></td>
					      <td>
					      	<a class="btn btn-danger" href="<%=request.getContextPath()%>/Eliminar?idJugadores=<%=unjugador.getIdJugadores()%>" role="button">Eliminar</a> | 
					      	<a class="btn btn-secondary" href="<%=request.getContextPath()%>/EditarController?idJugadores=<%=unjugador.getIdJugadores()%>" role="button">Editar</a>
					      </td>
					    </tr>
					   <%
					   	}
					   %>
					  </tbody>
					</table>
				</section>
			</div>
		</main>
	</body>	
</html>