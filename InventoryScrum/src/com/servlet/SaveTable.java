
import java.beans.Statement;
import java.io.IOException;
//import java.io.PrintWriter;
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

import java.sql.*;

import static java.lang.System.out;

/**
 * Servlet implementation class SaveTable
 */
@WebServlet("/SaveTable")

public class SaveTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Connection conn = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveTable() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @param table_number 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response, String table_number) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//
//		String connectionURL = "jdbc:postgresql://119.59.97.11:5432/mykitchen";
//		Connection connection = null;
//		response.setContentType("text/html");
//		
//		String tablename = request.getParameter("table_name");
//		Integer seat = Integer.parseInt(request.getParameter("seat"));
//
//		System.out.println("PostGreSql Connect Example.get");
//		try {
//			// Load the database driver
//			Class.forName("org.postgresql.Driver");
//			// Get a Connection to the database
//			connection = DriverManager.getConnection(connectionURL, "spartan",
//					"spartan");
//			
//			PreparedStatement pst = connection
//					.prepareStatement("INSERT into diningtable VALUES(?,?,?)");
//
//			pst.setString(1, tablename);
//			pst.setInt(2, seat);
//			pst.setInt(3, 0);
//
//			int numRowsChanged = pst.executeUpdate();
//			if (numRowsChanged != 0) {
//				out.println("<br>Record has been inserted");
//			} else {
//				out.println("failed to insert the data");
//			}
//			pst.close();
//		} catch (ClassNotFoundException e) {
//			out.println("Couldn't load database driver: " + e.getMessage());
//		} catch (SQLException e) {
//			out.println("SQLException caught: " + e.getMessage());
//		} catch (Exception e) {
//			out.println(e);
//		} finally {
//			// Always close the database connection.
//			try {
//				if (connection != null)
//					connection.close();
//			} catch (SQLException ignored) {
//				out.println(ignored);
//			}
//		}
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String connectionURL = "jdbc:postgresql://119.59.97.11:5432/mykitchen";
		Connection connection = null;
		response.setContentType("text/html");
		
		String tablename = request.getParameter("table_name");
		Integer seat = Integer.parseInt(request.getParameter("seat"));

		System.out.println("PostGreSql Connect Example.post");
		try {
			// Load the database driver
			Class.forName("org.postgresql.Driver");
			// Get a Connection to the database
			connection = DriverManager.getConnection(connectionURL, "spartan",
					"spartan");
			
			 
			PreparedStatement pst = connection
					.prepareStatement("INSERT into diningtable VALUES(?,?,?)");
       
			pst.setString(1, tablename);
			pst.setInt(2, seat);
			pst.setInt(3, 0);

			int numRowsChanged = pst.executeUpdate();
			if (numRowsChanged != 0) {
				out.println("<br>Record has been inserted");
				response.sendRedirect("viewtable.jsp");
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
