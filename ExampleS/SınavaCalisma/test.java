package S�navaCalisma;

import java.util.EnumSet;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str="Asaf";
		String str2="Beyza";
		String str3="Ane";
		System.out.println(str.compareTo(str2));// Gelen kelime s�zl�kte �nceyse negatif
		System.out.println(str.compareTo(str3));// S�zl�kte �nceyse pozitif 
		System.out.println(str.compareTo(str)); // E�itlerse s�f�r d�nd�r�r.
		System.out.println(str.toUpperCase());	// toUpperCase methodu stringi de�i�tirmez.
		System.out.println(str);
		str=str.toUpperCase();					// Ancak b�yle bir atama yaparsak string de�i�ir.
		System.out.println(str);
		System.out.println(str.toLowerCase());
		
		System.out.println(str.contains(str));
		System.out.println(str.contains(str3));
		str=str.toLowerCase();					
		System.out.println(str.contains("saf"));// ��inde bu substring var ise true d�nd�r�r.
		
		*/
		/*
		double val=Math.random();				//random fonksiyonu double de�er �retiyormu�.
		System.out.println("val is : "+val);
		//int value=Math.random(); ** Hatal� kod.
		Random rand=new Random();
		System.out.println(rand.nextInt());	
		System.out.println(rand.nextInt(3));	//3-1=2 ye kadar random de�er �retir.
		System.out.println(Math.abs(-50));		//Mutlak de�er
		System.out.println(Math.min(40, 5));
		System.out.println(Math.max(40, 4));
		*/
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Ad�n� gir");
		String kisi=scan.nextLine();
		System.out.println(kisi);
		
		System.out.println("Numaran� gir : ");
		int num=scan.nextInt();					//nextInt ile okuma yapt�ktan sonra nextLine kullanmak gerekiyor.
		scan.nextLine();
		System.out.println("Tc gir : ");
		String tc=scan.nextLine();
		System.out.println(tc);
		*/
		
		/*
		 * Car car=new Car();
		car.setName("bmw");
		System.out.println(car);
		degis(car);								//Methodlar�n� kullanarak objelerin i�eri�ini de�i�tirebilirsin.
		System.out.println(car);
		
		Car koltuk=new Koltuk("asaf");
		System.out.println(koltuk);
	*/
		
		Enum�rnek tarife=Enum�rnek.BOSKONUSMA;	//Yeni bir tarife olu�turuldu.
	System.out.println(tarife+"\t"+tarife.getFiyat());
	//tarife.setFiyat(45);
	System.out.println(tarife);
	EnumSet <G�nler> set1,set2,set3,set4;
	
	set2=EnumSet.of(G�nler.PAZARTES�); 			//Set2'ye pazartesiyi ekler. 
	System.out.println(set2);				
	System.out.println(EnumSet.complementOf(set2));	//Set2 nin de�ilini al�r.
	set1=EnumSet.complementOf(set2).range(G�nler.�AR�AMBA, G�nler.CUMARTES�);
	System.out.println(set1);
	set3=EnumSet.range(G�nler.PER�EMBE, G�nler.PAZAR); //Per�embeden pazara kadar olan g�nleri al�r.
	System.out.println(set3);
	System.out.println(EnumSet.allOf(G�nler.class));	//B�t�n g�nleri yazd�r�r.
	set4=EnumSet.copyOf(set3);							//set4, set3� kopyalar.
	System.out.println(set4);
	}
	public enum G�nler{
		PAZARTES�,SALI,�AR�AMBA,PER�EMBE,CUMA,CUMARTES�,PAZAR;
	}
	/*public static void degis(Car car) {
		car.setName("audi");
	}*/

	
}
