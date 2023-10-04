public class linearSearchExample
{
	public int linearSearchExample(int[] arr,int key) {
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==key){
		        return 1;
		    }
		}
		return -1;
	}
	public static void main(String[] args){
	    int[] a1={10,20,30,40,50,70,90};
	    int key=70;
	    linearSearchExample ob= new linearSearchExample();
	    int i=ob.linearSearchExample(a1,key);
	    if(i==-1)
	    System.out.println("Key not Found");
	    else
	    System.out.println(key+" is foundat index :"+i);
	}
}