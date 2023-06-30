<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<!-- Tag para permitir uso do Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>Selecione uma opção:</h1>
	<h2>
		<s:url action="consultarConvidado.action" var="consultarConvidado"></s:url>
		<a href="${consultarConvidado}" class="btn btn-warning text-white">Convidados</a>
	</h2>
	<h2>
		<s:url action="consultarEvento.action" var="consultarEvento"></s:url>
		<a href="${consultarEvento}" class="btn btn-warning text-white">Eventos</a>
	</h2>
	<h2>
		<s:url action="consultarRelatorios.action" var="consultarRelatorios"></s:url>
		<a href="${consultarRelatorios}" class="btn btn-warning text-white">Relatórios</a>
	</h2>
</div>

	<script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>