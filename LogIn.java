import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";

        Scanner scanner = new Scanner(System.in);
        String inputUsername;
        String inputPassword;

        while (true) {
            System.out.print("Enter username: ");
            inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            inputPassword = scanner.nextLine();
            if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                System.out.println("Incorrect data, please try adain.\n");
            }
        }
        scanner.close();
    }
}
