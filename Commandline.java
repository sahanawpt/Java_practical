package Week_02;
public class Commandline {
	public static void main(String args[])
	{
		if(args.length>0)
		{
			System.out.println("java buzzwords...");
			for (byte i=0;i<args.length;i++)
			{
				System.out.println(i+1+"."+ args[i]);
			}
		}
		else
		{
			System.out.println("NO COMMAND LINE ARGUMENT FOUND");
		}
	}

}