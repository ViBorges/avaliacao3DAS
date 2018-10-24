package Cadastros;

public class CompDuracaoHoras {
 	private Viagem viagem;
	private int duracaoHoras;
	
	 public CompDuracaoHoras(Viagem viagem, int duracaoHoras) {
		this.viagem = viagem;
		this.duracaoHoras = duracaoHoras;
	}
	 
	 public int comp() {
			if (viagem.getHoraTermino() == viagem.getHoraInicio())
				duracaoHoras = 0;
			if (viagem.getHoraTermino() > viagem.getHoraInicio()) 
				if (viagem.getHoraTermino() == viagem.getHoraInicio() + 1) {  
					if (viagem.getMinutosTermino() < viagem.getMinutoInicio())
						duracaoHoras = 0;
					else
						duracaoHoras = 1;
				} else {
					if (viagem.getHoraTermino() - viagem.getHoraInicio() > 2)
						duracaoHoras = viagem.getHoraTermino() - viagem.getHoraInicio();
					else if (viagem.getHoraTermino() - viagem.getHoraInicio() == 2 &&   
							 viagem.getMinutosTermino() < viagem.getMinutoInicio())  
						duracaoHoras = 1;
					else
						duracaoHoras = 2;
						
				}
			if (viagem.getHoraTermino() < viagem.getHoraInicio()) 
				duracaoHoras = -1;
			return duracaoHoras;
	 }
}