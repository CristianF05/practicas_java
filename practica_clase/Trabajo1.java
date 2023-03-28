/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.pkg1;
//inportamos Scanner para ingresar datos
import java.util.Scanner;
public class Trabajo1 {
    public static void main(String[] args) {
        //creamos datos para el ingreso y asicnamos numeros enteros
        int c = 0 ;
        int n2;
        int m  = 0;
        //creamos un objeto
        Scanner valor = new Scanner(System.in);
        //imprimos lo que deben ingresar
        System.out.println("numero par: ");
        //donde se guarda el dato ingresado
        n2 = valor.nextInt();
        //la oercionse hace con do
        do
        {
            c+=2;
            m = m +c;
            System.out.println("numero par: "+c);
        //elbucle while
        }while(c < n2);
        System.out.println("numero sumado: "+m);
    }
}
