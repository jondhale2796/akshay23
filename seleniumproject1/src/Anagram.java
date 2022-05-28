
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a string1 :");
          System.out.println("enter a string2 :");
       
          String str1=sc.nextLine();
          String str2=sc.nextLine();
          int count=0;
        str1= str1.replaceAll("\\s", "");
        str2= str2.replaceAll("\\s", "");
         if(str1.length()!= str2.length()) {
        	 count=1;        	 
         }
         else {
          str1=str1.toLowerCase();
          str2=str2.toLowerCase();
          char ch1[]=str1.toCharArray();
     	 char ch2[]=str2.toCharArray();
     	 System.out.println("ch1 is: ");
     	 for(int i=0;i<ch1.length;i++) {
     		 System.out.print(ch1[i]+" ");
     	 }
     	 System.out.println();
     	System.out.println("ch2 is: ");
    	 for(int i=0;i<ch2.length;i++) {
    		 System.out.print(ch2[i]+" ");
    	 }
     	 System.out.println();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       // System.out.println(" sorted ch1 is: ");
//    	 for(int i=0;i<ch1.length;i++) {
//    		 System.out.print(ch1[i]+" ");
//    	 }
     	 System.out.println();
    	System.out.println("sorted ch2 is: ");
//   	 for(int i=0;i<ch2.length;i++) {
//   		 System.out.print(ch2[i]+" ");
//   	 }
 //	 System.out.println();
        if(Arrays.equals(ch1, ch2)) {
        	count=2;
        }
         }
         if(count>1) {
         	System.out.println("string is anagram");
         }
         else {
        	 System.out.println("String is not anagram");
         }
           sc.close();
       
	}
}

