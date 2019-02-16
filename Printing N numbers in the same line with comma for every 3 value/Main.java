import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
     Scanner n=new Scanner(System.in);
    int a=n.nextInt();
    for(int i=1;i<=a;i++){
      System.out.print(i);
      if(i%3==0)
         System.out.print(",");
    }
  }
}