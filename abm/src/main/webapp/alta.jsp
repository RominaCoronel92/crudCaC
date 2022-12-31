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
					<h1>Alta</h1>
					<!--  JSP -->
					<form method="post"
						action="<%=request.getContextPath()%>/AltaController">
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Nombre</label>
						  <input name="nombre"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Apellido</label>
						  <input name="apellido"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="Apellido" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">DNI</label>
						  <input name="dni" type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
					      <div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">DOMICILIO</label>
						  <input name="domicilio"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="Domicilio" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">TELEFONO</label>
						  <input name="telefono" type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">CATEGORIA</label>
						  <input name="idCategoria" type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<button class="btn btn-primary">
							Dar de alta
						</button>
					</form>
				</section>
			</div>
		</main>
	</body>	
</html>