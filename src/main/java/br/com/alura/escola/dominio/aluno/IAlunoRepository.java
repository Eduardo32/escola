package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface IAlunoRepository {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
