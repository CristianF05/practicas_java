/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_imprimir;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class suma_de_numeros_naturale {
     public static void main(String[] args){
        //creamos para edir nombre
        Scanner dato = new Scanner(System.in);
        //creamos el pedido del numero
        System.out.println("Ingresa el numero par para la suma: ");
        int n1 = dato.nextInt();
        //creamos una variable para el bucle for
        int n = 0;
        for (int i = 0;i<=n1;i+=2){//ponemos los parametros
            n = n + i;}//hacemos las sumas para que el bucle termine
            System.out.println("el resultado es: "+n); //inprimimos la respuesta     
     }
}
