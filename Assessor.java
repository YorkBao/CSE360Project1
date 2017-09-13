import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.io.*;

public class Assessor extends JPanel implements ActionListener{	
	int state;
    	JLabel question;
    	JButton Op1JB, Op2JB, Op3JB;
    	JComboBox JCB;
    	JCheckBox Op1CB, Op2CB, Op3CB;
    	JOptionPane jDialog1 = null;
    	JTextField QuestionsText;
	GridBagConstraints a = new GridBagConstraints();
	JPanel panel = new JPanel(new GridBagLayout());
	
    public Assessor() {								// set state = 0
      	state = 0;
	setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
      	add(new JLabel("Zhenyu Bao"), c);
    } 
	
    public void changeState(int state) {					//
    	removeAll();
    	panel.removeAll();
    	this.setLayout(new BorderLayout());
    	if(state == 1) {
    		GridBagConstraints a = new GridBagConstraints();
    		String[] Options = {"TOM", "BOB", "HAM"};			// 3 options by JComBox for question1
            	JCB =  new JComboBox(Options);
            	JCB.addActionListener(this);
        	add(new JLabel("Question 1"), BorderLayout.NORTH);
        	panel.add(JCB, a);
        	add(panel, BorderLayout.CENTER);
        }
    	if(state == 2) {
    		Op1CB = new JCheckBox("Option 1");
    		a.fill = GridBagConstraints.VERTICAL;
    		a.gridx = 0;
    		a.gridy = 1;
    		panel.add(Op1CB, a);
    		Op2CB = new JCheckBox("Option 2");
    		a.fill = GridBagConstraints.VERTICAL;
    		a.gridx = 0;
    		a.gridy = 2;
    		panel.add(Op2CB, a);
    		Op3CB = new JCheckBox("Option 3");
    		a.fill = GridBagConstraints.VERTICAL;
    		a.gridx = 0;
    		a.gridy = 3;
    		panel.add(Op3CB, a); 	
    		Op1CB.addActionListener(this);
            	Op2CB.addActionListener(this);
            	Op3CB.addActionListener(this);
            	add(new JLabel("Question 2"), BorderLayout.NORTH);
            	add(panel, BorderLayout.CENTER);
    	}
    	if(state == 3) {
    		Op1JB = new JButton("Option 1");
    		a.fill = GridBagConstraints.VERTICAL;
    		a.gridx = 0;
    		a.gridy = 1;
    		panel.add(Op1JB, a);
    		Op2JB = new JButton("Option 2");
    		a.fill = GridBagConstraints.VERTICAL;
    		a.gridx = 0;
    		a.gridy = 2;
    		panel.add(Op2JB, a);
    		Op3JB = new JButton("Option 3");
    		a.fill = GridBagConstraints.VERTICAL;
    		a.gridx = 0;
    		a.gridy = 3;
    		panel.add(Op3JB, a);
    		Op1JB.addActionListener(this);
            Op2JB.addActionListener(this);
            Op3JB.addActionListener(this);
            
            add(new JLabel("Question 3"), BorderLayout.NORTH);
            add(panel, BorderLayout.CENTER);
    		
    	}
    	if(state == 4) {
    		
    		QuestionsText  = new JTextField(100);
    		a.weightx = 1;
    		a.gridx = 1;
    		a.fill = GridBagConstraints.HORIZONTAL;
    		a.insets = new Insets(0,50,50,0);
    		QuestionsText.addActionListener(this);
    		panel.add(QuestionsText, a);
    		add(new JLabel("Question 4"), BorderLayout.NORTH);
    		add(panel, BorderLayout.CENTER);
    	}
    }
    /* listener for Jbutton */
    public void actionPerformed(ActionEvent e){
    	if(e.getSource() == Op1JB )
    	JOptionPane.showMessageDialog(this, "Button 1 was pressed");
    	else if(e.getSource() == Op2JB )
        	JOptionPane.showMessageDialog(this, "Button 2 was pressed");
    	else if(e.getSource() == Op3JB )
        	JOptionPane.showMessageDialog(this, "Button 3 was pressed");
    	else if(e.getSource() == Op1CB )
        	JOptionPane.showMessageDialog(this, "Check box 1 was pressed");
    	else if(e.getSource() == Op2CB )
        	JOptionPane.showMessageDialog(this, "Check box 2 was pressed");
    	else if(e.getSource() == Op3CB )
        	JOptionPane.showMessageDialog(this, "Check box 3 was pressed");
    	else if(e.getSource() == JCB)
        	JOptionPane.showMessageDialog(this, JCB.getSelectedItem() + " was selected");
    	else if(e.getSource() == QuestionsText)
        	JOptionPane.showMessageDialog(this, "Text was entered");
    }
}
