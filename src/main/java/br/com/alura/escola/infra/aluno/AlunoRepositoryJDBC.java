package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.IAlunoRepository;
import br.com.alura.escola.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AlunoRepositoryJDBC implements IAlunoRepository {

    private final Connection connection;

    public AlunoRepositoryJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, aluno.getCpf().getNumero());
            statement.setString(2, aluno.getNome());
            statement.setString(3, aluno.getEmail().getEndereco());
            statement.execute();

            sql = "INSERT INTO TELEFONE VALUES(?, ?)";
            statement = connection.prepareStatement(sql);
            for (Telefone telefone : aluno.getTelefones()) {
                statement.setString(1, telefone.getDdd());
                statement.setString(2, telefone.getNumero());
                statement.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
