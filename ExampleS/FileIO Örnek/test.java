package FileIO;

import java.io.*;
import java.util.LinkedList;

/*Yazma i�lemlerinde dikkat edece�im bir husus �udur ki e�er yazaca��m bir objenin i�inde ba�ka bir class a ait bir field var ise 
 * onun da serializable olmas� gereklidir.Serializeable yapmad�klar�m� bast�rmak zorunday�m.
 * 
 * Okuma i�lemlerinde ise hem input-output hem de typecasting i�in exception yazmam gerekir.
 * 
 * */

public class test {

	public static void main(String[] args) {
			
		String fileName="Asaf.txt";
		Person p=new Person("AsafReis","1390106");
		
		try {
			ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(fileName,true));	//obje yazmak i�in stream a�t�k 
			writer.writeObject(p);																	//yazma i�lemini yapt�k
			System.out.println("Operation successfully completed in "+fileName);
			writer.close();																			//a�t���m stream� kapatmal�y�m.
		}catch(IOException e) {
			System.out.println("An exception detected while writing an object!");
			e.printStackTrace();
		}
		Person ki�i = null;
		try {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(fileName));			//Dosyadan obje okuyaca��m� bildiriyorum.
			ki�i =(Person) reader.readObject();														//Okuma i�lemini yap�yorum.
			reader.close();																			//��lem bittikten sonra stream� kapatmal�y�m.				
		}catch(IOException e) {
			System.out.println("An exception detected while reading an object!");					//Okuma i�leminde iki tane exception kontrol yapmal�y�m.
			e.printStackTrace();																	//Birincisi IO di�eri ise typecasting i�in olmal�.
		} catch (ClassNotFoundException e) {
			System.out.println("An exception detected while typecasting!");
			e.printStackTrace();
		}
		System.out.println(ki�i.getName()+" "+ki�i.getTc());										//Dosyadan ald���m bilgileri yazd�r�yorum.
		
	  LinkedList<Person> ki�iler=new LinkedList<Person>();
	  Person p1=new Person("ali","321321");
	  Person p2=new Person("alim","32d3t1");
	  Person p3=new Person("aliye","3s13e1");
	  Person p4=new Person("aliko","3a1f21");
	  ki�iler.add(p4);
	  ki�iler.add(p3);
	  ki�iler.add(p2);
	  ki�iler.add(p1);
	  
	  try {
		  ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(fileName));
		  writer.writeObject(ki�iler);
		  System.out.println("LinkedList is successfully written to file!");
		  writer.close();
	  }catch(IOException e) {
		  System.out.println("An exception detected while writing to file!");
		  e.printStackTrace();
	  }
	  LinkedList<Person> readPersons = null;
	  try {
		  ObjectInputStream reader=new ObjectInputStream(new FileInputStream (fileName));
		  readPersons=(LinkedList<Person>) reader.readObject();
		  System.out.println("LinkedList is successfully read from the file!");
		  reader.close();
	  }catch(IOException|ClassNotFoundException e) {
		  System.out.println("An exception detected while reading a LinkedList from the file!");
		  e.printStackTrace();
	  }
	  
	  for(Person x:readPersons) {
		  System.out.println(x.getName()+" - "+x.getTc());
	  }
	  
	}

}
