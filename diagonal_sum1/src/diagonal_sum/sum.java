package diagonal_sum;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int sum=0,sum1=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
				if(i==j)
				{
					sum=arr[i][j]+sum;
				}
				if((i+j)==4)
				{
					sum1=sum1+arr[i][j];
				}
			}
		}
		System.out.println("Sum of l-r= "+sum);
		System.out.println("sum of r-l= "+sum1);
	}
}
