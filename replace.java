public class Practice {

public static void main(String[] args) {
String s1 = "Payilagam Chennai TamilNadu";

System.out.println(s1.replace('a', 'z'));
System.out.println(s1.replace("Pa", "pa"));
System.out.println(s1.replaceAll(" ", "-"));
System.out.println(s1.replaceFirst(" ", "-"));
}
}

//Output
Pzyilzgzm Chennzi TzmilNzdu
payilagam Chennai TamilNadu
Payilagam-Chennai-TamilNadu
Payilagam-Chennai TamilNadu

System.out.println(s1.replace("\\s", "-"));//Payilagam Chennai TamilNadu
System.out.println(s1.replaceAll("\\s", "-"));//Payilagam-Chennai-TamilNadu
System.out.println(s1.replaceFirst("\\s", "-"));//Payilagam-Chennai TamilNadu