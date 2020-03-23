<%--
  Created by IntelliJ IDEA.
  User: binizmohamed
  Date: 3/22/20
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC 5 - form handling | Java Guides</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">


</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h2 class="text-center">Spring MVC 5 + Hibernate 6 + JSP + MySQL</h2>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add Employee</div>
            </div>
            <div class="panel-body">
                <form:form action="saveEmployee" cssClass="form-horizontal"
                           method="post" modelAttribute="employee">

                    <!-- need to associate this data with Employee id -->
                    <form:hidden path="id" />

                    <div class="form-group">
                        <label for="firstName" class="col-md-3 control-label">
                           First Name</label>
                        <div class="col-md-9">
                            <form:input path="firstName" cssClass="form-control" />
                        </div>
                        <div class="col-md-3">
                            <form:errors path="firstName" cssClass="alert alert-warning" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="lastName" class="col-md-3 control-label">
                            Last Name</label>
                        <div class="col-md-9">
                            <form:input path="lastName" cssClass="form-control" />
                        </div>
                        <div class="col-md-3">
                            <form:errors path="lastName" cssClass="alert alert-warning" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="salary" class="col-md-3 control-label">salary</label>
                        <div class="col-md-9">
                            <form:input path="salary" cssClass="form-control" />
                        </div>
                        <div class="col-md-3">
                            <form:errors path="salary" cssClass="alert alert-warning" />
                        </div>
                    </div>

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-md-offset-3 col-md-9">
                            <form:button cssClass="btn btn-primary">Submit</form:button>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>

