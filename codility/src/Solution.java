import java.util.ArrayList;
import java.util.Collections;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution {

	 public static void main(String[] args){

		 	int A[]={22,22,22,411,411, 333,333,4,4,4, 4,1555, 1555,1555,1555};



		 	int i=0;

		 	int count=0;

		    int ret=-1000;
		   ArrayList List = new ArrayList();



		    for(i=0;i<A.length;i++){
		    	List.add(A[i]);
		    }



		    Collections.sort(List);

		    System.out.println(List.toString());


int tempi=Integer.parseInt(List.get(0).toString()) ;

		    for(i=0;i<List.size();i++){
		    	if (tempi==Integer.parseInt(List.get(i).toString())) {
		    		count=count+1;
		    	}
		    	if (tempi!=Integer.parseInt(List.get(i).toString())) {
		    		if (count % 2 ==1){
		    			ret=tempi;
		    			break;
		    		}
		    		count=1;
		    		tempi=Integer.parseInt(List.get(i).toString());
		    	}
		    }

		    if (ret==-1000){
		    	ret=tempi;
		    }



			  System.out.println(ret);

	 }

}


