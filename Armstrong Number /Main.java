import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      int b=a;
      int i,cube=0,sum=0;
      while(a!=0){
        i=a%10;
        cube=i*i*i;
        sum=sum+cube;
        a=a/10;
      }
      if(sum==b)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}