import java.util.Scanner;
class stringReverse{
  public static void main(String args[]){
    String a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    a=sc.nextLine();
    System.out.println("THE STRING IS");
    StringBuilder b=new StringBuilder(a);
    System.out.println(b.reverse());
  }
}




