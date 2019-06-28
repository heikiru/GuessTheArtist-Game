package jogo;

public class Game {

	public int initial_points;
	public boolean correct;
	public GameObject obj;	// album, band
	public int points;
	
		public Game(int points, GameObject obj, boolean correct, int initial_points) {
			this.obj=obj;
			this.points=points;
			this.correct=correct;
		    this.initial_points=0;
		}
		
		public int Pontuacao(String guess) {
			if(guess.equals(obj.getName())) {
				this.correct= true;
			}else
				this.initial_points++;
				if(this.initial_points==3) {
					this.correct=false;
				}
			if(correct==true) {
				this.points=300;
			}else
			if(correct==false) {
				this.points=0;
			}
			return points;
		}

		public int getInitial_points() {
			return initial_points;
		}

		public void setInitial_points(int initial_points) {
			this.initial_points = initial_points;
		}

		public boolean isCorrect() {
			return correct;
		}

		public void setCorrect(boolean correct) {
			this.correct = correct;
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
