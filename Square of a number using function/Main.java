import java.util.Scanner;
class Main
{
	public static int sum(int a){
    int c=a*a;
    return c;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
   int n = in.nextInt();   
   int b=sum(n);
      System.out.println(b);
	} 
}

