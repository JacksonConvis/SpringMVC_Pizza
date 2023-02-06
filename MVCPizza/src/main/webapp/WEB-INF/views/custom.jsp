<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Pizza Builder!</title>
</head>
<h1>Custom Pizza Builder!</h1>

<form action ="customresults" method="GET">
Pizza Size <select name="size">
<option>Small</option>
<option>Medium</option>
<option>Large</option>
</select>

<p> Topping Count: <input type="number" name="toppings"> </p>
<p> Select for Gluten Free crust <input type="checkbox" name="gf"> </p>
<p> Special Instructions: <input type="text" name="instructions"> </p>
<p>  <input type="submit" value="submit"></p>


</form>
<body>

</body>
</html>