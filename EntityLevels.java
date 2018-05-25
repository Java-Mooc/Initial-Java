
public class EntityLevels {

	public static void main(String[] args) {
		
		System.out.println("What's a boolean?");
		System.out.println("Can store only 2 values: False or True");
		boolean a = false;
		System.out.println(a);
		a = true;
		System.out.println(a);
		
		System.out.println("=====================\n");
		
		System.out.println("What's a char?");
		char b = 'A';
		System.out.println(b);
		
		System.out.println("=====================\n");
		
		System.out.println("What's a byte?");
		byte c = -128;
		System.out.println("Min: " + c);
		c = 127;
		System.out.println("Max: " + c);
		
		System.out.println("=====================\n");
		
		System.out.println("What's a short?");
		short d = -32768;
		System.out.println("Min: " + d);
		d = 32767;
		System.out.println("Max: " + d);
		
		System.out.println("=====================\n");
		
		System.out.println("What's a int?");
		int e = -2147483648;
		System.out.println("Min: " + e);
		e = 2147483647;
		System.out.println("Max: " + e);
		
		System.out.println("=====================\n");
		
		System.out.println("What's a long?");
		//Min: -9223372036854775808 
		long f = (long)-1E+20;
		System.out.println("Min: " + f);
		//Min: 9223372036854775807 
		f = (long)1E+20;
		System.out.println("Max: " + f);
		
		System.out.println("=====================\n");
		
		System.out.println("What's a float?");
		float g = -Float.MAX_VALUE;
		System.out.println("Min: " + g);
		g = -Float.MIN_VALUE;
		System.out.println("Max: " + g);
		g = Float.MAX_VALUE;
		System.out.println("Min: " + g);
		g = Float.MIN_VALUE;
		System.out.println("Max: " + g);
		
		System.out.println("=====================\n");
		double h = -Double.MAX_VALUE;
		System.out.println("Min: " + h);
		h = -Double.MIN_VALUE;
		System.out.println("Max: " + h);
		h = Double.MAX_VALUE;
		System.out.println("Min: " + h);
		h = Double.MIN_VALUE;
		System.out.println("Max: " + h);
		h = 1.2;
		System.out.println("A number with a decimal: " + h);
		
	}

}
