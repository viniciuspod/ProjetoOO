package bytebank;

public class testaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println("o valor do saldo da conta � : " + conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		
		contaDaMarcela.transfere(300, conta);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(conta.saldo);
		
		
		contaDaMarcela.titular = "vinicius dantas";
		System.out.println(contaDaMarcela.titular);
			
		
	}

}
