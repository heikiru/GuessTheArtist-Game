
import java.awt.Dimension;
import java.awt.FlowLayout;
import javafx.embed.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;

public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	private JButton button1, button2, button3, button4, button5, button6, button7;
	private JRadioButton[] guess; //JRadioButtons for the guesses, need to finish
	private ButtonGroup guessGroup; 
	private RadioButtonHandler radioButtonHandler;
	private JPanel panel1, panel2, panel3, panel4, panelLabel;
	private JLabel label1, label2;
	private JTextArea textArea1, textArea2, textArea3;
	private String[] name = new String[10]; //names of the game objects 
	private String[] question = new String[10]; //questions
	private String[] guesses = new String[4]; //guesses
	private String selected;
	private Data data;
	private Game game;
	private int score;
	private ArrayList<GameObject> gameObject;
	private int i;
	public int j;
	private ArrayList<String> lines = new ArrayList<>();
	private boolean isCorrect;
	private Color bgColor, btColor;
	// private Serializer serial = new Serializer();
	
		// We will associate the music files we had downloaded before to our question array in order to 
		// actually sync the music with the question. If the user got it right, we play the music.
	
		public Menu() {
			

//			JFXPanel jfxPanel = new JFXPanel();
	
			this.j=0;
			this.score=0;
			
			bgColor= Color.white;
			btColor= Color.PINK;
			
			game = new Game();
			//initial menu
			layout = new GridBagLayout();
		    setLayout(layout); 
		    constraints = new GridBagConstraints();
		    panel1 = new JPanel(new FlowLayout());
		    panel1.setBackground(bgColor);
		    button1 = new JButton("Play");
		    button1.setBackground(btColor);
		 
		    getContentPane().setBackground(bgColor);
		    
		    //play
		    button1.addActionListener(
					new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							
							//apaguei o que existia no frame anterior
							panel1.setVisible(false);
							label1.setVisible(false);
							
							gameObject= new ArrayList<>();
							data = new Data();
							gameObject= data.getObj();
						
							final GameObject[] obj = new GameObject[10];
							for(i=0; i<10; i++){
							obj[i]= gameObject.get(i);
							}
							
							guesses= obj[Menu.this.j].getGuesses();					
							
							textArea1 = new JTextArea(obj[Menu.this.j].getQuestion()); 
							textArea1.setEditable(false);
							textArea1.setPreferredSize(new Dimension(50, 90));
							textArea1.setLineWrap(true);
							textArea1.setOpaque(false);
							textArea1.setBorder(BorderFactory.createEmptyBorder());
							textArea1.setFont(UIManager.getFont("Label.font"));
							
							panel2 = new JPanel(new FlowLayout());
							
							panel2.setBackground(bgColor);
							
							guessGroup= new ButtonGroup();
						    radioButtonHandler= new RadioButtonHandler();
						    guess = new JRadioButton[4];
		
						  for(int i=0; i<guess.length; i++) {
						  	  guess[i] = new JRadioButton(guesses[i]);
					    	  guess[i].setMaximumSize(new Dimension(95,25));
					    	  guessGroup.add(guess[i]);
					    	  guess[i].setBackground(bgColor);
					    	  guess[i].addItemListener(radioButtonHandler);
					    	  panel2.add(guess[i]);
						  }
							
						  	
							button2 = new JButton("OK");
							button2.setBackground(btColor);
							button3 = new JButton("Return");
							button3.setBackground(btColor);
							panel2.add(button2);
							panel2.add(button3);
						
							constraints.fill = GridBagConstraints.HORIZONTAL;
							addComponent(panel2, 5, 0, 3, 1);

							constraints.fill = GridBagConstraints.BOTH;
							addComponent(textArea1, 0, 0, 4, 3);
							
							//check answer, new panel
							button2.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									obj[Menu.this.j].getName();
									isCorrect= game.Pontuacao(obj[Menu.this.j].getName(), selected);
									if(isCorrect==true) {
										//ACERTOU
										textArea1.setVisible(false);
										panel2.setVisible(false);

										panel4 = new JPanel(new BorderLayout());
										panel4.setBackground(bgColor);
										textArea3= new JTextArea("Yay! You got it right :D");
										textArea3.setEditable(false);
										textArea3.setPreferredSize(new Dimension(160, 30));
										textArea3.setLineWrap(true);
										textArea3.setOpaque(false);
										textArea3.setBorder(BorderFactory.createEmptyBorder());
										textArea3.setFont(UIManager.getFont("Label.font"));
//
//										Serializer serial = new Serializer();
//										serial.addRecord(Menu.this);
//										serial.closeFile();
//										
										// button4 = new JButton("Yes");
										button5 = new JButton("OK");
										button5.setBackground(btColor);
										panel4.add(textArea3, BorderLayout.SOUTH);
										// panel4.add(button4);
										panel4.add(button5, BorderLayout.NORTH);
									    
										//continue playing
									    // button4.addActionListener(
											// 	new ActionListener() {
											// 		@Override
											// 		public void actionPerformed(ActionEvent e) {
											// 			panel4.setVisible(false);
											// 			textArea3.setVisible(false);
											// 			Menu.this.points++;
											// 			// Menu.this.j++; 
											// 			textArea1.setVisible(true);
											// 			panel2.setVisible(true);
														
											// 		}
											// 	}
											// );
									    //back to initial menu
									    button5.addActionListener(
												new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														panel4.setVisible(false);
														textArea3.setVisible(false);
														Menu.this.score++;
														Menu.this.j++;
														panel1.setVisible(true);
														label1.setVisible(true);
													}
												}
											);
										
										
										constraints.fill = GridBagConstraints.HORIZONTAL;
										addComponent(panel4, 4, 0, 3, 2);
									
										constraints.fill = GridBagConstraints.BOTH;
										addComponent(textArea3, 0, 0, 3, 3);
									}
									else {
										//ERROU
										textArea1.setVisible(false);
										panel2.setVisible(false);
										panel3 = new JPanel(new BorderLayout());
										panel3.setBackground(bgColor);
										
										textArea2= new JTextArea("Oops, incorrect!");
										textArea2.setEditable(false);
										textArea2.setPreferredSize(new Dimension(160, 30));
										textArea2.setLineWrap(true);
										textArea2.setOpaque(false);
										textArea2.setBorder(BorderFactory.createEmptyBorder());
										textArea2.setFont(UIManager.getFont("Label.font"));
										
										// button6 = new JButton("Yes");
										button7 = new JButton("Ok");
										button7.setBackground(btColor);
										// panel3.add(button6);
										panel3.add(button7, BorderLayout.SOUTH);
										panel3.add(textArea2, BorderLayout.NORTH);
									    
										
										//continue playing
									    // button6.addActionListener(
											// 	new ActionListener() {
											// 		@Override
											// 		public void actionPerformed(ActionEvent e) {
											// 			panel3.setVisible(false);
											// 			textArea2.setVisible(false);
											// 			// Menu.this.j++;
											// 			textArea1.setVisible(true);
											// 			panel2.setVisible(true);
											// 		}
											// 	}
											// );
									    //back to initial menu
									    button7.addActionListener(
												new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														panel3.setVisible(false);
														textArea2.setVisible(false);
														// Menu.this.j++
														panel1.setVisible(true);
														label1.setVisible(true);
													}
												}
											);
										
										addComponent(panel3, 0, 0, 2, 2 );
										
									}	
								}
							}
							);
							//back to initial menu
							button3.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									//apaguei o que existia no frame anterior
									textArea1.setVisible(false);
									panel2.setVisible(false);
									panel1.setVisible(true);
									label1.setVisible(true);
									}
								}
							);
							}
						
					//}
					}
				);
		    
		    panel1.add(button1);
		   
		    constraints.fill = GridBagConstraints.HORIZONTAL;
		    addComponent( panel1, 1, 0, 3, 1 );
		    
		    label1= new JLabel("Guess the Artist Game!");
		    constraints.fill= GridBagConstraints.BOTH;
		    addComponent(label1, 0, 0, 3, 1);
			 System.out.println(score);
			
			 
		}

		
	
		private void addComponent( Component component,
				int row, int column, int width, int height )
			{
		      constraints.gridx = column; 
		      constraints.gridy = row;
		      constraints.gridwidth = width; 
		      constraints.gridheight = height;
		      layout.setConstraints(component, constraints); 
		      add(component); 
			}

		private class RadioButtonHandler implements ItemListener {
			@Override
			public void itemStateChanged(ItemEvent e) {
				for(int a=0; a<4; a++) {
					if(guess[a].isSelected()){
						selected= guesses[a];
					}
				}
			}
		}

	public void setScore(int p){
		this.score = p;
	}

	public int getScore(){
		return this.score;
	}
	
	public static void main(String[] args){
		Menu menu = new Menu(); 
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setSize( 600, 300 ); // set frame size
		menu.setVisible( true ); // display frame
	} // end main



	public char[] getPoints() {
		// TODO Auto-generated method stub
		return null;
	}
}
