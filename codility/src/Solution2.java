// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution2 {

	 public static void main(String[] args){

		 	int A[]={1,2,3,-4,-6,-90};
		 	int K=10;

		 	int iK=0 ;
		 	int tempiB[];
		 	String retA="";
		 	String retB="";
		 	int i=0;



		 	if (K==0||A.length==0||A.length==1){
		 		tempiB=A;
		 	}else{
		 		iK=K % A.length;
		 		if(iK==0){
		 			tempiB=A;

		 		}else{

				 	retA=String.valueOf( A[0]);
				 	for(i=1;i<A.length;i++){
				 		retA=retA+","+A[i];

				 	}

				 	String tempB[]=retA.split(",");

			 	//	retB=retA.substring(retA.length()-(iK+(iK-1)), retA.length()) +","+ retA.substring(0,retA.length()-(iK+(iK-1))-1);

				 //	String tempB[]=retB.split(",");
				    tempiB=new int[tempB.length];
				    int j=0;
				 	for(i=0;i<tempB.length;i++){
				 		if(i>=tempB.length-iK){
				 			tempiB[j]=Integer.parseInt(tempB[i]);
				 			j++;
				 		}else{
				 			tempiB[iK+i]=Integer.parseInt(tempB[i]);
				 		}

				 	}


		 		}


		 	}



		 	 System.out.println(iK);
			 // System.out.println(retA);

	 }

}


