import java.util.Scanner;
class TollBooth{
 int a;
 double amount;
public TollBooth(){
this.a=0;
this.amount=0.0;
}





public void PayingCar(){
a=a+1;
amount=amount+0.50;


}

public void noPayingCar(){
a=a+1;

}



public static void main(String args[]){
Scanner sc=new Scanner(System.in);
TollBooth re=new TollBooth();
while(true){
System.out.println("press 1 if croosing Car is Tax Paying");
System.out.println("press 2 if croosing Car is Tax NoPaying");
int x=sc.nextInt();


if(x==1){
re.PayingCar();

}
else if(x==2){
re.noPayingCar();

}
else{
break;
}
}
System.out.println("=======================");
System.out.println(re.a);
System.out.println(re.amount);

}
}












