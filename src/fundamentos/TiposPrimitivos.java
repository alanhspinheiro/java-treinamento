package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//informações do funcionário
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos numéricos reais
		float salario = 11_445.444F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipos booleans
		boolean estaDeFerias = false;  //true
		
		//tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: "+ status);
	}	

	}


