<%-- 
    Document   : newjsp
    Created on : 2018/01/29, 13:30:37
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int i = 1000;
int j = 0;
while(i > 100){
    j = i / 2;
    out.println(i + "/2=" + j);
    i = j;
    
}
out.print("100より小さいため終了");
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
