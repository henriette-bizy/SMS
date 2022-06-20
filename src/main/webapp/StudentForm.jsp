<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>




<html>
<head>
    <title>Students Managment</title>
     <%--    express language in href tag--%>
<%--    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css"> </link>--%>
    <style><%@include file="inc/style.css"%></style>
<%--    <script language="JavaScript" type="text/JavaScript"x src="../js/hello.js"></script>--%>
</head>
<body>
<center>
    <div class="heading">
    <h1>Students Management</h1>
    </div>

    <div class="form-links">


        <div class="link">
        <a href="studentForm">Add New Student</a>
        </div>

        <div class="link">
        <a href="list">List All Students</a>
        </div>

    </h2>
    </div>
</center>
<div align="center">

<%--     this is jstl which allows to declare some variable--%>
<%--    the jsp has capabilities to connect it's self to the db through this clienttt--%>
<%--    that's why it can check for the current environment--%>



    <div class="form">

    <s:if test="${student != null}">
    <form action="update" method="post">
        </s:if>
        <s:if test="${student == null}">
        <form action="insert" method="post" onSubmit="return sayHelloToThisPerson();">
            </s:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <s:if test="${student != null}">
                            Edit Student
                        </s:if>
                        <s:if test="${student == null}">
                            Add Student
                        </s:if>
                    </h2>
                </caption>
                <s:if test="${student != null}">
                    <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
                </s:if>

                <tr>
                    <th>First Name: </th>
                    <td>
                        <input type="text" name="firstName" size="45"
                               value="<s:out value='${student.firstName}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Last Name: </th>
                    <td>
                        <input type="text" name="lastName" size="45"
                               value="<s:out value='${student.lastName}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>gender: </th>
                    <td>
                        <input type="text" name="gender" size="5"
                               value="<s:out value='${student.gender}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                        <input type="button" value="clear" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>