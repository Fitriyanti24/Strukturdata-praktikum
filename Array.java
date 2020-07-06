import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []numbers = new int[100];
        for (int i=0;i<3;i++){
            
            System.out.print(" Angka:");
            numbers[i] =sc.nextInt();
            System.out.println(numbers[i]);
        }
        for (int n : numbers){
            System.out.println(n);
      
    }
    
}
}
