package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {
    private static Object livro;

    public static void main(String[] args) {

       gato gato = new gato();

        System.out.println(gato);

        livro = new livro("O guia do mochileiro das galaxias", 300);
        System.out.println(livro);
   /* int a = 7;
    int b = 3;

        System.out.println("OLÁ MUNDOOO" + " " + (a+b));*/
    }
}

class livro {
    private String nome;
    private Integer numPag;

    public livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}