import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		Employee ram = new Employee(id,"rAm kUmar",9999);
		ram.setSalary(ram.getSalary()+1000);
		//System.out.println(ram.getSalary());
		String output =ram.print("\n");
		System.out.println(output);
		//ram.id = -1001;
		//ram.name = "Ram";
		//ram.salary = -9999;
		//ram.att = false;
		//ram.takeInput(-1001, "Ram", -9090, true);
//		ram.print();
//		Employee shyam  = new Employee(1002,"Shyam",8888);
//		//shyam.takeInput(1002, "Shyam", 8888, true);
//		shyam.print();
//		System.out.println("Id "+shyam.id);
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
//		System.out.println("Att "+shyam.att);
		//System.out.println(ram);
		//System.out.println(ram.hashCode());
		int x = 10;

	}

}
