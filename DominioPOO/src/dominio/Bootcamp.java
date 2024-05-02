package dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Desenvolvedor> inscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Desenvolvedor> getInscritos() {
        return inscritos;
    }

    public void setDevsInscritos(Set<Desenvolvedor> inscritos) {
        this.inscritos = inscritos;
    }
}