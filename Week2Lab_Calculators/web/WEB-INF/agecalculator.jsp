<%-- 
    Document   : agecalculator
    Created on : Sep 25, 2020, 3:08:43 PM
    Author     : Nykke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form action="age" method="post" autocomplete="off">
            <h1>Age Calculator</h1>
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <p>${error}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
