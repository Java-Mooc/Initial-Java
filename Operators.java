
public class Operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		//Arithmetic Operators
		System.out.println("Arithmetic Operators");
		System.out.println(a + "+" + b + "= " + (a+b));
		System.out.println(a + "-" + b + "= " + (a-b));
		System.out.println(a + "*" + b + "= " + (a*b));
		System.out.println(a + "/" + b + "= " + (a/b));
		System.out.println(a + "%" + b + "= " + (a%b));
		System.out.println(++a);
		a = 10;
		System.out.println(--a);
		
		//Relationals Operators
		System.out.println("Relationals Operators");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Logical Operators
		System.out.println(a == 10 && b == 0);
		System.out.println(a == 10 || b == 0);
		System.out.println(!(a == 10 && b == 0));
	}

}
