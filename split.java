public class Practice {

public static void main(String[] args) {
String s = "Raja M";	
String s1 = "Payilagam Chennai TamilNadu";

String s2[] = s.split("");
for(String ss:s2)
{
	System.out.println(ss);
}
System.out.println(s2.length);
System.out.println();

String s3[] = s1.split(" ");
for(String ss:s3)
{
	System.out.println(ss);
}
System.out.println(s3.length);
System.out.println();

String s4[] = s1.split(" ",2);
for(String ss:s4)
{
	System.out.println(ss);
}
System.out.println(s4.length);
}
}

//OUTPUT
R
a
j
a
 
M
6

Payilagam
Chennai
TamilNadu
3

Payilagam
Chennai TamilNadu
2
