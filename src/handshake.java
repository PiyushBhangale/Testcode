import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

 
// A class that uses Car
class Test
{
  
    // Driver method
    public static void main(String[] args)
    {
    	
    	Scanner s=new Scanner(System.in);
      System.out.println("Enter number of elements");
      int n=s.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elemets");
      for(int i=0;i<n;i++) 
      {
    	  arr[i]=s.nextInt();
      }
      for(int i=0;i<n;i++) 
      {
    	  try {
    	  if (arr[i]==1) {
    		  System.out.println("0");
    	  }
    	  else {
    	  int present=0;
    	  present=arr[i]*(arr[i]-1)/2;
    	  System.out.println(present);
    	  }
    	  }
    	  catch(NullPointerException  e){
    		  System.out.println("Null exception");
    		  
    	  }
    	  catch(InputMismatchException e) 
    	  {
    		  System.out.println("Enter appropriate value");
    	  }
      }
    }
}

//class Car
//{
//    int model, no;
// 
//   
// 
//    // Utility method to print Car
//    void print()
//    {
//  
//    }
//}