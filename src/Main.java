import br.com.dominio.Curso;
import br.com.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso(); //Instancia o objeto

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorario(8);
        System.out.println(curso1);

        Curso curso2 = new Curso(); //Instancia o objeto
        curso2.setTitulo("curso java scrit");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHorario(8);
        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDecricao("descrição  mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);



    }
}


