<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <jsp:include page="head.jsp"></jsp:include>
</head>

<nav><jsp:include page="navbar.jsp"></jsp:include></nav>

<body>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">name</th>
            <th scope="col">description</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>
                    <c:out value="${list.getName()}"/>
                </td>
                <td>
                    <c:out value="${list.getDescription()}"/>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</body>
<jsp:include page="scriptJS.jsp"></jsp:include>
</html>