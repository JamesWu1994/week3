  
import java.time.Year;
import java.util.Arrays;
import java.util.stream.IntStream;

import javax.management.loading.PrivateClassLoader;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
public class arraysAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 15;
		boolean isHotOutside = (t < 10.51);
		double moneyInPocket = 10.51;
		boolean willBuyDrink = true;
		
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// Instructions are to get the difference of the first and last element.
		// However we are not allowed to use any numbers at all...
		int lengthOfArr = ages.length;
		int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);
		
		System.out.println("Difference of first and last element in ages[] = " + difference);
		
		int[] newAges = new int[ages.length];
		
		System.arraycopy(ages,  0, newAges, 0, ages.length);
		
		lengthOfArr = newAges.length;
		newAges[lengthOfArr - 1] = 100;
		difference = Math.abs(newAges[lengthOfArr - lengthOfArr] - newAges[lengthOfArr - 1]);
		
		System.out.println("Difference of first and last element in newAges[] = " + difference);
		
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("The average age in newAges[] = " + average );
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name in names[] = " + average );
		
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
		System.out.println("Use array[arr.length] to access the last element of an array");
			
		System.out.println("Use array[0] to access the first element of an array");
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all lengths in nameLengths[] = " + sum);
		
		System.out.println(duplicateWord("Hello", 3));
		
		System.out.println(getFullName("James", "Wu"));
		
		System.out.println("checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100(ages));
		
		double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
		double[] emptyDoubleArr = {};
		System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));
		System.out.println("Passing empty double[] to getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(emptyDoubleArr));
	
		double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
		System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
		
	}
	
	private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
			duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
	}
	
	private static String getFullName(String firstName, String lastName) {
		return "getFullName() returns => " + firstName + " " + lastName;
	}
	
	private static Boolean checkIfSumGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	
	private static double getAverageOfDoubleArr(double[] arr) {
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if((isHotOutside) && (moneyInPocket > 10.50)) {
		return true;
	}
		else return false; }

	private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
	}

}
