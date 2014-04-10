package com.reserve.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

	public static final String HOST = "localhost";
	public static final int PORT = 5432;
	public static final String DATABASE_NAME = "sample";

	private static DatabaseHelper mInstance;
	private String connectionURL = "jdbc:postgresql://" + HOST + ":" + PORT
			+ "/sample";
	private Connection mConnection;

	public Connection getConnection() {
		return mConnection;
	}

	private DatabaseHelper() {

	}

	public static DatabaseHelper getInstance() {
		if (mInstance == null) {
			mInstance = new DatabaseHelper();
		}

		return mInstance;
	}

	public void open() {
		try {
			// Load the database driver
			Class.forName("org.postgresql.Driver");

			// Get a Connection to the database
			mConnection = DriverManager.getConnection(connectionURL,
					"postgres", "password");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			mConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
