
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        float nota = entrada.nextFloat();
        System.out.printf("A nota de %s é: %.1f \n", nome, nota);
        //System.out.format("Sua nota é %.2f", nota);
    }
    
}
