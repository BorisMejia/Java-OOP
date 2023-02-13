package defaul;
// Entidad cuenta

class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    //No retorna valor
    void depositar(double valor) {
        //this account              this object
        this.saldo = this.saldo + valor;
    }

    //Retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean transferir(double valor, Cuenta cuenta){

    }
}


