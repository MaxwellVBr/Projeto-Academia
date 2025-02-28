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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CpfDAO {
    
    public boolean checkCPF(String CPF) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM alunos WHERE CPF = ?");
            stmt.setString(1, CPF);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true; 
            }   

        } catch (SQLException ex) {
            Logger.getLogger(CpfDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
    public boolean checkCPFConv(String CPF) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM convidado WHERE CPF = ?");
            stmt.setString(1, CPF);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true; 
            }   

        } catch (SQLException ex) {
            Logger.getLogger(CpfDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
     public boolean checkCPFCProf(String CPF) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM professor WHERE CPF = ?");
            stmt.setString(1, CPF);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true; 
            }   

        } catch (SQLException ex) {
            Logger.getLogger(CpfDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
}
