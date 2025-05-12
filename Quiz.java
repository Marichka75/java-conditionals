import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        String playerAnswer;
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        System.out.println("1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("    a. Ada Lovelace");
        System.out.println("    b. Jude Milhon");
        System.out.println("    c. Martha Ackelsberg");
        System.out.println("    d. Jane Jacobs");
        System.out.print("Tu respuesta: ");
        playerAnswer = scanner.nextLine();

        //Por cada respuesta correcta, añade 5 puntos al puntaje
        if (playerAnswer.equalsIgnoreCase("b")) {
            playerScore += 5;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta era b.");
        }
        System.out.println();
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        System.out.println("2. ¿Quién es Fuencisla Clemares?");
        System.out.println("    a. La directora general de IBM Europa, Oriente Medio y África");
        System.out.println("    b. La vicepresidenta de Microsoft Western Europe");
        System.out.println("    c. La directora general de Google en España y Portugal");
        System.out.println("    d. Fundadora y CEO de Marsi Bionics");
        System.out.print("Tu respuesta: ");
        playerAnswer = scanner.nextLine();

        if (playerAnswer.equalsIgnoreCase("c")) {
            playerScore += 5;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta era c.");
        }
        System.out.println();
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java
        System.out.println("3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println("    a. Primera programadora de software");
        System.out.println("    b. Una actriz de cine");
        System.out.println("    c. Inventora del procesador de datos");
        System.out.println("    d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        System.out.print("Tu respuesta: ");
        playerAnswer = scanner.nextLine();

        if (playerAnswer.equalsIgnoreCase("b") || playerAnswer.equalsIgnoreCase("d")) {
            playerScore += 5;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. Las respuestas correctas eran b y d.");
        }
        System.out.println();

        System.out.println("4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("    a. Katherine Johnson, Dorothy Vaughan y Mary Jackson");
        System.out.println("    b. Jessica Miller, Emily Johnson, Sarah Davis");
        System.out.println("    c. bell hooks, Toni Morrison y Alice Walker");
        System.out.println("    d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
        System.out.print("Tu respuesta: ");
        playerAnswer = scanner.nextLine();

        if (playerAnswer.equalsIgnoreCase("a")) {
            playerScore += 5;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta era a.");
        }
        System.out.println();

        System.out.println("Tu puntaje final es: " + playerScore + "/20");

        if (playerScore >= 15) {
            System.out.println("Tú si que sabes mucho");
        } else if (playerScore >= 5) {
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buena suerte la próxima vez");
        }
        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */
        //Respuestas: 1. b / 2. c / 3. b y d / 4. a
        scanner.close();
    }
    
}