/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaobjetos;

/**
 *
 * @author gadie
 */
class Cuadrado {

    //Se declaran las varibles de objeto
    public static double lado, area, perimetro, volumen;

    //Se crea un método que calcula el área del cuadrado
    public static void CalcularArea() {
        //Se calcula el area 
        area = lado * lado;
        //Se manda a imprimir
        System.out.println("El área del cuadrado es: " + area);
    }

    //Se crea un método para calcular el perimetro del cuadrado
    public static void CalcularPerimetro() {
        //Se calcula el perimetro multiplicando los lados
        perimetro = lado * 4;
        //Se mada a imprimir el perimetro
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

}
