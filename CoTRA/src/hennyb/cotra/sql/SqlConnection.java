package hennyb.cotra.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Row;

public class SqlConnection {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public SqlConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager.getConnection(
				"jdbc:mysql://localhost/cotreports", "root", "omMWY90otazu");

		statement = connect.createStatement();
	}

	public void readDataBase() throws Exception {

		// resultSet gets the result of the SQL query
		resultSet = statement
				.executeQuery("SELECT * FROM `cotreports` WHERE 1");

	}

	public void insertIntoSQL(String insertInto) {

		try {
			// statement.executeUpdate("INSERT INTO cotreports (MarketAndExchangeNames) VALUES (1.3)");
			statement.executeUpdate(insertInto);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
