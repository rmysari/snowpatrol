/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Rohit Kumar
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t= new Triangle();
        t.triangle();
    }
    public void triangle()
    {
        System.out.println("hello triangle");
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
