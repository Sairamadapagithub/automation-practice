package test;

import java.util.Map;
import java.util.HashMap;
public class testpractive {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method executed");
		testpractive test=new testpractive();
		test.factorial();
	}

	public void duplicatestringlist() {
		
		String name="adapaanam";
		
		char s;
		for(int i=0;i<name.length();i++) {
			s=name.charAt(i);
			int count=0;
			System.out.println(s);
			for (int a=0;a<name.length();a++) {
				if(name.charAt(a)==s) {
					//System.out.println("entered if loop"+a);
					count++;
				}
				
			}
			System.out.println("count of letter: "+s+" = "+count);
		}
		
	}
	
public void duplicatestringvalue() {
	
	String value="Ada pasase";
	Map<Character,Integer> hasmapchar=new HashMap<>();
	char[] chararay=value.toCharArray();
	
	for(char c:chararay) {
		if(Character.isAlphabetic(c)) {
		if(hasmapchar.containsKey(c)) {
			hasmapchar.put(c, hasmapchar.get(c)+1);
		}
		else {
			hasmapchar.put(c, 1);
		}
	}
	}
	hasmapchar.entrySet().removeIf(i -> i.getValue()==1);
	System.out.println(hasmapchar);
}


public void duplicate() {
	String value="Adapa Janakiram Adapa Sandeep";
	Map <Character, Integer> hashmap= new HashMap<>();
	char[] cararry=value.toCharArray();
	
	for(char c:cararry ) {
		if(Character.isAlphabetic(c)) {
			
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			}
			else {
				hashmap.put(c, 1);
			}
		}
	}
	hashmap.entrySet().removeIf(i -> i.getValue()==1);
	System.out.println(hashmap);
}

public void stringreverse() {
	String ram="Adapa";
	String reverse="";
	for (int i=ram.length()-1;i>=0;i--) {
		
		reverse=reverse+ram.charAt(i);
		System.out.println(i);
	} 
	System.out.println(reverse);
}


public void reversenumber() {
	
	int a=123456789;
	int c = 0;
	while (a!=0) {
		int r=a%10;
		c=c*10+r;
		a=a/10;
		
		
	}
	System.out.println(c);
}

public void factorial() {
	int a=5;
	int count =1;
	for(int i=1;i<=a;i++) {
		count=count*i;
	}
	System.out.println(count);
	
	
}
//
//List <WebElement> listname=" //div[@class=' col']";
//
//for(WebElement ram : listname) {
//	
//	if (ram.equalsignorecase(object)) {
//		ram.click();
//	}
//}











}




