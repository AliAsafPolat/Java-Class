package Ders�rne�i;

public class test {

	public enum size{SMALL,MEDIUM,LARGE,XLARGE;}
	
	
	public static void main(String[] args) {
			size s=size.LARGE;
			
		
		
		Toy toy=new Toy ("123","For Kids",5);
		Clothing giysi=new Clothing("123321", "5-12 ya�",0,25);
		
		Child kid1=new Child("Asaf",12);
		Child kid2=new Child("As�m",16);
		Child kid3=new Child("Asya",27);
		Child kid4=new Child("Asl�",22);
		
		KinderGarten bah�e=new KinderGarten();
		bah�e.addChild(kid4);
		bah�e.addChild(kid3);
		bah�e.addChild(kid2);
		bah�e.addChild(kid1);
		
		System.out.println(giysi.isSuitable(kid3));
		System.out.println(giysi.isSuitable(kid2));
		System.out.println(giysi.isSuitable(kid1));
		System.out.println(giysi.isSuitable(kid4));
		System.out.println(bah�e.findOldestChild());
		
		

	}

}
