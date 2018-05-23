public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext ctx = this.getServletContext();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(!username.equals("张三")||!password.equals("123456")) {
			session.setAttribute("msg","failed");
			response.sendRedirect("login.jsp");
		} else {
			session.setAttribute("username",username);
			session.setAttribute("msg","succeed");
			Integer num = (Integer)ctx.getAttribute("vis");
			if (num==null) ctx.setAttribute("vis", num);
			else if (session.isNew()) ctx.setAttribute("vis",num+1); 
			response.sendRedirect("home.jsp");
		}
	}
}