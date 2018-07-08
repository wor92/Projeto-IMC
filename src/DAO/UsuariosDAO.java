/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Javabeans.Tbimc;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wellt
 */
public class UsuariosDAO {

    private Connection conecta;

    public UsuariosDAO() {
        this.conecta = new ConnectionFactory().conecta();
    }

    public void cadastrarUsuario(Tbimc obj) throws SQLException {
        try {

            String cmdsql = "insert into tbimc(nome, idade, peso, altura, resultado)values(?,?,?,?,?)";
                    

            PreparedStatement stmt = (PreparedStatement) conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setFloat(3, obj.getPeso());
            stmt.setFloat(4, obj.getAltura());
            stmt.setFloat(5, obj.getResultado());

            stmt.execute();

            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
}
