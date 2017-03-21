import java.util.ArrayList;
import java.util.Collections;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution9 {

	 public static void main(String[] args){

		 int  A[]={5,1,1,1,1,1,2,2};
	 	 int K=5;
		 int reti=0;
		 int i;
boolean flag=true;
		   ArrayList List = new ArrayList();
		   ArrayList ListR = new ArrayList();


		    for(i=0;i<A.length;i++){
		    	List.add(A[i]);
		    	ListR.add(A[i]);

		    }



		    Collections.sort(List);
		    Collections.sort(ListR);
		    Collections.reverse(ListR);


		    i=0;
		    int j=0;
		    int tempSum=0;

		    for(i=0;i<=List.size()-1;i++){
		    	tempSum=tempSum+Integer.parseInt(List.get(i).toString());

		    	if(tempSum>=K){
		    		reti=reti+1;
		    		tempSum=0;
		    	}else{

		    	}
		    }




	        //return count;

	        System.out.println(reti);
	    }


}






