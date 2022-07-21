import br.com.dominio.Bootcamp;
import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso(); //Instancia o objeto

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso(); //Instancia o objeto
        curso2.setTitulo("curso java scrit");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHorario(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição  mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" +  dev1.getConteudosInscritos());
        System.out.println("Incritos e Conclúidos após progressão - Dev " + dev1.getNome());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos:" +  dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" +  dev1.getConteudosConcluidos());
        System.out.println("XP:" +  dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos:" +  dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Incritos e Conclúidos após progressão - Dev" + dev2.getNome());
        System.out.println("Conteúdos Inscritos:" +  dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" +  dev2.getConteudosConcluidos());
        System.out.println("XP:" +  dev2.calcularTotalXp());


    }
}


