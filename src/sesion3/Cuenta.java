package sesion3;

public class Cuenta {

	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return 5.0;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public void retirar(double d) {
		this.saldo += d;
		
	}
	public void ingreso(double d) {
		this.saldo -= d;
	}
	
}
