import java.util.Scanner;
class Diagnoss{
String name;
int countV=0;
int countC=0;
int spaces=0;
char a;
int a1=0;
int e1=0;
int i1=0;
int o1=0;
int u1=0;
int all;



public void Input(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Sentence");
name=sc.nextLine();


for(int i=0;i<=name.length()-1;i++){
	 a=name.charAt(i);
if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ||
 a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){// abcd
 //countV++;
 // counting
 if(a=='a'){//a1=1
	 a1++; 
 }
 if(a1>=1){//a1=1
	 a1=1;
} // counting
 if(a=='e'){
	 e1++; 
 }
 if(e1>=1){
	 e1=1;
}
 // counting
 if(a=='i'){
	 i1++; 
 }
 if(i1>=1){
	 i1=1;
}
 // counting
 if(a=='o'){
	 o1++; 
 }
 if(o1>=1){
	 o1=1;
}
 // counting
 if(a=='u'){
	 u1++; 
 }
 if(u1>=1){
	 u1=1;
}
 }
else if(a==' '){
	spaces++;
}
else{
 countC++;

}
}

}
public static void main(String[] args){
Diagnoss re=new Diagnoss();
re.Input();
re.all=re.a1+re.e1+re.i1+re.o1+re.u1;
System.out.println("Vowels :"+re.all);
System.out.println("Consonant :"+re.countC);
System.out.println("spaces :"+re.spaces);

}
}