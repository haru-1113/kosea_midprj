package stock;

import java.util.ArrayList;

public class StockTest {

	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		ArrayList<StockVo> list = dao.list();

		for (int i = 0; i < list.size(); i++) {
			StockVo data = (StockVo) list.get(i);
			int eventcode = data.getEventcode();
			String company = data.getCompany();
			long listedstocks = data.getListedstocks();
			long capital = data.getCapital();
			int par = data.getPar();
			String currency = data.getCurrency();
			String address = data.getAddress();
			String mainnumber = data.getMainnumber();

			System.out.println(eventcode + "\t"  + company + "\t" + listedstocks + "\t" + capital + "\t" + par + "\t"
					+ currency + "\t" + address + "\t" + mainnumber);
		}

	}

}
