package com.email;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailSenderServlet
 */
public class EmailSenderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailSenderServlet() { 
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().print("dfdfgdfgdfg");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("Email");
		String tableNo = request.getParameter("TableNo");
		String queueNo = request.getParameter("QueueNo");
		
		com.email.EmailSender sendEmail = new com.email.EmailSender();
		boolean isPassMail = sendEmail.sendEmail(email, queueNo, tableNo);
		
		String result = "FAIL";
		if(isPassMail)
			result = "SUCCESS";
		
		request.setAttribute("SendMailResult", result);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
