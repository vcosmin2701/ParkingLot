<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Edit User">
    <h1>Edit User</h1>
    <form class="needs-validation" novalidate method="post" action="${pageContext.request.contextPath}/editUser">
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="username">Username:</label>
                <select id="username" name="username" class="form-control">
                    <option value="${user.id}">${user.username}</option>
                </select>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="password">Password (leave blank to keep the same):</label>
                <input type="password" id="password" name="password" autocomplete="off">
            </div>
        </div>

        <hr class="mb-4">
        <input type="hidden" name="user_id" value="${user.id}"/>
        <button class="btn btn-primary" type="submit">Save</button>
    </form>
</t:pageTemplate>