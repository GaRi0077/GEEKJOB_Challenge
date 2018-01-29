<%-- 
    Document   : java_practice1-10
    Created on : 2018/01/27, 11:06:56
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.HashMap"%>
<%
    HashMap<String,String>prof=new HashMap<String,String>();
    prof.put("1","AAA");
    prof.put("hello", "World");
    prof.put("soeda", "33");
    prof.put("20", "20");
    out.print(prof);
    
   
    
    
   
    
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
