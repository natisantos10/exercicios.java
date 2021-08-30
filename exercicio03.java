class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o segundo número");
		int segundoNumero = scan.nextInt();

		int resultado = primeiroNumero + segundoNumero;

		System.out.println("A soma dos números é " + resultado);
	}

}