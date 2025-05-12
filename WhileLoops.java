import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        Scanner scanner = new Scanner(System.in);
        System.out.println("Generating random numbers until 7 appears:");
        int randomNumber = 0;
        while (randomNumber != 7) {
            randomNumber = getRandomNumber(10);
            System.out.println("Generated: " + randomNumber);
        }
        System.out.println("Got 7!\n");
        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        System.out.println("Generating random numbers until a number greater than 70 appears:");
        randomNumber = 0;
        while (randomNumber <= 70) {
            randomNumber = getRandomNumber(100);
            System.out.println("Generated: " + randomNumber);
        }
        System.out.println("Got a number greater than 70: " + randomNumber);
        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        System.out.println("Guess the number (between 1 and 100):");
        int target = getRandomNumber(100);
        int guess;

        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < target) {
                System.out.println("Too low.");
            } else if (guess > target) {
                System.out.println("Too high.");
            }
        } while (guess != target);

        System.out.println(" Correct! The number was " + target);
        scanner.close();
    }


    /**
     * Function name: getRandomNumber
     *
     * @param number (int)
     * @return (int)
     * <p>
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number) {
        return (int) (Math.random() * number) + 1;
    }
}
