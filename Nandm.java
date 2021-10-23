import java.util.Scanner;
public class Nandm {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
				int m=sc.nextInt();
				int n=sc.nextInt();
				while(m<n-1)
				{
					m++;
					if(m%3==0)
					{
						System.out.println(m);
					}
				}
				
	}
	

}
