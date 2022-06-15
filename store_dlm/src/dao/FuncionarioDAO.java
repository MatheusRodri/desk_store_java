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
import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

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
    

    public boolean conectar() {
        try {
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
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
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean verificaLogin(String login, String senha) {
        try {
            String sql = "SELECT * FROM funcionarios WHERE email=? AND senha=?";
            st = conn.prepareStatement(sql);
            st.setString(1, login);
            st.setString(2, senha);
            rs = st.executeQuery();
            if (rs.next()) {
                Funcionario objfuncionario = new Funcionario();
                return rs.getBoolean("isGerente");
          
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar login");
            e.printStackTrace();
        }
        return false;
    }

    public boolean existeFuncionario(int id) {
        try {
            String sql = "SELECT * FROM funcionarios WHERE id = ?";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao verificar se usuário existe");
            e.printStackTrace();
        }
        return false;
    }

    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios(nome,email,senha,endereco,numero,salario,isGerente,isAtendente,data_de_cadastrado)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
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
            st.setString(9, funcionario.getDataDecadastrado());
            st.execute();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir funcionário",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void atualizar(Funcionario funcionario) {
        String sql = "UPDATE funcionarios SET nome = ?, email = ?, senha = ?, endereco = ?, salario = ?, isGerente = ?, isAtendente = ?, numero = ? WHERE id = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, funcionario.getNome());
            st.setString(2, funcionario.getEmail());
            st.setString(3, funcionario.getSenha());
            st.setString(4, funcionario.getEndereco());
            st.setDouble(5, funcionario.getSalario());
            st.setBoolean(6, funcionario.isGerente());
            st.setBoolean(7, funcionario.isFunc());
            st.setInt(8, funcionario.getNumero());
            st.setInt(9, funcionario.getId());
            st.execute();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM funcionarios WHERE id = ?";
        System.out.println(sql + " ID: " + id);
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao remover",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public Funcionario consultar(String email, String senha) {
        try {
            String sql = "SELECT nome, endereco, salario, isGerente, isAtendente, numero, data_de_cadastrado FROM funcionarios WHERE email = ? AND senha = ?";
            st = conn.prepareStatement(sql);
            st.setString(1, email);
            st.setString(2, senha);
            rs = st.executeQuery();
            if (rs.next()) {
                String nome = rs.getString(1);
                String endereco = rs.getString(2);
                double salario = rs.getDouble(3);
                boolean isGerente = rs.getBoolean(4);
                boolean isAtendente = rs.getBoolean(5);
                int numero = rs.getInt(6);
                String dataCadastro = rs.getString(7);

                return new Funcionario(nome, email, senha, endereco, numero, salario, isGerente, isAtendente, dataCadastro);
            } else {
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar funcionário");
            e.printStackTrace();
            return null;
        }
    }

    public List<Funcionario> listarFuncionarios(String ordem, boolean crescente) {
        try {
            List<Funcionario> funcionarios = new ArrayList<>();

            String sql = "SELECT nome, email, endereco, salario, isGerente, isAtendente, numero, data_de_cadastrado, id, senha FROM funcionarios ORDER BY " + ordem + " " + (crescente ? "ASC" : "DESC");
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString(1));
                funcionario.setEmail(rs.getString(2));
                funcionario.setEndereco(rs.getString(3));
                funcionario.setSalario(rs.getDouble(4));
                funcionario.setGerente(rs.getBoolean(5));
                funcionario.setFunc(rs.getBoolean(6));
                funcionario.setNumero(rs.getInt(7));
                funcionario.setDataDecadastrado(rs.getString(8));
                funcionario.setId(rs.getInt(9));
                funcionario.setSenha(rs.getString(10));

                funcionarios.add(funcionario);
            }

            return funcionarios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao listar funcionário");
            e.printStackTrace();
            return null;
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
