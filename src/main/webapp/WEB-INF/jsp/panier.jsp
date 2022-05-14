<%--
  Created by IntelliJ IDEA.
  User: Moustiluigi
  Date: 14/05/2022
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ul" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <!--<td>Prix</td>-->
        <td>Produits</td>
    </tr>


<c:forEach items="${panier}" var="p">

    <tr>
        <td><c:out value="${p.categorie}"></c:out></td>
        <td><c:out value="${p.nomCommercant}"></c:out></td>
        <td><c:out value="${p.localisation}"></c:out></td>

        <td>
            <ul:forEach var="i" begin="0" end="2">
                <li><c:out value="${p.listeDeProduits[i]}"></c:out></li>
            </ul:forEach>
        </td>
    </tr>

</c:forEach>

</a>
</table>
</body>
</html>
