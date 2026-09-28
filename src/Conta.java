public class Conta {

    //Atributos

    String titular,email,cpf;
    int dataCadastro;
    double saldo,saque,deposito;

    //Contrutores

    public Conta(String titular, String email, String cpf,int dataCadastro){
        this.titular = titular;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Metodos de exibição

    public void exibirDado(){
        System.out.println("Dados da conta do titular");
        System.out.println("Nome: " + titular);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("Data do cadastro: " + dataCadastro);
    }

    public double saque(double saldo){
        if (saldo <= 0){
            return saldo;
        }
        if (saque > saldo){
            return saldo;
        }
        saldo -= saque;
        return saldo;
    }

    //Metodos get e set


    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getDataCadastro(){
        return dataCadastro;
    }

    public void setDataCadastro(int dataCadastro){
        this.dataCadastro = dataCadastro;
    }
}
