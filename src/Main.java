import br.com.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Java POO");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devIgor.getNome() + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devIgor.getNome() + devIgor.getConteudosConcluidos());


        System.out.println("---");

        Dev devJordana = new Dev();
        devJordana.setNome("Jordana");
        devJordana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJordana.getNome() + devJordana.getConteudosInscritos());
        devJordana.progredir();
        System.out.println("Conteúdos Concluídos " + devJordana.getNome() + devJordana.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos " + devJordana.getNome() + devJordana.getConteudosInscritos());

        System.out.println("XP: " + devJordana.calcularXp());
    }
}