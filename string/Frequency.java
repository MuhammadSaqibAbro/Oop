import java.util.Scanner;
class Frequency{
String name;
char c;
int ca=0;
int ce=0;
int cw=0;
int co=0;
public void Input(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any String");
name=sc.nextLine();
for(int i=0;i<=name.length()-1;i++){
   c=name.charAt(i);
   if(c=='a'){
   ca++;
   }
   else if (c=='e'){
   ce++;
   }
   else if(c=='w'){
   cw++;
   }
   else{
   co++;
   }
}



}

public static void main(String[] args){
Frequency re=new Frequency();
re.Input();
System.out.println("Frequency of a :"+re.ca);
System.out.println("Frequency of e :"+re.ce);
System.out.println("Frequency of w :"+re.cw);
}
}