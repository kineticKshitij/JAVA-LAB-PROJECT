import java.util.*;
public class SumAvg
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int[] a=new int[3];
	    
	    for(int i=0;i<3;i++)
	  {
	  a[i]=sc.nextInt();
	  }
	  int sum=0,avg;
	  for(int i=0;i<3;i++)
	  {
	  sum+=a[i];
	  }
	  avg=sum/2;
	  System.out.println("Sum= "+sum+"\nAverage= "+avg);
	  }
	}