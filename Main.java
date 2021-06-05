package projetolivro;
public class Main {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Daniel", 30, "M");
        p[1] = new Pessoa("Mauren", 27, "F");
        
        l[0] = new Livro("Essencialismo", "Greg Mckeown", 272, p[1]); 
        l[1] = new Livro("Mulheres que correm com os lobos", "Clarissa Pinkola Estés", 576, p[1]);
        l[2] = new Livro("Teoria da relatividade", "Albert Einstein", 192, p[0]);

        l[0].abrir();
        l[0].folhear(150);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
        l[0].avancarPag();
        l[1].avancarPag();
        p[1].fazerAniver();

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());        
    }
}