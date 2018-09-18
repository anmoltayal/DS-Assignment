import java.util.Scanner;
class substring
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
  		String S;
		System.out.println("Enter the String :");
		S=sc.nextLine();
  		System.out.println("all substring of string are: ");
   		for (int i = 0; i < S.length(); i++)
   		{
   			for (int j = i+1; j <= S.length(); j++)
   			{
        		System.out.println(S.substring(i,j));
   			}
 		}
 	}
}