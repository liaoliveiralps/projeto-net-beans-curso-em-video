package aulapoo4;

public class Caneta {
    
    public Caneta(String m, String c, float p){ //CONSTRUTOR
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta() {return this.ponta;}
    public void setPonta(float p) {this.ponta = p;}
    
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    public void tampar() {this.tampada = true;}
    
    public void destampar() {this.tampada = false;}

    //ALT + INSERT gera os get e set
    
}
