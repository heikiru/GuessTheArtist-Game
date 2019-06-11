import java.util.Scanner;
public class Interacao {
	public Interacao() {
	
	}
	Scanner ler = new Scanner(System.in);
	public int Cadastro() {
		System.out.println("Olá! Você gostaria de fazer uma sugestão? \nEscolha a categoria que deseja acrescentar: (1-Banda, 2-Disco, 3-Sair)");
		int escolha= 0;
		while(escolha==0) {
			escolha = ler.nextInt();
		}if(escolha>3||escolha<1) {
			System.out.println("Entrada inválida, digite novamente: ");
			escolha=0;
			while(escolha==0) {
				escolha = ler.nextInt();
			}
		}
		return escolha;
	}
	public Banda[] ArrayNovo1(Banda[] array) {
			int n=0;
			boolean continuar = true;
			while (continuar== true) {
				String nome= "";
				String descricao1= "";
				String descricao2= "";
				String descricao3= "";
				String se="";
				
				array[n]= new Banda();
				System.out.println("Dados da banda "+(n+1)+": \n(o limite de sugestões(bandas) por usuário é 3.)");
				System.out.println("Banda "+(n+1)+": Insira o nome: ");
				while(nome.isEmpty()) {
				nome = ler.nextLine();
				}
				array[n].setNome(nome);
				System.out.println("Banda "+(n+1)+": Digite a descrição 1: ");
				while(descricao1.isEmpty()) {
					descricao1 = ler.nextLine();
					}
				array[n].setDescricao1(descricao1);
				System.out.println("Banda "+(n+1)+": Digite a descrição 2: ");
				while(descricao2.isEmpty()) {
					descricao2 = ler.nextLine();
					}
				array[n].setDescricao2(descricao2);
				System.out.println("Banda "+(n+1)+": Digite a descrição 3: ");
				while(descricao3.isEmpty()) {
					descricao3 = ler.nextLine();
					}
				array[n].setDescricao3(descricao3);
				System.out.println("Deseja sugerir mais alguma banda? \n(Se sim, digite 'S', do contrário digite qualquer coisa)");
				while(se.isEmpty()) {
					se = ler.nextLine();
					}
					if(se.equals("S")) {
						n++;
						if(n>2) {
							System.out.println("O limite de sugestões(bandas) foi atingido.");
							continuar=false;
							}
					}else
						continuar=false;
			}
		return array;
	}
		public Disco[] ArrayNovo2(Disco[] array) {
			int n=0;
			boolean continuar = true;
			while (continuar== true) {
				String nome= "";
				String descricao1= "";
				String descricao2= "";
				String descricao3= "";
				String se="";
				array[n]= new Disco();
				System.out.println("Dados do disco "+(n+1)+": \n(o limite de sugestões(discos) por usuário é 3.)");
				System.out.println("Disco "+(n+1)+": Insira o nome: ");
				while(nome.isEmpty()) {
				nome = ler.nextLine();
				}
				array[n].setNome(nome);
				System.out.println("Disco "+(n+1)+": Digite a descrição 1: ");
				while(descricao1.isEmpty()) {
					descricao1 = ler.nextLine();
					}
				array[n].setDescricao1(descricao1);
				System.out.println("Disco "+(n+1)+": Digite a descrição 2: ");
				while(descricao2.isEmpty()) {
					descricao2 = ler.nextLine();
					}
				array[n].setDescricao2(descricao2);
				System.out.println("Disco "+(n+1)+": Digite a descrição 3: ");
				while(descricao3.isEmpty()) {
					descricao3 = ler.nextLine();
					}
				array[n].setDescricao3(descricao3);
				System.out.println("Disco "+(n+1)+": Digite a(s) inicial(is) do disco: ");
				String iniciais= ler.nextLine();
				array[n].setIniciais(iniciais);
				System.out.println("Deseja sugerir mais algum disco? \n(Se sim, digite 'S', do contrário digite qualquer coisa)");
				while(se.isEmpty()) {
					se = ler.nextLine();
					}
					if(se.equals("S")) {
						n++;
						if(n>2) {
							System.out.println("O limite de sugestões(bandas) foi atingido.");
							continuar=false;
							}
					}else
						continuar=false;
			}
		return array;
	}
	public int menuConfirmar() {
		System.out.println("Deseja alterar, consultar ou excluir alguma de suas sugestões antes de enviar? \n(1-alterar, 2-consultar, 3-excluir, 4-enviar)"); 
		int opcao=0;
		while(opcao==0) {
			opcao = ler.nextInt();
			}if(opcao>4||opcao<1) {
				System.out.println("Entrada inválida, digite novamente: ");
				opcao=0;
				while(opcao==0) {
					opcao = ler.nextInt();
				}
			}
		 return opcao;
	}
	public int recebeNumero() {
		int n= 0;
		while(n==0) {
			n = ler.nextInt();
			}
		return n;
	}
	public Banda AlterarB(Banda b) {
		System.out.println("O que deseja alterar? \n(1- Nome, 2- descricao1, 3- descricao2, 4- descricao)");
		int opcao=0;
		while(opcao==0) {
			opcao = ler.nextInt();
			}if(opcao>4||opcao<1) {
				System.out.println("Entrada inválida, digite novamente: ");
				opcao=0;
				while(opcao==0) {
					opcao = ler.nextInt();
				}
			}
		switch (opcao) {
		case 1:
			System.out.println("Insira o novo nome: ");
			String nome="";
			while(nome.isEmpty()) {
			nome = ler.nextLine();
			}
			b.setNome(nome);
			break;
		case 2:
			System.out.println("Insira a nova descrição: ");
			String descricao1= "";
			while(descricao1.isEmpty()) {
				descricao1 = ler.nextLine();
				}
			b.setDescricao1(descricao1);
			break;
		case 3:
			System.out.println("Insira a nova descrição: ");
			String descricao2= "";
			while(descricao2.isEmpty()) {
				descricao1 = ler.nextLine();
				}
			b.setDescricao2(descricao2);
			break;
		case 4:
			System.out.println("Insira a nova descrição: ");
			String descricao3= "";
			while(descricao3.isEmpty()) {
				descricao1 = ler.nextLine();
				}
			b.setDescricao3(descricao3);
			break;
		}
		return b;
		 
	}
	public Disco AlterarD(Disco d) {
		System.out.println("O que deseja alterar? \n(1- Nome, 2- descricao1, 3- descricao2, 4- descricao)");
		int opcao=0;
		while(opcao==0) {
			opcao = ler.nextInt();
			}if(opcao>4||opcao<1) {
			System.out.println("Entrada inválida, digite novamente: ");
			opcao=0;
			while(opcao==0) {
				opcao = ler.nextInt();
			}
			}
		switch (opcao) {
		case 1:
			System.out.println("Insira o novo nome: ");
			String nome="";
			while(nome.isEmpty()) {
			nome = ler.nextLine();
			}
			d.setNome(nome);
			break;
		case 2:
			System.out.println("Insira a nova descrição: ");
			String descricao1= "";
			while(descricao1.isEmpty()) {
				descricao1 = ler.nextLine();
				}
			d.setDescricao1(descricao1);
			break;
		case 3:
			System.out.println("Insira a nova descrição: ");
			String descricao2= "";
			while(descricao2.isEmpty()) {
				descricao1 = ler.nextLine();
				}
			d.setDescricao2(descricao2);
			break;
		case 4:
			System.out.println("Insira a nova descrição: ");
			String descricao3= "";
			while(descricao3.isEmpty()) {
				descricao1 = ler.nextLine();
				}
			d.setDescricao3(descricao3);
			break;
		case 5:
			System.out.println("Insira as novas iniciais: ");
			String iniciais= ler.nextLine();
			while(iniciais.isEmpty()) {
			d.setIniciais(iniciais);
			}
			break;
		}
		return d;
	}
	public void ConsultarB(Banda b) {
		if(b==null) {
			System.out.println("Esta banda ainda não foi cadastrada ou foi excluída. ");
		}else
		System.out.println("nome: "+b.getNome()+", \ndescricao1: "+b.getDescricao1()+", \ndescricao2: "+b.getDescricao2()+", \ndescricao3: "+b.getDescricao3()+".");
	}
	public void ConsultarD(Disco d) {
		if(d==null) {
			System.out.println("Este disco ainda não foi cadastrado ou foi excluído. ");
		}else
		System.out.println("nome: "+d.getNome()+", \ndescricao1: "+d.getDescricao1()+", \ndescricao2: "+d.getDescricao2()+", \ndescricao3: "+d.getDescricao3()+", \niniciais: "+d.getIniciais()+".");
	}
	
	public void Total(int soma) {
		System.out.println("Você possui no total : "+soma+" pontos.");
	}
	public int lerMenu() {
	System.out.println("Menu: 1-Jogar, 2-Fazer uma sugestão, 3- Sair");
	int menu=0;
	while(menu==0) {
		menu= ler.nextInt();
	}if(menu>3||menu<1) {
		System.out.println("Entrada inválida, digite novamente: ");
		menu=0;
		while(menu==0) {
			menu = ler.nextInt();
		}
	}
	return menu;
	}
	public int lerDificuldade() {
		System.out.println("Em qual dificuldade deseja jogar? (1-Normal, 2-Difícil, 3-Sair)");
		int dificuldade= 0;
		while(dificuldade==0) {
			dificuldade= ler.nextInt();
		}if(dificuldade>3||dificuldade<1) {
			System.out.println("Entrada inválida, digite novamente: ");
			dificuldade=0;
			while(dificuldade==0) {
				dificuldade = ler.nextInt();
			}
		}
		return dificuldade;
	}
	public int Jogar1(Banda x, Jogo y) {
		String t1= "";
		String t2= "";
		String t3= "";
		int pontos=-1;
		while(pontos<0) {
		System.out.println("Primeira dica: ");
		System.out.println(x.getDescricao1());
		while (t1.isEmpty()) {
		t1= ler.nextLine();
		}
		y.setT(t1);
		y.Pontuacao();
			if(y.isAcertar()==true) {
			System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
				pontos= y.getPontos();
				break;
			}else
			System.out.println("Incorreto! Próxima dica: ");
			System.out.println(x.getDescricao2());
			while (t2.isEmpty()) {
				t2= ler.nextLine();
				}
			y.setT(t2);
			y.Pontuacao();
				if(y.isAcertar()==true) {
					System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
					pontos= y.getPontos();
					break;
				}else
					System.out.println("Incorreto! Última dica: ");
					System.out.println(x.getDescricao3());
					while (t3.isEmpty()) {
						t3= ler.nextLine();
						}
					y.setT(t3);
					y.Pontuacao();
					if(y.isAcertar()==true) {
					System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
					pontos= y.getPontos();
					break;
					}else
						System.out.println("Que pena :(, você não acertou. Recebe "+ y.getPontos()+" pontos. ");
						pontos= y.getPontos();
						break;
		}
		return pontos;
	}
	public int Jogar2(Disco x, Hard y) {
		String t1= "";
		String t2= "";
		String t3= "";
		String t4= "";
		int pontos=-1;
		while(pontos<0) {
		System.out.println("Primeira dica: ");
		System.out.println(x.getDescricao1());
		while (t1.isEmpty()) {
		t1= ler.nextLine();
		}
		y.setT(t1);
		y.Pontuacao();
			if(y.isAcertar()==true) {
			System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
				pontos= y.getPontos();
				break;
			}else
			System.out.println("Incorreto! Próxima dica: ");
			System.out.println(x.getDescricao2());
			while (t2.isEmpty()) {
				t2= ler.nextLine();
				}
			y.setT(t2);
			y.Pontuacao();
				if(y.isAcertar()==true) {
					System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
					pontos= y.getPontos();
					break;
				}else
					System.out.println("Incorreto! Próxima dica: ");
				System.out.println(x.getDescricao2());
				while (t3.isEmpty()) {
					t3= ler.nextLine();
					}
				y.setT(t3);
				y.Pontuacao();
					if(y.isAcertar()==true) {
						System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
						pontos= y.getPontos();
						break;
					}else
					System.out.println("Incorreto! Última dica: ");
					System.out.println(x.getDescricao3());
					while (t4.isEmpty()) {
						t4= ler.nextLine();
						}
					y.setT(t4);
					y.Pontuacao();
					if(y.isAcertar()==true) {
					System.out.println("Parabéns, você acertou! Recebe " + y.getPontos()+ " pontos.");
					pontos= y.getPontos();
					break;
					}else
						System.out.println("Que pena :(, você não acertou. Recebe "+ y.getPontos()+" pontos. ");
						pontos= y.getPontos();
						break;
		}
		return pontos;
	}
}