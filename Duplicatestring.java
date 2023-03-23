public class Duplicatestring {

   public static void main(String args[]) {

      String inputstr = "beautiful beach";

      char[] result = inputstr.toCharArray();

      System.out.println("The string is:" + str);



      for (int i = 0; i < str.length(); i++) {

         for (int j = i + 1; j < str.length(); j++) {

            if (result[i] == result[j]) {

               System.out.print(result[j] + " ");

               break;

            }

         }

      }

   }

}
