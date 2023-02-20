package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoBuilder {

    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private List<Telefone> telefones = new ArrayList<>();

    public AlunoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder comCPF(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public AlunoBuilder comEmail(String email) {
        this.email = email;
        return this;
    }

    public AlunoBuilder comTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
        return this;
    }

    public Aluno build() {
        return new Aluno(new CPF(this.cpf), this.nome, new Email(this.email), telefones);
    }
}
