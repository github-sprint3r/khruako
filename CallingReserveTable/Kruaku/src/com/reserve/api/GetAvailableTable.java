package com.reserve.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
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
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int inputAmount = 0;
		ArrayList<TableData> tableResult = new ArrayList<TableData>();
		String stringQuery = "SELECT * FROM dinning_table WHERE (available = 0) AND (capacity < " + inputAmount + ");";
		PrintWriter printWriter = response.getWriter();
		
	}

}
