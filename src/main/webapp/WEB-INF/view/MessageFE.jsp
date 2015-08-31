<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page session="false" %>


<html>
<head>
<script >

 
   
 
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Convert currency</title>
</head>
<body>


<f:form method="POST" action="processTradeMsg">
    <table>
      <tbody>
        <tr>
          <td>User ID:</td>
          <td><f:input path="userId" size="10" maxlength="10"></f:input></td>
        </tr>
        <tr>
          <td>Currency From:</td>
          <td><f:input path="currencyFrom" size="30"></f:input></td>
        </tr>
        <tr>
          <td>Currency To:</td>
          <td><f:input path="currencyTo" size="30"></f:input></td>
        </tr>
        <tr>
          <td>Amount Sell:</td>
          <td><f:input path="amountSell" size="30"></f:input></td>
        </tr>
         <tr>
          <td>Amount Buy:</td>
          <td><f:input path="amountBuy" size="30"></f:input></td>
        </tr>
        <tr>
          <td>Rate:</td>
          <td><f:input path="rate" size="30"></f:input></td>
        </tr>
         <tr>
          <td>Time Placed:</td>
          <td><f:input path="timePlaced" size="40"></f:input></td>
        </tr>
         <tr>
          <td>Originating Country:</td>
          <td><f:input path="originatingCountry" size="40"></f:input></td>
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="Convert"></td>
        </tr>
      </tbody>
    </table>
    </f:form>

</body>
</html>