
public class Hard extends Jogo {
	public int penalidade;
	public Hard() {
		
	}
	public Hard(int pontos, Disco b1, boolean acertar, String t, int b, int penalidade) {
		super(pontos, b1, acertar, t, b);
		this.penalidade=penalidade;
	}
	public void setB1(Disco b1) {
		this.b1 = b1;
	}
	public int Pontuacao() {
		if(t.equals(b1.getNome())) {
			this.acertar= true;
			if(b==0) {
				this.pontos= 150;
			}else
				this.pontos = 100-penalidade;
			if(b==4) {
				this.acertar=false;
			}
		}else
			b++;
		if(acertar==false) {
			this.pontos=0;
		}
		return pontos;
	}
	public int Penalidade() {
		if(b==2) {
			penalidade+=20;
		}else 
		penalidade+=10;
		return penalidade;
	}
		
}
