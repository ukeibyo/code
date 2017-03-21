// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution4 {

	 public static void main(String[] args){




		 int X=10;
		 int Y=85;
		 int D=30;


		int M=Y-X;


		 int reti=0;
		 if (X==Y){
			 reti=0;
		 }else{
			 if (M<=D){
				 reti=1;
			 }else{
				 if(M % D==0){
					 reti=(M / D);
				 }else{

					 if((M / D) * D>M){
						 reti=(M / D)-1;
					 }
					 if((M / D) * D<M){
						 reti=(M / D)+1;
					 }
				 }


			 }


		 }



		  System.out.println(reti);



		 }












		 }




