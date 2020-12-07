import java.util.*;

public class Vector {

	static void vectorIO(List<Integer> v) {

		Scanner input = new Scanner(System.in);
		for (int i = 0; i<3; i++) {
			int comp = i+1;
			System.out.println("c"+comp+":");
			int c = input.nextInt();
			v.add(c);

		}
		System.out.println(v);


	}
	static void checkUIO(List<Integer> v_1, List<Integer> v_2, char input) {

		while (true) {
					if ((input == 'd') || (input == 'D')) {
			int dotProd = ((v_1.get(0)*v_2.get(0))+((v_1.get(1)*v_2.get(1)))+(v_1.get(2)*v_2.get(2)));
			System.out.println("(v1 . v2) = " + dotProd);
			break;
		}
		else if ((input == 'c') || (input == 'C')) {
			int i = (v_1.get(1)*v_2.get(2))-(v_1.get(2)*v_2.get(1));
			int j = -((v_1.get(0)*v_2.get(2))-(v_1.get(2)*v_2.get(0)));
			int k = ((v_1.get(0)*v_2.get(1))-(v_1.get(1)*v_2.get(0)));
			List<Integer> crossProd = new ArrayList<>();
			crossProd.add(i);crossProd.add(j);crossProd.add(k);
			System.out.println("(v1 x v2) = " + crossProd);
			break;
		}
		else {

			System.out.println("Wrong input, try again");
			continue;
		}
		}

	}
	public static void main(String[] args){
		
		List<Integer> v1 = new ArrayList<>();
		List<Integer> v2 = new ArrayList<>();
		vectorIO(v1);
		vectorIO(v2);
		System.out.println("Find dot product ('d/D') or cross product ('c/C')?");
		Scanner userInput = new Scanner(System.in);
		char uInput = userInput.next().charAt(0);
		checkUIO(v1,v2,uInput);


	}
}
