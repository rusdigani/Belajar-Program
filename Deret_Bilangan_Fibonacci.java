import java.util.Scanner;

public class Deret_Bilangan_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil_input, tot_prev = 0, bil1 = 0, bil2 = 1, bil_ulang = 0;
        
        System.out.println("--- Menentukan Deret Fibonanci ---");
        System.out.print("* Masukkan angka = ");
        bil_input = sc.nextInt();
        
        System.out.print("- Deret Fibonanci dari "+bil_input+" = ");
        System.out.print(tot_prev);
        
        while(bil_ulang <= bil_input) {            
            tot_prev = bil1+bil2;
            bil2 = bil1;
            bil1 = tot_prev;
            
            System.out.print(" "+tot_prev);
            bil_ulang++;
        }
        
        System.out.println("\n----------------------------------");
    }    
}