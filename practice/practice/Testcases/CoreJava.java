package Testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class CoreJava {

	@Test
	public void reverseString() {
		// reverse string
		String a = "selenium";
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse);
	}
	@Test
	public void count() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(10);
		System.out.println(list);
	    int a=list.get(0);
	      int b=list.get(1);
	    int newNum=a+b; //5
	    list.remove(0);
	list.remove(1);
//	    list.add(newNum);
	      		System.out.println(list);
	}
	@Test
	public void reverseWords() {
		// reverse each word in content
		String b = "reverse each word in content";
		String[] words = b.split(" ");
		String reverseLine = "";
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			reverseLine = reverseLine + sb.toString() + " ";
		}
		System.out.println(reverseLine);
	}

	public static void main(String[] args) {
		// duplicate characters from string
		String str = "selenaaabbbccium";
		String[] arr = str.split("");
		for (String s : arr) {
			int count = Collections.frequency(Arrays.asList(arr), s);
			System.out.println("The frequency of " + s + " is " + count);
		}
		// duplicate numbers from integer
		int in = 121342425;
		String str1 = Integer.toString(in);
		String[] arr1 = str1.split("");
		for (String s : arr1) {
			int count = Collections.frequency(Arrays.asList(arr1), s);
			System.out.println("The frequency of " + s + " is " + count);
		}

		// duplicate numbers from integer array
		int[] intarr = { 1, 2, 1, 3, 4, 2, 4, 2, 5 };
		String[] st = new String[intarr.length];
		int i = 0;
		for (int in1 : intarr) {
			st[i++] = String.valueOf(in1);
		}

		for (String s : st) {
			int count = Collections.frequency(Arrays.asList(st), s);
			System.out.println("The frequency of " + s + " is " + count);
		}
		// ascending order of integer array
		Arrays.sort(intarr);
		System.out.println(Arrays.toString(intarr));
		// ascending order of string array
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		// compare two arrays
		boolean status = Arrays.equals(st, arr1);
		System.out.println(status);

		// separate alphabets , integers and special chars

		String d = "abcd1234$%^&";
		String alphabetic = "";
		String digits = "";
		String special = "";

		for (int j = 0; j < d.length(); j++) {
			char c = d.charAt(j);
			if (Character.isAlphabetic(c)) {
				alphabetic = alphabetic + d.charAt(j);
			} else if (Character.isDigit(c)) {
				digits = digits + d.charAt(j);
			} else {
				special = special + d.charAt(j);
			}

		}
		System.out.println(alphabetic);
		System.out.println(digits);
		System.out.println(special);

		// split upperCase & lowerCase
		String d1 = "ABCDqwerty";
		String upperCase = "";
		String lowerCase = "";

		for (int j = 0; j < d1.length(); j++) {
			char c = d1.charAt(j);
			if (Character.isUpperCase(c)) {
				upperCase = upperCase + d1.charAt(j);
			} else if (Character.isLowerCase(c)) {
				lowerCase = lowerCase + d1.charAt(j);
			}

		}
		System.out.println(upperCase);
		System.out.println(lowerCase);

		// fibonacci series in java

		int n1 = 0, n2 = 1, n3, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		for (int j = 2; j <= count; j++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		String[] stringArray = { "a", "b", "c" };
		String abc = String.join("", stringArray);
		System.out.println(abc);
	}

}
