import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Requisito: Ler o raio
        System.out.print(" Entre com o raio do circulo: ");
        double raio = scanner.nextDouble();
        scanner.close();

        // Calcule a area do circulo
        double area = Math.PI * Math.pow(raio, 2);

        // Imprimir a area do circulo
        System.out.print("A area do circulo é: " + area);

    }
}
