package jogo;
import java.util.ArrayList;

public class Data {
		ArrayList<GameObject> obj = new ArrayList();
		public Data() {
			
			GameObject[] object= new GameObject[10];
			String[] name = new String[10];
			String[] tips= new String[3];
			
			name[0]="Pink Floyd";
				tips[0]="It was an English rock band formed in London in 1965. They achieved international acclaim with their progressive and psychedelic music.";
				tips[1]="";
				tips[2]="";
			
			name[1]="Kendrick Lamar";
				tips[0]="";
				tips[1]="";
				tips[2]="";
			
			name[2]="Queen";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[3]="Justin Bieber";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[4]="Aurora";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[5]="Tyler, the creator";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[6]="Arctic Monkeys";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[7]="BTS";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[8]="Dua Lipa";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			name[9]="Adele";
				tips[0]="";
				tips[1]="";
				tips[2]="";
				
			
			
			
			
			for(int i=0; i<10; i++){
			object[i]= new GameObject(name[i], tips);
			obj.add(object[i]);
			}
			
		}
}
