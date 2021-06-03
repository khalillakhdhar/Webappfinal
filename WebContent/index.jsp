<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Formation</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col">
      
    </div>
    <div class="col">
       <form method="post" action="FormationServlet">
  <div class="mb-3">
    <label for="titre" class="form-label">Titre</label>
    <input type="text" required name="titre" class="form-control" id="titre" >
  </div>
 <div class="mb-3">
    <label for="prix"  class="form-label">Prix</label>
    <input type="number" min="100" name="prix" class="form-control" id="prix" >
  </div>
  <div class="mb-3">
    <label for="description" class="form-label">Description</label>
    <textarea required name="description" class="form-control" id="description" ></textarea>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<% if(request.getAttribute("erreur")!=null) { %><h3>
<%=request.getAttribute("erreur")  %>

</h3> <% } %>
    </div>
    <div class="col">
     
    </div>
  </div>
</div>
</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</html>