package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.aplicacao.indicacao.IEnviarEmailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacao implements IEnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        System.out.println("Enviando email para " + indicado.getNome());
    }
}
