/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Alunos;
import model.bean.Convidados;

/**
 *
 * @author mvasc
 */
public class ConvidadosDAO {
      public void create(Convidados conv) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            if (conv.getVl_Pago() < 0){
              JOptionPane.showMessageDialog(null, "VALOR PAGO DEVE SER POSITIVO");    
            } 
            else{
            stmt = con.prepareStatement("INSERT INTO convidado (Nome,CPF,Vl_Pago)VALUES(?,?,?)");
            stmt.setString(1, conv.getNome());
            stmt.setString(2, conv.getCpf());
            stmt.setFloat(3, conv.getVl_Pago());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
      
     public List<Convidados> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Convidados> convidados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM convidado WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Convidados c = new Convidados();

                c.setIdConv(rs.getInt("IdConv"));
                c.setNome(rs.getString("Nome"));
                c.setCpf(rs.getString("CPF"));
                c.setVl_Pago(rs.getFloat("Vl_Pago"));
                convidados.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return convidados;

    }
}
