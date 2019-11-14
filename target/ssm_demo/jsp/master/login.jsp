<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2019/11/7
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${ctx}/user/login" method="post">
       用户名:<input type="text" name="name"><br>
        密码:<input type="password" name="password">
            <input type="submit" value="提交">
        <span>${msg}</span>



    </form>

</body>
</html>
