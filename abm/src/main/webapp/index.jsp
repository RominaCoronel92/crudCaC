<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet">

<html>
<heaad>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/style.css">
	<%@include file="head.jsp" %>	
</heaad>
<body>

<main>
<%@include file="navbar.jsp" %>
<br>
<p>Galeria</p>

 <div class="fila">
        <div class="columna">
            <img src="imagen/imagen1.jpg">
        </div>
        <div class="columna">
            <img src="imagen/imagen2.jpg">
        </div>
        <div class="columna">
            <img src="imagen/imagen3.jpg">>
        </div>
        </div>
          <div class="fila">
         <div class="columna">
            <img src="imagen/imagen5.jpg">
        </div>
         <div class="columna">
            <img src="imagen/imagen6.jpg">
        </div>
         <div class="columna">
            <img src="imagen/imagen7.jpg">
        </div>
    </div>
    <br>
    <br>

     <section>
        <section class="mapa">
            <h3 class="titulo-principal">Nuestra ubicacion</h3>
            <p>El club se encuentra en la localidad de Tortuguitas, Malvinas Argentinas</p>

            <div class="mapa-contenido">
               <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3289.403869705058!2d-58.739432285613965!3d-34.46727748049503!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x95bc989d817c83ed%3A0x9f9474a315dedeed!2sClub%20LOS%20ANGELES!5e0!3m2!1ses-419!2sar!4v1672447784769!5m2!1ses-419!2sar" width="100%" height="300" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            </div>
            
            
        </section>
</main>

<footer>
<%@include file="footer.jsp" %>
<br>
<br>
</footer>
</body>
</html>
