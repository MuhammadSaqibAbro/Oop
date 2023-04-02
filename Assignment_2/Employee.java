import java.util.Scanner;
class Employee{
static int input1;
static double input2;
static int [] array1 = new int[3];
static Double [] array2 = new Double[3];

public static void TakeInput(){

for(int i=0;i<=2;i++){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee Id No");
 input1=sc.nextInt();
System.out.println("Enter employee Sallery");
input2=sc.nextDouble();
array1[i]=input1;
array2[i]=input2;

}

}

public static void Display(){
for(int k=0;k<=2;k++){
System.out.println("Employee"+(k+1)+" Id:"+array1[k]);
System.out.println("Employee"+(k+1)+" Sallery:"+array2[k]);
System.out.println("=============================");
}
}

public static void main(String args[]){
Employee.TakeInput();
Employee.Display();



}
}
