package aulapoo5;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {return this.numConta;}
    public String getTipo() {return this.tipo;}
    public String getDono() {return this.dono;}
    public float getSaldo() {return this.saldo;}
    public boolean getStatus() {return this.status;}

    public void setNumConta(int numConta) {this.numConta = numConta;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setDono(String dono) {this.dono = dono;}
    public void setSaldo(float saldo) {this.saldo = saldo;}
    public void setStatus(boolean status) {this.status = status;}
    
    public void statusAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC")
            this.setSaldo(50);
        else if (t == "CP")
            this.setSaldo(150);
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo()>0)
            System.out.println("Conta com dinheiro!");
        else if (this.getSaldo()<0)
            System.out.println("Conta em débito!");
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!");
        }
        else
            System.out.println("Impossível depositar!");
    }
    
    public void sacar(float v){
        if(this.getStatus()==true){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso!");
            }
            else
                System.out.println("Saldo indisponível para saque!");
        }
        else
            System.out.println("Impossível sacar!");
    }
    
    public void pagarMens(){
        int v=0;
        if(this.getTipo() == "CC")
            v = 12;
        else if(this.getTipo() == "CP")
            v = 20;
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }
        else
            System.out.println("Impossível pagar");
    }
}
