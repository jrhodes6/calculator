<%-- 
    Document   : submit
    Created on : Oct 18, 2015, 8:47:26 PM
    Author     : dhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CSC330 Homework 2</title>
    </head>
    <body>
        <h1> Future Value Calculator </h1>
        <jsp:useBean id="user" scope="request" class= "edu.elon.calculator"/>
        <label> Investment Amount: </label>
        <span> <jsp:getProperty name = "user" property= "amount"/></span><br>
        <label> Yearly Interest Rate: </label>
        <span> <jsp:getProperty name = "user" property= "rate"/></span><br>
        <label> Number of Years: </label>
        <span> <jsp:getProperty name = "user" property= "years"/></span><br>
        <label> Future Value: </label>
        
        
        <span><useBean id="value" scope="request" </span><br>
        
        
        
    </body>
</html>
