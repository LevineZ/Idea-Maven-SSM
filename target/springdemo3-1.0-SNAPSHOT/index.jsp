<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <center>
    <a href="account/findAll">查询用户数据</a>

    <h3>保存用户数据</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name" /><br/>
        内容：<input type="text" name="message" /><br/>
        <input type="submit" value="保存"/><br/>
    </form>
    </center>
</body>
</html>
