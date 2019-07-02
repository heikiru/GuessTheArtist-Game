package jogo;
//game objects such as album or band
public class GameObject {
	private String name;
	private String question;
	private String[] guesses;

	public GameObject(){
		
	}
	public GameObject(String name, String question, String[] guesses) {
		this.name=name;
		this.question=question;
		this.guesses=guesses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String[] getGuesses() {
		return guesses;
	}
	
	public void setGuesses(String[] guesses) {
		this.guesses = guesses;
	}

}
