package jogo;

public class Game {

	public int initial_points;
	public boolean correct;
	public GameObject obj;	// album, band
	public int points;
	
		public Game(int points, GameObject obj, boolean correct) {
			this.obj=obj;
			this.points=points;
			this.correct=correct;
		    this.initial_points=0;
		}
		
		public boolean Pontuacao(String answer, String guess) {
			//checks answer with what the user selected
			if(guess.equals(answer)) {
				this.correct= true;
			}else
				this.correct= false;
			//points:
				if(correct==true) {
					this.points+=300;
				}else
				if(correct==false) {
					this.points+=0;
				}
			return this.correct;
		}

		public GameObject getObj() {
			return obj;
		}

		public void setGameObject(GameObject obj) {
			this.obj = obj;
		}

		public int getPoints() {
			return points;
		}

		public void setPoints(int points) {
			this.points = points;
		}
		
	

}
