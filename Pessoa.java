package projetolivro;
public class Pessoa {
    private String nome, sexo;
    private int idade;
    
    public void fazerAniver() {
        this.idade++;
    }           

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
        
    public String getNome() {
        return nome;        
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    private void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }   
}