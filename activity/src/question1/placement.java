package question1;

public class placement {

	public static void main(String[] args) {
		
	        System.out.println("Enter the no of students placed in CSE:");
	        Scanner sc = new """
	        Scanner
	        """(System.in);
	        int cse = sc.nextInt();
	        
	        System.out.println("Enter the no of students placed in IT:");
	        int ece = sc.nextInt();
	        
	        System.out.println("Enter the no of students placed in MECH:");
	        int mech = sc.nextInt();
	        
	        if(cse < 0 || ece < 0 || mech < 0) 
	            System.out.print("Input is Invalid");
	        else if(cse == it && it == mech) 
	            System.out.print("None of the department has got the highest placement");
	        else if (cse == it && cse > mech)
	            System.out.print("Highest placement\n CSE\n IT");
	        else if (ece == mech && cse < it)
	            System.out.print("Highest placement\n IT\n MECH");
	        else if (cse == mech && it < mech)
	            System.out.print("Highest placement\n MECH\n CSE");
	        else if (cse > it && cse > mech)
	            System.out.print("Highest placement\n CSE");
	        else if (ece > cse && ece > mech)
	            System.out.print("Highest placement\n IT");
	        else if (mech > cse && mech > it)
	            System.out.print("Highest placement\n MECH");

	}

}
