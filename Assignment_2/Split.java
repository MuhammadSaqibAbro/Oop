import java.util.Scanner;
class CalculatorS{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();

String a[]=input.split(" ");
if(a[1]=="+")
System.out.println(a[0]+a[2]);
}
else if(a[1]=="-"){
System.out.println(a[0]-a[2]);
}
else if(a[1]=="*"){
System.out.println(a[0]*a[2]);
}
else if(a[1]=="/"){
System.out.println(a[0]/a[2]);
}
else {
System.out.println("Operator is out of Range");
}

}
}
