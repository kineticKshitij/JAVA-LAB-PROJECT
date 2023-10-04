import java.util.*;
public class linearSearch
{
	public static int linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==key){
		        return 1;
		    }
		}
		return -1;
	}
	public static void main(String[] args){
	    linearSearch l=new linearSearch();
	    Scanner sc=new Scanner(System.in);
	    int[] arr=new int[5];
	    System.out.println("Enter Element: ");
	    for(int j=0;j<arr.length;j++)
	    {
	        arr[j]=sc.nextInt();
	    }
	    System.out.println("Enter the integer you want to Search: ");
	    int key=sc.nextInt();
	    int c= l.linearSearch(arr,key);
	    if(c==-1)
	    System.out.println("Key not Found");
	    else
	    System.out.println(key+" is foundat index :"+linearSearch(arr,key));
	}
}
