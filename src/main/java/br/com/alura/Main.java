package br.com.alura;

import br.com.alura.escola.aplicacao.aluno.matricula.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricula.MatricularAlunoDTO;
import br.com.alura.escola.infra.aluno.AlunoRepositoryEmMemoria;

public class Main {
    public static void main(String[] args) {
        String nome = "Fulano";
        String cpf = "000.000.000-00";
        String email = "email@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new AlunoRepositoryEmMemoria());
        matricularAluno.executa(new MatricularAlunoDTO(cpf, nome, email));

    }
}