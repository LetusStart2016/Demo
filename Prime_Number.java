package First_Tasks;

//WAP  to print prime number between 10 to 100
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Rajiba Dixit
 * 
 */
public class Prime_Number {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		// Creation and initialization of List type object

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 10; i < 100; i++) {

			// TODO: Call below method to check whether it's prime or not
			// isPrimeNumber();

			if (isPrimeNumber(i)) {

				// adding elements to list

				l.add(i);
			}

		}
		// displayAllPrimeNums(list object to pass)
		displayAllPrimeNums(l);

	}

	private static boolean isPrimeNumber(int number) {

		// TODO: Write Logic for prime number
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
		// Or False
	}

	private static void displayAllPrimeNums(List<Integer> c) {

		// TODO: Iterate the loop and display the output.
		Iterator<Integer> itr = c.iterator();
		for (; itr.hasNext();) {
			System.out.println(itr.next());
		}

	}

}
