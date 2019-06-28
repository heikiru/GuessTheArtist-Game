package jogo;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;


//adaptando o antigo menu
public class Menu extends JFrame{
	
	private GridBagLayout layout; // layout of this frame
	private GridBagConstraints constraints;
	private JButton button1, button2, button3, button4, button5, button6;
	private JPanel panel1, panel2, panel3, panelText;
	private JLabel label1, label2, label3;
	private JTextArea textArea1, textArea2;
	
	
		public Menu(){
			layout = new GridBagLayout();
		    setLayout( layout ); 
		    constraints = new GridBagConstraints();
		    
		    panel1 = new JPanel(new FlowLayout());
		    button1 = new JButton("Artistas");
		    button2 = new JButton("Álbuns");
		    
		    button1.addActionListener(
					new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							//apaguei o que existia no frame anterior
							panel1.setVisible(false);
							label1.setVisible(false);
							
							textArea1= new JTextArea();
							label2 = new JLabel("dica");
							panel2 = new JPanel(new FlowLayout());
							
	
							button3 = new JButton("OK");
							button4 = new JButton("Voltar");
							panel2.add(button3);
							panel2.add(button4);
							
						
							constraints.fill = GridBagConstraints.HORIZONTAL;
							addComponent( panel2, 3, 0, 3, 1 );
						
							constraints.fill = GridBagConstraints.BOTH;
							addComponent(textArea1, 1, 0, 3, 2);
							
							constraints.fill = GridBagConstraints.BOTH;
							addComponent(label2, 0, 0, 3, 1);
							
							
							button4.addActionListener(new ActionListener() {
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
			
		    button2.addActionListener(
		    		new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							//apaguei o que existia no frame anterior
							panel1.setVisible(false);
							label1.setVisible(false);						
						
							panel3 = new JPanel(new FlowLayout());
			
							textArea2= new JTextArea();
							label3 = new JLabel("dica");
							button5 = new JButton("OK");
							button6 = new JButton("Voltar");
							panel3.add(button5);
							panel3.add(button6);
							
							constraints.fill = GridBagConstraints.HORIZONTAL;
							addComponent(panel3, 3, 0, 3, 1);
							
							constraints.fill = GridBagConstraints.BOTH;
							addComponent(textArea2, 1, 0, 3, 2);
							
							constraints.fill = GridBagConstraints.BOTH;
							addComponent(label3, 0, 0, 3, 1);
							
							button6.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									//apaguei o que existia no frame anterior
									panel3.setVisible(false);
									textArea2.setVisible(false);
									label3.setVisible(false);
									panel1.setVisible(true);
									label1.setVisible(true);
									
									}
								}
							);
							
						
						}
					}
				);
		    
		    panel1.add(button1);
		    panel1.add(button2);
		    
		    constraints.fill = GridBagConstraints.HORIZONTAL;
		    addComponent( panel1, 1, 0, 3, 1 );
		    
		    label1= new JLabel("Em qual categoria deseja jogar?");
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
	
