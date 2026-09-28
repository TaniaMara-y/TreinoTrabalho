public class Conta {

    //Atributos

    private String titular,email,cpf,dataCadastro;
    private double saldo,saque,deposito;

    //Contrutores

    public Conta(String titular, String email, String cpf,String dataCadastro,double saldo){
        this.titular = titular;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
        this.saldo = saldo;
    }

    //Metodos de exibição

    public void exibirSaldoAtual(){
        System.out.println("Seu saldo atual é: " + saldo);
    }

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

    public double deposito(double saldo){
        return (saldo += deposito);
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

    public String getDataCadastro(){
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro){
        this.dataCadastro = dataCadastro;
    }
}
