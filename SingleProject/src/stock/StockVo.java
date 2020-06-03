package stock;

public class StockVo {
	private int eventcode;
	private String company;
	private long listedstocks;
	private long capital;
	private int par;
	private String currency;
	private String address;
	private String mainnumber;

	public StockVo() {

	}

	public StockVo(int eventcode, String company, long listedstocks, long capital, int par, String currency,
			String address, String mainnumber) {
		this.eventcode = eventcode;
		this.company = company;
		this.listedstocks = listedstocks;
		this.capital = capital;
		this.par = par;
		this.currency = currency;
		this.address = address;
		this.mainnumber = mainnumber;
	}

	public int getEventcode() {
		return eventcode;
	}

	public String getCompany() {
		return company;
	}

	public long getListedstocks() {
		return listedstocks;
	}

	public long getCapital() {
		return capital;
	}

	public int getPar() {
		return par;
	}

	public String getCurrency() {
		return currency;
	}

	public String getAddress() {
		return address;
	}

	public String getMainnumber() {
		return mainnumber;
	}

}
