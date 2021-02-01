package aulapoo9;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPags, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totalPags = totalPags;
        this.leitor = leitor;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public int getTotalPags() {return totalPags;}
    public void setTotalPags(int totalPags) {this.totalPags = totalPags;}
    public int getPagAtual() {return pagAtual;}
    public void setPagAtual(int pagAtual) {this.pagAtual = pagAtual;}
    public boolean getAberto() {return aberto;}
    public void setAberto(boolean aberto) {this.aberto = aberto;}
    public Pessoa getLeitor() {return leitor;}
    public void setLeitor(Pessoa leitor) {this.leitor = leitor;}

    public String detalhes() {
        return "Livro{" + "\ntitulo=" + titulo + "\nautor=" + autor + "\ntotalPags=" + 
                totalPags + "\npagAtual=" + pagAtual + "\naberto=" + 
                aberto + "\nleitor=" + leitor.getNome() +
                "\nidade=" + leitor.getIdade() +
                "\nsexo=" + leitor.getSexo() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if(pag>this.totalPags)
            this.pagAtual = 0;
        else   
            this.pagAtual = pag;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
}
