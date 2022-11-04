public class BMExercicio03 {
    
    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEspecial;

    public void abreConta(String nome, double deposito, boolean especial) {
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    public void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0;
        contaEspecial = false;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void retira(double valor) {
        if (!contaEspecial && valor > saldo) {
            System.out.println("A operação foi cancelada pois o saldo é insuficiente\n");
        } else {
            saldo -= valor;
        }
    }

    public void mostraDados() {
        System.out.println("Nome do correntista:\n" + nomeDoCorrentista);
        System.out.println("Saldo da conta:\n" + saldo);
        if (saldo < 0) {
            System.out.println("Atenção! Seu saldo está negativo!");
        }
        if (contaEspecial) {
            System.out.println("Essa conta é especial.");
        } else {
            System.out.println("Essa conta é comum.");
        }
    }






}
