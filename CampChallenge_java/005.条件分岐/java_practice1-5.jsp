<%-- 
    Document   : newjsp
    Created on : 2018/01/26, 16:25:31
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int num = 1;

if(num==1){
    out.println("1です！");
}else if(num==2){
    out.println("2です！");
}else{
    out.println("その他です！");
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
