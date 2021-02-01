package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucao.getScreenSize();
        System.out.println("Screen width = " + dimensao.width);
        System.out.println("Screen height = " + dimensao.height);
    }
    
}
