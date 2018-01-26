<%-- 
    Document   : java_practice1-6
    Created on : 2018/01/26, 16:52:49
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int num = 1;

switch(num){
    case 1:
        out.print("one");
        break;
     
    case 2:
        out.print("two");
        break;
        
    default:
        out.print("想定外");
     
}
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
