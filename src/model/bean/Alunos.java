
package model.bean;

import java.util.List;

public class Alunos {
    
    public int IdAlu;
    public String nome;
    public String CPF;
    public String endereco;
    public int telefone;
    public int idade;
    public int mensalidade;
    public float mt_atraso;
   
     public int getIdAlu (){
        return IdAlu;
    }
    
    public void setIdAlu(int idalu){
        this.IdAlu = idalu;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String Nome){
        this.nome = Nome;
    }
    
    public String getCPF (){
        return CPF;
    }
    
    public void setCPF(String Cpf){
        this.CPF = Cpf;
    }
    
    public String getEndereco (){
        return endereco;
    }
    
    public void setEndereco(String Endereco){
        this.endereco = Endereco;
    }
    
    public int getTelefone (){
        return telefone;
    }
    
    public void setTelefone(int Telefone){
        this.telefone = Telefone;
    }
    
    public int getIdade (){
        return idade;
    }
    
    public void setIdade(int Idade){
        this.idade = Idade;
    }
    
    public int getMensalidade (){
        return mensalidade;
    }
    
    public void setMensalidade(int Mensalidade){
        this.mensalidade = Mensalidade;
    }
    
    public float getMt_Atraso (){
        return mt_atraso;
    }
    
    public void setMt_Atraso(float Mt_Atraso){
        this.mt_atraso = Mt_Atraso;
    }

    public void add(List<Alunos> alunos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
