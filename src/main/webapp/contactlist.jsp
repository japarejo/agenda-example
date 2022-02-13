<%@page import="agenda.model.Contact"%>
<%@page import="agenda.model.repository.ContactRepository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Nombre</th><th>Teléfono</th>
		</tr>
	<c:forEach items="${contactRepository.contacts}" var="cont">
			<tr>
				<td><c:out value="${cont.value.name}"/></td>
				<td><c:out value="${cont.value.telephone}"/></td>
			</tr>
	</c:forEach>
	</table>
</body>
</html>