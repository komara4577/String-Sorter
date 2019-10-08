//By Kevin O'Mara
import java.util.Scanner;
public class StringSorting{
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
      String temp;
      
      System.out.print("Enter number of strings to sort:");
      int count = input.nextInt();
      
      String str[] = new String[count];
      
      System.out.println("Enter the Strings one by one:");
      input.nextLine();
      for(int i = 0; i < count; i++){
         str[i] = input.nextLine();
      }
      input.close();
      
      for(int i = 0; i < count; i++){
         for(int j = i + 1; j < count; j++){
            if(str[i].compareTo(str[j])>0){
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            }
         }
      }
      
      System.out.print("Strings in Sorted Order: ");
      for(int i = 0; i <= count - 1; i++){
         System.out.print(str[i] + ", ");
      }
   }
}