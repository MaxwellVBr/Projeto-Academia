/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Alunos;
import model.dao.AlunosDAO;
import model.dao.CpfDAO;

/**
 *
 * @author mvasc
 */
public class ViewAlu extends javax.swing.JFrame {

    public ViewAlu() {
        initComponents();
         DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));

      readJTable();

    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        AlunosDAO aludao = new AlunosDAO();

        for (Alunos alu : aludao.read()) {

            modelo.addRow(new Object[]{
                alu.getIdAlu(),
                alu.getNome(),
                alu.getCPF(),
                alu.getEndereco(),
                alu.getTelefone(),
                alu.getIdade(),
                alu.getMensalidade(),
                alu.getMt_Atraso()
            });

        }

   }
    
    public void readJTableForDesc(String nome) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        AlunosDAO aludao = new AlunosDAO();

        for (Alunos alu : aludao.readForNome(nome)) {

            modelo.addRow(new Object[]{
                alu.getIdAlu(),
                alu.getNome(),
                alu.getCPF(),
                alu.getEndereco(),
                alu.getTelefone(),
                alu.getIdade(),
                alu.getMensalidade(),
                alu.getMt_Atraso()
            });
        }
    }       


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMt_At = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtCPF = new javax.swing.JTextField();
        txtMen = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtBuscaDesc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("Idade");

        jLabel6.setText("Mensalidade");

        jLabel7.setText("Multa por Atraso");

        txtMt_At.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMt_AtActionPerformed(evt);
            }
        });

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Endereço", "Telefone", "Idade", "Mensalidade", "Multa Atraso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jTProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtMen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE UMA OPÇÃO>", "Básico – R$ 70.00", "Médio – R$ 90.00", "Completo – R$ 120.00" }));

        jLabel8.setText("Digite o Nome:");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtBuscaDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaDescActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtBuscaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(txtEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMt_At, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(3, 3, 3)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMt_At, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(txtBuscaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMt_AtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMt_AtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMt_AtActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        CpfDAO cpdao = new CpfDAO();
       
        if(cpdao.checkCPF(txtCPF.getText())){
            JOptionPane.showMessageDialog(null, "CPF JÁ CADASTRADO");
        }
        else{
            
        Alunos alu = new Alunos();
        AlunosDAO dao = new AlunosDAO();

        switch (txtMen.getSelectedIndex()){
                       
            case 0:
                JOptionPane.showMessageDialog(null, "ESCOLHA O PLANO");
                break;
            case 1:

        alu.setNome(txtNome.getText());
        alu.setCPF(txtCPF.getText());
        alu.setEndereco(txtEnd.getText());
        alu.setTelefone(Integer.parseInt(txtTel.getText()));
        alu.setIdade(Integer.parseInt(txtIda.getText()));
        alu.setMensalidade(1);
        alu.setMt_Atraso(Float.parseFloat(txtMt_At.getText()));
        dao.create(alu);

        txtNome.setText("");
        txtCPF.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        txtIda.setText("");
        txtMen.setSelectedIndex(0);
        txtMt_At.setText("");
        
               break; 
               
            case 2:
                
        alu.setNome(txtNome.getText());
        alu.setCPF(txtCPF.getText());
        alu.setEndereco(txtEnd.getText());
        alu.setTelefone(Integer.parseInt(txtTel.getText()));
        alu.setIdade(Integer.parseInt(txtIda.getText()));
        alu.setMensalidade(2);
        alu.setMt_Atraso(Float.parseFloat(txtMt_At.getText()));
        dao.create(alu);

        txtNome.setText("");
        txtCPF.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        txtIda.setText("");
        txtMen.setSelectedIndex(0);
        txtMt_At.setText("");
        break;
        
          case 3:
                
        alu.setNome(txtNome.getText());
        alu.setCPF(txtCPF.getText());
        alu.setEndereco(txtEnd.getText());
        alu.setTelefone(Integer.parseInt(txtTel.getText()));
        alu.setIdade(Integer.parseInt(txtIda.getText()));
        alu.setMensalidade(3);
        alu.setMt_Atraso(Float.parseFloat(txtMt_At.getText()));
        dao.create(alu);

        txtNome.setText("");
        txtCPF.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        txtIda.setText("");
        txtMen.setSelectedIndex(0);
        txtMt_At.setText("");
        
        break;
        
        }
   
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        // TODO add your handling code here:

        if (jTProdutos.getSelectedRow() != -1) {

            txtNome.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtCPF.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtEnd.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            txtTel.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 4).toString());
            txtIda.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 5).toString());
          //  txtMen.setSelectedIndex(jTProdutos.getValueAt(jTProdutos.getSelectedIndex(), 5));
            txtMt_At.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 7).toString());
            

        }
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jTProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosKeyReleased
        // TODO add your handling code here:
        if (jTProdutos.getSelectedRow() != -1) {

            txtNome.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtCPF.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtEnd.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            txtTel.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 4).toString());
            txtIda.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 5).toString());
          //  txtMen.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 5).toString());
            txtMt_At.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 7).toString());
            

        }
    }//GEN-LAST:event_jTProdutosKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

     /* int idPesquisa = Integer.parseInt(txtBuscaDesc.getText());
        AlunosDAO alunosdao = new AlunosDAO();
        Alunos alunos = alunosdao.read();
        if (alunos == null){
            JOptionPane.showMessageDialog(this, "Aluno não encontrado");
        }
        else {
            txtNome.setText (alunos.getNome());
            txtCPF.setText (String.valueOf(alunos.getCPF()));
            txtEnd.setText (alunos.getEndereco());
            txtTel.setText (String.valueOf(alunos.getTelefone()));
            txtIda.setText (String.valueOf(alunos.getIdade()));
            txtMen.setText (String.valueOf (alunos.getMensalidade()));
            txtMt_At.setText (String.valueOf (alunos.getMt_Atraso()));
        }
        */
        readJTableForDesc(txtBuscaDesc.getText());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
/*            if (jTProdutos.getSelectedRow() != -1) {

            Alunos p = new Alunos();
            AlunosDAO pdao = new AlunosDAO();

            p.setNome(txtNome.getText());
            p.setCPF(Integer.parseInt(txtCPF.getText()));
            p.setEndereco((txtEnd.getText()));
            p.setTelefone(Integer.parseInt(txtTel.getText()));
            p.setIdade(Integer.parseInt(txtIda.getText()));
            p.setMensalidade(Float.parseFloat(txtMen.getText()));
            p.setMt_Atraso(Float.parseFloat(txtMt_At.getText()));
           // pdao.update(p);

            txtNome.setText("");
            txtCPF.setText("");
            txtEnd.setText("");
            txtTel.setText("");
            txtIda.setText("");
            txtMen.setText("");
            txtMt_At.setText("");

            readJTable();

        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txtBuscaDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaDescActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAlu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField txtBuscaDesc;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtIda;
    private javax.swing.JComboBox<String> txtMen;
    private javax.swing.JTextField txtMt_At;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
