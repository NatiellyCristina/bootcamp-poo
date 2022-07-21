package br.com.dominio;

public class Curso extends Conteudo {
    //Atributos

    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHoraria = cargaHorario;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHoraria +
                '}';
    }


}
