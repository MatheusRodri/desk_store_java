/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entidade.Venda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class VendaDAO {
    Connection conn;
    PreparedStatement stmt;
    
    public void inserir(Venda v){
        String sql = "INSERT INTO vendas (nome_produto, valor, data_pagamento)" + "VALUES(?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, v.getNome_produto());
            stmt.setDouble(2, v.getValor());
            stmt.setString(3, v.getData_pagamento());
            stmt.execute();
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro na venda!","",JOptionPane.ERROR_MESSAGE);
        }
    }
}
