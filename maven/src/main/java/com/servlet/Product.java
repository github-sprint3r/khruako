package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<option value='1'>one</option>");
		out.println("<option value='2'>two</option>");
		out.println("<option value='3'>three</option>");
		out.println("<option value='4'>four</option>");
		out.println("<option value='5'>five</option>");
		out.close();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Hello World</title></title>");
		pw.println("<body>");
		pw.println("<h1>Hello World</h1>");
		pw.println("</body></html>");
		// processRequest(request, response);

		String connectionURL = "jdbc:postgresql://localhost:5432/sample";
		Connection connection = null;
		ResultSet rs;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("PostGreSql Connect Example.");
		// get the variables entered in the form
		String username = request.getParameter("empid");
		String pass = request.getParameter("ename");

		try {
			// Load the database driver
			Class.forName("org.postgresql.Driver");
			// Get a Connection to the database
			connection = DriverManager.getConnection(connectionURL, "postgres",
					"password");
			// Add the data into the database

			// String sql = "insert into sample values(?,?)";

			PreparedStatement pst = connection
					.prepareStatement("INSERT into sample VALUES(?,?)");

			pst.setString(1, username);
			pst.setString(2, pass);

			int numRowsChanged = pst.executeUpdate();
			if (numRowsChanged != 0) {
				out.println("<br>Record has been inserted");
			} else {
				out.println("failed to insert the data");
			}
			pst.close();
		} catch (ClassNotFoundException e) {
			out.println("Couldn't load database driver: " + e.getMessage());
		} catch (SQLException e) {
			out.println("SQLException caught: " + e.getMessage());
		} catch (Exception e) {
			out.println(e);
		} finally {
			// Always close the database connection.
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException ignored) {
				out.println(ignored);
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		String connectionURL = "jdbc:postgresql://localhost:5432/sample";
		Connection connection = null;
		ResultSet rs;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("PostGreSql Connect Example.");
		// get the variables entered in the form
		String username = request.getParameter("empid");
		String pass = request.getParameter("ename");

		try {
			// Load the database driver
			Class.forName("org.postgresql.Driver");
			// Get a Connection to the database
			connection = DriverManager.getConnection(connectionURL, "postgres",
					"password");
			// Add the data into the database

			// String sql = "insert into sample values(?,?)";

			PreparedStatement pst = connection
					.prepareStatement("INSERT into sample VALUES(?,?)");

			pst.setString(1, username);
			pst.setString(2, pass);

			int numRowsChanged = pst.executeUpdate();
			if (numRowsChanged != 0) {
				out.println("<br>Record has been inserted");
			} else {
				out.println("failed to insert the data");
			}
			pst.close();
		} catch (ClassNotFoundException e) {
			out.println("Couldn't load database driver: " + e.getMessage());
		} catch (SQLException e) {
			out.println("SQLException caught: " + e.getMessage());
		} catch (Exception e) {
			out.println(e);
		} finally {
			// Always close the database connection.
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException ignored) {
				out.println(ignored);
			}
		}
	}

}
