package ec.edu.espoch.practicados;

import java.util.Scanner;

public class PracticaDos {

    public static void main(String[] args) {
        // hola mundo
     
        Scanner entrada= new Scanner(System.in);
        int[]ventas=new int[7];
        int valorTotal=0;
        int valorMaximo=0;
        int ventasSuperiorPromedio=0;
        double promedio=0.0;

        //solicitar al usuario las ventas
        System.out.println("Ingrese los valores de ventas");
        for(int i=0; i< ventas.length; i++){
            ventas[i]=entrada.nextInt();
            valorTotal=valorTotal+ventas[i];
        }
      //muestre todas las ventas ingresadas
        for(int i=0; i< ventas.length; i++){
            System.out.println("Venta"+i+":"+ventas[i]);
        }
      
        promedio=(valorTotal/ventas.length);  
        for(int i=0; i< ventas.length; i++){
            if(ventas[i]>valorMaximo){
                valorMaximo=ventas[i];
            }
            
            if(ventas[i]>promedio){
                ventasSuperiorPromedio++;
            }
        }
        
        System.out.println("valor total:"+valorTotal);
        System.out.println("Promedio ventas:"+(valorTotal/ventas.length));
        System.out.println("Valor maximo:"+valorMaximo);
        System.out.println("N.dias superior Promedio:"+ventasSuperiorPromedio);
    }
}
