<%--
  Created by IntelliJ IDEA.
  User: Moustiluigi
  Date: 14/05/2022
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Recherche de panier</title>
</head>
<body>
<form action="/panier">
    <input type="submit" value="Chercher tous les paniers">
</form>
<br><br>
<form action="/rechercherPanierCommercantNom" method="get">
    <input type="text" placeholder="Nom de commerçant" id="valcor"/>

    <input type="submit" value="Chercher par commerçant">
</form>
<br><br>
<form action="/rechercherPanierId">
    <input type="text" placeholder="No Id" id="valid"/>

    <input type="submit" value="Chercher par id">
</form>
<br><br>
<form action="">
    <input type="text" placeholder="Nom de catégorie" id="valcat"/>

    <input type="submit" value="Chercher par catégorie">
</form>
<br><br>
<form action="">
    <input type="text" placeholder="Localisation" id="valloc"/>

    <input type="submit" value="Chercher par localisation">
</form>
</body>
</html>
