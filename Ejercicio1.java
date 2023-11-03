import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if (num%2==0){
            for (int i=10;i<num;i++){
                if (i%5==0) System.out.println(i);
            }
        }else {
            for (int i=10;i<num;i++){
                if (i%3==0) System.out.println(i);
            }
        }
    }
}
