import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      int shine=a;
      int fact;
      int sum=0;
      while(a>0){
       int  b=a%10;
        fact=1;
      for(int i=1;i<=b;i++)
      {
         fact=fact*i;
      }
        sum+=fact;
         a=a/10;
      }
     // System.out.println(sum);
      if(sum==shine)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}