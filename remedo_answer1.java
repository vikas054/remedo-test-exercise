Import java,sql,*;
public class GetData{
	public static void main(String[] args){
		String driverName = “com.mysql.jdbc.Driver” ; 
		String url = “jdbc:mysql://mysql.remedoapp.com:3306/remedo-database”;
		String userid = “remedo”;
		String password = “mypass”;
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(url,userid,password);
		String query = “select u.user_id, u. address, t. total_invoice_amount, t.invoice_amount_paid, t remedo_commission from users u , transactions  t where u.user_id = t.user_id and u.user_id = ‘u1’ ”;
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			String userid = rs.getString(“user_id”);
			String address = rs.getString(“address”);
			String total_invoice_amount = rs.getString(“total_invoice_amount”);
			String invoice_amount_paid = rs.getString(“invoice_amount_paid”);
			String remedo_commission  = rs.getString(“remedo_commission”);
		}
	}
}