
public class Dados {
	Banda b1= new Banda();
	Banda b2= new Banda();
	Banda b3= new Banda();
	Banda b4= new Banda();
	Disco d1= new Disco();
	Disco d2= new Disco();
	Disco d3= new Disco();
	Interacao i = new Interacao();
	public Dados() {
		b1.setNome("Pink Floyd");
		b2.setNome("Kendrick Lamar");
		b3.setNome("Queen");
		b4.setNome("Justin Bieber");
		d1.setNome("Flower Boy");
		d2.setNome("21");
		d3.setNome("Clube da Esquina");
		b1.setDescricao1("Foi uma banda brit�nica de rock, formada em Londres em 1965, que atingiu sucesso internacional com sua m�sica psicod�lica e progressiva. ");
		b3.setDescricao1("Foi uma banda brit�nica de rock, fundada em 1970 e ativa, sob sua forma��o cl�ssica, at� 1991.");
		b2.setDescricao1("� um rapper, produtor musical, compositor e ator americano, amplamente considerado como um dos mais relevantes da atualidade, e por muitos como o maior nome do Hip Hop.");
		b4.setDescricao1("� um cantor e compositor de m�sica pop e R&B e ator canadense.");
		d1.setDescricao1("� o quarto �lbum do rapper americano Tyler, the creator.");
		d2.setDescricao1("� o segundo �lbum de est�dio da artista musical inglesa Adele.");
		d3.setDescricao1("Foi um movimento musical brasileiro surgido na d�cada de 1960 em Belo Horizonte - Minas Gerais, onde jovens m�sicos come�aram a se reunir, dentre eles, Milton Nascimento.");
		b1.setDescricao2("Seu trabalho foi marcado pelo uso de letras filos�ficas, experimenta��es musicais, encartes de �lbuns inovadores e shows elaborados");
		b3.setDescricao2("Foi lan�ado recentemente (2018) o filme biogr�fico desta banda, com nome de uma de suas m�sicas mais famosas");
		b2.setDescricao2("Em fevereiro de 2018, foi lan�ado o �lbum de m�sicas para o filme Black Panther (filme), onde Kendrick foi curador, ajudando na produ��o e composi��o das m�sicas, al�m de fazer participa��o direta na Trilha sonora.");
		b4.setDescricao2("Em 2007, seus v�deos de apresenta��es covers foram vistas no YouTube por Scooter Braun, que tornou seu agente e o levou para a cidade de Atlanta (Ge�rgia), para reunir-se com o cantor Usher. ");
		d1.setDescricao2("Conta com a colabora��o vocal de v�rios artista, incluindo Frank Ocean, ASAP Rocky, Anna of the North, Lil Wayne, Kali Uchis, Steve Lacy, Estelle, Jaden Smith e Rex Orange County.");
		d2.setDescricao2("O disco possui uma sonoridade inspirada por g�neros como pop, soul e R&B");
		d3.setDescricao2("Seu som se fundia com as inova��es trazidas pela Bossa Nova a elementos do jazz, do rock � principalmente os Beatles �, m�sica folcl�rica dos negros mineiros com alguns recursos de m�sica erudita e m�sica hisp�nica.");
		b1.setDescricao3("Lan�ou in�meros �lbuns, atingindo sucesso internacional com Dark Side of the Moon (1973), Wish You Were Here (1975), Animals (1977) e The Wall (1979)");
		b3.setDescricao3("O vocalista da banda tornou-se c�lebre pelo seu poderoso tom de voz e seus desempenhos energ�ticos que sempre envolviam a plateia, tendo sido considerado pela cr�tica como um dos maiores artistas de todos os tempos.");
		b2.setDescricao3("\"To Pimp a Butterfly\", seu terceiro �lbum, foi aclamado pela cr�tica, indicado ao Grammy de 2016 e ganhou na categoria Melhor �lbum de Rap. Foi considerado o melhor �lbum de 2015 por v�rias publica��es e sites, incluindo a Rolling Stone, Billboard e Pitchfork. ");
		b4.setDescricao3("O primeiro single, \"Baby\", que conta com a participa��o do rapper Ludacris foi liberado em 18 de janeiro de 2010, alcan�ando o top 5 em mais de dez pa�ses.");
		d1.setDescricao3("As faixas mais famosas do �lbum consistem em: \"Who Dat Boy\" / \"911\", \"Boredom\", \"I Ain't Got Time!\" and \"See You Again\".");
		d2.setDescricao3("\"Rolling in the Deep\", foi um sucesso comercial, liderando tabelas de 11 pa�ses e qualificando-se como a m�sica mais vendida dos Estados Unidos em 2011. ");
		d3.setDescricao3("Nos anos 70, esses artistas tornaram-se refer�ncia de qualidade na MPB pelo alto n�vel de performance e disseminaram suas inova��es e influ�ncia a diversos cantos do pa�s e do mundo.");
		d1.setIniciais("F_ _ _ _ _  B _ _");
		d2.setIniciais("dois n�meros");
		d3.setIniciais("C_ _ _ _  D _  E _ _ _ _ _ _");
	}
	public Banda getBanda1() {
		return b1;
	}
	public Banda getBanda2() {
		return b2;
	}
	public Banda getBanda3() {
		return b3;
	}
	public Banda getBanda4() {
		return b4;
	}
	public Disco getDisco1() {
		return d1;
	}
	public Disco getDisco2() {
		return d2;
	}
	public Disco getDisco3() {
		return d3;
	}
}
