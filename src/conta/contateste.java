package conta;

public class contateste {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = "Alex";
        conta.saldo = 4_000.00;
        conta.exibesaldo();

    }
}