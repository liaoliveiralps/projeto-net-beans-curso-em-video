package aulapoo9;

public class AulaPOO9 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Liandra", 20, "F");
        p[1] = new Pessoa("Pedro", 22, "M");
        
        l[0] = new Livro("Apredendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[1]);
        
        l[0].abrir();
        l[0].folhear(50);
        System.out.println(l[0].detalhes());
    }
    
}
