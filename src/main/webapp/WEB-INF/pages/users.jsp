<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
        <a class="nav-link
                                ${pageContext.request.requestURI.substring(pageContext.request.requestURI.lastIndexOf("/")) eq '/addUser.jsp' ? 'active' : ''}"
           aria-current="page" href="${pageContext.request.contextPath}/AddUser">Add User</a>
    </c:if>
    <div class="container text-center">
        <c:forEach var="user" items="${users}">
            <div class="row">
                <div class="col">${user.username}</div>
                <div class="col">${user.email}</div>
            </div>
        </c:forEach>
    </div>
</t:pageTemplate>