package S�navaCalisma;

public class kal�t�mMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee []staff=new Employee[3];
	Manager boss=new Manager("Asaf Reis",5000);
	boss.setBonus(2000);
	staff[0]=boss;
	staff[1]=new Employee("Kagawa",2000);
	staff[2]=new Employee("Nagatomo",2001);
	
	for(Employee isci:staff) {
		System.out.println(isci.getName()+"  "+isci.getSalary());
	}
	
	//Employee kisi=new Person("kra�");***HATALI***
	Person kisiler=new Employee("ali",55); //parent child � tutabiliyor ama child parenti tutam�yor.
	//ama parent child�n methodlar�na eri�emiyor.
	}

}
