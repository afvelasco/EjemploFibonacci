/*
 *  Programa que permite generar el termino n de la serie de fibonacci, y que 
 *  ilustrará problemas de eficiencia
*/
package fuentes;

import javax.swing.JOptionPane;

/**
 * @author AFV
 */
public class Principal {
    public Principal(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(
                "Cuál término Fibonacci desea (n)?"));
        int fn = fibonacci(n);
        JOptionPane.showMessageDialog(null, "El término Fibonacci(n): "+fn);
    }
    public static void main(String[] args) {
        new Principal();
    }

    private int fibonacci(int n) {
        if(n<=1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
