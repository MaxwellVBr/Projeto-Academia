
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
import model.bean.professores;


public class ProfessoresDAO {
    public void create(professores prof) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            if ( (prof.getIdade() < 10)  ){
            JOptionPane.showMessageDialog(null, "IDADE DEVE SER MAIOR QUE 10 ANOS");    
            }
            else if (prof.getSalario() < 0){
              JOptionPane.showMessageDialog(null, "SALÁRIO DEVE SER POSITIVO");    
            } 
            else if (prof.getHr_Trabalhadas() < 0){
              JOptionPane.showMessageDialog(null, "HORAS TRABALHADAS DEVE SER POSITIVO");    
            }
            else{
            stmt = con.prepareStatement("INSERT INTO professor (Nome,CPF,endereco,Telefone,Idade,Salario,Hr_Trabalhadas)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, prof.getNome());
            stmt.setString(2, prof.getCPF());
            stmt.setString(3, prof.getEndereco());
            stmt.setInt(4, prof.getTelefone());
            stmt.setInt(5, prof.getIdade());
            stmt.setFloat(6, prof.getSalario());
            stmt.setFloat(7, prof.getHr_Trabalhadas());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO!");
            
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "ERRO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
       public List<professores> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<professores> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM professor WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                professores p = new professores();

                p.setIdProf(rs.getInt("IdProf"));
                p.setNome(rs.getString("Nome"));
                p.setCPF(rs.getString("CPF"));
                p.setEndereco(rs.getString("Endereco"));
                p.setTelefone(rs.getInt("Telefone"));
                p.setIdade(rs.getInt("Idade"));
                p.setSalario(rs.getFloat("Salario"));
                p.setHr_Trabalhadas(rs.getInt("Hr_Trabalhadas"));
                professores.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    
}
