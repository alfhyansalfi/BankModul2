public class BankBeraksi {
    public static void main(String[] args){
        System.out.println("Selamat Datang di Bank ABC");

        Bank saldoBank = new Bank(100000);
        System.out.println("Saldo saat ini: Rp. " + saldoBank.getSaldo());
        System.out.println();

        double simpanUang = 500000;
        saldoBank.simpanUang(simpanUang);
        System.out.println("Simpan uang: Rp. " + simpanUang);
        System.out.println("Saldo saat ini: Rp. " + saldoBank.getSaldo());
        System.out.println();

        double ambilUang = 150000;
        saldoBank.ambilUang(ambilUang);
        System.out.println("Ambil uang: Rp. " + ambilUang);
        System.out.println("Saldo saat ini: Rp. " + saldoBank.getSaldo());
    }
}
