// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution8 {

	 public static void main(String[] args){

		// int  A[]={1,10};
		 int reti=0;

		 int A=7;
		 int B=17;
		 int K=8;

		 int  M=B-A;
		 if(A % K==0&&B % K ==0){
			 reti=B/K -A/K +1;
		 }else if(A % K==0&&B % K !=0){
			 reti=B/K -A/K+1 ;

		 }
		 else if(A % K!=0&&B % K ==0){
			 reti=B/K -A/K ;

		 }else if(A % K!=0&&B % K!=0){
			 reti=B/K -A/K ;

		 }
	        //return count;

	        System.out.println(reti);
	    }


}






