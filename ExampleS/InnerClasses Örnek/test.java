package InnerClasses;
import InnerClasses.Ki�i.�al��an;
	
/* Burada da �nner class public tan�mland� ve d��ar�da bir classdaki main ile onu kullanmaya ba�lad�m.
 * Bu da inner class �n bulundu�u yeri import etmem ile m�mk�n oldu. 
 * */
public class test {

	public static void main(String[] args) {
		�al��an []staff=new �al��an[3];
		Ki�i kisi=new Ki�i("AsafKral");
		staff[0]=kisi.new �al��an(1000);
		kisi=new Ki�i("Aliye");
		staff[1]=kisi.new �al��an(564);
		kisi=new Ki�i("Alican");
		staff[2]=kisi.new �al��an(5456);
		
		for(�al��an c:staff) {
			System.out.println(c);
		}
	}

}
