<%@ page contentType="text/html; charset=iso-8859-1" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Add Data To DataBase</title>
</head>

<body>
	<form name="TestForm" method="post" action="/InventoryScrum/Product">
		<label> <label>Emp_Id</label>&nbsp;&nbsp;&nbsp;&nbsp; <input
			type="text" name="empid" />
		</label>
		<p>
			<label>Emp_Name <input type="text" name="ename" />
			</label>
		</p>
		<p>
			&nbsp;&nbsp;&nbsp;<input type="submit" name="Submit" value="Submit" />
		</p>
	</form>
</body>
</html>