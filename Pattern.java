public class Pattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0 ; i<n ; i++)
		{
			for(int j =0 ; j<n ;j++)
			{
				if(i==0 && j<n || i==1&&j==n-5 || i==2 && j<n || i==3 && j==n-1 || i==4 && j<n) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j =0 ; j<n ;j++)
			{
				if(j==0 || j==n-1 || i==(n-1)/2 || i==0 && j>=0) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j =0 ; j<n ;j++)
			{
				if(i==0 || j==2) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j =0 ; j<n ;j++)
			{
				if(i==0 || j==2 || i==4) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j =0 ; j<n ;j++)
			{
				if(i==0 && j<n || i==1&&j==n-5 || i==2 && j<n || i==3 && j==n-1 || i==4 && j<n) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j =0 ; j<n ;j++)
			{
				if(j==0 || j==n-1 || i==2) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
			System.out.println(" ");
		}
		}

	}

