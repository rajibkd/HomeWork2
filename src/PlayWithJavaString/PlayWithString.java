package PlayWithJavaString;

import java.util.Locale;
import java.util.Scanner;

public class PlayWithString {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sampleString;
		@SuppressWarnings("resource")
		Scanner userInput= new Scanner(System.in);
		char[] charArray=new char[30];
		
		System.out.println("Please Enter a String :");
		sampleString=userInput.nextLine();
		
		System.out.println("You typed :"+sampleString+"  <-- We gonna play with it");
		
		System.out.println("Character at position 2 is :"+sampleString.charAt(2));
		
		System.out.println("Unicode of character at position 2 is :"+sampleString.codePointAt(2));
		
		System.out.println("Unicode of character at position before 2 is :"+sampleString.codePointBefore(2));
		
		System.out.println("Code Point Count is :"+sampleString.codePointCount(1,1));
		
		System.out.println("OffsetByCodePoints is :"+sampleString.offsetByCodePoints(2,2));
		
		sampleString.getChars(4,10,charArray,0);
		System.out.println(charArray);
		
		byte[] val=sampleString.getBytes();
		String sampleString1= new String(val);
		System.out.println(sampleString1);
				
		byte[] bytesArray=new byte[10];
		sampleString.getBytes(1,4,bytesArray,0);
		System.out.println(bytesArray);
		
		byte[] byteArray1=sampleString.getBytes();
		arrayPrint(byteArray1);
		
		byte[] bArray=sampleString.getBytes();
		arrayPrint(bArray);
		
		String str="AaBbCcDd";
		boolean bool=sampleString.equals(str);
		System.out.println(bool);
		
		StringBuffer strB=new StringBuffer(sampleString);
		System.out.println(str.contentEquals(strB));
		
		CharSequence cS="AaBbCcDd";
		System.out.println("contentEquals(CharSequence)"+str.contentEquals(cS));
		
		System.out.println(sampleString.equalsIgnoreCase(str));
		
		System.out.println(sampleString.compareTo(str));
	
		System.out.println(sampleString.compareToIgnoreCase(str));
	
		System.out.println(sampleString.regionMatches(0,str,0,4));
		
		System.out.println(sampleString.regionMatches(true,0,str,0,4));
	
		System.out.println("String sampleString starts with Aa: "+sampleString.startsWith("Aa"));
				
		System.out.println("String sampleString starts with Aa: "+sampleString.startsWith("Aa",0));			
		
		System.out.println("String sampleString ends with Ee: "+sampleString.endsWith("Ee"));
	
	    System.out.println("Hash Code for SampleString is: "+sampleString.hashCode());
	
	    System.out.println("The Index of D in SampleString is: "+sampleString.indexOf('D'));
	    
	    System.out.println("The Index of D in SampleString is: "+sampleString.indexOf('D',7));
	    
	    System.out.println("The Index of Dd in SampleString is: "+sampleString.indexOf("Dd"));
	    
	    System.out.println("The Index of Dd in SampleString is: "+sampleString.indexOf("Dd",4));
	    
	    System.out.println("The Last Index of D in SampleString is: "+sampleString.lastIndexOf('D'));
	
	    System.out.println("The Index of D in SampleString is: "+sampleString.indexOf('D',7));
	
	    System.out.println("The Index of Dd in SampleString is: "+sampleString.indexOf("Dd"));
	    
	    System.out.println("The Index of AbC in SampleString is: "+sampleString.indexOf("AbC",7));
	
	    System.out.println(" The SubString is: "+sampleString.substring(2));
	    
	    System.out.println("The SubString is: "+sampleString.substring(2,4 ));
	
	    System.out.println("The SubSequence is: "+sampleString.subSequence(2,4));
	    
	    System.out.println("The output String is: "+sampleString.concat(str));
	    
	    System.out.println("The Output String is: "+sampleString.replace('A', 'B'));
	
	    System.out.println("The Output String is: "+sampleString.replaceFirst("(.*)AaBbCcDdEe(.*)","Hi There"));
	
	    System.out.println("The Output String is: "+sampleString.replaceAll("AbC","Hi"));
		    
	    System.out.println("The Output String is: "+sampleString.replace("AbC","There"));
	
	    String strA[]=sampleString.split("Hi");
	    for (String temp: strA){
	    System.out.println("The Output String is: "+temp);
	    }
    
	
	    String strA1[]=sampleString.split("Hi", 2);
	    for (String temp: strA1){
		System.out.println("The Output String is: "+temp);
		}
	    
	    String strExample=new String("ABC IS NOT EQUAL TO XYZ");
	    System.out.println(strExample.toLowerCase());
	    
	    System.out.println(strExample.toLowerCase(Locale.KOREAN));
	    
	    String strTest=new String("this is for test only");
	    System.out.println(strTest.toUpperCase(Locale.KOREAN));
	    
	    System.out.println(strTest.toUpperCase(Locale.CHINA));
	    
	    String strTrim=new String("    Testing Trim Method    ");
	    System.out.println("This returns: "+strTrim.trim());
	    
	    Integer iTest=555;
	    System.out.println("The return will be: "+iTest.toString());
	    
	    String strChar=new String("Welcome to Selenium");
	    char[] arr=strChar.toCharArray();
	    System.out.print("Contents of Array: ");
	    for(char c:arr)
	    	System.out.print(c);
	    System.out.println();

	    String firstName="Rajib Das";
	    double iD=2042;
	    String value=String.format("%2$s  %1$s",iD,firstName);
	    System.out.println(value);
	    String value1=String.format(Locale.CHINESE,"%1$s  %2$s",firstName,iD);
	    System.out.println(value1);
	    
	    Integer x=5;
	    System.out.println(String.valueOf(x));
	    
	    double d=102939939.939;
	    System.out.println(String.valueOf(d));
	    
	    boolean b=true;
	    System.out.println(String.valueOf(b));
	    
	    char[] ary={'a','b','c','d','e','f','g','h','i','j','k'};
	    System.out.println(String.valueOf(ary));
	    
	    System.out.println(String.valueOf(ary,2,5));
	    
	    char[] data={'H','i',' ','T','h','e','r','e'};
	    String str1="Test";
	    String str2="Test Again";
	    str1=String.copyValueOf(data);
	    System.out.println(str1);
	    
	    str2=String.copyValueOf(data,3,3);
	    System.out.println(str2);
	    
	    String str11="Rajib Das";
	    String str22=str11.intern();
	    System.out.println(str22);
	    System.out.println((str11==str22));
	    
	      
	    
	}
		
		
		public static void arrayPrint(byte[] anByteArray) {
			for (byte Number: anByteArray) {
				System.out.format("%d \t", Number);
			}
				System.out.println();
			
		
	}
	
	}


