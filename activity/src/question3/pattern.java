//darshana thakare
//program for generating pattern

package question3;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		        int a = 1;
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(a++ + "\t");
		            }
		            System.out.println();
		        }

	}

}
