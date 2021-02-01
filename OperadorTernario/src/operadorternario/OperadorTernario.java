/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author liandralopes
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 4, n2 = 8, r;
        r = (n1>n2) ? n1 : n2; //se n1>n2 então r recebe 0, senão recebe 1
        System.out.println(r);
    }
    
}
