package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.98;
		
		System.out.println("Nome:  " + nome 
				+ "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade 
				+ "\nSalario " + salario);
		
		System.out.printf("Nome: %s %s", nome, sobrenome);
		
		
		
	}

}
