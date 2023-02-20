package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.ISenhaEncoder;

public class SenhaEncoder implements ISenhaEncoder {

    @Override
    public String encode(String senha) {

        return senha;
    }

    @Override
    public boolean validarSenha(String senhaCifrada, String senha) {
        return senhaCifrada.equals(senha);
    }
}
