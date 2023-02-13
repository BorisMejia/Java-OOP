package defaul;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(3);
        miCuenta.depositar(300);
        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());

        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());

        Cuenta cuentaFelipe = new Cuenta(4);
        cuentaFelipe.depositar(1000);

        boolean puedeTrasferir=(cuentaFelipe.transferir(400, miCuenta));
            if(puedeTrasferir){
                System.out.println("Trasferencia exitosa");
            }else {
                System.out.println("No es posible hacer la trasferencia");
            }

        System.out.println(cuentaFelipe.getSaldo());
        System.out.println(miCuenta.getSaldo());
    }
}
