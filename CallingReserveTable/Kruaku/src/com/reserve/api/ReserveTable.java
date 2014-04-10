package com.reserve.api;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reserve.database.DatabaseHelper;

/**
 * Servlet implementation class ReserveTable
 */
@WebServlet("/ReserveTable")
public class ReserveTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReserveTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DatabaseHelper dbHelper = DatabaseHelper.getInstance();
		DateFormat df = new SimpleDateFormat("HHmm", Locale.getDefault());

		String fullname = request.getParameter("fullname");
		String telephone = request.getParameter("telephone");
		int amount = Integer.valueOf(request.getParameter("amount"));
		String email = request.getParameter("email");
		String reserveDate = request.getParameter("reserve_date");
		String diningTableId = request.getParameter("dining_table_id");
		String reserveCode = df.format(new Date()).toUpperCase(Locale.getDefault());

		// Connect to database
		dbHelper.open();

		Connection connection = dbHelper.getConnection();

		PreparedStatement statement;
		int i = 0;

		try {
			statement = connection
					.prepareStatement("INSERT INTO `reserve` (`fullname`, `telephone`, `amount`, `email`, `reserve_date`, `reserve_code`, `dining_table_id`, `user_id`) VALUES(?,?,?,?,?,?,?,?)");

			statement.setString(++i, fullname);
			statement.setString(++i, telephone);
			statement.setInt(++i, amount);
			statement.setString(++i, email);
			statement.setString(++i, reserveDate);
			statement.setString(++i, reserveCode);
			statement.setString(++i, diningTableId);
			statement.setInt(++i, 0);

			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbHelper.close();
	}
}
