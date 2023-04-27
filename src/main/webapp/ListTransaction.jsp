<%@page import="java.util.ArrayList"%>
<%@page import="dao.Transaction"%>
<%@page import="java.util.List"%>
<%@page import="dao.TransactionDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of all transactions</title>
</head>
<body>
<%!TransactionDao trdao=new TransactionDao(); %>
<%!String tableContent=""; %>
<%!ArrayList<Transaction> trs=new ArrayList<Transaction>(); %>
<%trs=trdao.findAllTransactions(); %>
<%for(int i=0; i<trs.size();i++){
	tableContent+="<tr>"+"<td>"+trs.get(i).getRef()+"</td>"+"<td>"+trs.get(i).getCptDeb()+"</td>"+"<td>"+trs.get(i).getCptCred()+"<td>"+trs.get(i).getMontant()+"</td>"+"</tr>";
}
%>
	<h1>Transactions : </h1>
	<table border="1">
		<tr>
			<td>Reference</td><td>CompteDeb</td><td>CompteCred</td><td>Montant</td>
		</tr>
		<%=tableContent %>
		<tr><a href="newTransaction.html">Add a new transaction</a></tr>
	</table>
</body>
</html>