package Testcases;

import java.net.InetAddress;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Methods {

	private static String randomNum;
	private char[] random;
	@Test
	public void seperateStringandInt() {
		String a = "Westeros Agent- 100000000103";
		int i;
		for (i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if ('0' <= c && c <= '9')
				break;
		}
		String alphaPart = a.substring(0, i);
		String numberPart = a.substring(i);
		System.out.println(alphaPart);
		System.out.println(numberPart);

	}
	
	@Test
	public void ss() {
		System.out.println(seperateAlphabetsOnly("Westeros Agent- 100000000103"));
	}

	public String seperateAlphabetsOnly(String str) {
		String letters = "";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (!Character.isDigit(a)) {
				letters = letters + a;
			} 
		}
		return letters;
	}


	@Test
	public void mathRandom() {
		int db = (int) (Math.random() * 999999);
		System.out.println(db);
	}

	@Test
	public void generatephoneNumber() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddyymss");
		String getdate = dateFormat.format(new Date());
		System.out.println(getdate);
	}

	@Test

	public void generateIpAddress() throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("ss");
		String getdate = dateFormat.format(new Date());
		InetAddress ipAddress1 = InetAddress.getLocalHost();
		String str = ipAddress1.getHostAddress();
		String str1 = str.replace(str.substring(11, 13), getdate);
		String Str2 = str.substring(0, 10).concat(getdate);
		System.out.println("random ipaddress :" + str1);
		System.out.println("random ipaddress :" + Str2);

	}

	public static String shuffleString(String string) {
		List<String> letters = Arrays.asList(string.split(""));
		Collections.shuffle(letters);
		String shuffled = "";
		for (String letter : letters) {
			shuffled += letter;
		}
		return shuffled;
	}

	@Test
	private void appendPartnerIIn() {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10000000);
		String s1 = String.valueOf(rand_int1);
		String sub1 = s1.substring(2, 5);
		System.out.println(sub1);
		System.out.println(shuffleString(sub1));
	}

	@Test
	private void partner() {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10000000);
		int rand_int2 = rand.nextInt(10000000);
		String s1 = String.valueOf(rand_int1);
		String s2 = String.valueOf(rand_int2);
		String sub1 = s1.substring(2, 5);
		String sub2 = s2.substring(4, 7);
		System.out.println(sub1);
	}

	@Test

	public void generateIpAddress1() throws Exception {
		Set<String> sets = new HashSet<String>();
		String initIP = "192.168.";
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10000000);
		int rand_int2 = rand.nextInt(10000000);
		String s1 = String.valueOf(rand_int1);
		String s2 = String.valueOf(rand_int2);
		String sub1 = s1.substring(2, 4);
		String sub2 = s2.substring(4, 7);
		String finalIP = initIP.concat(sub1 + "." + sub2);

		System.out.println(finalIP);

	}

	public String appendIPaddress(String value) throws Exception {
		if (value != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ss");
			String getdate = dateFormat.format(new Date());
			InetAddress ipAddress1 = InetAddress.getLocalHost();
			String str = ipAddress1.getHostAddress();
			return str.replace(str.substring(11, 13), getdate);
		}
		return null;
	}

	@Test
	private void random() {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(6);

		// Print random integers
		System.out.println("Random Integers: " + rand_int1);

		// Generate Random doubles
		double rand_dub1 = rand.nextDouble();
		double rand_dub2 = rand.nextDouble();

		// Print random doubles
		System.out.println("Random Doubles: " + rand_dub1);
		System.out.println("Random Doubles: " + rand_dub2);
	}

	@Test
	private void currentTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(timestamp);
	}

	@Test
	public void webTable() {
		Set<String> sets = new HashSet<String>();

		String str0 = "key1,key2,key3";
		String[] strlist1 = str0.split(",");
		String str1 = "value1,value2,value3";
		String[] strlist2 = str1.split(",");
		for (String string : strlist1) {
			for (String string1 : strlist2) {
				System.out.println((string + " : " + string1));
			}
		}
	}

	@Test

	public void webTable1() {
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");

		Map<List<String>, List<String>> mp = new HashMap<>();
		// mp.put("TC01", list);
		mp.put(list, list1);
		// System.out.println(mp.get(list));

		// To iterate Map Data
		// mp.forEach((k, v) -> System.out.println(k + "=" + v));
		// To Iterate ArrayList Data Which is inside Map
		/*
		 * mp.forEach((k, v) -> { System.out.print(k + " = "); v.forEach(w ->
		 * System.out.println(w + ",")); System.out.println(); });
		 */

		/*
		 * for (Entry<String, List<String>> eSet : mp.entrySet()) {
		 * System.out.println(eSet); }
		 */

	}

	@Test
	public void stringjoiner() {
		String[] values = "string joiner".split(" ");
		StringJoiner stringJoiner = new StringJoiner(",");
		for (String string : values) {
			System.out.println(stringJoiner.add(string));
		}
	}

	@Test
	public void iin_text() {
		for (int i = 0; i < 100; i++) {
			System.out.println(appendIIN_Ext());
		}
	}

	public String appendIIN_Ext() {
		String string = "";
		Random random = new Random();
		int i = random.nextInt(1000);
		if (i > 101) {
			string = String.valueOf(i);
		}
		return string;
	}

	@Test
	private void partner_iin() {
		for (int i = 0; i <100; i++) {
			String temp = "";
			for (int index = 0; index <= 4; index++) {
				temp = temp + generateRandom();
				System.out.println(temp);
			}	
		}
		
	}

	/*public String generateRandom() {
		Random random = new Random();
		return "" + random.nextInt(9);
	}
	*/
	@Test
	public  void main() {
		String temp="";
		for(int index=1;index<=5;index++) {
			temp =  temp + generateRandom();
		}
		System.out.println(temp);
	}
	public static String generateRandom() {
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			int randomNum = random.nextInt(9);
			System.out.println(randomNum);
			if(randomNum==0) {
				generateRandom();
			}
		}
		
			return "" + randomNum;
	}
}
