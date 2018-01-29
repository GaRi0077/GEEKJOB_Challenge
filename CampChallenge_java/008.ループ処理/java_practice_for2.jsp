<%-- 
    Document   : java_practice_for2
    Created on : 2018/01/29, 10:18:59
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String a = "A";
String b;
int i;

for(i = 0; i<30; i++){
    b  = a;
    out.println(b + i);
     
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
