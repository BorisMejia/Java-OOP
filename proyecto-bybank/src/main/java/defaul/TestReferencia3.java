package defaul;

public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaBoris = new Cuenta(5);
        Cliente cliente = new Cliente();
        cuentaBoris.getAgencia();


        System.out.println(cuentaBoris.getTitular().getNombre());
    }
}
