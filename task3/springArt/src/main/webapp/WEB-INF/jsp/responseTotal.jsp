<%--
  Created by IntelliJ IDEA.
  User: xianxiaobo
  Date: 2018/11/6
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

<json:object>
    <json:property name="code" value="${data.code}"/>
    <json:property name="message" value="${data.message}"/>
    <json:property name="total" value="${data.total}"/>
</json:object>
