package ca.said.first;


public class Principale {
	
	public static void main(String[] args) {

		int [][] tableau = new int[12][12];
		
		for (int i = 1; i < 13; i++) {
			
			System.out.println();
			
			for (int j = 1; j < 13; j++) {
			
				int ret = i * j;
				System.out.print(ret + "       ");
			}
		}
		
	}
	
}
