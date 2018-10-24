package Cadastros;

public class CompDuracaoMinutos {
	
	private Viagem viagem;
	private int duracaoMinutos;
	
	public CompDuracaoMinutos(Viagem viagem, int duracaoMinutos) {
		this.viagem = viagem;
		this.duracaoMinutos = duracaoMinutos;
	}
	
	public int comp() {
		if (viagem.getMinutosTermino() > viagem.getMinutoInicio()) 
			duracaoMinutos = viagem.getMinutosTermino() - viagem.getMinutoInicio();
		else {
			duracaoMinutos = 60 - viagem.getMinutoInicio() + viagem.getMinutosTermino();
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
		
	}

}
