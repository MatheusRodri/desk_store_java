/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import entidade.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class RelatorioDAO {

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

    public List<Relatorio> listaRelatorio(String dataInicial, String dataFinal) {
        
        List<Relatorio> relatorios = new ArrayList<>();
        String sql = "SELECT nome_produto,valor,data_pagamento FROM vendas WHERE"
                + " STR_TO_DATE(vendas.data_pagamento, '%d/%m/%Y') BETWEEN  ? and"
                + " ? order by STR_TO_DATE(vendas.data_pagamento, '%d/%m/%Y') ASC";

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, dataInicial);
            st.setString(2, dataFinal);
            rs = st.executeQuery();

            while (rs.next()) {
                Relatorio relatorio = new Relatorio();
                relatorio.setNome(rs.getString(1));
                relatorio.setValor(rs.getDouble(2));
                relatorio.setData(rs.getString(3));

                relatorios.add(relatorio);
            }

            return relatorios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar relatorios");
            e.printStackTrace();
        }
        return null;
    }

}
