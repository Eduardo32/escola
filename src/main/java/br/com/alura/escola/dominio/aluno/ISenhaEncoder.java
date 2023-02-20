package br.com.alura.escola.dominio.aluno;

public interface ISenhaEncoder {

    String encode(String senha);

    boolean validarSenha(String senhaCifrada, String senha);
}
