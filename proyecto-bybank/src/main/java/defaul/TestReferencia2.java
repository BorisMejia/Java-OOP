package defaul;

public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente boris = new Cliente();
        boris.setNombre("Boris");
        boris.setDocumento("10451543535");
        boris.setTelefono("30193234433");

        Cuenta cuentaBoris = new Cuenta(2);
        cuentaBoris.setAgencia(1);
        cuentaBoris.setTitular(boris);

        System.out.println(cuentaBoris.getAgencia());
        System.out.println(cuentaBoris.getTitular());
        System.out.println(boris);
    }
}
