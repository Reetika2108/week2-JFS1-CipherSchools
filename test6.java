import java.util.InputMismatchException;
import java.util.Scanner;

public class test6 {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);

        void Calculate() {
            try {
            System.out.println("Enter first number: ");
            num1=sc.nextInt();
            System.out.println("Enter second number: ");
            num2=sc.nextInt();
                    
            if(num2==0) {
                    throw new ArithmeticException();
            }
            res=num1/num2;
            }

            catch(InputMismatchException ime) {
                //this block executes only if any error occurs at try block.
                System.out.println("Ouch!!! Exception detected.");
            }
            catch(ArithmeticException ae) {
                //this block executes only if any error occurs at try block.
                System.out.println("Ouch!!! Exception detected.");
            }
            finally{
                System.out.println("The division is : "  + res);
            }
            //try is a block of code that we think has probability to throw error at runtime.

            
        }
        public static void main(String[] args) {
            test6 obj=new test6();
            obj.Calculate();
        }
}