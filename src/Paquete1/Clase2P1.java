package Paquete1;
import Paquete1.Clase1P1;

public class Clase2P1 {

    public static int sumar (int a, int b){
        return a + b;
    }
public static void main(String[] args) {
    System.out.println("Nueva clase agregada.");
    int a = 5;
    int b = 10;
    int suma = sumar(a,b);
    System.out.println("El resultado final es: " + suma);
}
}