import java.util.*;
public class TwodimensiionalLoop
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int[][] a=new int[4][3];
	    
	    for(int i=0;i<3;i++)
	  {
	  for(int j=0;j<2;j++){
	  a[i][j]=sc.nextInt();
	  }
	  }System.out.println("Two Dimesional Array is\n");
	    System.out.println(Arrays.deepToString(a));
	  }
	}