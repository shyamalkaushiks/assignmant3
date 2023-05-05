
public class Epattern {

	public static void main(String[] args) {
		int n=14;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 ||i==n || i+j<=n-6 || i-j>=n-8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
				
			}
			System.out.println(" ");
		}

	}

}
