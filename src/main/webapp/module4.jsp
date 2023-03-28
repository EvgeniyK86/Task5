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
        <th><font size=“5” />Номер темы</th>
        <th> <font size=“5” /> Тема</th>
        <th> <font size=“5” /> Описание</th>
    </tr>
    <tr>
        <td><font size=“4” color=“#000080” /> <%=SPRING_BEANS.getOrder()%>
        </td>
        <td> <font size=“4” color=“#0000CD” /> <%=SPRING_BEANS.getTopic()%>
        </td>
        <td> <font size=“4” color=“#4682B4” /> <%=SPRING_BEANS.getDescription()%>
        </td>
    </tr>
    <tr>
        <td> <font size=“4” color=“#000080” /> <%=SPRING_DATA.getOrder()%>
        </td>
        <td> <font size=“4” color=“#0000CD” /> <%=SPRING_DATA.getTopic()%>
        </td>
        <td> <font size=“4” color=“#4682B4” /> <%=SPRING_DATA.getDescription()%>
        </td>
    </tr>
    <tr>
        <td> <font size=“4” color=“#000080” /> <%=SPRING_SECURITY.getOrder()%>
        </td>
        <td> <font size=“4” color=“#0000CD” /> <%=SPRING_SECURITY.getTopic()%>
        </td>
        <td> <font size=“4” color=“#4682B4” /> <%=SPRING_SECURITY.getDescription()%>
        </td>
    </tr>
    <tr>
        <td> <font size=“4” color=“#000080” /> <%=SPRING_BOOT.getOrder()%>
        </td>
        <td> <font size=“4” color=“#0000CD” /> <%=SPRING_BOOT.getTopic()%>
        </td>
        <td> <font size=“4” color=“#4682B4” /> <%=SPRING_BOOT.getDescription()%>
        </td>
    </tr>
</table>


</br><a href=${pageContext.request.contextPath}/module3>&#8592Предыдущий модуль</a>
</br><a href='${pageContext.request.contextPath}/'>Назад</a>
</body>
</html>