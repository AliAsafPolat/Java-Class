package Enum;

public class test {
    
	public enum Size{
		SMALL,LARGE,XLARGE;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Size.LARGE);
		Tarif trf=Tarif.AVANTAJLIPAKET;
	M��teri m�t=new M��teri("Asaf",Tarif.BOLPAKET);
	M��teri m�t1=new M��teri("As�m",trf);
	
	System.out.println("Tarifelerimiz : ");
	for(Tarif trf1:Tarif.values()) {
		System.out.println(trf1.toString());
	}
	
	System.out.println(m�t.toString());
	System.out.println(m�t1.toString());
	
	
	System.out.println("Tarife Ad� : "+m�t.getTarife()+"\tTarife �creti : "+m�t.getTarife().get�cret());
	
	}

}
