/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author mvasc
 */
public class Convidados {
    
    public int idconv;
    public String nome;
    public String CPF;
    public float vl_pago;
    
    public int getIdConv() {
        return idconv;
    }

    public void setIdConv(int IdConv) {
        this.idconv = IdConv;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    public String getCpf() {
        return CPF;
    }

    public void setCpf (String Cpf) {
        this.CPF = Cpf;
    }
    
    public float getVl_Pago() {
        return vl_pago;
    }

    public void setVl_Pago(float Vl_Pago) {
        this.vl_pago = Vl_Pago;
    }
    
}
