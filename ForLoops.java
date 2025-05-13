public class ForLoops {
    public static void main(String[] args) {

        //Escribe un bucle for que imprima números del 1 al 10
    System.out.println("Numbers from 1 to 10:");
    for (int i = 1; i <= 10; i++) {
        System.out.print(i + " ");
    }
    System.out.println("\n");

        //Escribe un bucle for que imprima "¡Hola FemCoders!" 5 veces
    System.out.println("Message printed 5 times:");
    for (int i = 0; i <= 5; i++) {
        System.out.println("Hello FemCoders!");
    }
    System.out.println();

        //Escribe un bucle for que imprima la tabla de multiplicar del número 7 (del 1 al 10)
    System.out.println("Multiplication table of 7:");
    for (int i = 1; i <= 10; i++) {
        System.out.println("7 x " + i + " = " + (7 * i));
    }
    System.out.println();

        //Escribe un bucle for que imprima números del 10 al 1 
    System.out.println("Numbers from 10 to 1:");
    for (int i = 10; i >= 1; i--) {
        System.out.print(i + " ");
    }
    System.out.println("\n");

        //Escribe un bucle for que imprima los 10 primeros números impares
    System.out.println("First 10 odd numbers:");
    for (int i = 1, count = 0; count < 10; i += 2, count++) {
        System.out.print(i + "");
    }
    System.out.println("\n");
        //Escribe un bucle for que encuentre el número más pequeño que sea mayor a 20 y que sea divisible para 8, usando 'break'.
        //Imprime: El número más pequeño mayor de 20 que es divisible para 8 es <result>
    for (int i = 21; ; i++) {
        if (i % 8 == 0) {
            System.out.println("The smallest number greater than 20 that is divisible by 8 is " + i);
        break;
        }
    }
    System.out.println();
        //Escribe un bucle for que imprima números pares del 1 al 20 saltando los números impares usando 'continue'
    System.out.println("Even numbers from 1 to 20:");
    for (int i = 1; i <= 20; i++) {
        if (i % 2 !=0) continue;
        System.out.print(i + " ");
    }
    System.out.println();
    }
}
