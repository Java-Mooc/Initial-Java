
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int conta = 0;
		
		//FOR
		System.out.println("A For Loop in process!");
		for(int i = 0;i<=10;i++) {
			System.out.println(a+i);
			System.out.println("i value: " + i);
		}
		System.out.println("\n");
		
		//WHILE
		System.out.println("A While Loop in process!");
		while(conta != 100) {
			System.out.println("Before: " + conta);
			System.out.println("After: " + (conta += a));
			if(conta==100) {
				System.out.println("Done");
			}else {
				System.out.println("Again! Not 100 yet!");
			}
		}
		
		//DO WHILE

		int i = 1;
		do{
			conta = a * i;
			i++;
			System.out.println(conta);
		}while(conta<100);
	}
}
