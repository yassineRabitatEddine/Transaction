<%@page import="dao.TransactionDao"%>
<%@page import="dao.Transaction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%!TransactionDao trdao=new TransactionDao(); %>
	<%trdao.begin(); %>
	<%trdao.save(new Transaction(Integer.parseInt(request.getParameter("id")),request.getParameter("ref"),request.getParameter("cptDeb"),request.getParameter("cptCred"),Double.parseDouble(request.getParameter("montant")))); %>
	<%trdao.commit(); %>
</body>
</html>