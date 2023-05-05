
public class HomePattern {

	public static void main(String[] args) {
		int n=14;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n ||j==n ||i==1 || j==1 || i+j<=n-6||(i==2 &&j==8) ||(j==9 && i<=3) ||(i<=4 && j==10) ||(i<=5 && j==11)||(i<=6 && j==12)|| (i<=7 && j==13))
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
