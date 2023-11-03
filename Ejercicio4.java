import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planta, aux = 0, resultado = 0, diferencia, cont = 0;
        do {
            planta = sc.nextInt();
            if (planta != -1 && cont > 0) {
                diferencia = aux - planta;
                if (diferencia < 0) diferencia = -diferencia;
                resultado += diferencia;
            }
            aux = planta;
            cont=1;
        } while (planta != -1);
        System.out.println(resultado);
    }
}
