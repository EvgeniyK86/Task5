<%@ page import="by.itacademy.git.mergeexperience.topics.Module1Topics" %>
<%@ page import="static by.itacademy.git.mergeexperience.topics.Module4Topics.SPRING_BEANS" %>
<%@ page import="static by.itacademy.git.mergeexperience.topics.Module4Topics.SPRING_DATA" %>
<%@ page import="static by.itacademy.git.mergeexperience.topics.Module4Topics.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module4</title>
</head>
<body>
<h1>Модуль 4</h1>

<table border="1">
    <tr>
        <th>Номер темы</th>
        <th>Тема</th>
        <th>Описание</th>
    </tr>
    <tr>
        <td><%=SPRING_BEANS.getOrder()%>
        </td>
        <td><%=SPRING_BEANS.getTopic()%>
        </td>
        <td><%=SPRING_BEANS.getDescription()%>
        </td>
    </tr>
    <tr>
        <td><%=SPRING_DATA.getOrder()%>
        </td>
        <td><%=SPRING_DATA.getTopic()%>
        </td>
        <td><%=SPRING_DATA.getDescription()%>
        </td>
    </tr>
    <tr>
        <td><%=SPRING_SECURITY.getOrder()%>
        </td>
        <td><%=SPRING_SECURITY.getTopic()%>
        </td>
        <td><%=SPRING_SECURITY.getDescription()%>
        </td>
    </tr>
    <tr>
        <td><%=SPRING_BOOT.getOrder()%>
        </td>
        <td><%=SPRING_BOOT.getTopic()%>
        </td>
        <td><%=SPRING_BOOT.getDescription()%>
        </td>
    </tr>
</table>


</br><a href=${pageContext.request.contextPath}/module3>&#8592Предыдущий модуль</a>
</br><a href='${pageContext.request.contextPath}/'>Назад</a>
</body>
</html>
