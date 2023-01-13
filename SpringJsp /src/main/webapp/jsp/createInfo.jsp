<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<c:if test="${operation == true}">
    <div class="alert alert-success" role="alert">
        Inserimento effettuato correttamente!
    </div>
</c:if>

<div class="container">
    <form action="${pageContext.request.contextPath}/createInfo" method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Name</label>
            <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Descrizione</label>
            <input type="text" name="description" class="form-control" id="exampleInputPassword1">
        </div>
        <button type="submit" class="btn btn-primary">Invia</button>
        <button type="button" style="color: white" class="btn btn-tertiary"><a href="${pageContext.request.contextPath}/listaPagine">vedi pagine</a> </button>


    </form>
</div>
<br>
<footer class="footer mt-auto py-3 bg-light">
    <div class="container">
        <span class="text-muted"></span>
    </div>
</footer>
</body>
<jsp:include page="scriptJS.jsp"></jsp:include>