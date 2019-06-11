
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
		b1.setDescricao1("Foi uma banda britânica de rock, formada em Londres em 1965, que atingiu sucesso internacional com sua música psicodélica e progressiva. ");
		b3.setDescricao1("Foi uma banda britânica de rock, fundada em 1970 e ativa, sob sua formação clássica, até 1991.");
		b2.setDescricao1("É um rapper, produtor musical, compositor e ator americano, amplamente considerado como um dos mais relevantes da atualidade, e por muitos como o maior nome do Hip Hop.");
		b4.setDescricao1("É um cantor e compositor de música pop e R&B e ator canadense.");
		d1.setDescricao1("É o quarto álbum do rapper americano Tyler, the creator.");
		d2.setDescricao1("É o segundo álbum de estúdio da artista musical inglesa Adele.");
		d3.setDescricao1("Foi um movimento musical brasileiro surgido na década de 1960 em Belo Horizonte - Minas Gerais, onde jovens músicos começaram a se reunir, dentre eles, Milton Nascimento.");
		b1.setDescricao2("Seu trabalho foi marcado pelo uso de letras filosóficas, experimentações musicais, encartes de álbuns inovadores e shows elaborados");
		b3.setDescricao2("Foi lançado recentemente (2018) o filme biográfico desta banda, com nome de uma de suas músicas mais famosas");
		b2.setDescricao2("Em fevereiro de 2018, foi lançado o Álbum de músicas para o filme Black Panther (filme), onde Kendrick foi curador, ajudando na produção e composição das músicas, além de fazer participação direta na Trilha sonora.");
		b4.setDescricao2("Em 2007, seus vídeos de apresentações covers foram vistas no YouTube por Scooter Braun, que tornou seu agente e o levou para a cidade de Atlanta (Geórgia), para reunir-se com o cantor Usher. ");
		d1.setDescricao2("Conta com a colaboração vocal de vários artista, incluindo Frank Ocean, ASAP Rocky, Anna of the North, Lil Wayne, Kali Uchis, Steve Lacy, Estelle, Jaden Smith e Rex Orange County.");
		d2.setDescricao2("O disco possui uma sonoridade inspirada por gêneros como pop, soul e R&B");
		d3.setDescricao2("Seu som se fundia com as inovações trazidas pela Bossa Nova a elementos do jazz, do rock – principalmente os Beatles –, música folclórica dos negros mineiros com alguns recursos de música erudita e música hispânica.");
		b1.setDescricao3("Lançou inúmeros álbuns, atingindo sucesso internacional com Dark Side of the Moon (1973), Wish You Were Here (1975), Animals (1977) e The Wall (1979)");
		b3.setDescricao3("O vocalista da banda tornou-se célebre pelo seu poderoso tom de voz e seus desempenhos energéticos que sempre envolviam a plateia, tendo sido considerado pela crítica como um dos maiores artistas de todos os tempos.");
		b2.setDescricao3("\"To Pimp a Butterfly\", seu terceiro álbum, foi aclamado pela crítica, indicado ao Grammy de 2016 e ganhou na categoria Melhor Álbum de Rap. Foi considerado o melhor álbum de 2015 por várias publicações e sites, incluindo a Rolling Stone, Billboard e Pitchfork. ");
		b4.setDescricao3("O primeiro single, \"Baby\", que conta com a participação do rapper Ludacris foi liberado em 18 de janeiro de 2010, alcançando o top 5 em mais de dez países.");
		d1.setDescricao3("As faixas mais famosas do álbum consistem em: \"Who Dat Boy\" / \"911\", \"Boredom\", \"I Ain't Got Time!\" and \"See You Again\".");
		d2.setDescricao3("\"Rolling in the Deep\", foi um sucesso comercial, liderando tabelas de 11 países e qualificando-se como a música mais vendida dos Estados Unidos em 2011. ");
		d3.setDescricao3("Nos anos 70, esses artistas tornaram-se referência de qualidade na MPB pelo alto nível de performance e disseminaram suas inovações e influência a diversos cantos do país e do mundo.");
		d1.setIniciais("F_ _ _ _ _  B _ _");
		d2.setIniciais("dois números");
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
