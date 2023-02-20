package br.com.alura.escola.aplicacao.aluno.matricula;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoBuilder;
import br.com.alura.escola.dominio.aluno.IAlunoRepository;

public class MatricularAluno {

    private final IAlunoRepository alunoRepository;

    public MatricularAluno(IAlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void executa(MatricularAlunoDTO matricularAlunoDTO) {
        Aluno aluno = new AlunoBuilder()
                .comCPF(matricularAlunoDTO.getCpf())
                .comEmail(matricularAlunoDTO.getEmail())
                .comNome(matricularAlunoDTO.getNome())
                .build();

        alunoRepository.matricular(aluno);
    }
}
