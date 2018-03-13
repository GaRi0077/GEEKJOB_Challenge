<%-- 
    Document   : control2
    Created on : 2018/03/13, 12:42:17
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>コントロールテスト</title>
    </head>
    <body>
         <form action="./control2_test.jsp" method="post">

            名前：<input type="text" name="txtName"><br>
            性別：男<input type="radio" name="rdoSample">女<input type="radio" name="rdoSample"><br>
            趣味：<br>
            <textarea name="mulText"></textarea><br>
            <input type="submit" name="btnSubmit">
        </form>
    </body>
</html>
