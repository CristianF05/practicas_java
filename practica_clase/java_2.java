/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_con_netbeans;
//Importamos el Scanner para la entrada de datos
import java.util.Scanner;
public class java_2 {
    public static void main(String[] args){
        //creacion de pedidas de datos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int n2 = leer.nextInt();
        //hacemos la suma de los dos números
        int r = n1 + n2;
        //inprimimos los resultados
        System.out.println("El resultado es: "+r);
    }
    
}
