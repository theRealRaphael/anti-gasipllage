<%--
  Created by IntelliJ IDEA.
  User: Moustiluigi
  Date: 14/05/2022
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Recherche de commerçant</title>
</head>
<body>
<form action="">
  <label for="filter">Filtrer le commerçant par :</label>
  <select name="filter" id="filter">
    <option value="cat">Catégorie</option>
    <option value="loc">Localisation</option>
  </select>
  <input type="text" id="val"/>
  <br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>