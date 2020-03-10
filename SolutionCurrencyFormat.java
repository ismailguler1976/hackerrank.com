package guler.solutions;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SolutionCurrencyFormat {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
       NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
       String us = nf.format(payment);
       
       NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
       String china = nfChina.format(payment);
       
       String china2 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(payment);
       
       nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
       String france = nf.format(payment);
       
       nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
       String india = nf.format(payment);
       
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("China: " + china2);
        System.out.println("France: " + france);
    }
}
