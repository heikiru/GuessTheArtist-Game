package jogo;

//O J++ NAO CONTABILIZA POR SE TORNAR UMA VARIAVEL ESPECIFICA DE CADA BUTTON (RESOLVER)
//MESMO MOTIVO CASO EXISTA UM WHILE, ELE VAI SER PARA SEMPRE INIFINITO E JOGO NÃO RODA, PORÉM ACREDITO QUE NÃO HAVERÁ NECESSIDADE DE WHILE***
//as textareas ainda são editáveis e precisamos mudar o tamanho

import java.awt.Dimension;
import java.awt.FlowLayout;
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.Box;

public class Menu extends JFrame{
	
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	private JButton button1, button2, button3, button4, button5, button6, button7;
	private JRadioButton[] guess; //JRadioButtons for the guesses, need to finish
	private ButtonGroup guessGroup; 
	private RadioButtonHandler radioButtonHandler;
	private JPanel panel1, panel2, panel3, panel4, panelLabel;
	private JLabel label1, label2, label3;
	private Box box;
	private JTextArea textArea1, textArea2, textArea3;
	private String[] name = new String[10]; //names of the game objects 
	private String[] question = new String[10]; //questions
	private String[] guesses = new String[4]; //guesses
	private String selected;
	private Data data;
	private Game game;
	private ArrayList<GameObject> gameObject;
	private boolean newGame= true;
	private int i, j=0;
	private boolean isCorrect;
	

	
		public Menu() {
			
			//initial menu
			layout = new GridBagLayout();
		    setLayout( layout ); 
		    constraints = new GridBagConstraints();
		    panel1 = new JPanel(new FlowLayout());
		    button1 = new JButton("Play");
		 
		    //play
		    button1.addActionListener(
					new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							//while(newGame==true) {
							
							//apaguei o que existia no frame anterior
							panel1.setVisible(false);
							label1.setVisible(false);
							
							game = new Game();
							gameObject= new ArrayList();
							data = new Data();
							gameObject= data.getObj();
							
							
							GameObject[] obj = new GameObject[10];
							for(i=0; i<10; i++){
							obj[i]= gameObject.get(i);
							}
							
							
							guesses= obj[j].getGuesses();					
						
							textArea1 = new JTextArea(obj[j].getQuestion()); //
							textArea1.setMaximumSize(new Dimension(2,95));
						
							panel2 = new JPanel(new FlowLayout());
							
							guessGroup= new ButtonGroup();
						    radioButtonHandler= new RadioButtonHandler();
						    guess = new JRadioButton[4];
		
						  for(int i=0; i<guess.length; i++) {
						  	  guess[i] = new JRadioButton(guesses[i]);
						    	  guess[i].setMaximumSize(new Dimension(95,25));
						    	  guessGroup.add(guess[i]);
						    	  guess[i].addItemListener(radioButtonHandler);
						    	  panel2.add(guess[i]);
						  }
							
		
							button2 = new JButton("OK");
							button3 = new JButton("Voltar");
							panel2.add(button2);
							panel2.add(button3);
							
						
							constraints.fill = GridBagConstraints.HORIZONTAL;
							addComponent( panel2, 4, 0, 2, 1 );
						

							constraints.fill = GridBagConstraints.BOTH;
							addComponent(textArea1, 0, 0, 2, 3);
							
							
							//check answer, new panel
							button2.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									obj[j].getName();
									isCorrect= game.Pontuacao(obj[j].getName(),selected);
									if(isCorrect==true) {
										//ACERTOU
										textArea1.setVisible(false);
										panel2.setVisible(false);
										
										
										panel4 = new JPanel();
										textArea3= new JTextArea("Yay! You got it right :D\nDo you wish to continue playing?");
										
										
										button4 = new JButton("Yes");
										button5 = new JButton("No");
										panel4.add(textArea3);
										panel4.add(button4);
										panel4.add(button5);
									    
										//continue playing
									    button4.addActionListener(
												new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														j++; //THIS.J++ DOESN'T WORK
														panel4.setVisible(false);
														textArea1.setVisible(true);
														panel2.setVisible(true);
													}
												}
											);
									    //back to initial menu
									    button5.addActionListener(
												new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														j++;
														panel4.setVisible(false);
														panel1.setVisible(true);
														label1.setVisible(true);
														newGame=false;
													}
												}
											);
										
										
										constraints.fill = GridBagConstraints.HORIZONTAL;
										addComponent( panel4, 0, 0, 3, 3 );
									}
									else {
										//ERROU
										textArea1.setVisible(false);
										panel2.setVisible(false);
										panel3 = new JPanel();
										
										textArea2= new JTextArea("Oops, incorrect!\nThe answer was: "+obj[j].getName()+"\nDo you wish to continue playing?");
										
										button6 = new JButton("Yes");
										button7 = new JButton("No");
										panel3.add(textArea2);
										panel3.add(button6);
										panel3.add(button7);
									    
										//continue playing
									    button6.addActionListener(
												new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														panel3.setVisible(false);
														j++;
														textArea1.setVisible(true);
														panel2.setVisible(true);
													}
												}
											);
									    //back to initial menu
									    button7.addActionListener(
												new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														j++;
														panel3.setVisible(false);
														panel1.setVisible(true);
														label1.setVisible(true);
														newGame=false;
													}
												}
											);
										
										addComponent(panel3, 0, 0, 1, 1 );
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
									newGame=false;
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
		  
		    
		}
	

	
		private void addComponent( Component component,
				int row, int column, int width, int height )
			{
		      constraints.gridx = column; 
		      constraints.gridy = row;
		      constraints.gridwidth = width; 
		      constraints.gridheight = height;
		      layout.setConstraints( component, constraints ); 
		      add( component ); 
			}
		private class RadioButtonHandler implements ItemListener{
			@Override
			public void itemStateChanged(ItemEvent e) {
				for(int a=0; a<4; a++) {
					if(guess[a].isSelected()){
						selected= guesses[a];
					}
					}
			}
	}

	
	public static void main( String[] args ){
		Menu menu = new Menu(); 
		menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		menu.setSize( 600, 300 ); // set frame size
		menu.setVisible( true ); // display frame
	} // end main
}
