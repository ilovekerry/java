<%--
  Created by IntelliJ IDEA.
  User: xianxiaobo
  Date: 2018/10/25
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.8.2/jquery.js"></script>
</head>
<body>
<div style="padding: 100px 100px 10px;">
    <div class="panel  panel-primary">
        <div class="panel-heading">
            用户列表
            <button class="btn btn-success btn-xs pull-right" onclick="window.location.href='/user/add'">新增+</button>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>用户名</th>
                        <th>性别</th>
                        <th>手机号</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${userListData}" var="item">
                    <tr>
                        <td>${item.name}</td>
                        <td>${item.sex}</td>
                        <td>${item.phone}</td>
                        <td>
                            <button class="btn btn-sm btn-primary" onclick="window.location.href='/user/edit/${item.id}'">修改</button>
                            <button class="btn btn-sm btn-danger" onclick="window.location.href='/user/delete/${item.id}'">删除</button>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
