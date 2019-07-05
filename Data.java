package jogo;
import java.util.ArrayList;

public class Data {
		
		ArrayList<GameObject> obj = new ArrayList();
		public Data(ArrayList<GameObject> obj){
			this.obj=obj;
		}
		public Data() {
			//class that store all the game objects
			
			GameObject[] object= new GameObject[10]; //game objects
			String[] name = new String[10]; //names of the game objects 
			String[] question = new String[10]; //questions of each game object
			
			//bands/artists alike for the JRadioButtons;
			String[] guesses1 = new String[4]; 
			String[] guesses2 = new String[4];
			String[] guesses3 = new String[4];
			String[] guesses4 = new String[4];
			String[] guesses5 = new String[4];
			String[] guesses6 = new String[4];
			String[] guesses7 = new String[4];
			String[] guesses8 = new String[4];
			String[] guesses9 = new String[4];
			String[] guesses10 = new String[4];
			
			name[0]="Pink Floyd";
				question[0]="It was an English rock band formed in London in 1965. They achieved international acclaim with their progressive and psychedelic music.\nDistinguished by their philosophical lyrics, sonic experimentation, extended compositions, and elaborate live shows, they are one of the most commercially successful and influential groups in popular music history.";
					guesses1[0]="The Smiths";
					guesses1[1]="Joy Division";
					guesses1[2]="Pink Floyd";
					guesses1[3]="The Cure";
					
				object[0] = new GameObject(name[0], question[0], guesses1);
			
			name[1]="Kendrick Lamar";
				question[1]="He is an American rapper, songwriter, and record producer, regarded as one of the most skillful and successful hip hop artists of his generation. In june 2018 he was invited for his work on the Black Panther and Divergent soundtracks.";
					guesses2[0]="Tyler, the Creator";
					guesses2[1]="J. Cole";
					guesses2[2]="Drake";
					guesses2[3]="Kendrick Lamar";
					
				object[1] = new GameObject(name[1], question[1], guesses2);	
			
			name[2]="Queen";
				question[2]="They were a British rock band formed in London in 1970. reached the top of U.S. and U.K. charts with songs like \"Killer Queen,\" \"Bohemian Rhapsody,\" \"We Will Rock You\" and \"Another One Bites the Dust.\"";
					guesses3[0]="Queen";
					guesses3[1]="The Rolling Stones";
					guesses3[2]="Kiss";
					guesses3[3]="Coldplay";
					
				object[2] = new GameObject(name[2], question[2], guesses3);		
				
			name[3]="Troye Sivan";
				question[3]="He is a South African-born Australian singer, songwriter, actor, and YouTuber. ";
					guesses4[0]="Jaden Smith";
					guesses4[1]="Sam Smith";
					guesses4[2]="Troye Sivan";
					guesses4[3]="Justin Bieber";
				
				object[3] = new GameObject(name[3], question[3], guesses4);	
					
			name[4]="Aurora";
				question[4]="She is a Norwegian singer-songwriter and producer. Her debut EP Running with the Wolves was released through Decca Records in May 2015, receiving widespread approval from online music blogs and national press";
					guesses5[0]="Dua Lipa";
					guesses5[1]="Aurora";
					guesses5[2]="Sia";
					guesses5[3]="Billie Eilish";
			
				object[4] = new GameObject(name[4], question[4], guesses5);	
					
			name[5]="Tyler, the creator";
				question[5]="";
					guesses6[0]="Frank Ocean";
					guesses6[1]="Kevin Abstract";
					guesses6[2]="Tyler, the Creator";
					guesses6[3]="Childish Gambino";
				
				object[5] = new GameObject(name[5], question[5], guesses6);	
					
			name[6]="Arctic Monkeys";
				question[0]="";
					guesses7[0]="Arctic Monkeys";
					guesses7[1]="The Strokes";
					guesses7[2]="Cage the Elephant";
					guesses7[3]="The Kooks";
				
				object[6] = new GameObject(name[6], question[6], guesses7);	
					
			name[7]="BTS";
				question[0]="Originally a hip hop group, their musical style has evolved to include a wide range of genres. Their lyrics, often focused on personal and social commentary, touch on the themes of mental health, troubles of school-age youth, loss, the journey towards loving oneself, and individualism. Their work features references to literature and psychological concepts and includes an alternative universe storyline.";
					guesses8[0]="BROCKHAMPTON";
					guesses8[1]="BTS";
					guesses8[2]="Odd Future";
					guesses8[3]="Black Hippy";
				
				object[7] = new GameObject(name[7], question[7], guesses8);	
					
			name[8]="Metallica";
				question[0]="It is an American heavy metal band formed in 1981 in Los Angeles, California. The band's third album, Master of Puppets (1986), was described as one of the heaviest and most influential thrash metal albums";
					guesses9[0]="Megadeth";
					guesses9[1]="Slipknot";
					guesses9[2]="Guns'n'Roses";
					guesses9[3]="Metallica";
				
				object[8] = new GameObject(name[8], question[8], guesses9);	
					
			name[9]="Adele";
				question[0]="She is a British singer-songwriter who has sold millions of albums worldwide and won a total of 15 Grammys as well as an Oscar. Her first two albums, 19 and 21, earned her critical praise and a level of commercial success unsurpassed among her peers.";
					guesses10[0]="Whitney Houston";
					guesses10[1]="Adele";
					guesses10[2]="Lady Gaga";
					guesses10[3]="Beyonce";
				
				object[9] = new GameObject(name[9], question[9], guesses10);	
			
			
			for(int i=0; i<10; i++){
			this.obj.add(object[i]);
			}
			
		}

		public ArrayList<GameObject> getObj() {
			return obj;
		}
		public void setObj(ArrayList<GameObject> obj) {
			this.obj = obj;
		}
}
