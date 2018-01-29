<%-- 
    Document   : java_practice_for3
    Created on : 2018/01/29, 10:34:54
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int a,j,k,w,i;

for(a = 0, j = 0, k = 0, w = 0, i = 0; i <= 100; i++){
    w = a + i;
    k = a;
    a = w;
    out.println(k + "+" + i + "=" + w);
    
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
