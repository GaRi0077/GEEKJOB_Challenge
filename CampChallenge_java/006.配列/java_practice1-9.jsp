<%-- 
    Document   : newjsp
    Created on : 2018/01/26, 19:41:55
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.ArrayList"%>

<%ArrayList<String> datas = new ArrayList<String>(7);
datas.add("10");
datas.add("100");
datas.add("soeda");
datas.add("hayashi");
datas.add("-20");
datas.add("118");
datas.add("END");
out.print(datas);

datas.set(2, "33");

out.print(datas);
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
