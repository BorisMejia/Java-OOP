package defaul;
// Entidad cuenta

class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;
    public Cuenta(int agencia){

            if(agencia <= 0){
                System.out.println("No se permite 0");
                this.agencia = 1;
            }else {
                this.agencia = agencia;
            }
            total ++;
        System.out.println("Se van creando: " + total + " cuentas" );
    }


    //No retorna valor
    void depositar(double valor) {
        //this account              this object
        this.saldo = this.saldo + valor;
    }

    //Retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valor, Cuenta cuenta){

        if(this.saldo >= valor){
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setAgencia(int nuevaAgencia){
        if(agencia > 0){
            this.agencia = agencia;
        }else {
            System.out.println("No estan permitidos numeros negativos");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal(){
        return Cuenta.total;
    }
}


