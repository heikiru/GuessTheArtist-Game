

public class Game {

	public boolean correct;
	public int points;
	
	public Game() {
		
	}
		public Game(int points, boolean correct) {
			this.points=points;
			this.correct=correct;
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


		public int getPoints() {
			return points;
		}

		public void setPoints(int points) {
			this.points = points;
		}
		
	

}
