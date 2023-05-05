public class Vpattern {
	public static void main(String [] args) {
		int n =14;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j==1&&i>=7)||(i>=7&&j==n) || i==n ||i-j>=6 ||(i==13 && j>=8)||(i==12 && j>=9)|| (i==11&&j>=10) ||(i==10&&j>=11) ||(i==9&&j>=12)||(i==8&&j>=13))
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
