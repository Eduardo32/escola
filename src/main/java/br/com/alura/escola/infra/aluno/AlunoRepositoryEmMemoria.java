package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontradoException;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.IAlunoRepository;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryEmMemoria implements IAlunoRepository {

    private static final List<Aluno> db = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.db.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.db.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.db;
    }
}
