/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import entidade.Funcionario;

/**
 *
 * @author mathe
 */
public class FuncionarioDAO {

    private final String URL = "jdbc:mysql://localhost:3306/loja";
    private final String SENHA = "";
    private final String USUARIO = "root";
    Connection conn;
    PreparedStatement st;
    private ResultSet rs;

    public void conectar() {
        try {
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

    public boolean consultarLogin(String login, String senha) {
        try {
            String sql = "SELECT * FROM funcionarios WHERE email=? AND senha=?";
            st = conn.prepareStatement(sql);
            st.setString(1, login);
            st.setString(2, senha);
            rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar login");
            System.out.println(e);
        }
        return false;
    }

    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios(nome,email,senha,endereco,numero,salario,isGerente,isAtendente)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, funcionario.getNome());
            st.setString(2, funcionario.getEmail());
            st.setString(3, funcionario.getSenha());
            st.setString(4, funcionario.getEndereco());
            st.setInt(5, funcionario.getNumero());
            st.setDouble(6, funcionario.getSalario());
            st.setBoolean(7, funcionario.isGerente());
            st.setBoolean(8, funcionario.isFunc());
            st.execute();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

    }
}
