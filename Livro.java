package projetolivro;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;    
    private Pessoa leitor;

        public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor +
               "\n totPaginas=" + totPaginas + ", pagAtual=" + pagAtual +
               ", aberto=" + aberto + "\n leitor=" + leitor.getNome() + 
               ", idade=" + leitor.getIdade() + 
               ", sexo=" + leitor.getSexo() + '}';
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
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;        
        } else {
            this.pagAtual = p;            
        }    
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
