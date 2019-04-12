<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/3
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>奋斗少年在路上</title>
    <style type="text/css">
      #container{
        margin-left: auto;
        margin-right: auto;
        width: 80%; /*设置元素的宽度：90%*/
        height: 80%; /*设置元素的高度：600px*/
        display: block;
        text-align: center; /*设置元素文本的水平对齐方式：居左*/
        border: 15px solid #2E9CBD;
        /*设置元素的上、下、左、右边框宽度1px、边框样式solid（实线）、边框颜色：#2E9CBD*/
        overflow: auto;
      }
    </style>
  </head>
  <body>
  <div id="container">
    <div style="width: 40%;display: block;margin: auto;margin-top: 18%">
      <form action="">
        <fieldset>
          <legend>欢迎登陆</legend>
            <input type="radio" name="sex" id="user" value="user" checked="checked">用户
            <input type="radio" name="sex" id="admin" value="admin">管理员<br>
            账号：<input type="text"><br>
            密码：<input type="password"><br><br>
            <input type="button" value="登陆">
            <input type="reset" value="重置">
            <input type="button" value="注册" onclick="window.location.href='registration.jsp'">
        </fieldset>
      </form>
    </div>
  </div>
  </body>
</html>
