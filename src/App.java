import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       
Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

Mentoria mentoria1 = new Mentoria("Mentoria JS", "Descrição Mentoria1", LocalDate.now());
  
System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria1);
}
}
