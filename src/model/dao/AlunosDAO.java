
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


public class AlunosDAO {
       
    public void create(Alunos alu) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        ResultSet rs = null;
        
        try { 
       
          /*  stmt = con.prepareStatement("SELECT * FROM alunos WHERE CPF = '?)");
          //  stmt.setString(1, alu.getCPF()+"'");
            
         //    rs = stmt.executeQuery();
             
          //  if(rs.next()){
                 JOptionPane.showMessageDialog(null, "CPF já existe"); 
             }
             else{
                 JOptionPane.showMessageDialog(null, "TESTE"); 
             }*/
             
                 
            if ( (alu.getIdade() < 10)  ){
            JOptionPane.showMessageDialog(null, "Idade deve ser maior que 10 anos");    
            }
            else if (alu.getMt_Atraso() < 0){
              JOptionPane.showMessageDialog(null, "Multa por atraso deve ter valores positivos");    
            } 
            else{
            stmt = con.prepareStatement("INSERT INTO alunos (Nome,CPF,endereco,Telefone,Idade,Multa_Atraso,idtp)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, alu.getNome());
            stmt.setString(2, alu.getCPF());
            stmt.setString(3, alu.getEndereco());
            stmt.setInt(4, alu.getTelefone());
            stmt.setInt(5, alu.getIdade());
            stmt.setFloat(6, alu.getMt_Atraso());
            stmt.setInt(7, alu.getMensalidade());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
            }   
            
   
        }
        catch (SQLException ex) {
            System.out.println(ex);
             JOptionPane.showMessageDialog(null, "ERRO");         
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
                
        }

    }

    
   /* public Alunos getConsulta(int id){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
      //  PreparedStatement stmt = this.conn.preparedStatement(sql);
        stmt = con.prepareStatement("SELECT * FROM alunos WHERE ID = ?");
        stmt.setInt(1,id);
        ResultSet rs = stmt.executeQuery();
        Alunos alunos = new Alunos();
        rs.first();
        
                alunos.setIdAlu(id);
                alunos.setNome(rs.getString("Nome"));
                alunos.setCPF(rs.getInt("CPF"));
                alunos.setEndereco(rs.getString("Endereco"));
                alunos.setTelefone(rs.getInt("Telefone"));
                alunos.setIdade(rs.getInt("Idade"));
                alunos.setMensalidade(rs.getFloat("Mensalidade"));
                alunos.setMt_Atraso(rs.getInt("Multa_Atraso"));
                return alunos;
                
        }
        catch(Exception e){
                return null;
                }
    }
    */
        public List<Alunos> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Alunos> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Alunos a = new Alunos();

                a.setIdAlu(rs.getInt("IdAlu"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setEndereco(rs.getString("Endereco"));
                a.setTelefone(rs.getInt("Telefone"));
                a.setIdade(rs.getInt("Idade"));
                a.setMt_Atraso(rs.getInt("Multa_Atraso"));
                a.setMensalidade(rs.getInt("idtp"));
                alunos.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }
        
         public List<Alunos> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Alunos> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM alunos WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Alunos a = new Alunos();

                a.setIdAlu(rs.getInt("IdAlu"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setEndereco(rs.getString("Endereco"));
                a.setTelefone(rs.getInt("Telefone"));
                a.setIdade(rs.getInt("Idade"));              
                a.setMt_Atraso(rs.getInt("Multa_Atraso"));
                a.setMensalidade(rs.getInt("idtp"));
                alunos.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }
          
        /* 
         public void update(Alunos p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE alunos SET Nome = ? , CPF = ?, Endereco = ?, Telefone = ?, Idade = ?, Mensalidade = ?, Multa_Atraso = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getCPF());
            stmt.setString(3, p.getEndereco());
            stmt.setInt(4, p.getTelefone());
            stmt.setInt(1, p.getIdade());
            stmt.setFloat(1, p.getMensalidade());
            stmt.setFloat(1, p.getMt_Atraso());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
*/
    
}
