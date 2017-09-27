<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html"/>
<form action="calculatorservlet" method="post">
    <input type="text" name="first"><br/>
    <input type="text" name="second"><br/>
    <input name="operation" type="submit" value="+">
    <input name="operation" type="submit" value="-"><br/>
    <input name="operation" type="submit" value="/">
    <input name="operation" type="submit" value="x"><br/>
</form>
${result}
<c:import url="/footer.html"/>

