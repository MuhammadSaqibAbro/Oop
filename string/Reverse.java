import java.util.Scanner;
class Reverse{
String sentence;
public void Input(){
	System.out.println("Please Enter Any String Sentence");
	Scanner sc=new Scanner(System.in);
	sentence=sc.nextLine();
	String[] a=sentence.split(" ");
	for(int i=a.length-1;i>=0;i--){
		String c=a[i];
	for(int j=c.length()-1;j>=0;j--){
		System.out.print(a[i].charAt(j));
	}
	for(int k=0;k<=0;k++){
		System.out.print(" ");
	}
	}
}






public static void main(String args[]){
Reverse re=new Reverse();
re.Input();



}

}


