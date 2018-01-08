package anagramChecker;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	private static String string1 = "";
	private static String string2 ="";
	private static String string3 = "";
	private static String string4 ="";
	public static void main(String[] args) {
		System.out.println("Enter your first word: ");
		Scanner scanner = new Scanner(System.in);
		string1 = scanner.nextLine();
		System.out.println("Enter your second word: ");
		string2 = scanner.nextLine();
		if (Check(string1, string2)==true) {
			System.out.println(string2 + " is an anagram of " + string1);
		} else {
			System.out.println(string2 + " is not an anagram of " + string1);
		}
	}
	private static boolean Check(String first, String second) {
		char[] array1 = first.toCharArray();
		char[] array2 = second.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		string3 = toString(array1);
		string4 = toString(array2);
		return string3.equals(string4);
	}
	
	private static String toString(char[] array) {
		String toReturn = "";
		for(int i = array.length-1; i >= 0; i--) {
			toReturn = toReturn + " " + array[i];
		}
		return toReturn;
	}


}
