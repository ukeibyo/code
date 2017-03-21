import java.util.ArrayList;
import java.util.Collections;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution5 {

	 public static void main(String[] args){

		 int  A[]={1,3};
		 int reti=-1;

		   ArrayList List = new ArrayList();

		   if(A.length==0){
			   reti=1;
		   }

		    for(int i=0;i<A.length;i++){
		    	List.add(A[i]);
		    }


		    int i;
		    Collections.sort(List);
		    for( i=0;i<List.size();i++){
		    	if(i+1!=Integer.parseInt(List.get(i).toString()) ){
		    		reti=i+1;
		    		break;
		    	}
		    }

		    if (reti==-1){
		    	reti=List.size()+1;
		    }

		  System.out.println(reti);



		 }












		 }




