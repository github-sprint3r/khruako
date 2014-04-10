package com.reserve.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.reserve.database.DatabaseHelper;
import com.reserve.database.model.TableData;

/**
 * Servlet implementation class GetAvailableTable
 */
@WebServlet("/GetAvailableTable")
public class GetAvailableTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAvailableTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 getTable();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	void getTable() {
		ArrayList<TableData> tableResult = new ArrayList<TableData>();

		DatabaseHelper.getInstance().open();
		Connection connection = DatabaseHelper.getInstance().getConnection();
		String stringQuery = "SELECT * FROM dining_table";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(stringQuery);
			ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
		    	TableData table = new TableData();
		    	
		        table.setNumber(resultSet.getString("number"));
		        table.setCapacity(resultSet.getInt("capacity"));
		        table.setStatus(resultSet.getInt("available"));
		        
		        System.out.println(table.getNumber());
		        
		        tableResult.add(table);
		    }
	        resultSet.close();
	        prepareStatement.close();
	        
	        System.out.print("table count" + tableResult.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
