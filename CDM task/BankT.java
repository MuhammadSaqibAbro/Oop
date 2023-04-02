import java.util.Scanner;
class BankT{
int chose;
int chose1;
String name;
int mob;
int cnic;
int pincode;
int cnic1;
int pincode1;
int pincode2;
int balance;
int deposite;


public void create(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name");
name=sc.nextLine();
System.out.println("Enter Mob no");
mob=sc.nextInt();
System.out.println("Enter Cnic");
cnic=sc.nextInt();
System.out.println("Enter pincode");
pincode=sc.nextInt();
}


public void Login(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Cnic");
cnic1=sc.nextInt();
System.out.println("Enter pincode");
pincode1=sc.nextInt();
}

public void Deposite(){
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("Enter pincode");
pincode2=sc.nextInt();
if(pincode2==pincode){
	System.out.println("Enter Amount to depsoite");
    deposite=sc.nextInt();
	balance=balance+deposite;
	break;
}
else{
	System.out.println("invalid Pincode try again");
	System.out.println("---------------");
}
}

}

public void BalanceInquiry(){
	System.out.println("your current Balance is: "+balance);
}

public void Profile(){
	System.out.println("name: "+name);
	System.out.println("Mob no: "+mob);
	System.out.println("Cnic: "+cnic);
	System.out.println("pincode: "+pincode);
	System.out.println("Balance: "+balance);
}

public static void main(String args[]){
BankT re=new BankT();
Scanner sc=new Scanner(System.in);


while(true){
	//while start
System.out.println("----------Wellcome to Cash Deposite Machine-----------");
System.out.println("1: create");
System.out.println("2: login");
re.chose=sc.nextInt();

if(re.chose==1){
 ///1st block start   
if(re.name==null && re.cnic==0){
	re.create();
}
else{
System.out.println("Account is already created");	
}
//1st block end

}
else if(re.chose==2){
	 ///1st block start   
if(re.cnic==0 && re.pincode==0){
	System.out.println("First create Acoount then login");
}
else{
	
re.Login();
while(true){
      if(re.cnic==re.cnic1 && re.pincode==re.pincode1){
		  System.out.println("1: Deposite");
		  System.out.println("2: Balance Inquiry");
		  System.out.println("3: Profile");
		  System.out.println("4: Exit");
		  re.chose1=sc.nextInt();
		  if(re.chose1==1){
		
			  re.Deposite();
		  }
		  else if(re.chose1==2){
			  re.BalanceInquiry();
		  }
		  else if(re.chose1==3){
			 re.Profile();
		  }
		  else if(re.chose1==4){
			  break;
		  }
		  else{
			  System.out.println("Num is out of Range");  
		  }
		  
	  }
	    else if(re.cnic!=re.cnic1){
		  
		  while(re.cnic!=re.cnic1){
			  
			  System.out.println("cnic is Incorrect Try Again");
              System.out.println("--------------------------------");  
			  System.out.println("Enter Cnic");
			  re.cnic1=sc.nextInt();
	  }
	  }
	  else if(re.pincode!=re.pincode1){
	
		  
		  while(re.pincode!=re.pincode1){
			  System.out.println("Password is Incorrect Try Again");
			  System.out.println("--------------------------------");
			  
			  System.out.println("Enter pincode");
			  re.pincode1=sc.nextInt();
			  
		  }
	  }
	
	  else{
		  System.out.println("              ");
	  }
	  
	  
	  
	}	  
}
//1st block end

}
else{
	System.out.println("please Select 1 or 2");
}
// while end
if(re.chose1==4){
	break;
}
}	

	
}
}