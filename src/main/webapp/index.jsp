<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>XML parser</title>
</head>
<body>
	<h3>XML parser</h3>
	<form enctype="multipart/form-data" method="post">
		<input type="file" name="xml" accept=".xml">
		<p>Выберите парсер</p>
		<select name="parserType">
			<option value="DOM">DOM</option>
			<option value="SAX">SAX</option>
			<option value="StAX">StAX</option>
		</select> <input type="submit" value="Выполнить">
	</form>
</body>
</html>