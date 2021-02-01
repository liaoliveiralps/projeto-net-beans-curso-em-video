/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author liandralopes
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Liandra";
        String nome2 = "Liandra";
        String nome3 = new String("Liandra");
        String res;
        res = (nome1.equals(nome3)) ? "igual" : "diferente"; //verifica se o conteúdo de uma variável é igual a outra
        System.out.println(res);
    }
    
}
