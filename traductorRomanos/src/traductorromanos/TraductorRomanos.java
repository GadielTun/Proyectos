/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorromanos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gadiel
 */
public class TraductorRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Este programa convierte los números arábigos a números romanos
        //Se crea un escaner para poder capturar los datos introducidos
        Scanner entrada = new Scanner(System.in);

        //Se crean las variables que se utilizaran
        int valor = 0;
        String otra;
        String unidades, decenas, centenas, millar;
        //se crea un do-while para que regrese a la peticion de el números si no es un número entre 1 y 1000
        do {
            //Se imprime la petición
            System.out.print("Ingrese un número Arábigo del 1 al 1000: ");
            //Se crea un try-catch para la validación del valor
            try {
                valor = entrada.nextInt();

            } catch (InputMismatchException ime) {
                //Si lo que introdujo no es un entero se imprime lo siguente 
                System.out.println("Solo se puede introducir números entreros en el rango 1-1000.");
                //Se continua las entradas
                entrada.next();
            }
            //comprobamos el valor introducido
        } while (valor < 1 || valor > 1000);

//unidades
        int residuo = valor % 10;

//decenas
        int numerodecena = valor / 10;
        int residuo2 = numerodecena % 10;

//centenas
        int numerocentena = valor / 100;
        int residuo3 = numerocentena % 10;

//millar
        int residuo4 = valor / 1000;

        switch (residuo) //unidades
        {
            case 1:
                unidades = "I";
                break;
            case 2:
                unidades = "II";
                break;
            case 3:
                unidades = "III";
                break;
            case 4:
                unidades = "IV";
                break;
            case 5:
                unidades = "V";
                break;
            case 6:
                unidades = "VI";
                break;
            case 7:
                unidades = "VII";
                break;
            case 8:
                unidades = "VIII";
                break;
            case 9:
                unidades = "IX";
                break;
            default:
                unidades = "";
                break;
        }

        switch (residuo2) //decenas
        {
            case 1:
                decenas = "X";
                break;
            case 2:
                decenas = "XX";
                break;
            case 3:
                decenas = "XXX";
                break;
            case 4:
                decenas = "XL";
                break;
            case 5:
                decenas = "L";
                break;
            case 6:
                decenas = "LX";
                break;
            case 7:
                decenas = "LXX";
                break;
            case 8:
                decenas = "LXXX";
                break;
            case 9:
                decenas = "XC";
                break;
            default:
                decenas = "";
                break;
        }

        switch (residuo3) //centenas
        {
            case 1:
                centenas = "C";
                break;
            case 2:
                centenas = "CC";
                break;
            case 3:
                centenas = "CCC";
                break;
            case 4:
                centenas = "CD";
                break;
            case 5:
                centenas = "D";
                break;
            case 6:
                centenas = "DC";
                break;
            case 7:
                centenas = "DCC";
                break;
            case 8:
                centenas = "DCCC";
                break;
            case 9:
                centenas = "CM";
                break;
            default:
                centenas = "";
                break;
        }

        switch (residuo4) //millar
        {
            case 1:
                millar = "M";
                break;
            default:
                millar = "";
                break;
        }

        System.out.println("El equivalente en numero romano es: " + millar + centenas + decenas + unidades);

    }

}
