import java.util.Scanner;
class Temperature{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Press 1 to convert fahrenhiet to celsius");
System.out.println("Press 2 to convert celsius to fahrenhiet");
int a=sc.nextInt();

if(a==1){
System.out.println("Enter Temperature in fahrenhiet");
int b=sc.nextInt();
double c=((f-32)*(5/9));
System.out.println("In Celsius: "+c);
}
else if(a==2){
System.out.println("Enter Temperature in celsius");
int d=sc.nextInt();
double e=((d*95)+32);
System.out.println("In Celsius: "+e);
}
else{
System.out.println("Plaese Select no 1 or 2");
}

}
}

