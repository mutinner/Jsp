<span>
	<%= session.getAttribute("msg") = "failed" ? "用户名或密码错误" : "" %>
</span>
<form action="LoginServlet" method="post">
	用户名:	<input type="text" name="username"><br>
	密码:	<input type="password" name="password"><br>
	<input type="submit" value="submit">
</form>

<%= "welcome " + session.getAttribute("username") + " !"%>

<h3><%= session.getAttribute("username")%></h3>
<h3><%= application.getAttribute("vis")%></h3>