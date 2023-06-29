
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<body bgcolor="#6495ed"></body>
<style>
    .error{color:red}

</style>
</head>
<body>
<%--@elvariable id="carModel" type="skytech"--%>
<table>

</table>
<table border="1" align="center" style="background-color: aquamarine">
    <form:form action="enter" modelAttribute="carModel">
        <tr>
            <td>CarPrice:</td>
            <td><form:input path="car_price" />
                <form:errors path="car_price" cssClass="error"/></td>

        </tr>
        <tr>
            <td>CarColour: </td>
            <td>
                <form:input path="car_colour"/>
                <form:errors path="car_colour" cssClass="error"/> </td>
        </tr>
        <tr>
            <td>CarBrand:</td>
            <td><form:input path="car_brand"/>
                <form:errors path="car_brand" cssClass="error"/></td>
        </tr>
        <tr>
            <td>OwnerName: </td>
            <td>
                <form:input path="owner_name"/>
                <form:errors path="owner_name" cssClass="error"/> </td>
        </tr>
        <tr>
            <td>ContactNumber: </td>
            <td>
                <form:input path="contact_number"/>
                <form:errors path="contact_number" cssClass="error"/> </td>
        </tr>
        <tr >
            <td colspan="2" align="center"><input type="submit" value="submit"></td>
        </tr>




    </form:form>

</table>
<h3 align="center"><a href="read">click to display All</a></h3>

</body>
</html>
