
public class Jogo{
	public String t;
	public int b;
	public boolean acertar;
	public Banda b1;	
	public int pontos;
	public Jogo() {
		
	}
	public Jogo(int pontos, Banda b1, boolean acertar, String t, int b) {
		this.b1=b1;
		this.pontos=pontos;
		this.acertar=acertar;
		this.t=t;
		b=0;
	}
	public boolean isAcertar() {
		return acertar;
	}
	public void setAcertar(boolean acertar) {
		this.acertar = acertar;
	}
	public Banda getB1() {
		return b1;
	}
	public void setB1(Banda b1) {
		this.b1 = b1;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getPontos() {
		return pontos;
	}
	public int Pontuacao() {
		if(t.equals(b1.getNome())) {
			this.acertar= true;
		}else
			b++;
			if(b==3) {
				this.acertar=false;
			}
		if(acertar==true) {
			this.pontos=50;
		}else
		if(acertar==false) {
			this.pontos=0;
		}
		return pontos;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
}