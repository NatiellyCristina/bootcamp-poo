package br.com.dominio;

public abstract class Conteudo {

    //STATIC -> Static é “de classe”, ou seja, uma variável static da classe POSSUI o mesmo valor para qualquer objeto
    protected static final double XP_PADRAO = 10d; //Constante
    private   String titulo;
    private  String descricao;

    //ABSTRACT -> Não consigo instanciar a classe sem o método definido como abstract
    public abstract  double calcularXp();

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
