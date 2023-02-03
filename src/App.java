import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       
Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

Mentoria mentoria1 = new Mentoria("Mentoria JS", "Descrição Mentoria1", LocalDate.now());
  
// System.out.println(curso1);
// System.out.println(curso2);
// System.out.println(mentoria1);

Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descricao curso Java ");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria1);

Dev devGabriela = new Dev();
devGabriela.setNome("Gabriela");
devGabriela.inscreverBootcamp(bootcamp);
devGabriela.progredir();
devGabriela.progredir();
devGabriela.calcularTotalXp();
System.out.println("------");
System.out.println(devGabriela.calcularTotalXp());


Dev devJoao = new Dev();
devJoao.setNome("Joao");
devJoao.inscreverBootcamp(bootcamp);
System.out.println("------");
System.out.println(devJoao.getConteudosInscritos());
devJoao.progredir();
System.out.println("------");
System.out.println(devJoao.getConteudosConcluidos());


}
}
