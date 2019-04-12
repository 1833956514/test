<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/3
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>奋斗少年在路上_注册</title>
</head>
<body>
<form>
    <fieldset>
        <legend>账号注册</legend>
        <p>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;区：
            <select>
                    <optgroup label="亚细亚洲">
                        <option value="中国">中国</option>
                        <option value="越南">越南</option>
                        <option value="斯里兰卡">斯里兰卡</option>
                        <option value="伊朗">伊朗</option>
                        <option value="土库曼斯坦">土库曼斯坦</option>
                        <option value="西伯利亚">西伯利亚</option>
                    </optgroup>
                    <optgroup label="欧罗巴洲">
                        <option value="北欧">北欧</option>
                        <option value="南欧">南欧</option>
                        <option value="西欧">西欧</option>
                        <option value="中欧">中欧</option>
                        <option value="东欧">东欧</option>
                    </optgroup>
                </select>
        </p>
        <p>
            账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：&nbsp;<input type="text"><br>
        </p>
        <p>
            密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;<input type="password"><br>
        </p>
        <p>
            确认密码：&nbsp;<input type="password">
        </p>
        <p>
            <input type="button" value="注册">
            <input type="reset" value="重置">
            <input type="button" value="取消">
        </p>
    </fieldset>
</form>
</body>
</html>
