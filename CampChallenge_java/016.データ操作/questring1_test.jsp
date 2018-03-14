<%-- 
    Document   : questring1_test
    Created on : 2018/03/13, 16:10:57
    Author     : GaRi0077
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            request.setCharacterEncoding("UTF-8");
            int total = Integer.parseInt(request.getParameter("total"));
            int count = Integer.parseInt(request.getParameter("count"));
            int type = Integer.parseInt(request.getParameter("type"));
            
            
            out.print("商品種別:");
            
            if (type == 1) {
                out.print("雑貨<br>");
                
            } else if (type == 2) {
                out.print("生鮮食品<br>");
                
            } else {
                out.print("その他<br>" );
                
            }
            
            int num = 0;
            
            num = total / count;
            
            out.print("単価" + num + "円<br>");
            
            int point = 0;
            
            if (total >= 3000 && total < 5000) {
                point =(int) (total / 0.4);
                
            } else if (total >= 5000) {
                
                point = (int)(total/0.5);
                
            } else {
                point = 0;
            }
            
            out.print("ポイント" + point);   

        %>
    </body>
</html>
