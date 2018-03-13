<%-- 
    Document   : html1
    Created on : 2018/03/13, 11:36:11
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>コントロールサンプル</title>
    </head>
    <body>
        <%

            request.setCharacterEncoding("UTF-8");

            out.print("名前：" + request.getParameter("txtName") + "<br>");

            out.print("性別" + request.getParameter("rdoSample") + "<br>");

            out.print("趣味" + request.getParameter("mulText") + "<br>");
            
        %>
    </body>
</html>
