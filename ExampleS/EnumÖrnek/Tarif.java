package Enum;

public enum Tarif {
AVANTAJLIPAKET(500,100,10,40),BOLPAKET(1000,150,16,55),KONU�MAPAKET�(500,500,10,50);
	private int konusma,sms,internet,�cret;
	private Tarif(int konus,int sms,int internet,int �cret) {
		this.internet=internet;
		this.konusma=konus;
		this.sms=sms;
		this.�cret=�cret;
	}
	
	public int get�nternet() {
		return this.internet;
	}

	public int getSms() {
		return this.sms;
	}
	
	public int getKonusma() {
		return this.konusma;
	}
	
	public int get�cret() {
		return this.�cret;
	}
	
	
}
