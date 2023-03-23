class stringReverse{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    StringBuilder input=in.nextline();
    StringBuilder result=new StringBuilder();
    for(int i=input.lenght()-1;i>=0;i--){
      result.append(input.charAt(i));
      }
    System.out.println("Reversed ouput"+result);
    }
  
  }





