<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 17-05-2023
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body style="background-color: antiquewhite">
<center>
    <h1 style="color: chartreuse;"> Welcome to Car Service</h1>
<table border="1">
    <tr>
        <th>car_id</th>
        <th>car_colour</th>
        <th>car_price</th>
        <th>car_brand</th>
        <th>owner_name</th>
        <th>contact_number</th>
    </tr>
    <c:forEach var="car" items="${listcar}">
        <tr>
            <td><a href="getid/${car.car_id}">${car.car_id}</a></td>
            <td>${car.car_colour}</td>
            <td>${car.car_price}</td>
            <td>${car.car_brand}</td>
            <td>${car.owner_name}</td>
            <td>${car.contact_number}</td>

        </tr>
    </c:forEach>
</table>
    <a href="http://localhost:8081/CarServiceServerSideFinalProject_war_exploded/"><button>Add Car Details</button></a>
    <a href="logout"><button>LogOutHere</button></a>

</center>
</body>
</html>
