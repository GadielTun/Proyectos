/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductormorse;

import java.util.Scanner;

/**
 *
 * @author gadiel
 */
public class TraductorMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta aplicación es un traductor de español a morse y de morse a español.

        //Se crea un Scanner para poder capturar los datos imtroducidos
        Scanner entrada = new Scanner(System.in);

        //Creamos e inicializamos variables que se utilizan
        String mensaje = "";
        String opcion = "";
        String otra = "";
        String morse1 = "";
        String resultadoMorse = "";
        String op;
        int contador = 0;

        //Mostramos un mensage de bienvenida
        System.out.println("Bienvenido a este traductor Español-Morse o Morse-Español: " + "(Esp-Mor) (Mor-Esp)\n");

        System.out.print("MENÚ DE OPCIONES:\n"
                + "A)  ESPAÑOL-MORSE\n"
                + "B) MORSE-ESPAÑOL\n");
        System.out.print("Elija una opción: ");
        opcion = entrada.nextLine();

        //si el usuario acepta
        if ("A".equalsIgnoreCase(opcion)) {

            //Creamos un do while por si desea traducir otra texto
            do {
                //Mostramos al usuario el abecedario el codigo morse para que el usuario pueda comprobar si la traduccíon es correcta
                System.out.println("------------ABECEDARIO Y NÚMEROS EN ESPAÑOL-CÓDIGO MORSE------------");
                System.out.print(" A = .-      B = -...      C = -.-.     D = -..\n E = .       F = ..-.      G = --.      H = ....\n"
                        + " I = ..      J = .---      K = -.-      L = .-..\n M = --      N = -.        O = ---      P = .--.\n"
                        + " Q = --.-    R = .-.       S = ...      T = -\n U = ..-     V = ...-      W = .--      X = -..-\n"
                        + " Y = -.--    Z = --..      1 = .----    2 = ..--- \n 3 = ...--   4 = ....-     5 = .....    6 = -....\n"
                        + " 7 = --...   8 = ---..     9 = ----.    0 = -----\n\n");

                //Le pedimos al usuario el mensaje que se traducira
                System.out.print("Ingrese el texto que desea traducir: ");
                mensaje = entrada.nextLine();
                //Creamos una variable que contenga todas las letras del abecedario
                String letras = "abcdefghijklmnopqrstuvwxyz0123456789";
                //Esta parte convierte el mensaje en minusculas para comprobarlo con la variable letras
                mensaje = mensaje.toLowerCase();
                //creamos un array que tenga el codigo morse en su memoria
                String codigoM[] = new String[36];
                //creamos estas variables para cuando sea una letra sea separada por un espacio
                String morse = " ";//cuando es una letra
                String espacio = "   ";//cuando es una palabra

                //Vector con los los datos
                codigoM[0] = ".-"; 		//A
                codigoM[1] = "-...";		//B
                codigoM[2] = "-.-.";		//C
                codigoM[3] = "-..";		//D
                codigoM[4] = ".";		//E
                codigoM[5] = "..-.";		//F
                codigoM[6] = "--.";		//G
                codigoM[7] = "....";		//H
                codigoM[8] = "..";		//I
                codigoM[9] = ".---";		//J
                codigoM[10] = "-.-";		//K
                codigoM[11] = ".-..";	        //L
                codigoM[12] = "--";		//M
                codigoM[13] = "-.";		//N
                codigoM[14] = "---";		//O
                codigoM[15] = ".--.";	        //P
                codigoM[16] = "--.-";	        //Q
                codigoM[17] = ".-.";		//R
                codigoM[18] = "...";		//S
                codigoM[19] = "-";		//T
                codigoM[20] = "..-";		//U
                codigoM[21] = "...-";	        //V
                codigoM[22] = ".--";		//W
                codigoM[23] = "-..-";	        //X
                codigoM[24] = "-.--";	        //Y
                codigoM[25] = "--..";	        //Z
                codigoM[26] = "-----";	        //0
                codigoM[27] = ".----";	        //1
                codigoM[28] = "..---";	        //2
                codigoM[29] = "...--";	        //3
                codigoM[30] = "....-";	        //4
                codigoM[31] = ".....";	        //5
                codigoM[32] = "-....";	        //6
                codigoM[33] = "--...";	        //7
                codigoM[34] = "---..";	        //8
                codigoM[35] = "----.";	        //9

                //Creamos un for para poder recorrer todas las letras del abecedario y los numeros que hay en en array
                for (int i = 0; i < mensaje.length(); i++) {
                    //si encontramos que se hizo una separacion se la convertimos en tres separaciones
                    if (mensaje.charAt(i) == ' ') {
                        morse = morse + espacio + ' ';//la multiplicamos por 3 la separación

                        //si no es una separación
                    } else {
                        //Creamos un for que recorra las letras del abecedario
                        for (int j = 0; j < letras.length(); j++) {
                            //Si cada letra concuerda con las letras del abecedario
                            if (mensaje.charAt(i) == letras.charAt(j)) {
                                //Se guarda el codigo morse en la variable que contendra el texto traducido en este caso "morse"
                                morse = morse + codigoM[j] + ' ';	// Cuando no hay letras se eliminan

                            }
                        }
                    }
                }
                //Quitamos los espacios de mas que podria introducir el usuario y lo convertimos en uno
                morse = morse.substring(1, morse.length());
                //Mandamos a imprimir el resultado en consola
                System.out.println("El texto en código morse es:" + morse);

                //Le preguntamos al usuario si desea realizar otra traducción
                System.out.print("¿Desea traducir otro texto? (S/N):");
                otra = entrada.nextLine();
            } while ("S".equalsIgnoreCase(otra));

            //Si el usuario no desea traducir de español a morse se le pregunta si lo desea hacer de morse a español
            //Tambien comprobamos si no desea traducir otra palabra
        }

        if ("b".equalsIgnoreCase(opcion)) {
            //si el usuario acepta
            if ("b".equalsIgnoreCase(opcion)) {
                //Creamos un do while por si desea traducir otra texto
                do {
                    //Mostramos al usuario el abecedario el codigo morse para que el usuario pueda comprobar si la traduccíon es correcta
                    System.out.println("------------ABECEDARIO Y NÚMEROS EN CÓDIGO MORSE-ESPAÑOL------------");
                    System.out.print(" .-    = A   -...  = B     -.-.  = C    -..   = D\n .     = E   ..-.  = F     --.   = G    ....  = H\n"
                            + " ..    = I   .---  = J     -.-   = K    .-..  = L\n --    = M   -.    = N     ---   = O    .--.  = P\n"
                            + " --.-  = Q   .-.   = R     ...   = S    -     = T\n ..-   = U   ...-  = V     .--   = W    -..-  = X\n"
                            + " -.--  = Y   --..  = Z     .---- = 1    ..--- = 2 \n ...-- = 3   ....- = 4     ..... = 5    -.... = 6\n"
                            + " --... = 7   ---.. = 8     ----. = 9    ----- = 0\n\n");

                    //Strings que contienen el abecedario en morse
                    String espacio = " ", a = ".-", b = "-...", c = "-.-.", d = "-..", e = ".", f = "..-.", g = "--.", h = "....", i = "..",
                            j = ".---", k = "-.-", l = ".-..", m = "--", n = "-.", o = "---", p = ".--.", q = "--.-", r = ".-.", s = "...",
                            t = "-", u = "..-", v = "...-", w = ".--", x = "-..-", y = "-.--", z = "--..";

                    //Strings que contienen los numeros en morse
                    String c1 = ".----", c2 = "..---", c3 = "...--", c4 = "....-", c5 = ".....", c6 = "-....", c7 = "--...", c8 = "---..", c9 = "----.", c0 = "-----";
                    int longitudMorse, cont = 0;
                     
                    //Le decimos que introduzca el codigo morse
                    System.out.print("Ingrese el código morse que desea traducir: ");
                    morse1 = entrada.nextLine();

                    //Divide por un espacio
                    String[] letra = morse1.split("\\ ");
                    
                    //mientras el contador sea menor a la longitud de las letras se ejecuta
                    while (cont < letra.length) {
                        //Comprueba si lo que introducimos es una letra y lo concatena
                        if (letra[cont].equals(a)) {
                            resultadoMorse = resultadoMorse.concat("a");
                        }
                        //Comprueba si lo que introducimos es una letra y lo concatena
                        if (letra[cont].equals(b)) {
                            resultadoMorse = resultadoMorse.concat("b");
                        }
                        //Comprueba si lo que introducimos es una letra y lo concatena
                        if (letra[cont].equals(c)) {
                            resultadoMorse = resultadoMorse.concat("c");
                        }
                        //Comprueba si lo que introducimos es una letra y lo concatena
                        if (letra[cont].equals(d)) {
                            resultadoMorse = resultadoMorse.concat("d");
                        }
                        if (letra[cont].equals(e)) {
                            resultadoMorse = resultadoMorse.concat("e");
                        }
                        if (letra[cont].equals(f)) {
                            resultadoMorse = resultadoMorse.concat("f");
                        }
                        if (letra[cont].equals(g)) {
                            resultadoMorse = resultadoMorse.concat("g");
                        }
                        if (letra[cont].equals(h)) {
                            resultadoMorse = resultadoMorse.concat("h");
                        }
                        if (letra[cont].equals(i)) {
                            resultadoMorse = resultadoMorse.concat("i");
                        }
                        if (letra[cont].equals(j)) {
                            resultadoMorse = resultadoMorse.concat("j");
                        }
                        if (letra[cont].equals(k)) {
                            resultadoMorse = resultadoMorse.concat("k");
                        }
                        if (letra[cont].equals(l)) {
                            resultadoMorse = resultadoMorse.concat("l");
                        }
                        if (letra[cont].equals(m)) {
                            resultadoMorse = resultadoMorse.concat("m");
                        }
                        if (letra[cont].equals(n)) {
                            resultadoMorse = resultadoMorse.concat("n");
                        }
                        if (letra[cont].equals(o)) {
                            resultadoMorse = resultadoMorse.concat("o");
                        }
                        if (letra[cont].equals(p)) {
                            resultadoMorse = resultadoMorse.concat("p");
                        }
                        if (letra[cont].equals(q)) {
                            resultadoMorse = resultadoMorse.concat("q");
                        }
                        if (letra[cont].equals(r)) {
                            resultadoMorse = resultadoMorse.concat("r");
                        }
                        if (letra[cont].equals(s)) {
                            resultadoMorse = resultadoMorse.concat("s");
                        }
                        if (letra[cont].equals(t)) {
                            resultadoMorse = resultadoMorse.concat("t");
                        }
                        if (letra[cont].equals(u)) {
                            resultadoMorse = resultadoMorse.concat("u");
                        }
                        if (letra[cont].equals(v)) {
                            resultadoMorse = resultadoMorse.concat("v");
                        }
                        if (letra[cont].equals(w)) {
                            resultadoMorse = resultadoMorse.concat("w");
                        }
                        if (letra[cont].equals(x)) {
                            resultadoMorse = resultadoMorse.concat("x");
                        }
                        if (letra[cont].equals(y)) {
                            resultadoMorse = resultadoMorse.concat("y");
                        }
                        if (letra[cont].equals(z)) {
                            resultadoMorse = resultadoMorse.concat("z");
                        }
                        //Comprueba si lo que introducimos es un número y lo concatena
                        if (letra[cont].equals(c1)) {
                            resultadoMorse = resultadoMorse.concat("1");
                        }
                        //Comprueba si lo que introducimos es una letra y lo concatena
                        if (letra[cont].equals(c2)) {
                            resultadoMorse = resultadoMorse.concat("2");
                        }
                        //Comprueba si lo que introducimos es una letra y lo concatena
                        if (letra[cont].equals(c3)) {
                            resultadoMorse = resultadoMorse.concat("3");
                        }
                        if (letra[cont].equals(c4)) {
                            resultadoMorse = resultadoMorse.concat("4");
                        }
                        if (letra[cont].equals(c5)) {
                            resultadoMorse = resultadoMorse.concat("5");
                        }
                        if (letra[cont].equals(c6)) {
                            resultadoMorse = resultadoMorse.concat("6");
                        }
                        if (letra[cont].equals(c7)) {
                            resultadoMorse = resultadoMorse.concat("7");
                        }
                        if (letra[cont].equals(c8)) {
                            resultadoMorse = resultadoMorse.concat("8");
                        }
                        if (letra[cont].equals(c9)) {
                            resultadoMorse = resultadoMorse.concat("9");
                        }
                        if (letra[cont].equals(c0)) {
                            resultadoMorse = resultadoMorse.concat("0");
                        }
                        //el contador aumenta en 1
                        cont++;
                        //al resultado le concatenamos un espacio para que las letras queden separadas
                        resultadoMorse = resultadoMorse.concat(" ");
                    }
                    
                    //Sacamos la longitud de resultadoMorse
                    longitudMorse = resultadoMorse.length();
                    //Creamos 2 variables
                    String cadena, cadena2 = "";
                        
                      //Creamos e inicializamos un contador
                    int co = 0;
                             
                     //Creamos un for que recorra la longitudMorse
                    for (int en = 0; en < longitudMorse; en++) {
                        
                        cadena = resultadoMorse.charAt(en) + "";
                        
                           //Si el caracter es distinto a un espacio  
                        if (resultadoMorse.charAt(en) != ' ') {
                            
                            //Se crea una cadena nueva
                            cadena2 = cadena2 + resultadoMorse.charAt(en);
                            
                            //El contador sigue en ceros
                            co = 0;
                            
                            //Si no 
                        } else {
                            //El contador aumenta 1
                            co = co + 1;
                            //Y si el contador es igual a tres 
                            if (co == 3)
                            {
                                //Se le quitan los espacios de más y se le agrega un espacio en blanco para separar las palabras 
                                cadena2 = cadena2 + " ";     
                            }
                        }
                    }
                    //Se manda a imprimir el resultado de la cadena 
                    System.out.print("De morse a texto es :" + cadena2 + "\n");
                    
                    //Le preguntamos al usuario si desea realizar otra traducción
                    System.out.println("¿Desea traducir otro texto? (S/N):");
                    otra = entrada.nextLine();
                     //Si desea otra lo manda al inicio del do-while
                } while ("S".equalsIgnoreCase(otra));

            }

        }

    }

}
