package compilation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.EventQueue;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.File;  
import java.io.FileNotFoundException;

import javax.jws.soap.SOAPBinding.Style;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import java.io.*;
import java.util.Scanner;
 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;

public class Analyseur_Finale {

	private JFrame frame;
	public javax.swing.JFileChooser jFileChooser2;
	 String stringValue1,stringValue2,stringValue3;
	 String buffer="";char c; String var,chaine,chaine1,sem="",sem1="",sem2="",sem3="",sem4=""; String syntax="";
	 StyledDocument sDoc, sDoc1,sDoc2;
	char[] opera = {'+','-','*','/','%','='};
   File fp;
   int i,j=0,pos=0,pos1=0;
   char alph[]= {'a','z','e','r','t','y','u','i','o','p','q','s','d','f','g','h','j','k','l','m','w','x','c','v','b','n','A','Z','E','R','T','Y'
   		,'U','I','O','P','Q','S','D','F','G','H','J','K','L','M','W','X','C','V','B','N','0','1','2','3','4','5','6','7','8','9',
   		'(',')','_',';','-','.','/','>','<','=',':',',','`'};
	
public boolean estUnEntier(String chaine) {
		try {
			Integer.parseInt(chaine);
		} catch (NumberFormatException e){
			return false;
		}

		return true;
   }
   
   public boolean estUnDouble(String chaine) {
   	double d;
 		try {
 			d=Double.valueOf(chaine);
 		} catch (NumberFormatException e){
 			return false;
 		}
  
 		return true;
     }


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Analyseur_Finale window = new Analyseur_Finale();
					window.frame.setVisible(true);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	void setColor(JPanel panel) {
		panel.setBackground(new Color(0,0,102));
		
	}
	
void resetColor(JPanel panel) {
	panel.setBackground(new Color(72,61,139));	
	}

	/**
	 * Create the application.
	 */
	public Analyseur_Finale() {
		initialize();
		 jFileChooser2.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 759, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jFileChooser2 = new javax.swing.JFileChooser();
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
	 
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 753, 507);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(279, 72, 363, 292);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JScrollPane jsp1 = new JScrollPane();
		jsp1.setBounds(0, 0, 0, 0);
		panel_1.add(jsp1);
		JTextPane t1 = new JTextPane();
		t1.setEditable(false);
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		jsp1.setViewportView(t1);
		jsp1.setBounds(0, 0, 364, 293);
		jsp1.setEnabled(false);
		jsp1.setToolTipText("");
	    
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(279, 72, 363, 292);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(0, 0, 0, 0);
		panel_2.add(jsp2);
		JTextPane t2 = new JTextPane();
		t2.setEditable(false);
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		jsp2.setViewportView(t2);
		jsp2.setBounds(0, 0, 364, 293);
		jsp2.setEnabled(false);
		jsp2.setToolTipText("");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(279, 72, 363, 292);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setBounds(0, 0, 364, 293);
		panel_3.add(jsp3);
		jsp3.setEnabled(false);
		jsp3.setToolTipText("");
		JTextPane t3 = new JTextPane();
		t3.setEditable(false);
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		jsp3.setViewportView(t3);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				setColor(panel_4) ;
			}
		});
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				 jFileChooser2.setVisible(true);
	                int returnVal;
	               returnVal = jFileChooser2.showOpenDialog(null);
	           if(returnVal == JFileChooser.APPROVE_OPTION) {
	            	  
	           }
			 
				
			 
			}
		});
		
		
		 jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	              
	            }
	        });
		panel_4.setBackground(new Color(72,61,139));
		panel_4.setBounds(10, 72, 211, 73);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Charger un fichier");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(50, 28, 115, 14);
		panel_4.add(lblNewLabel);
		
		JLabel label_3 = new JLabel(" ");
		label_3.setIcon(new ImageIcon(Analyseur_Finale.class.getResource("/compilation/rech.PNG")));
		label_3.setBounds(10, 11, 40, 51);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setBounds(10, 11, 40, 51);
		panel_4.add(label_4);
		label_4.setIcon(new ImageIcon(Analyseur_Finale.class.getResource("/compilation/icons8-search-32.png")));
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				buffer="";
				Scanner o= null;
		 		 try {
		 		 o = new Scanner(new File(jFileChooser2.getSelectedFile().getPath()));
		 		 } catch (FileNotFoundException e1) {
		 		 e1.printStackTrace();
		 		 }
		 		  while(o.hasNextLine()){
		 		   String  line = o.nextLine();
		 		
		 		
		 		 int a = line.length();
		 		 char[] c= new char[a];
		 		  
		 		 for(int h = 0; h < a;h++){
		 		      c[h] = line.charAt(h);
		 		 
		 				stringValue3 = String.valueOf(c[h]); 
		 			 
		 			 for(i = 0; i < 75; ++i) {
		 				   stringValue1 = String.valueOf(alph[i]);
		 				    
		 			    if ( stringValue1.equals(stringValue3) )
		 			    	
		 			    	buffer =buffer+stringValue3 ;
		 			   
		 			    } 
		 			  
		 			  if (  (c[h]==' ' ||  c[h]=='\n' ) &&  (buffer!="")){ 
		              
		                    var=buffer;
		                    buffer="";
		                    javax.swing.text.Style defaut =t1.getStyle("default");
		                   if (estUnEntier(var)) {
		                     	 chaine =var+":valeur entier\n";
		                	   StyledDocument sDoc = (StyledDocument)t1.getDocument();
		                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();}
		                	   catch (BadLocationException e0) { }
		                	   
		                     }
		                     	 
		                   
		                       else
		                     	 if(estUnDouble(var)) {
		                     	   	 chaine =var+":valeur réel\n";
				                	   StyledDocument sDoc = (StyledDocument)t1.getDocument();
				                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
				                	   catch (BadLocationException e23) { }
		                     		 
		                     	 }
		                      else
		                 	      switch (var)
		                 	   {
		                 	     case"Start_Program":
		                 	    	 chaine =var +": Mot reservé début d'un programme\n";
		                 	    	 
				                	   sDoc = (StyledDocument)t1.getDocument();
				                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
				                	   catch (BadLocationException e2) { }
		                 	      
		                 	    	 break;
		                 	    	 
		                 	     case "Int_Number":
		                 	    	     chaine =var +": Mot reservé déclaration d'un entier\n";
				                	     sDoc = (StyledDocument)t1.getDocument();
				                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
				                	   catch (BadLocationException e3) { }
		                 	    	  
		                 	    	 break; 
		                 	    	 
		                 	     case ":":
		                 	    	chaine =var +": caractére reservé\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e4) { }
		                 	    	 
		                 	    	 break; 
		                 	     case ",":
		                 	    	chaine =var +": caractére reservé\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e5) { }
		                 	     
		                 	    	 break; 
		                 	     case ";;":
		                 	    	chaine =var +": mot reservé\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e6) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "Real_Number":
		                 	    	chaine =var +": Mot reservé declaration d'un réel\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e7) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "--":
		                 	    	chaine =var +": mot reservé pour une condition\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e8) { }
		                 	     
		                 	     case "=":
			                 	    	chaine =var +": signe égalité\n";
				                	     sDoc = (StyledDocument)t1.getDocument();
				                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
				                	   catch (BadLocationException e7) { }
			                 	    	 
			                 	    	 break; 
		                 	    	 
		                 	    	  
		                 	     case "Else":
		                 	    	chaine =var +": mot reserver pour une condition\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e9) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "<":
		                 	    	chaine =var +": symbole inferieure\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e10) { }
		                 	    	 
		                 	    	 break; 
		                 	     case ">":
		                 	    	chaine =var +": Symbole superieure\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e11) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "End_Program":
		                 	    	chaine =var +": mot reservé pour fin du programme\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e12) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "ShowMes":
		                 	    	chaine =var +": mot reservé pour afficher un message\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e13) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "ShowVal":
		                 	    	chaine =var +": mot reserver pour afficher une valeur\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e14) { }
		                 	    	 
		                 	    	 break;
		                 	     case "If":
		                 	    	chaine =var +": mot reservé pour condition\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e15) { }
		                 	    	 
		                 	    	 break; 
		                 	     case ("Give"):
		                 	    	chaine =var +": mot resrver \n";
		                	     sDoc = (StyledDocument)t1.getDocument();
		                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
		                	   catch (BadLocationException e16) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "``":
		                 	    	chaine =var +": mot resrver pour message\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e16) { }
		                 	    	 
		                 	    	 break;
		                 	     case "//.":
		                 	    	chaine =var +": mot reserver pour les commantaires\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e17) { }
		                 	    	 
		                 	    	 
		                 	    	 break; 
		                 	     case "Start":
		                 	    	chaine =var +": mot resrvé pour le  debut\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e18) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "Finish":
		                 	    	chaine =var +": mot reservé pour la fin\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e19) { }
		                 	    	 
		                 	    	 break; 
		                 	     case "Affect":
		                 	    	chaine =var +": mot reservé pour l'affectation d'une valeur\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e20) { }
		                 	     
		                 	    	 break; 
		                 	     case "to":
		                 	    	chaine =var +": mot reservé pour l'affectation\n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e21) { }
		                 	    	 
		                 	    	 break; 
		                 	    	 
		                 	     default:
		                 	    	chaine =var +":indentificateur \n";
			                	     sDoc = (StyledDocument)t1.getDocument();
			                	   try { sDoc.insertString(pos,chaine,defaut);pos+=chaine.length();} 
			                	   catch (BadLocationException e22) { }
		                 	 
		                    
		                 	   }
		            }
		 		   }
		 		   } 
			 
				
				 
				 
				
			}
		});
		panel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setColor(panel_5) ;
			}
		});
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(72, 61, 139));
		panel_5.setBounds(10, 167, 211, 73);
		panel.add(panel_5);
		
		JLabel lblAnalyseLexicale = new JLabel("Analyse Lexicale");
		lblAnalyseLexicale.setForeground(Color.WHITE);
		lblAnalyseLexicale.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnalyseLexicale.setBounds(50, 28, 115, 14);
		panel_5.add(lblAnalyseLexicale);
		
		JLabel label_1 = new JLabel(" ");
		label_1.setIcon(new ImageIcon(Analyseur_Finale.class.getResource("/compilation/lex.PNG")));
		label_1.setBounds(10, 11, 40, 51);
		panel_5.add(label_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

	 		    panel_2.setVisible(true);
				panel_1.setVisible(false);
				 
				panel_3.setVisible(false);
				 
					buffer="";pos1=0;
				Scanner o= null;
		 		 try {
		 		 o = new Scanner(new File(jFileChooser2.getSelectedFile().getPath()));
		 		 } catch (FileNotFoundException e1) {
		 		 e1.printStackTrace();
		 		 }
		 		  while(o.hasNextLine()){
		 		      syntax="";
		 			  String  line = o.nextLine();
		 		
		 		
		 		 int a = line.length();
		 		 char[] c= new char[a];
		 		  
		 		 for(int h = 0; h < a;h++){
		 		      c[h] = line.charAt(h);
		 		 
		 				stringValue3 = String.valueOf(c[h]); 
		 			 
		 			 for(i = 0; i < 75; ++i) {
		 				   stringValue1 = String.valueOf(alph[i]);
		 				    
		 			    if ( stringValue1.equals(stringValue3) )
		 			    	
		 			    	buffer =buffer+stringValue3 ;
		 			   
		 			    } 
		 			  
		 			  if (  (c[h]==' ' ||  c[h]=='\n' ) &&  (buffer!="")){ 
		              
		                    var=buffer;
		                    buffer="";
		                   
		                    
		                   if (estUnEntier(var)) {
		                	     
		                     	 chaine =var+":valeur entier\n";
		                     	 syntax=syntax+"1";
		                        }
		                     else
		                     	 if(estUnDouble(var)) {
		                     		 
		                     	   	 chaine =var+":valeur réel\n";
		                     	    syntax=syntax+"23";
				                   }
		                      else
		                 	      switch (var)
		                 	   {
		                 	     case"Start_Program":
		                 	    	 
		                 	    	 chaine =var +": Mot reservé début d'un programme\n";
		                 	    	 syntax=syntax+"6";
				                  break;
		                 	      case "Int_Number":
		                 	     
		                 	    	     chaine =var +": Mot reservé déclaration d'un entier\n";
		                 	    	     syntax=syntax+"4";
				                   break; 
		                 	     case ":":
		                             chaine =var +": caractére reservé\n";
		                 	    	 syntax=syntax+"5";
			                    break; 
		                 	     case ",":
		                 	    	 
		                 	    	chaine =var +": caractére reservé\n";
		                 	    	 syntax=syntax+"3";
			                 
		                 	     
		                 	    	 break; 
		                 	     case ";;":
		                 	    	 
		                 	    	chaine =var +": mot reservé\n";
		                 	    	 syntax=syntax+"7";
			                	  
		                 	    	 
		                 	    	 break; 
		                 	     case "Real_Number":
		                 	    	 
		                 	    	chaine =var +": Mot reservé declaration d'un réel\n";
		                 	    	 syntax=syntax+"8";
			                	 
		                 	    	 
		                 	    	 break; 
		                 	     case "--":
		                 	    	 
		                 	    	chaine =var +": mot reservé pour une condition\n";
		                 	    	 syntax=syntax+"9";
			                	   
		                 	    	 
		                 	    	 break; 
		                 	    	 
		                 	    case "=":
		                 	    	 
		                 	    	chaine =var +": signe égalité\n";
		                 	    	 syntax=syntax+"40";
			                	   
		                 	    	 
		                 	    	 break; 
		                 	     case "Else":
		                 	    	 
		                 	    	chaine =var +": mot reserver pour une condition\n";
		                 	    	 syntax=syntax+"10";
			                	 
		                 	    	 
		                 	    	 break; 
		                 	     case "<":
		                 	    	 
		                 	    	chaine =var +": symbole inferieure\n";
		                 	    	 syntax=syntax+"11";
			               
		                 	    	 
		                 	    	 break; 
		                 	     case ">":
		                 	    	 
		                 	    	chaine =var +": Symbole superieure\n";
		                 	    	 syntax=syntax+"12";
			                	  
		                 	    	 
		                 	    	 break; 
		                 	     case "End_Program":
		                 	     
		                 	    	chaine =var +": mot reservé pour fin du programme\n";
		                 	    	 syntax=syntax+"13";
			                	     
		                 	    	 
		                 	    	 break; 
		                 	     case "ShowMes":
		                 	     
		                 	    	chaine =var +": mot reservé pour afficher un message\n";
		                 	    	 syntax=syntax+"s";
			                	 
		                 	    	 
		                 	    	 break; 
		                 	     case "ShowVal":
		                 	       syntax=syntax+"15";
			                         break;
		                 	     case "If":
		                 	      syntax=syntax+"16";
			                       break; 
		                 	     case ("Give"):
		                 	    	syntax=syntax+"24";
		                	      break; 
		                 	     case "``":
		                 	      syntax=syntax+"g";
			                       break;
		                 	     case "//.":
		                 	   syntax=syntax+"p";
			                       break; 
		                 	     case "Start":
		                 	      syntax=syntax+"19";
			                        break; 
		                 	     case "Finish":
		                 	    	syntax=syntax+"20";
		                 	    	  break; 
		                           case "Affect":
		                 	        syntax=syntax+"21";
			                         break; 
		                 	     case "to":
		                 	        syntax=syntax+"22";
			                         break; 
		                 	    	 
		                 	     default:
		                         syntax=syntax+"2";
			                   
		                 	   }//if(var.equals("//.")) break;
		            }
		 			  
		 			  
		 	   	      }  /*---------fin for---------*/
		 		
		 		 
		 		 javax.swing.text.Style defaut1 =t2.getStyle("default");
		 		System.out.print(syntax +" \n");
		 		
		 		int a1 = syntax.length();
		 		 ;
		 		
		 		char[] tab = new char[a1];

		 		for(int x = 0; x < a1;x++){
		 		     tab[x] = syntax.charAt(x);
		 		  
		 		}
		 		
		 		if(tab[0]=='4' &&  tab[1]=='5'   && tab[a1-2]=='2'&& tab[a1-1]=='7')
		 		{int j1=2;boolean test=true;
		 		 while(j1<(a1-2)) {int y=j1;if(tab[y]=='2'&& tab[y+1]=='3') j1=j1+2; else {test=false;j1=a1-2; }}
		 		 if (test==true) {
		 			               chaine1= " déclaration d'entier  sans affectation\n";
		 		                   sDoc1 = (StyledDocument)t2.getDocument();
	   	                           try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
	   	                            catch (BadLocationException e22) { };}
		 		 else {
		 			chaine1= " erreur syntaxique\n";
	                   sDoc1 = (StyledDocument)t2.getDocument();
                       try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
                        catch (BadLocationException e22) { };
		 			 
		 		 }
		 		                 
		 	    }
		 		 
		 		
		 		else if(tab[0]=='8' && tab[1]=='5' &&   tab[a1-2]=='2' && tab[a1-1]=='7')
		 		{int j1=2;boolean test=true;
		 		 while(j1<(a1-2)) {int y=j1;if(tab[y]=='2'&& tab[y+1]=='3') {j1=j1+2; }else {test=false;j1=a1-2;} }
		 		 if (test==true) {
		 			               chaine1= " déclaration de réél  sans affectation\n";
		 		                   sDoc1 = (StyledDocument)t2.getDocument();
	   	                           try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
	   	                            catch (BadLocationException e22) { };
		 			 
		 		                }  
		 		else {
		 			chaine1= " erreur syntaxique\n";
	                   sDoc1 = (StyledDocument)t2.getDocument();
                       try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
                        catch (BadLocationException e22) { };
		 			 
		 		 }
		 	    }
		 		 
		 		else if(tab[0]=='s' && tab[1]=='5' &&   tab[2]=='g' && tab[a1-2]=='g' && tab[a1-1]=='7')
		 		{
		 			chaine1= "  affichage d'un message\n";
	                   sDoc1 = (StyledDocument)t2.getDocument();
                       try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
                        catch (BadLocationException e22) { };
		 		}
		 		else if(tab[0]=='p') {
		 			chaine1= "  affichage d'un commentaire\n";
	                sDoc1 = (StyledDocument)t2.getDocument();
	                try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
	                 catch (BadLocationException e22) { };
		 		}
		 		 
		 		else switch (syntax) {
		 		 case"6": {
		 		          chaine1="debut d'un programme\n";
		 		          sDoc1 = (StyledDocument)t2.getDocument();
            	          try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
            	           catch (BadLocationException e22) { };break;
		 		           }
	 			 
		 		 case"13": {
		 		            chaine1="Fin d'un programme\n";
		 		            sDoc1 = (StyledDocument)t2.getDocument();
          	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
          	             catch (BadLocationException e22) { };break;
		 		           }
		 		 case"18":{
		 		        chaine1= "commantaire\n";
		 		        sDoc1 = (StyledDocument)t2.getDocument();
          	        try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
          	        catch (BadLocationException e22) { };break;
          	          }
		 		         
		 		 case"10":{
		 		        chaine1= " sinon d'une condition\n";
		 		        sDoc1 = (StyledDocument)t2.getDocument();
       	        try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
       	        catch (BadLocationException e22) { };break;}
		 		 
		 		case"19":{
	 		        chaine1= " début d'un bloc\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
		 		case"20":{
	 		        chaine1= " fin d'un bloc\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
	 
		 		case"242517":{
	 		        chaine1= " affectation sans déclaration\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
		 		case"2425237":{
	 		        chaine1= " affectation sans déclaration\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
		 		case"16921129242517":{
	 		        chaine1= " condition if avec affectation\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
		 		case"16921229242517":{
	 		        chaine1= " condition if avec affectation\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
		 		
	 		    case"16924029242517":{
		 		        chaine1= " condition if avec affectation\n";
		 		        sDoc1 = (StyledDocument)t2.getDocument();
	   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
	   	            catch (BadLocationException e22) { };break;}
	 		    case"169240292425237":{
	 		        chaine1= " condition if avec affectation\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
	 		   case"169212292425237":{
	 		        chaine1= " condition if avec affectation\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
  	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
  	            catch (BadLocationException e22) { };break;}
	 			case"169211292425237":{
	 		        chaine1= " condition if avec affectation\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
	 			case"2122227":{
	 		        chaine1= " affectation entre variables\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
	 			case"15527":{
	 		        chaine1= " affichage d'une valeur\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
	 			
	 			default:{
	 			   chaine1= " erreur syntaxique\n";
	 		        sDoc1 = (StyledDocument)t2.getDocument();
  	            try { sDoc1.insertString(pos1,chaine1,defaut1);pos1+=chaine1.length();} 
  	            catch (BadLocationException e22) { };break;
	 			}
	 				
			 		
		 		         
			 		         }
		 		 
		 		 
		 		    
		 	 
		 		  } 
		  
				   
					 
				 
			}
		});
		panel_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setColor(panel_6) ;
			}
		});
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(72, 61, 139));
		panel_6.setBounds(10, 262, 211, 73);
		panel.add(panel_6);
		
		JLabel lblAnalyseSyntaxique = new JLabel("Analyse Syntaxique");
		lblAnalyseSyntaxique.setForeground(Color.WHITE);
		lblAnalyseSyntaxique.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnalyseSyntaxique.setBounds(50, 28, 131, 14);
		panel_6.add(lblAnalyseSyntaxique);
		
		JLabel label_6 = new JLabel(" ");
		label_6.setIcon(new ImageIcon(Analyseur_Finale.class.getResource("/compilation/syn.PNG")));
		label_6.setBounds(10, 11, 40, 51);
		panel_6.add(label_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				panel_3.setVisible(true);
				panel_2.setVisible(false);
			    panel_1.setVisible(false);
				buffer="";
				pos1=0;
			Scanner o= null;
	 		 try {
	 		 o = new Scanner(new File(jFileChooser2.getSelectedFile().getPath()));
	 		 } catch (FileNotFoundException e1) {
	 		 e1.printStackTrace();
	 		 }
	 		  while(o.hasNextLine()){
	 		      syntax="";sem="";sem1="";sem2="";int compt=1;
	 			  String  line = o.nextLine();
	 		
	 		
	 		 int a = line.length();
	 		 char[] c= new char[a];
	 		  
	 		 for(int h = 0; h < a;h++){
	 		      c[h] = line.charAt(h);
	 		 
	 				stringValue3 = String.valueOf(c[h]); 
	 			 
	 			 for(i = 0; i < 75; ++i) {
	 				   stringValue1 = String.valueOf(alph[i]);
	 				    
	 			    if ( stringValue1.equals(stringValue3) )
	 			    	
	 			    	buffer =buffer+stringValue3 ;
	 			   
	 			    } 
	 			  
	 			  if (  (c[h]==' ' ||  c[h]=='\n' ) &&  (buffer!="")){ 
	              
	                    var=buffer;
	                    buffer="";
	                   
	                    
	                   if (estUnEntier(var)) {
	                	     
	                     	 chaine =var+":valeur entier\n";
	                     	 syntax=syntax+"1";
	                     	 sem3=var+" ";
	                        }
	                     else
	                     	 if(estUnDouble(var)) {
	                     		 
	                     	   	 chaine =var+":valeur réel\n";
	                     	    syntax=syntax+"23";
	                     	   sem4=var+" ";
			                   }
	                      else
	                 	      switch (var)
	                 	   {
	                 	     case"Start_Program":
	                 	    	 
	                 	    	 chaine =var +": Mot reservé début d'un programme\n";
	                 	    	 syntax=syntax+"6";
	                 	    	 sem=sem+"{"+" ";
			                  break;
	                 	      case "Int_Number":
	                 	     
	                 	    	     chaine =var +": Mot reservé déclaration d'un entier\n";
	                 	    	     syntax=syntax+"4";
	                 	    	    sem=sem+"int"+" ";
			                   break; 
	                 	     case ":":
	                             chaine =var +": caractére reservé\n";
	                 	    	 syntax=syntax+"5";
	                 	    	 sem=sem+" ";
		                    break; 
	                 	     case ",":
	                 	    	 
	                 	    	chaine =var +": caractére reservé\n";
	                 	    	 syntax=syntax+"3";
	                 	    	 sem=sem+var+" ";
		                 
	                 	     
	                 	    	 break; 
	                 	     case ";;":
	                 	    	 
	                 	    	chaine =var +": mot reservé\n";
	                 	    	 syntax=syntax+"7";
	                 	    	 sem1=sem1+";"+" ";
		                	  
	                 	    	 
	                 	    	 break; 
	                 	     case "Real_Number":
	                 	    	 
	                 	    	chaine =var +": Mot reservé declaration d'un réel\n";
	                 	    	 syntax=syntax+"8";
	                 	    	 sem=sem+"float"+" ";
		                	 
	                 	    	 
	                 	    	 break; 
	                 	     case "--":
	                 	    	 
	                 	    	chaine =var +": mot reservé pour une condition\n";
	                 	    	 syntax=syntax+"9";
	                 	    	if(compt==1) {sem=sem+"("+" ";compt=2;}
	                 	    	else sem=sem+")"+" ";
		                	   
	                 	    	 
	                 	    	 break; 
	                 	    	 
	                 	    case "=":
	                 	    	 
	                 	    	chaine =var +": signe égalité\n";
	                 	    	 syntax=syntax+"40";
	                 	    	 sem=sem+"=="+" ";
		                	   
	                 	    	 
	                 	    	 break; 
	                 	     case "Else":
	                 	    	 
	                 	    	chaine =var +": mot reserver pour une condition\n";
	                 	    	 syntax=syntax+"10";
	                 	    	 sem=sem+"else"+" ";
		                	 
	                 	    	 
	                 	    	 break; 
	                 	     case "<":
	                 	    	 
	                 	    	chaine =var +": symbole inferieure\n";
	                 	    	 syntax=syntax+"11";
	                 	    	 sem=sem+var+" ";
		               
	                 	    	 
	                 	    	 break; 
	                 	     case ">":
	                 	    	 
	                 	    	chaine =var +": Symbole superieure\n";
	                 	    	 syntax=syntax+"12";
	                 	    	 sem=sem+var+" ";
		                	  
	                 	    	 
	                 	    	 break; 
	                 	     case "End_Program":
	                 	     
	                 	    	chaine =var +": mot reservé pour fin du programme\n";
	                 	    	 syntax=syntax+"13";
	                 	    	 sem=sem+"}"+" ";
		                	     
	                 	    	 
	                 	    	 break; 
	                 	     case "ShowMes":
	                 	     
	                 	    	chaine =var +": mot reservé pour afficher un message\n";
	                 	    	 syntax=syntax+"s";
	                 	    	 sem2="system.out.print"+" ";
		                	 
	                 	    	 
	                 	    	 break; 
	                 	     case "ShowVal":
	                 	       syntax=syntax+"15";
	                 	      sem2="system.out.print"+" ";
		                         break;
	                 	     case "If":
	                 	      syntax=syntax+"16";
	                 	     sem=sem+"if"+" ";
		                       break; 
	                 	     case ("Give"):
	                 	    	syntax=syntax+"24";
	                 	    sem=sem+" ";
	                	      break; 
	                 	     case "``":
	                 	      syntax=syntax+"g";
	                 	     sem=sem+"''"+" ";
		                       break;
	                 	     case "//.":
	                 	   syntax=syntax+"p";
	                 	  sem=sem+"//"+" ";
		                       break; 
	                 	     case "Start":
	                 	      syntax=syntax+"19";
	                 	     sem=sem+"{"+" ";
		                        break; 
	                 	     case "Finish":
	                 	    	syntax=syntax+"20";
	                 	    	 sem=sem+"}"+" ";
	                 	    	  break; 
	                           case "Affect":
	                 	        syntax=syntax+"21";
	                 	       sem=sem+" ";
		                         break; 
	                 	     case "to":
	                 	        syntax=syntax+"22";
	                 	       sem=sem+"="+" ";
		                         break; 
	                 	    	 
	                 	     default:
	                         syntax=syntax+"2";
                             sem=sem+var+" ";
		                   
	                 	   }//if(var.equals("//.")) break;
	            }
	 			  
	 			  
	 	   	      }  /*---------fin for---------*/
	 		
	 		 
	 		 javax.swing.text.Style defaut2 =t3.getStyle("default");
	 		System.out.print(syntax +" \n");
	 		
	 		int a1 = syntax.length();
	 		 ;
	 		
	 		char[] tab = new char[a1];

	 		for(int x = 0; x < a1;x++){
	 		     tab[x] = syntax.charAt(x);
	 		  
	 		}
	 		
	 		if(tab[0]=='4' &&  tab[1]=='5'   && tab[a1-2]=='2'&& tab[a1-1]=='7')
	 		{int j1=2;boolean test=true;
	 		 while(j1<(a1-2)) {int y=j1;if(tab[y]=='2'&& tab[y+1]=='3') j1=j1+2; else {test=false;j1=a1-2; }}
	 		 if (test==true) {
	 			               chaine1= sem+sem1+"\n";
	 			              sDoc1 = (StyledDocument)t3.getDocument();
   	                           try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
   	                            catch (BadLocationException e22) { };}
	 		 else {
	 			chaine1= " erreur syntaxique\n";
                   sDoc1 = (StyledDocument)t3.getDocument();
                   try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
                    catch (BadLocationException e22) { };
	 			 
	 		 }
	 		                 
	 	    }
	 		 
	 		
	 		else if(tab[0]=='8' && tab[1]=='5' &&   tab[a1-2]=='2' && tab[a1-1]=='7')
	 		{int j1=2;boolean test=true;
	 		 while(j1<(a1-2)) {int y=j1;if(tab[y]=='2'&& tab[y+1]=='3') {j1=j1+2; }else {test=false;j1=a1-2;} }
	 		 if (test==true) {
	 			               chaine1= sem+sem1+"\n";
	 		                   sDoc1 = (StyledDocument)t3.getDocument();
   	                           try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
   	                            catch (BadLocationException e22) { };
	 			 
	 		                }  
	 		else {
	 			chaine1= " erreur syntaxique\n";
                   sDoc1 = (StyledDocument)t3.getDocument();
                   try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
                    catch (BadLocationException e22) { };
	 			 
	 		 }
	 	    }
	 		 
	 		else if(tab[0]=='s' && tab[1]=='5' &&   tab[2]=='g' && tab[a1-2]=='g' && tab[a1-1]=='7')
	 		{
	 			chaine1= sem2+"("+sem+")"+sem1+"\n";
                   sDoc1 = (StyledDocument)t3.getDocument();
                   try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
                    catch (BadLocationException e22) { };
	 		}
	 		
	 		else if(tab[0]=='p') {
	 			chaine1= sem+sem1+"\n";
                sDoc1 = (StyledDocument)t3.getDocument();
                try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
                 catch (BadLocationException e22) { };
	 		}
	 		 
	 		else switch (syntax) {
	 		 case"6": {
	 		          chaine1=sem+sem1+"\n";
	 		          sDoc1 = (StyledDocument)t3.getDocument();
        	          try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
        	           catch (BadLocationException e22) { };break;
	 		           }
 			 
	 		 case"13": {
	 		            chaine1=sem+sem1+"\n";
	 		            sDoc1 = (StyledDocument)t3.getDocument();
      	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
      	             catch (BadLocationException e22) { };break;
	 		           }
	 		  
	 		         
	 		 case"10":{
	 		        chaine1=sem+sem1+ "\n";
	 		        sDoc1 = (StyledDocument)t3.getDocument();
   	        try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
   	        catch (BadLocationException e22) { };break;}
	 		 
	 		case"19":{
 		        chaine1=sem+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
	 		case"20":{
 		        chaine1= sem+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
 
	 		case"242517":{
 		        chaine1= sem+"="+sem3+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
	 		case"2425237":{
	 			chaine1= sem+"="+sem4+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
	 		case"16921129242517":{
	 			chaine1= sem+"="+sem3+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
	 		case"16921229242517":{
	 			chaine1= sem+"="+sem3+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
	 		
 		    case"16924029242517":{
 		    	chaine1= sem+"="+sem3+sem1+"\n";
	 		        sDoc1 = (StyledDocument)t3.getDocument();
   	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
   	            catch (BadLocationException e22) { };break;}
 		    case"169240292425237":{
 		    	chaine1= sem+"="+sem4+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
 		   case"169212292425237":{
 			  chaine1= sem+"="+sem4+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
 			case"169211292425237":{
 				chaine1= sem+"="+sem4+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
 			case"2122227":{
 		        chaine1= sem+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
 			case"15527":{
 				chaine1= sem2+"("+sem+")"+sem1+"\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;}
 			
 			default:{
 			   chaine1=sem+sem1+ "\n";
 		        sDoc1 = (StyledDocument)t3.getDocument();
	            try { sDoc1.insertString(pos1,chaine1,defaut2);pos1+=chaine1.length();} 
	            catch (BadLocationException e22) { };break;
 			}
 				
		 		
	 		         
		 		         }
	 		 
	 		 
	 		    
	 	 
	 		  } 
	  
			  
			 
	 
			 
				 
			}
		});
		panel_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setColor(panel_7) ;
			}
		});
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(72, 61, 139));
		panel_7.setBounds(10, 356, 211, 73);
		panel.add(panel_7);
		
		JLabel lblAnalyseSmantique = new JLabel("Analyse S\u00E9mantique");
		lblAnalyseSmantique.setForeground(Color.WHITE);
		lblAnalyseSmantique.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnalyseSmantique.setBounds(50, 28, 131, 14);
		panel_7.add(lblAnalyseSmantique);
		
		JLabel label_5 = new JLabel(" ");
		label_5.setIcon(new ImageIcon(Analyseur_Finale.class.getResource("/compilation/sem.PNG")));
		label_5.setBounds(10, 11, 40, 51);
		panel_7.add(label_5);
		
		JLabel label = new JLabel("Commandes:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 34, 98, 14);
		panel.add(label);
		
		JLabel label_2 = new JLabel("Sortie:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(279, 35, 60, 14);
		panel.add(label_2);
		
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				resetColor(panel_4) ;
				resetColor(panel_5) ;
				resetColor(panel_6) ;
				resetColor(panel_7) ;
				
			}
		});
	}
	  private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed

	        // TODO add your handling code here:
	    }
}
