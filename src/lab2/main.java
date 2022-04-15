package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cmd, j;
		String a;
		System.out.print ("Daraalliinhaa niit hemjeeg oruulna uu:"); 
		j = scan.nextInt (); 
		String [] arr = new String [j];
		ArrayLinearList array = new ArrayLinearList();
		try {
			  System.out.println("1.Hooson esehiig shalgah\n2.Jagsaaltiin urtiig oloh"
			  		+ "\n3.Jagsaaltand utga nemeh\n4.Jagsaaltiin utguudiig hevleh"
			  		+ "\n5.Jagsaaltaas utga hasah\n6.Jagsaaltaas indexeer utga haih"
			  		+ "\n7.Jagsaaltaas elementeer utga haih \n\nComanduudaas songoj oruulna uu!!!");
			  System.out.println("Ta commandaa oruulna uu");
		      cmd=scan.nextInt();
		      while(cmd!=0) {
		    	  switch(cmd) {
		    	  case 1:
		    		  if(array.empty()) {
		    			  System.out.println("Jagsaalt hooson baina.");
		    		  }
		    		  else {
		    			  System.out.println("Jagsaalt hooson bish baina.");
		    		  }
		    		  break;
		    	  case 2:
		    		  int size;
		    		  size = array.size();
		    		  System.out.println("Jagsaaltiin urt:" + size);
		    		  break;
		    	   case 3:	  
		    		   System.out.print("Nemeh utga :");
			    	   a=scan.next();
			    	   if(array.add(arr, a)) {
			    		   String[] newArr = Arrays.copyOf(arr, arr.length + 1);
			                arr = newArr;
			    	   }
			    	   System.out.println("Oruulsan utga amjilttai nemegdlee.");
			    	   break;
		    	   case 4:
		    		   array.print(arr);
		    		   break;
		    	   case 5:
		    		   int i;
		    		   System.out.println("Heddugeer indexiin utgiig hasahaa oruulna uu :");
		    		   i = scan.nextInt();
		    		   array.remove(arr, i);
		    		   break;
		    	   case 6:
		    		   int k;
		    		   System.out.println("Indexiin utgaa oruulna uu : ");
		    		   k = scan.nextInt();
		    		   System.out.println("Oruulsan indexd tohiroh element : " + array.getElement(arr, k));
		    		   break;
		    	   case 7:
		    		   System.out.println("Elementiin utgaa oruulna uu : ");
		    		   a = scan.next();
		    		   System.out.println("Oruulsan elementiin index ni : " + array.getIndex(arr, a));
		    		   break;
		    	   
		    		default:
		    		   System.out.println("1-4 iin hoorond comand oruulna uu!");
		    		
		    	  }
		    	  System.out.print("\nComand :");
		    	   cmd=scan.nextInt();
		      }
		}
		      catch(Exception e) {
		    	  System.out.println("Buruu baina!");
		      }
	}
}
