package corejava.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class MySQLAccess {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void readDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(
					"jdbc:mysql://bcp7-java-db-01.cs4gnvom3jcr.ap-south-1.rds.amazonaws.com/ingits.bcp7javaee?"
							+ "user=ingits&password=bcp7javaee&useSSL=false");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();

			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from comments");
			writeResultSet(resultSet);

			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect.prepareStatement("insert into  comments values (default, ?, ?, ?, ? , ?, ?)");
			// "myuser, webpage, datum, summary, COMMENTS from comments");
			// Parameters start with 1
			preparedStatement.setString(1, "Test");
			preparedStatement.setString(2, "TestEmail");
			preparedStatement.setString(3, "TestWebpage");
			preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
			preparedStatement.setString(5, "TestSummary");
			preparedStatement.setString(6, "TestComment");
			preparedStatement.executeUpdate();

			preparedStatement = connect
					.prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from comments");
			resultSet = preparedStatement.executeQuery();
			writeResultSet(resultSet);

			// Remove again the insert comment
			preparedStatement = connect.prepareStatement("delete from comments where myuser= ? ; ");
			preparedStatement.setString(1, "Test");
			preparedStatement.executeUpdate();

			resultSet = statement.executeQuery("select * from comments");
			writeResultSet(resultSet);

			System.out.println("\n [MetaData Details]");
			writeMetaData(resultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void writeMetaData(ResultSet resultSet) throws SQLException {
		// Now get some metadata from the database
		// Result set get the result of the SQL query

		System.out.println("The columns in the table are: ");

		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			System.out.println("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {

		System.out.println();
		System.out.println(">>>>>> Writing Result Set <<<<<<");
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String user = resultSet.getString("myuser");
			String website = resultSet.getString("webpage");
			String summary = resultSet.getString("summary");
			Date date = resultSet.getDate("datum");
			String comment = resultSet.getString("comments");
			System.out.println("User: " + user);
			System.out.println("Website: " + website);
			System.out.println("summary: " + summary);
			System.out.println("Date: " + date);
			System.out.println("Comment: " + comment);
		}
	}

	// Updating the database
	private void updateDatabase() throws SQLException {

		// read input
		Scanner scan = null;
		scan = new Scanner(System.in);
		if (scan != null) {
			System.out.println("Enter the details" + " to update user, email,website,summary,date,comment: ");

			String user = scan.next();
			String email = scan.next();
			String website = scan.next();
			String summary = scan.next();
			String date = scan.next();
			String comment = scan.next();

			PreparedStatement st = connect.prepareStatement(
					"insert into  comments(myuser,email,webpage,datum,summary,COMMENTS) values (?,?,?,?,?,?)");

			st.setString(1, user);
			st.setString(2, email);

			st.setString(3, website);
			st.setString(4, summary);
			st.setString(5, date);
			st.setString(6, comment);
			// 5
			st.executeUpdate();
		}

	}

	// You need to close the resultSet
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws Exception {
		MySQLAccess dao = new MySQLAccess();
		dao.readDataBase();
		dao.updateDatabase();
	}
}
