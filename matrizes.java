public class matrizes {
	public static void main(String[] args) {
		int [][] array = new int[2][3];
		array[0][0] = 1;
		array[1][0] = 2;
		array[0][1] = 3;
		array[1][1] = 4;
		array[0][2] = 5;
		array[1][2] = 6;
		for(int l=0; l<2; l++) {
			for(int c=0; c<3; c++) {
				System.out.println(array[l][c]);
			}
		}
	}
}
