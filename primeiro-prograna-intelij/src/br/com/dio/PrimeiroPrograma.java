package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos",352);

        System.out.println(livro);

        int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a + b));
    }
}

class Livro {
    private String nome;
    private Integer numpags;

    public Livro(String nome, Integer numpags) {
        this.nome = nome;
        this.numpags = numpags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpags() {
        return numpags;
    }

    public void setNumpags(Integer numpags) {
        this.numpags = numpags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpags=" + numpags +
                '}';
    }
}
