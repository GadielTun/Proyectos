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
//La clase se extiende de la clase principal
class Cubo  extends Cuadrado{

    //Se declaran variables
    
    public static void CalcularVolumen(){
        //Se calcula el volumen
        volumen= (Double) Math.pow(Cuadrado.lado, 3);
        //Se manda a imprimir el volumen
        System.out.println("El volumen del cubo es: "+volumen);
    }
    //Se crea un método para calcular el perímetro del cubo
    public static void CalcularPerimetro1(){
        //Se calcula los datos principales ancho, largo y la altura
        perimetro= lado * 12;
        //Se manda a imprimir el perímetro
        System.out.println("El perímetro del cubo es: "+perimetro);
    }
    
}
