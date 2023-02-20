package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEncontradoException extends  RuntimeException{

    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno não encontrado CPF: " + cpf.getNumero());
    }
}
