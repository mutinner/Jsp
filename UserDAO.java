public class UserDAO {
	private int uid;
	private String uname;
	private String upwd;

	public UserDAO(int uid,String uname,String upwd) {
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	boolean validateUser(String username,String password) {
		boolean ans = false;
		String sql = "SELECT upwd FROM users WHRER unmae = " + username;
		Connection conn = new ConnectDB().getConnection();
		try {
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1,username);
			ResultSet res = p.executeQuery();
			if (res != null) {
				res.next();
				String upwd = res.getString(1);
				if (upwd.equals(password)) ans = true;
			}
		} catch (SQLException e) {

		}
		return ans;
	}
}