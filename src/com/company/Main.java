package com.company;

public class Main {

    public static void main(String[] args) {
/*
        String nome1 = "Antonio";
        String idade1 = "54";
        String nome2 = "Nicholas";
        String idade2 = "18";
        System.out.println(nome1 + " tem " + idade1 + " anos");
        System.out.println(nome2 + " tem " + idade2 + " anos");
        System.out.println("");

        int baseMaior = 10;
        int baseMenor = 7;
        int altura = 5;
        int areaTrapezio = (baseMaior + baseMenor) / 2 * altura;
        System.out.println("A área do trapézio vale: " + areaTrapezio);
        System.out.println("");

        int idadeCandidato = 54;
        boolean nacionalidadeCandidato = true;
        boolean disponibilidadeCandidato = true;

        if (idadeCandidato >= 18) {
            if (idadeCandidato <= 60)
                System.out.println("O candidato têm idade compatível com o desejado");
        }

        if (idadeCandidato < 18) {
            System.out.println("O candidato é menor de idade");
        }

        if (idadeCandidato > 60) {
            System.out.println("O candidato tem mais que 60 anos");
        }

        if (nacionalidadeCandidato) {
            System.out.println("O candidato é Brasileiro");
        }

        if (!nacionalidadeCandidato) {
            System.out.println("O candidato é Estrangeiro");
        }

        if (disponibilidadeCandidato) {
            System.out.println("O candidato está disponível no período da tarde");
        }

        if (!disponibilidadeCandidato) {
            System.out.println("O candidato não está disponível no período da tarde");
        }

        System.out.println("");
        System.out.println("");
*/
        int idade = 17;
        boolean nacionalidade = true;
        boolean disponibilidade = true;

        cadastro(idade,nacionalidade,disponibilidade);

    }

    private static boolean cadastro(int idade, boolean nacionalidade, boolean disponibilidade) {
        if (verificarMaiorIdade(idade)) {
            if (verificaNacionalidadeCompativel(nacionalidade)) {
                if (verificaDisponibilidade(disponibilidade)) {
                    System.out.println("O candidato FOI cadastrado com sucesso");
                    return true;
                }
                else{
                    System.out.println("O candidato NÃO FOI cadastrado com sucesso");
                    return false;
                }
            }
            else{
                System.out.println("O candidato NÃO FOI cadastrado com sucesso");
                return false;
            }
        }
        else{
            System.out.println("O candidato NÃO FOI cadastrado com sucesso");
            return false;
        }
    }

    private static boolean verificarMaiorIdade(int idade) {

        if (idade >= 18) {
            System.out.println("O candidato é maior de idade");
            return true;
        }else {
            System.out.println("O candidato é menor de idade");
            return false;
        }
    }

    private static boolean verificaNacionalidadeCompativel(boolean nacionalidade) {

        if (nacionalidade) {
            System.out.println("O candidato é Brasileiro");
            return true;
        }else {
            System.out.println("O candidato é estrangeiro");
            return false;
        }

    }

    private static boolean verificaDisponibilidade(boolean disponibilidade) {

        if (disponibilidade) {
            System.out.println("O candidato é disponível para trabalhar a tarde");
            return true;
        }else {
            System.out.println("O candidato não é disponível para trabalhar a tarde");
            return false;
        }
    }
}
