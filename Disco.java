
public class Disco extends Banda {
	public String iniciais;
	public Disco() {
		
	}
	public Disco(String nome, String descricao1, String descricao2, String descricao3, String iniciais) {
		super(descricao1, descricao2, descricao3, nome);
		this.iniciais=iniciais;
	}
	public String getIniciais() {
		return iniciais;
	}
	public void setIniciais(String iniciais) {
		this.iniciais = iniciais;
	}
	
}
