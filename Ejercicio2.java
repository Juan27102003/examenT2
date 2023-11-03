import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, media = 0;
        int contSus = 0, cont = 0, contApro = 0;
        do {
            nota = sc.nextInt();
            if (nota > 0) {
                if (nota >= 5) contApro++;
                if (nota < 5) contSus++;
                cont++;
                media += nota;
            }
        } while (nota != -1);
        media = media / cont;
        if (cont == 0) {
            System.out.println("No se han introducido calificaciones");
        } else {
            System.out.println("La media es " + media);
            System.out.println("Aprobados: " + contApro + " - Suspensos: " + contSus);
        }

    }
}
