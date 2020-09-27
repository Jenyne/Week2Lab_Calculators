<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 27, 2020, 10:45:08 AM
    Author     : Nykke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="arithmetic" method="post">
        <h1>Arithmetic Calculator</h1>
        <label>First:</label>
        <input type="text" name="first" value=""${first}>
        <br>
        <label>Second:</label>
        <input type="text" name="second" value=""${last}>
        <br>
        <input type="submit" value ="+" name="mathop">
        <input type="submit" value ="-" name="mathop">
        <input type="submit" value ="*" name="mathop">
        <input type="submit" value ="%" name="mathop">
        <br>
        <label>Result:</label>
        <p>${result}</p>
        <br>
        <a href="/age">Age Calculator</a>
        </form>
    </body>
</html>
