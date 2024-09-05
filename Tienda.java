import javax.swing.*;
import java.util.Scanner;

public class Tienda {

    /**
     * @param args
     */
    public static void main(String[] args) {

    Scanner par = new Scanner(System.in);
    String nombre;
    String producto;
    Double valor;
    int cantidad;
    String mensaje = "Error, ingresar datos mayor a 0";

    System.out.println("Digite su nombre: ");
    nombre = Scanner.nextLine();

    System.out.println("Digite el nombre del producto:");
    producto = Scanner.nextLine();

    System.out.println("Digite el valor del producto:");
    valor = Scanner.nextDouble();
    if (valor >=0) {
        System.out.println("Digite el valor del producto");
    }





}

}