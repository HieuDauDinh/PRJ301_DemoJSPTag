<%-- 
    Document   : testCustomTag
    Created on : Mar 13, 2024, 8:27:17 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="mytag" uri="WEB-INF/mytag.tld"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  
        <mytag:convertvndate value="05-15-2024"/>
    </body>
</html>
