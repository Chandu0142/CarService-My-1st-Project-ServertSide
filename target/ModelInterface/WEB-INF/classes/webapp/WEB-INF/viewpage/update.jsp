<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="car" type="com"--%>
<form:form modelAttribute="car" action="update1" method="post">
    <label>car_id</label>
    <form:input path="car_id" readonly="true"/><br>
    <label>car_colour</label>
    <form:input path="car_colour"/><br>
    <label>car_price</label>
    <form:input path="car_price"/><br>
    <label>car_brand</label>
    <form:input path="car_brand"/><br>
    <label>owner_name</label>
    <form:input path="owner_name"/><br>
    <label>contact_number</label>
    <form:input path="contact_number"/><br>
    <input type="submit" value="update">

</form:form>


</body>
</html>