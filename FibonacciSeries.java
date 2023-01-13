package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int FirstNum=0,SecNum=1,sum=0;
    for(int i=1;i<=11;i++)
    {
    	sum=FirstNum+SecNum;
    	FirstNum=SecNum;
    	SecNum=sum;
    	System.out.println(sum);
    }
	}

}
