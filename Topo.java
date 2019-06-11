import java.util.Scanner;
public class Topo {
	public static void main(String[]args) {
		Scanner ler= new Scanner(System.in);
		int soma=0;
		int menu, dificuldade;
		int m=0;
		int l=0;
		int a, c, f, g;
		boolean continuar1=true;
		boolean continuar2=true;
		boolean continuar3=true;
		boolean continuar4=true;
		Dados d = new Dados();
		Banda[] b = new Banda[4];
		Disco[] e = new Disco[3];
		b[0]=d.getBanda1();
		b[1]=d.getBanda2();
		b[2]=d.getBanda3();
		b[3]=d.getBanda4();
		e[0]=d.getDisco1();
		e[1]=d.getDisco2();
		e[2]=d.getDisco3();
		Jogo [] j = new Jogo[4];
		j[0]= new Jogo();
		j[0].setB1(b[0]);
		j[1]= new Jogo();
		j[1].setB1(b[1]);
		j[2]= new Jogo();
		j[2].setB1(b[2]);
		j[3]= new Jogo();
		j[3].setB1(b[3]);
		Hard [] h = new Hard[3];
		h[0]= new Hard();
		h[0].setB1(e[0]);
		h[1]= new Hard();
		h[1].setB1(e[1]);		
		h[2]= new Hard();
		h[2].setB1(e[2]);
		Interacao i1 = new Interacao();
		while(continuar1==true) {
			i1.Total(soma);
			menu= i1.lerMenu();
			switch (menu) {
			case 1:
				continuar2=true;
				while(continuar2==true) {
					dificuldade= i1.lerDificuldade();
					switch (dificuldade) {
					case 1:
						if(l<3) {
							soma+= i1.Jogar1(b[l],j[l]);
							l++;
						}else
							if(l>=3) {
								System.out.println("O sistema não possui mais jogos(dificuldade normal) disponíveis. ");
								break;
							}
						break;
					case 2:
						if(m<2) {
							soma+= i1.Jogar1(e[m],h[m]);
							m++;
						}else
							if(m>=2) {
								System.out.println("O sistema não possui mais jogos(dificuldade normal) disponíveis. ");
								break;
							}
						break;
						
					case 3:
					System.out.println("  ");
					continuar2=false;
				}
			}
				break;
						
			case 2:
				if(continuar3==true) {
				a= i1.Cadastro();
				switch (a) {
				case 1: 
					Banda[] array1 = new Banda[3];
					array1= i1.ArrayNovo1(array1);
					while(continuar4==true) {
					c= i1.menuConfirmar();
					switch(c) {
					case 1:
						System.out.println("Qual Banda deseja alterar? insira o número. ");
						g= (i1.recebeNumero())- 1;
						array1[g]= i1.AlterarB(array1[g]);
						break;
					case 2:
						System.out.println("Qual Banda deseja consultar? insira o número. ");
						g= (i1.recebeNumero())- 1;
						i1.ConsultarB(array1[g]);
						break;
					case 3:
						System.out.println("Qual Banda deseja excluir? insira o número. ");
						g= (i1.recebeNumero())- 1;
						array1[g]= null;
						break;
					case 4:
						continuar4=false;
					}
					continuar3= false;
					}
					break;
				case 2:
					Disco[] array2 = new Disco[3];
					array2= i1.ArrayNovo2(array2);
					while(continuar4==true) {
					c= i1.menuConfirmar();
					switch(c) {
					case 1:
						System.out.println("Qual Disco deseja alterar? insira o número. ");
						f= (i1.recebeNumero())- 1;
						array2[f]= i1.AlterarD(array2[f]);
						break;
					case 2:
						System.out.println("Qual Disco deseja consultar? insira o número. ");
						f= (i1.recebeNumero())- 1;
						i1.ConsultarB(array2[f]);
						break;
					case 3:
						System.out.println("Qual Disco deseja excluir? insira o número. ");
						f= (i1.recebeNumero())- 1;
						array2[f]= null;
						break;
					case 4:
						continuar4=false;
					}
					continuar3= false;
					}
					break;
				case 3: 
					continuar3= false;
				}
				break;
				}else
					System.out.println("Você já efetuou uma sugestão hoje.");
			break;	
			case 3:	
				continuar1=false;
			}
			
		}
	}
}