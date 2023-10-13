package learn;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello learn");
		System.out.print("\n");
		Car bmw=new Car();
		bmw.setColor("Red");
		System.out.print(bmw.getColor());
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		Boy b1=new Boy();
		b1.setAge(28);
		System.out.print(b1.getAge());
		
		System.out.print("\n");
		
		Girl g1=new Girl();
		g1.setName("Norhan");
		System.out.print(g1.getName());
		}

}
