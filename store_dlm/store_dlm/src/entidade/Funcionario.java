package entidade;


public class Funcionario {
    private int id,numero;
    private String nome,email,endereco,senha;
    private double salario;
    private boolean gerente,func;

    public Funcionario() {
    }

    public Funcionario(String nome,String email,String senha,String endereco, int numero, double salario,boolean gerente, boolean func) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.numero = numero;
        this.salario = salario;
        this.gerente = gerente;
        this.func = func;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario=salario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }

    public boolean isFunc() {
        return func;
    }

    public void setFunc(boolean func) {
        this.func = func;
    }
    
    
  
    

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome 
                 + ", salario=" + salario + '}';
    }
}
