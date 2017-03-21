// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution3 {

	 public static void main(String[] args){


		 String S="aaaaa";
		 int iret=-1;
		 String newS="";
		 newS=S;

		 if (S.length()<=2){
			 if(S.length()<=0){

			 }else if(S.length()==1){
				 iret=0;
			 }else if(S.length()==2){

			 }
		 }else{

			 int i;


			 for( i=1;i<=S.length()-1;i++){
				 newS=" " + newS;
			 }





	 	      for( i=newS.length()/2;i<=newS.length()-2;i++){
	 	    	  if(newS.substring(i-1, i).equals(" ")){

	 	    	  }else{

	 	    		  for(int j=i;j<=newS.length()-2;j++){

	 	    		  }
		 	    	  if(newS.substring(i-1, i).equals(newS.substring(i+1, i+2))){

			 	    		 iret=i-newS.length()/2;
			 	    		 break;

		 	    	  }
	 	    	  }



	 	    	 }


	 	      }

		  System.out.println(iret);
		 }

}


