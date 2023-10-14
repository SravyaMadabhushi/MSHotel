// Java program to sort the elements in descending order
import java.util.*;

public class MSHotel {
	public static void main(String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);  
		 System.out.println("🏨️Welcome to MS Hotel🏨️");
		  int n=sc.nextInt();
		  String [] name=new String[n];
		 for(int i=0;i<n;i++){
		 System.out.println("Please enter Your Name");
		 String str=sc.next();
		 name[i]=str;
		 System.out.println("Please enter your mobile number");
		 String phNo=sc.next();
		 while(true){
		 if(phNo.length() != 10 ){
		 	System.out.println("Please enter valid phNo");
		 	phNo=sc.next();}
		 else
		 	break;
		 	}
		 
		 System.out.println("Available Food");
		 System.out.println("   Dosa-20rs");
		 System.out.println("   Chapathi-30rs");
		 System.out.println("   Puri-20rs");
		 System.out.println("Order Please😍️");
		 
		 int price=0;
		 while(true)
		 {
		 	String item=sc.next();
		 	item=item.toLowerCase();
		 	System.out.println("Quantity");
		 	int quantity=sc.nextInt();
		 	switch(item)
		 	{
		 		case "dosa":
		 			price+=quantity*20;
		 			break;
		 		case "chapathi":
		 			price+=quantity*30;
		 			break;
		 		case "puri":
		 			price+=quantity*20;
		 			break;
		 	}
		 	System.out.println("Want more😋️");
		 	System.out.println("True/False");
		 	boolean val=sc.nextBoolean();
		 	if(val ==false)
		 	break;
		 }
		 
		 System.out.println("Are you like my MSHotel??");
		 String review=sc.next();
		 System.out.println("Want to give a tip💁️");
		 System.out.println("True/False");
		 boolean bool=sc.nextBoolean();
		 if(bool == true)
		 {
		 System.out.print("Your Tip amount is:");
		 int tip=sc.nextInt();
		 price+=tip;
		 }
		 System.out.println("Your total amount : "+price);
		 System.out.println("       Have a nice day "+str+" and your review is : "+review);
	}	 	
		int winner=(int)Math.random()*n;
		for(int i=0;i<n;i++){
		
		if(i==winner)
		System.out.println(name[i]+" win the vocher🎊️");
		}
		
		
			
        
	}
}

