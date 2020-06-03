package stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StockDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "stockadmin";
	String password = "kosea2019a";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public ArrayList<StockVo> list() {
		ArrayList<StockVo> list = new ArrayList<StockVo>();

		try {
			connDB();

			String query = "SELECT * FROM STOCK";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int eventcode = rs.getInt("eventcode");
				String company = rs.getString("company");
				long listedstocks = rs.getLong("listedstocks");
				long capital = rs.getLong("capital");
				int par = rs.getInt("par");
				String currency = rs.getString("currency");
				String address = rs.getString("address");
				String mainnumber = rs.getString("mainnumber");

				StockVo data = new StockVo(eventcode, company, listedstocks, capital, par, currency, address,
						mainnumber);
				list.add(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("stock driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement();
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
