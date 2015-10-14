package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
	public static ArrayList<Integer> intList=new ArrayList<Integer>();
	public static ArrayList<String> stringList=new ArrayList<String>();
	public static void main(String[] args){
		String p="y";

		Scanner keyboard= new Scanner(System.in);
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(10, "ten"); myMap.put(9, "nine"); myMap.put(8, "eight"); myMap.put(7, "seven"); myMap.put(6, "six"); myMap.put(5, "five"); myMap.put(4, "four"); myMap.put(3, "three"); myMap.put(2, "two"); myMap.put(1, "one"); myMap.put(0, "zero");
		while(p.equals("y")){
		int a=Validator.getInt(keyboard, "Enter a number: ");
		String b=myMap.get(a);
		if(!myMap.containsKey(a)){
			b=Validator.getString(keyboard, "Not found in database. Enter value: ");
			intList.add(a);
			stringList.add(b);
			myMap.put(a, b);
		}
		System.out.println("You entered "+b+".");
		p=Validator.getString(keyboard,"Another one?(y/n) ");
		}
		System.out.println("\n-----------------\nNew Entries: ");
		Display();
		System.out.println("\nClosing program....");
	
	}
	public static void Display(){
		int s=intList.size();
		for(int i=0;i<s;i++){
			System.out.println(intList.get(i)+"   "+stringList.get(i));
		}
		System.out.println("-----------------\n");
	}

}
