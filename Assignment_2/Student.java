import java.util.Scanner;
class Student{
String name;
int rollNo;
int mobNo;
String city;
int semester; 
String gender;
String dept;
int gpa;
int i;

String a[]=new String[3];
int b[]=new int[3];
int c[]=new int[3];
String d[]=new String[3];
int e[]=new int[3];
String f[]=new String[3];
String g[]=new String[3];
int h[]=new int[3];



public void Input(){

Scanner sc=new Scanner(System.in);
System.out.print("Enter name::");
name=sc.nextLine();
a[i]=name;
System.out.print("Enter RollNo::");
rollNo=sc.nextInt();
b[i]=rollNo;
System.out.print("Enter MobNo::");
mobNo=sc.nextInt();
sc.nextLine();
c[i]=mobNo;
System.out.print("Enter City::");
city=sc.nextLine();
d[i]=city;
System.out.print("Enter Semester::");
semester=sc.nextInt();
sc.nextLine();
e[i]=semester;
System.out.print("Enter gender::");
gender=sc.nextLine();
f[i]=gender;
System.out.print("Enter Dept::");
dept=sc.nextLine();
g[i]=dept;
System.out.print("Enter Gpa::");
gpa=sc.nextInt();
h[i]=gpa;

}
public void Display(){
for(int z=0;z<a.length;z++){
System.out.println("=>>>===============RESULT=============<<<=");

System.out.println("Employee "+z+" Name"+a[z]);
System.out.println("Employee "+z+"RollNo"+b[z]);
System.out.println("Employee "+z+"MobNo"+c[z]);
System.out.println("Employee "+z+"City"+d[z]);
System.out.println("Employee "+z+"Semester"+e[z]);
System.out.println("Employee "+z+"Gender"+f[z]);
System.out.println("Employee "+z+"dept"+g[z]);
System.out.println("Employee "+z+"gpa"+h[z]);

}
}
public static void main(String args[]){

Student re=new Student();
 re.i=-1;
while(true){
System.out.println("Data for Employee "+(re.i+2));

if(re.i==2){
break;
}
re.i++;
re.Input();
System.out.println("=======================================");



}
re.Display();
}
} 

