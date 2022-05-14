<%--
  Created by IntelliJ IDEA.
  User: Moustiluigi
  Date: 14/05/2022
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Commerçants</title>
</head>
<body>
<table>
  <tr>
    <td>Nom</td>
    <td>Localisation</td>
    <td>Categorie</td>
  </tr>
    <tr th:each="c:${commercants}">
      <td tr:text="${c.nom}"></td>
      <td tr:text="${c.localisation}"></td>
      <td tr:text="${c.categorie}"></td>
    </tr>
  </a>
</table>
</body>
</html>
