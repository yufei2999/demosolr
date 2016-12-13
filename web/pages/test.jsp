<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>test</title>
    <style>
        body {
            text-align: center
        }

        table {
            margin:auto;
            margin-top: 100px;
            width: 500px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<div>
    <table border="1px">
        <tr>
            <th>id</th>
            <th>title</th>
            <th>content</th>
            <th>createTime</th>
        </tr>
        <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.title}</td>
            <td>${item.content}</td>
            <td>${item.createTime}</td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>