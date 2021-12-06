public class Practice {

public static void main(String[] args) {
String s1 = " Raja ";
String s2 = "Raja";
System.out.println(s1); // Raja 
System.out.println(s1.toUpperCase()); // RAJA 
System.out.println(s1.toLowerCase()); // raja
System.out.println(s1.trim()); //Raja
System.out.println(s1.strip()); //Raja
System.out.println(s1.stripLeading()); //Raja 
System.out.println(s1.stripTrailing()); //Raja
System.out.println(s1.repeat(5)); // Raja  Raja  Raja  Raja  Raja 
System.out.println(s1.indent(5)); //      Raja 
System.out.println(s2.toCharArray()); //Raja
      
	}    
}
