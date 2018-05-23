public class ConnectDB {
	private static final String URL = "";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {

		}
		try {
			return DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			return null;
		}
	}
}