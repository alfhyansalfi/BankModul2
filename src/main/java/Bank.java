public class Bank {
    private double saldo;

    public Bank(double saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(double amount){
        saldo = saldo + amount;
    }

    public void ambilUang(double amount){
        saldo = saldo - amount;
    }

    public double getSaldo(){
        return saldo;
    }
}

