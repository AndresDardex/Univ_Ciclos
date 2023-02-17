package tarea;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tarea {
    public static void main(String[] args) {
        int resultado = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido", "Mi calculadora", JOptionPane.INFORMATION_MESSAGE);
//        System.out.println("Calculadora");
//        Scanner in = new Scanner(System.in);
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el Segundo numero"));
            String operador = new String();
            operador = JOptionPane.showInputDialog(null, "Inserte operador");
            System.out.println("OPERADOR: " + operador);

            if(operador.equals("+")){
                resultado = numero + numero2;
                System.out.println("estoy en la suma");
            } else if (operador.equals("-")) {
                resultado = numero - numero2;
                System.out.println("estoy en la resta");
            }else if (operador.equals("*")){
                resultado = numero * numero2;
            }else if(operador.equals("%")){
                resultado = numero % numero2;
            }
            else {
                JOptionPane.showMessageDialog(null, "Solo sumo o/y resto: ", "Resultado", JOptionPane.ERROR_MESSAGE);
            }


            JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            System.out.println("ERROR: " + e);
        }
        finally {
            System.out.println("Guardando error en la base de datos...");
        }
    }
}