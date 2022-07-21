package br.com.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    //Atributos
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20 ;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", decricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
