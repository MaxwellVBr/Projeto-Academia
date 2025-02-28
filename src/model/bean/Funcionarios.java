/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author mvasc
 */
public class Funcionarios {
    
    public int idfun;
    public String nome;
    public float salario;
    public String endereco;
    public int telefone;
    public String funcao;
    
    public int getIdFun (){
        return idfun;
    }
    
    public void setIdFun(int IdFun){
        this.idfun = IdFun;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String Nome){
        this.nome = Nome;
    }
    
     public float getSalario (){
        return salario;
    }
    
    public void setSalario(float Salario){
        this.salario = Salario;
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
    
    public String getFuncao (){
        return funcao;
    }
    
    public void setFuncao(String Funcao){
        this.funcao = Funcao;
    }
    
}
