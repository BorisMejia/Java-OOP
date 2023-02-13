package defaul;

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(4);
        Cliente cliente = new Cliente();
        cliente.setNombre("Boris");
        cliente.setDocumento("104510343");

        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());

    }
}
