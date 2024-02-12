package dao;

public class Dao {
	public void Connection(int id) {

		//		//DB接続用定数
		//		String DATABASE_NAME = "Sample";
		//		String PROPATIES = "?characterEncoding=UTF-8&serverTimezone=JST";
		//		String URL = "jdbc:mySQL://localhost/" + DATABASE_NAME + PROPATIES;
		//		//DB接続用・ユーザ定数
		//		String USER = "root";
		//		String PASS = "root";
		//		Connection connection = null;
		//
		//		try {
		//			//MySQL に接続する
		//			Class.forName("com.mysql.cj.jdbc.Driver");
		//			//データベースに接続
		//			connection = DriverManager.getConnection(URL, USER, PASS);
		//			PreparedStatement pStatement = connection.prepareStatement("SELECT name FROM employees WHERE id = ? ");
		//			pStatement.setInt(1, id);
		//			ResultSet rs = pStatement.executeQuery();
		//			Bean bean = new Bean();
		//			if (rs.next()) {
		//				bean.setName(rs.getString("name"));
		//			}
		//
		//		} catch (SQLException | ClassNotFoundException e) {
		//			e.printStackTrace();
		//		} finally {
		//			try {
		//				if (connection != null) {
		//					// データベースを切断
		//					connection.close();
		//				}
		//
		//			} catch (SQLException e) {
		//				e.printStackTrace();
		//			}
		//		}
	}
}
