public class SoalUAS4 {
    public static void main(String[] args) {
   // write your code here
    	 int x = 5;
         for (int i = 0; i <= x; i++){
             for (int j = i; j <= x; j++){
                 System.out.print(" ");
             }
             for (int j = 0; j < i; j++){
                 System.out.print("*");
             }
             System.out.println();
             
         }
     }
}