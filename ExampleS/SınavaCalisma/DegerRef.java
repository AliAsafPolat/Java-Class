package S�navaCalisma;

public class DegerRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DegerRef deneme=new DegerRef();
		int count=5;
		ilkelDuzenle(count);
		System.out.println(count); 	//Fonksiyonun i�inde art�rd� geri d�nd�rmedi.
		Integer a=new Integer(5);
		Integer b=17;
		sarmalay�c�Duzenle(a);	
		System.out.println("After :" +a);
		sarmalay�c�DegistirAlt(a,b);
		System.out.println(a);
	}

	public static void ilkelDuzenle(int a) {
		a++;
	}
	public static void sarmalay�c�Duzenle(Integer a) {
		a++;
	}
	public void ilkelDegistir(int a,int b) {
		int tmp=a; a=b; b=tmp;
	}
	public void sarmalay�c�Degistir(Integer a,Integer b) {
		Integer tmp=a; a=b; b=tmp;
	}
	public static void sarmalay�c�DegistirAlt(Integer a,Integer b) {
		Integer tmp=new Integer(a);
		a=new Integer(b);
		b= new Integer(tmp);
	}
	public static void bakDegiscek(Integer x) {
		int a=x.intValue();
		a++;
	
	}
}
