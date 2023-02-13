package defaul;

public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo =400;
        System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 400;
        System.out.println("Saldo Segunda cuenta: " + segundaCuenta.saldo);

        System.out.println(segundaCuenta.saldo);
        //System.out.println(primeraCuenta.agencia);

        if(primeraCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("Son diferentes");
        }
    }
}
