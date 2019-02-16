import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      int fact=1;
      for(int i=1;i<=a;i++){
        if(a==0)
          fact=1;
        else
        fact=fact*i;
     
      }
      System.out.println(fact);
	}
}