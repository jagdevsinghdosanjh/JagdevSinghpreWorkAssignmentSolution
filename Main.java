import java.util.Scanner;
public class Main 
{
	Scanner sc=new Scanner(System.in);
	//sc is used for the user input variable from command line
	public void checkPalindrome()
	{
	    int num,temp,r,sum=0;
	    System.out.println("Enter the number to check it as Palindrom or Not Palindrom");
	    num=sc.nextInt();
	    temp=num;
		while(temp!=0)
	    {
	    r=temp%10;
	    temp=temp/10;
	    sum=sum*10+r;
	    System.out.println("Temp="+temp+"and Sum="+sum);
	    }
		if(sum==num)
			System.out.println("Number entered="+num+"="+sum+" is a Palindrome");
		else
			System.out.println("Number entered="+num+"="+sum+"is not a Palindrome");
	}
		//function to print pattern
	public void printPattern() 
	{
		int num,i,j;
	    System.out.println("Enter the number to Generate Pattern of Stars");
	    num=sc.nextInt();
		for(i=num;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
		//function to check number is prime or not
	public void checkPrimeNumber()
	{
		int num,mid=0,flag=0,i;
	    System.out.println("Enter the number to check as a Prime Number or Not a Prime Number");
	    num=sc.nextInt();//it is the number to be checked    
	    mid=num/2;      
	    if(num==0||num==1)
	    {  
	     System.out.println(num+" is not Prime Number");      
	    }
	    else
	    {  
	     for(i=2;i<=mid;i++)
	     {      
	      if(num%i==0)
	      {      
	       System.out.println(num+" is not prime number");      
	       flag=1;      
	       break;      
	      }      
	     }      
	     if(flag==0)  
	     System.out.println(num+" is prime number");   
	    }//end of else  
	}
		//function to print Fibonacci Series
	public void printFibonacciSeries()
	{
		//initialize the first and second values as 0,1 respectively.
		long first=0,second=1,next,i,count;
		System.out.println("Enter the total terms of Fibonacci Series");
	    count=sc.nextInt();//count is the total number of terms in FS
		System.out.print(first+" "+second);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  next=first+second;    
		  System.out.print(" "+next);    
		  first=second;    
		  second=next;
		 }
	}
		//main method which contains swith and do while loop
	public static void main(String[] args) 
	{
		Main obj=new Main();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\n\nEnter your choice from below list.\n"
			+"1. Find palindrome of number.\n"+"2. Print Pattern for a given number.\n"
			+"3. Check whether the number is a prime number.\n"
			+"4. Print Fibonacci Series.\n"+"--> Enter 0 to Exit.\n");
			System.out.println();
			choice=sc.nextInt();
			switch(choice) 
			{
					case 0:
					choice=0;
					break;
				
					case 1:
					{
						obj.checkPalindrome();
					}
					break;
					
					case 2:
					{
						obj.printPattern();
					}
					break;
					
					case 3:
					{
						obj.checkPrimeNumber();
					}
					break;
					
					case 4:
					{
						obj.printFibonacciSeries();
					}
					break;
			
					default:
						System.out.println("Invalid Choice. Enter a valid choice.\n ");
				}
		}
			while(choice!=0);
			System.out.println("Exited Successfully!!!");
			sc.close();
}
}