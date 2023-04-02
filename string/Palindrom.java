import java.util.Scanner;
class Palindrom{
int a;
int b;
int a1;
int b1;
int c=0;
int r=0;
public void Input (){




Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int no=sc.nextInt();
int no1=no;
while(no1!=0){//513
	a=no1%10;
b=no1/10;
no1=b;
r=r*10+a;
}
if(no==r){
	System.out.println(no+" : is a Palindrom no");
}
else{
	System.out.println(no+" : is not a Palindrom no");
}
}
public static void main(String args[]){
Palindrom re=new Palindrom();
re.Input();


}
}

