package S�navaCalisma;

public enum Enum�rnek {
	
COKKONUSMA(500,1000,10,40),BOSKONUSMA(500,500,5,30);
	
	private final int dakika;
	private final int sms;
	private final int internet;
	private final int fiyat;
	Enum�rnek(int dakika,int sms,int internet,int fiyat){
		this.dakika=dakika;
		this.sms=sms;
		this.internet=internet;
		this.fiyat=fiyat;
	}/*
	public void setDakika(int set) {
		this.dakika=set;
	}
	public void setSms(int set) {
		this.sms=set;
	}
	public void set�nternet(int set) {
		this.internet=set;
	}
	public void setFiyat(int set) {
		this.fiyat=set;
	}*/
	
	public int getDakika() {
		return this.dakika;
	}
	public int getSms() {
		return this.sms;
	}
	public int get�nternet() {
		return this.internet;
	}
	public int getFiyat() {
		return this.fiyat;
	}
	/*
	public String toString() {
		return "Dakika : "+this.dakika+"\tSms : "+this.sms+"\t�nternet : "+this.internet
				+"\tFiyat : "+this.fiyat;
	}*/
}
