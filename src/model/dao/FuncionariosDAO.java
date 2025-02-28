
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
import model.bean.Funcionarios;


public class FuncionariosDAO {
      public void create(Funcionarios fun) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            if (fun.getSalario() < 0){
              JOptionPane.showMessageDialog(null, "SALÁRIO DEVE SER POSITIVO");    
            } 
            else{
            stmt = con.prepareStatement("INSERT INTO funcionario (Nome,Endereco,Telefone,Salario,Funcao)VALUES(?,?,?,?,?)");
            stmt.setString(1, fun.getNome());
            stmt.setString(2, fun.getEndereco());
            stmt.setInt(3, fun.getTelefone());
            stmt.setFloat(4, fun.getSalario());
            stmt.setString(5, fun.getFuncao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO!");
            
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
      
       public List<Funcionarios> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionarios> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionarios f = new Funcionarios();

                f.setIdFun(rs.getInt("IdFunc"));
                f.setNome(rs.getString("Nome"));
                f.setEndereco(rs.getString("Endereco"));
                f.setTelefone(rs.getInt("Telefone"));
                f.setSalario(rs.getFloat("Salario"));
                f.setFuncao(rs.getString("Funcao"));
                
                funcionarios.add(f);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return funcionarios;

    }
    
}
