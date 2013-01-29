//david lafreniere, samuel forcier

import java.awt.*;
import java.awt.event.*;
import java.io.*;

class fenetre extends Frame {

TextField mot;
Label lmot;
Label lcle;
TextField cle;
Label resultat;
Button encrypt;
Button decrypt;

    public fenetre() 
    	{
    	addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setLayout(null);
		mot  = new TextField();
		cle = new TextField();
		lmot = new Label("mot: ");
		lcle = new Label("clé: ");
		resultat = new Label();
		encrypt = new Button("Encrypter");
		decrypt = new Button("Decrypter");
		
		mot.setBounds(100,50,80,20);
        cle.setBounds(100,100,80,20);
        lmot.setBounds(50,50,80,20);
        lcle.setBounds(50,100,80,20);
        resultat.setBounds(50,150,80,20);
        encrypt.setBounds(200,50,80,20);
        decrypt.setBounds(200,100,80,20);
        add(mot);
        add(cle);
        add(lmot);
        add(lcle);
        add(resultat);
        add(encrypt);
        add(decrypt);
        setVisible(true);
        setSize(300,200);
		
		/*setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0; c.gridy = 0; c.gridheight = 1; c.gridwidth = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		add( lmot , c );
		
		c.gridx = 5; c.gridy = 0; c.gridheight = 1; c.gridwidth = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5,5,5,5);
		add( mot , c );
		
		c.gridx = 0; c.gridy = 3; c.gridheight = 1; c.gridwidth = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		add( lcle , c );
		
		c.gridx = 5; c.gridy = 3; c.gridheight = 1; c.gridwidth = 5;
		c.
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5,5,5,5);
		add( cle , c );
		
		c.gridx = 3; c.gridy = 5; c.gridheight = 1; c.gridwidth = 2;
		add( encrypt , c );
		
		c.gridx = 3; c.gridy = 7; c.gridheight = 1; c.gridwidth = 2;
		add( decrypt , c );
		
		c.gridx = 0; c.gridy = 9; c.gridheight = 1; c.gridwidth = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		add( resultat , c );*/
		
			encrypt.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiffre E = new chiffre();
				 String rep = E.encrypte(mot.getText().toString(), cle.getText().toString());
				 resultat.setText(rep);
				
			}
		});
		
		
		decrypt.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiffre D = new chiffre();
				 String rep = D.decrypte(mot.getText().toString().toUpperCase(), cle.getText().toString());
				 resultat.setText(rep);
				
			}
		});

		// Rendre la fenêtre visible (afficher)
		
		}
		public static void main( String[] args ) {
		new fenetre();
		}
			
}