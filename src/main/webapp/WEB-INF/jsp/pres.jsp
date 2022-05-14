<%--
  Created by IntelliJ IDEA.
  User: Moustiluigi
  Date: 14/05/2022
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Paniers</title>
</head>
<body>
<table>
    <tr>
        <td>Catégorie</td>
        <td>Commerçant</td>
        <td>Localisation</td>
        <td>Prix</td>
        <td>Produits</td>
    </tr>
    <div th:each="p:${paniers}" href="panier?id=${p.id}">
        <tr>
            <td tr:text="${p.categorie}"></td>
            <td tr:text="${p.nomCommercant}"></td>
            <td tr:text="${p.localisation}"></td>
            <td tr:text="${p.prix}"></td>
            <td
                    <ul:forEach var = "i" begin = "0" end = "3">
                        li:text="${p.listDeProduits}[<c:out value = "${i}"/>]">
                    </ul:forEach>
            </td>
        </tr>
    </div>
</a>
</table>
</body>
</html>
