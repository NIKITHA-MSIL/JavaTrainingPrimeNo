import java.util.Scanner; 
public class PrimeNo {
	
	 
	 
	                 public static void main(String args[]) 
	              { 
	                   int num,b,c; 
	                   Scanner s=new Scanner(System.in); 
	                   System.out.println("Enter A Number"); 
	                   num =s.nextInt(); 
	                   b=1; 
	                   c=0; 
	                    while(b<= num) 
	                       { 
	                           if((num%b)==0) 
	                              c=c+1; 
	                              b++; 
	                       } 
	                        if(c==2) 
	                        System.out.println(num +" is a prime number"); 
	                        else 
	                        System.out.println(num +" is not a prime number"); 
	                        System.out.println("input the no to be multiplied"); 
	                        int num6 = s.nextInt();
	                        int num2 = num * num6;
	                        System.out.println("product is"+num2); 
	                        float num3= num2;
	                        System.out.println("Input the no to be divided"); 
	                        int num4 = s.nextInt();
	                        float num5 = num4;
	                        System.out.println("The final output is"+num3/num5); 

	              
	 } 

}
