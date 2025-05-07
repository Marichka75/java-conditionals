import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        final String correctUsername = "Usuario";
        final String correctPassword = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca nombre de usuario: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Introduzca la contraseña: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }
        scanner.close();
    }
}