import java.util.Scanner;
public class THungDungTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double Money = input.nextDouble();
        System.out.println("Enter number of months: ");
        int Month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double Interest_rate = input.nextDouble();
        double total_Iterest_rate = 0;
        for(int i=0;i<Month;i++){
            total_Iterest_rate = Money*(Interest_rate/100)/12*Month;
        }
        System.out.println("Total of interest: "+total_Iterest_rate);
    }
}
