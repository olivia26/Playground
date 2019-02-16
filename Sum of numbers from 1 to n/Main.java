import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
       Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      int i,sum=0;
      for(i=1;i<=a;i++){
        sum+=i;
      }
      System.out.println(sum);
	}
}