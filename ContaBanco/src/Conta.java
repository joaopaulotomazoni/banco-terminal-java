public class Conta {
    private int numero;
    private String agencia;
    private String cliente;
    private double saldo;

    public Conta(int numero, String agencia, String cliente, double saldo){
        this.numero=numero;
        this.agencia=agencia;
        this.cliente=cliente;
        this.saldo=saldo;
    }

    public String exibirInformacoes(){
        return "Olá " + this.cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ this.agencia + ", conta "+ this.numero + " e seu saldo "+ this.saldo +" já está disponível para saque";
    }


}
