import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1,2,3,4};
		List<List<Integer>> f_list= new ArrayList<>();
		
		Codechef cc = new Codechef();
		cc.G_Subset(f_list,arr,0,arr.length);
		for(int i=0;i<f_list.size();i++){
		    List<Integer> t_list = f_list.get(i);
		    System.out.println(t_list);
		}
	}
	
	public void G_Subset(List<List<Integer>> f_list, int arr[], int start, int end){
	    System.out.println("Inside G_Subset");
	    for(int i=start;i<end;i++){
	        //System.out.println("Start: "+i);
	        Subset(f_list,arr,i,i+1);
	    }
	}
	
	public void Subset(List<List<Integer>> f_list, int arr[], int start, int end){
	    //System.out.println("Inside Subset");
	    List<Integer> t_list = new ArrayList<>();
	    for(int i=start;i<end;i++){
	        t_list.add(arr[i]);
	    }
	    //System.out.println("Adding list: "+ t_list);
	    f_list.add(t_list);
	    if(end<arr.length){
	        Subset(f_list, arr, start, ++end);
	    }
	}
}