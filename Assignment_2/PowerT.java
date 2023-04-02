import java.util.Scanner;
class PowerT{
int chose;
int no;
double no1;
int po;
double temp=1.0;
int temp1=1;


public double FunctionPower(double n,int p){
//2^4=2*2*2*2  //3^3
for(int i=1;i<=po;i++){
temp=temp*no1;

}
return temp;


}
public int FunctionPower(int n,int p){
for(int j=1;j<=po;j++){
temp1=temp1*no;
}
return temp1;
}
public static void main(String args[]){
PowerT re=new PowerT();
Scanner sc=new Scanner(System.in);
System.out.println("1: double");
System.out.println("2: int");
re.chose=sc.nextInt();
if(re.chose==1){
    System.out.println("Enter no");
	re.no1=sc.nextDouble();
	   System.out.println("Enter power");
	re.po=sc.nextInt();
	if(re.po==0){
	System.out.println(re.no1+"^2="+re.FunctionPower(re.no1,2));
	}
	else{
	System.out.println(re.no1+"^"+re.po+"="+re.FunctionPower(re.no1,re.po));
	}
	
}
else if(re.chose==2){
 System.out.println("Enter no");
	re.no=sc.nextInt();
	   System.out.println("Enter power");
	re.po=sc.nextInt();
	if(re.po==0){
	System.out.println(re.no+"^2="+re.FunctionPower(re.no,2));
	}
	else{
	System.out.println(re.no+"^"+re.po+"="+re.FunctionPower(re.no,re.po));
	}

}

}
}