<%@ page import="skytech.model.CarModel" %><%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 18-05-2023
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<% Car car6= (Car) request.getAttribute("car5");%>--%>
<table border="1">
    <tr>
        <th>car_id</th>
        <th>car_colour</th>
        <th>car_price</th>
        <th>car_brand</th>
        <th>owner_name</th>
        <th>contact_number</th>
        <th>edit </th>
        <th>delete </th>
    </tr>
    <tr>
        <td>${carModel.car_id}</td>
        <td>${carModel.car_colour}</td>
        <td>${carModel.car_price}</td>

        <td>${carModel.car_brand}</td>
        <td>${carModel.owner_name}</td>
        <td>${carModel.contact_number}</td>
        <td><button><a href="update/${carModel.car_id}">update</a></button></td>
        <td><button><a href="del/${carModel.car_id}">delete</a></button></td>
    </tr>

<%--    <td><button>update</button> </td>--%>
<%--    <td><button>delete</button> </td>--%>
</body>
</html>
