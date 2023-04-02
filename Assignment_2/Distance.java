import java.util.Scanner;
class Distance{
Scanner sc=new Scanner(System.in);
int dis;
String unit;
int chose1;
public void Input(){
System.out.println("Enter Distance::");
dis=sc.nextInt();
System.out.println("Enter Unit::");
unit=sc.next();

}

public void Conditions(){
if(unit.equals("m")){

System.out.println("press 1 for meter to Kilometer::");
System.out.println("press 2 for meter to centimeter::");
chose1=sc.nextInt();

if(chose1==1){
System.out.println(dis+" meters::"+(dis/1000)+" Kilometers");
}
else if(chose1==2){
System.out.println(dis+" meters::"+(dis*100)+" Centimeters");
}
else{
System.out.print("No is Out Of Range::");
}

}






else if(unit.equals("km")){

System.out.println("press 1 for Kilometer to meter::");
System.out.println("press 2 for Kilometer to centimeter::");
chose1=sc.nextInt();

if(chose1==1){
System.out.println(dis+" Kilometers::"+(dis*1000)+" meters");
}
else if(chose1==2){
System.out.println(dis+" Kilometers::"+(dis*100000)+" Centimeters");
}
else{
System.out.println("No is Out Of Range::");
}

}





else if(unit.equals("cm")){

System.out.println("press 1 for Centimeter to Kilometer::");
System.out.println("press 2 for Centimeter to meter::");
chose1=sc.nextInt();

if(chose1==1){
System.out.println(dis+" Centimeters::"+(dis/100000)+" Kilometers");
}
else if(chose1==2){
System.out.println(dis+" Centimeters::"+(dis/100)+" meters");
}
else{
System.out.println("No is Out Of Range::");
}

}
}


public static void main(String args[]){
Distance sc1=new Distance();
sc1.Input();
sc1.Conditions();


}
}