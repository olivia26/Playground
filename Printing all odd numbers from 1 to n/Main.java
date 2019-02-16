import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      int i;
      for(i=1;i<=a;i++){
        if((i%2)==1)
          System.out.println(i);
      }
    }
}