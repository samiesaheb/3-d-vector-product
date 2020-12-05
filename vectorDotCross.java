//Program to find dot/cross product of 3d vectors.
import java.util.*;


public class vectorDotCross {

	static void vInput(List<Integer> vect) {
		System.out.println("Inputting a vector...");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i<3; i++) {
		int c = 1;c += i;
		System.out.println("c" + c + ":");
		int comp = input.nextInt();
		vect.add(comp);

	}

}


	public static void main(String[] args) {

		List<Integer> v1 = new ArrayList<>();
		List<Integer> v2 = new ArrayList<>();
		vInput(v1);
		vInput(v2);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("Do you want to find the dot product ('d/D') or cross product ('c/C') of the two vectors? ");
		
		while (true) {
		
		//Takes in user_input of type char 
		Scanner user_input = new Scanner(System.in);
		char uInput = user_input.next().charAt(0);

		if ((uInput == 'd') || (uInput == 'D')){
			//Computing dot product
			int dot = v1.get(0)*v2.get(0) + v1.get(1)*v2.get(1) + v1.get(2)*v2.get(2);
			System.out.println("v1 . v2 = "+ dot);
			break;
		}

		else if ((uInput == 'c') || (uInput == 'C')) {
			//Computing each component of cross product
			int i = (v1.get(1)*v2.get(2) - v1.get(2)*v2.get(1));
			int j = -(v1.get(0)*v2.get(2)-v1.get(2)*v2.get(0));
			int k = (v1.get(0)*v2.get(1)-v1.get(1)*v2.get(0)); 
			List<Integer> v3 = new ArrayList<>();
			v3.add(i); v3.add(j); v3.add(k); //Adding i,j,k components to v3
			System.out.println("v1 x v2 = " + v3);
			break;
		}

		else {
			System.out.println("You did not enter a valid input\nTry again");
			continue;
		}
		
}
		
	}
}