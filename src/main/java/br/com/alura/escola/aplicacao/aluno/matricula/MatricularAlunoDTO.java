package br.com.alura.escola.aplicacao.aluno.matricula;

public class MatricularAlunoDTO {

    private String cpf;
    private String nome;
    private String email;

    public MatricularAlunoDTO(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
