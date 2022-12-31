<%@page import="dto.JugadoresDTO"%>
<html>
	<head>
		<%@include file="head.jsp" %>	
	</head>
	
	<body>
		<main>
			<!-- ACA VA EL NAVBAR  -->
			<%@include file="navbar.jsp" %>
			<div class="container">
				<section>
					<% 
					  	JugadoresDTO jugador = (JugadoresDTO)request.getAttribute("jugador");
				  	%>
					<h1>Editar</h1>
					<!--  JSP -->
					<form method="POST"
						action="<%=request.getContextPath()%>/EditarController">
						
						<div class="mb-3">
						  <input name="idJugadores"
						  	value="<%=jugador.getIdJugadores()%>" 
						  	type="hidden" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Nombre</label>
						  <input name="nombre"
						  	value="<%=jugador.getNombre()%>"  
						  	type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50" disabled>
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Apellido</label>
						  <input name="apellido"
						  	value="<%=jugador.getApellido()%>"  
						  	type="text" class="form-control" id="exampleFormControlInput1" placeholder="Apellido" maxlength="50" disabled>
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Dni</label>
						  <input name="dni"
						  	value="<%=jugador.getDni()%>" 
						  	type="number" class="form-control" id="exampleFormControlTextarea1" disabled>
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Direccion</label>
						  <input name="direccion"
						  	value="<%=jugador.getDomicilio()%>"  
						  	type="text" class="form-control" id="exampleFormControlInput1" placeholder="Direccion" maxlength="50" disabled>
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Telefono</label>
						  <input name="telefono"
						  	value="<%=jugador.getTelefono()%>" 
						  	type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Categoria</label>
						  <input name="idCategoria"
						  	value="<%=jugador.getIdCategoria()%>" 
						  	type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<button class="btn btn-primary">
							Actualizar
						</button>
					</form>
				</section>
			</div>
		</main>
	</body>	
</html>