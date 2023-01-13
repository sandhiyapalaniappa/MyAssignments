package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=13;int count=0;
      for(int i=2;i<=n;i++)
      {
    	 if( n % 2 != 0) 
    	 {
    		 System.out.println("Prime Number");
    		 break;
    	 }
    	 else
    	 {
    		 System.out.println("Not a Prime Number");
    		 break;
    	 }
      }
	}

}
