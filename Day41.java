import java.util.*;
class Day41{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1,str2,index;
		System.out.println("Enter first string:");
		str1=sc.nextLine();
		System.out.println("Enter Second string:");
		str2=sc.nextLine();
		if(str1.contains("*")){
			StringBuilder myString = new StringBuilder(str1);
			int k=str1.indexOf("*");
			System.out.println(k);
			char p='*';
			myString.setCharAt(k,p);
			index=myString.toString();
			System.out.println(index);
		
			if(str1.equals(index)){
				System.out.println("same");
			}
			else{
				System.out.println("not same");
			}
		}
		else if(str1.contains("?")){
			StringBuilder myString = new StringBuilder(str1);
			int l=str1.indexOf("?");
			System.out.println(l);
			char v='?';
			myString.setCharAt(l,v);
			index=myString.toString();
			System.out.println(index);
		
			if(str1.equals(index)){
				System.out.println("same");
			}
			else{
				System.out.println("not same");
			}
		}	
		
	}
}

