import java.util.Locale;

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

    public void exibirSaldoAtual() {
        System.out.println("Seu saldo atual é: " +
                String.format(new Locale("pt", "BR"), "R$ %,.2f", saldo));
    }

    public void exibirDado(){
        System.out.println("Dados da conta do titular");
        System.out.println("Nome: " + titular);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("Data do cadastro: " + dataCadastro);
    }

    public void saque(double valor){
        if (valor <= 0){
            return;
        }
        if (valor > saldo){
            return;
        }
        saldo -= valor;
        System.out.println("Valor sacado com sucesso ");
        exibirSaldoAtual();
    }

    public void deposito(double valor){saldo += valor; }

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
