import java.time.LocalDate;

import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp boot = new Bootcamp();
        Desenvolvedor dev = new Desenvolvedor();

        curso.setNome("Java");
        curso.setHora(100);
        mentoria.setNome("Java");
        mentoria.setData(LocalDate.now());
        boot.setNome("Java Santander");
        dev.setNome("Aldo");

        System.out.println("Desenvolvedor: " + dev.getNome());
        System.out.println("Inscrito no curso: " + curso.getNome() + " - " + curso.getHora() + "hs");
        System.out.println("Inscrito na mentoria: " + mentoria.getNome() + " - " + mentoria.getData());
        System.out.println("Inscrito no Bootcamp: " + boot.getNome() + " - " + boot.getConteudos().add(curso));
    }
}
