
import java.util.Scanner;

public class Práctica1 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);


    System.out.print("Introduce un texto: ");
    String texto = sc.nextLine();


    System.out.print("Introduce el primer número entero: ");
    int num1 = sc.nextInt();

    System.out.print("Introduce el segundo número entero: ");
    int num2 = sc.nextInt();

    System.out.print("Introduce el tercer número entero: ");
    int num3 = sc.nextInt();

  
    System.out.print("Introduce un número con decimales (double): ");
    double numDecimal = sc.nextDouble();


    if (num1 < 0) {
        num1 = Math.abs(num1);
    }
    if (num2 < 0) {
        num2 = Math.abs(num2);
    }
    if (num3 < 0) {
        num3 = Math.abs(num3);
    }


    int resultado = (num2 * num3) + num1;


    int numeroArriba = (int) Math.ceil(numDecimal);
    int numeroAbajo = (int) Math.floor(numDecimal);


    System.out.println("Texto guardado: " + texto);


    System.out.println("Resultado de la operación: " + resultado);
    System.out.println("Número entero más próximo por arriba: " + numeroArriba);
    System.out.println("Número entero más próximo por abajo: " + numeroAbajo);

    sc.close();


	}

}
