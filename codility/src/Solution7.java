// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution7 {

	 public static void main(String[] args){

		 int  A[]={1,10};
		 int reti=-1;
		 int i;
		 int N=5;



	        int[] count = new int[N];
	        int max = 0;
	        int lastUpdate = 0;
	        for(  i = 0; i < A.length; i++){
	            if(A[i] <= N){
	                if(count[A[i]-1] < lastUpdate){
	                    count[A[i]-1] = lastUpdate+1;
	                }
	                else{
	                    count[A[i]-1]++;
	                }
	                max = Math.max(max, count[A[i]-1]);
	            }
	            else{
	                lastUpdate = max;
	            }
	        }
	        for(  i = 0; i < N; i++){
	            if(count[i] < lastUpdate)
	                count[i] = lastUpdate;
	        }
	        //return count;
	        System.out.println(reti);
	    }











		 }






