import javax.swing.*;

public class Bucle_for_factorial {
    
    public static void main(String[] args){
        
        // Número para calcular su factorail
        int num_calcular = Integer.parseInt(JOptionPane.showInputDialog("faltorial de ? "));

        long factorial = 1L; 
        for (int i = num_calcular; i > 0; i--){
            factorial *= i;
        }
        System.out.println("El factorial de " + num_calcular + " es " + factorial + ".");
    }  
}
