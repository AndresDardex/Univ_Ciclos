
package tarea2;


public class Tarea2 {


    public static void main(String[] args) {
    for (int numeros = 5; numeros < 21; numeros++){
        if (numeros == 2){
        System.out.println("el numero " + numeros +  " es primo");
        }
        if (numeros %2 == 0){
            System.out.println("el numero " + numeros +  " no es primo");
        }
        else{
        for(int divisor = numeros/2;divisor>=1;divisor-- ){
            if (numeros % divisor == 0 && divisor !=1){
                System.out.println("el numero " + numeros +  " no es primo");
                break;
            }
            if (divisor == 1){
            System.out.println("el numero " + numeros +  " es primo");
            }
            else{
                continue;
            }
            
            }
            }
        }
    }
    
}
