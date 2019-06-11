
public class Banda {
	
	private String nome;
	public String descricao1;
	public String descricao2;
	public String descricao3;
	public Banda() {
		
	}
	public Banda(String nome, String descricao1, String descricao2, String descricao3) {
		this.descricao1=descricao1;
		this.descricao2=descricao2;
		this.descricao3=descricao3;
		this.nome=nome;
	}
	public String getDescricao2() {
		return descricao2;
	}
	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}
	public String getDescricao3() {
		return descricao3;
	}
	public void setDescricao3(String descricao3) {
		this.descricao3 = descricao3;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao1() {
		return descricao1;
	}
	public void setDescricao1(String descricao1) {
		this.descricao1=descricao1;
	}
	
}
