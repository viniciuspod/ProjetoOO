package bytebank;

public class testaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println("o valor do saldo da conta é : " + conta.saldo);

	}

}
