import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanyo = sc.nextInt();
        int medio = tamanyo / 2;
        if (tamanyo % 2 != 0) {
            for (int i = 0; i < tamanyo; i++) {
                if (tamanyo > 1 && i != medio) {
                    for (int j = 0; j < tamanyo - medio - 1; j++) {
                        System.out.print(" ");
                    }
                }
                if (i != medio) System.out.print("X");
                if (i == medio) {
                    for (int j = 0; j < tamanyo; j++) {
                        System.out.print("X");
                    }
                }
                if (tamanyo > 1 && i != medio) {
                    for (int j = 0; j < tamanyo - medio - 1; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else System.out.println("Numero no valido");
    }
}
