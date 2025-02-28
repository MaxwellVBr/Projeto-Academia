
package model.bean;


public class professores {
    
    public int idprof;
    public String nome;
    public String CPF;
    public String endereco;
    public int telefone;
    public int idade;
    public float salario;
    public float hr_trabalhadas;
    
    public int getIdProf (){
        return idprof;
    }
    
    public void setIdProf(int IdProf){
        this.idprof = IdProf;
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
    
      public float getSalario (){
        return salario;
    }
    
    public void setSalario(float Salario){
        this.salario = Salario;
    }
    
      public float getHr_Trabalhadas (){
        return hr_trabalhadas;
    }
    
    public void setHr_Trabalhadas(float Hr_Trabalhadas){
        this.hr_trabalhadas = Hr_Trabalhadas;
    }
    
    
}
