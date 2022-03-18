
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency converter</title>
</head>
<body>
<h1>Currency converter</h1>
<form action="/converter/usdToVnd" method="post">
    <table>
        <tr>
            <td><label>USD: </label></td>
            <td><input type="text" name="usd" placeholder="USD"></td>
        </tr>
        <tr>
            <td><label>Rate: </label></td>
            <td><input type="text" name="rate" placeholder="Rate" value="23000"></td>
        </tr>
    </table>
    <button>Converter</button>
</form>
</body>
</html>
