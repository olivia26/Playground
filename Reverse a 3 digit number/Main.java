import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner n=new Scanner(System.in);
      int n1=n.nextInt();
     int a=n1/100;
    int b=(n1/10)%10;
    int d=n1%10;
    int c=(d*100)+(b*10)+a;
      System.out.println(c);
  }
}