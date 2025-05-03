import java.io.FileWriter;
import java.io.IOException;

public class Practice {
  public static void main(String[] args){
    // Your code here:
   try {
		System.out.println("Step 1");
		int result = 10 / 0;
		System.out.println("Step2");
   } catch (ArithmeticException Name) {
		System.out.println("Error" + Name.getMessage());
   }
  }
}