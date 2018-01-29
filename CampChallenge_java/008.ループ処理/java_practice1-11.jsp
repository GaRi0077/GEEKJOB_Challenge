<%-- 
    Document   : java_practice1-11
    Created on : 2018/01/27, 11:27:56
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int i,j,w;
for(j = 0,i = 1,w= 0; i<=20; i++){
    j = 8;
    w = j * i;
    out.println(j + "*" + i + "=" + w);
    
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
