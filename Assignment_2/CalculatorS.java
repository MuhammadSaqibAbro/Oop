import java.util.Scanner;
class CalculatorS{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Eneter Values along with operation");
String input=sc.nextLine();
double x,y;


String a[]=input.split(" ");


if(a[1].equals("+")){
 x=Double.parseDouble(a[0]);
  y=Double.parseDouble(a[2]);


System.out.println(x+y);
}
else if(a[1].equals("-")){
 x=Double.parseDouble(a[0]);
  y=Double.parseDouble(a[2]);

System.out.println(x-y);
}
else if(a[1].equals("*")){
 x=Double.parseDouble(a[0]);
  y=Double.parseDouble(a[2]);

System.out.println(x*y);
}
else if(a[1].equals("/")){
 x=Double.parseDouble(a[0]);
  y=Double.parseDouble(a[2]);
System.out.println(x/y);
}
else {
System.out.println("Operator is out of Range");
}

}
}
