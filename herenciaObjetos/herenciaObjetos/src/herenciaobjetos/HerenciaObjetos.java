/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaobjetos;

import static herenciaobjetos.Cuadrado.CalcularArea;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gadiel
 */
public class HerenciaObjetos extends Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este programa utiliza POO para saber el perimetro y area de un cuadrado o volumen y perimetro de un cubo.

        //Se crea un Scanner para poder capturar los datos introducidos
        Scanner entrada = new Scanner(System.in);
        //Se declaran las variables
        String op = " ", op1 = " ";
        int opcion = 0;

        double lado = 0, ladoCop = 0;
        int a = 0;

        do {

            try {
                a = -1;
                imprimirMenu1();
                opcion = entrada.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("¡El dato de entrada no fue la correcta!.");
                a = +1;
                entrada.next();
            }
        } while (a == 1);

        if (opcion == 1) {

            do {

                do {
                    try {

                        a = -1;
                        System.out.print("Introduzca el lado: ");

                        Cuadrado.lado = entrada.nextDouble();

                    } catch (InputMismatchException ime) {
                        System.out.println("¡Lo que se introdujo no es un número!.");
                        a = +1;
                        entrada.next();
                    }

                } while (a == 1);

                imprimirMenu2();
                op = entrada.next();

            } while ("c".equalsIgnoreCase(op));

            if ("a".equalsIgnoreCase(op)) {
                CalcularArea();
                CalcularPerimetro();
               // imprimirMenu3();
                //op1 = entrada.next();
                

            }
            
            if ("b".equalsIgnoreCase(op)) {
                Cubo.CalcularVolumen();
                Cubo.CalcularPerimetro1();
                //imprimirMenu3();
                //op1 = entrada.next();
                
            }
            
            if ("d".equalsIgnoreCase(op)) {
                System.exit(0);
            }

        }
        if (opcion == 2) {
            System.exit(0);
        }

    }
    
    //Se crean métodos para los menús
    public static void imprimirMenu1() {
        System.out.print("MENÚ DE INICIO:\n"
                        + "1) Ingresar lado\n"
                        + "2) Salir\n");
                System.out.print("Elija una opción: ");
    }
    
    public static void imprimirMenu2() {
        System.out.print("MENÚ DE CÁLCULOS:\n"
                + "a) Cuadrado\n"
                + "b) Cubo\n"
                + "c) Cancelar\n"
                + "d) Salir\n");
        System.out.print("Elija una opción: ");
    }

    public static void imprimirMenu3() {
        System.out.print("MENÚ DE OPCIONES:\n"
                + "I)  MENÚ DE CALCULOS\n"
                + "II) MENÚ DE INICIO\n");
        System.out.print("Elija una opción: ");
    }

    

}
