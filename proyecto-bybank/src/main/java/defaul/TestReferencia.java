package defaul;

public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.depositar(400);
        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(2);
        segundaCuenta.depositar(400);
        System.out.println("Saldo Segunda cuenta: " + segundaCuenta.getSaldo());

        System.out.println(segundaCuenta.getSaldo());
        //System.out.println(primeraCuenta.agencia);

        if(primeraCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("Son diferentes");
        }
    }
}
