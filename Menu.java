package jogo;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.GridBagConstraints;
import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;



public class Menu extends JFrame{
	
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	private JButton button1, button2, button3;
	private JRadioButton[] guess; //JRadioButtons for the guesses, need to finish
	private ButtonGroup guessGroup; 
	private JPanel panel1, panel2;
	private JLabel label1, label2, label3;
	private JTextArea textArea1, textArea2;
	private String[] name = new String[10]; //names of the game objects 
	private String[] question = new String[10]; //questions
	private String[] guesses = new String[4]; //guesses
	private Data data;
	private ArrayList<GameObject> gameObject;
	private boolean newGame= true;
	private int i, j=0;
	
	
		public Menu(){
			
			
			
			layout = new GridBagLayout();
		    setLayout( layout ); 
		    constraints = new GridBagConstraints();
		    panel1 = new JPanel(new FlowLayout());
		    button1 = new JButton("Play");
		 
		    
		    button1.addActionListener(
					new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							
							//apaguei o que existia no frame anterior
							panel1.setVisible(false);
							label1.setVisible(false);
							
							gameObject= new ArrayList();
							data = new Data();
							gameObject= data.getObj();
							
							GameObject[] obj = new GameObject[10];
							for(i=0; i<10; i++){
							obj[i]= gameObject.get(i);
							}
								guesses= obj[j].getGuesses();					
							
							label2 = new JLabel(obj[j].getQuestion()); //***fix later (ajeitar as linhas)
							panel2 = new JPanel(new FlowLayout());
	
							button2 = new JButton("OK");
							button3 = new JButton("Voltar");
							panel2.add(button2);
							panel2.add(button3);
							
						
							constraints.fill = GridBagConstraints.HORIZONTAL;
							addComponent( panel2, 3, 0, 3, 1 );
						
							
							constraints.fill = GridBagConstraints.BOTH;
							addComponent(label2, 0, 0, 3, 1);
							
							
							button3.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									//apaguei o que existia no frame anterior
									textArea1.setVisible(false);
									label2.setVisible(false);
									panel2.setVisible(false);
									panel1.setVisible(true);
									label1.setVisible(true);
									
									}
								}
							);
							
							}
						
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
			
			
			
		public static void main( String[] args ){
				Menu menu = new Menu(); 
				menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				menu.setSize( 300, 150 ); // set frame size
				menu.setVisible( true ); // display frame
			} // end main
}
	
