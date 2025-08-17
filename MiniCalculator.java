import javax.swing.*;


import java.awt.*;
import java.awt.event.*;





public class MiniCalculator implements ActionListener{
	
	JButton zerobutton,sevenbutton,eightbutton,ninebutton,onebutton,twobutton,threebutton,fourbutton,fivebutton,sixbutton;
	JButton additionbutton,multiplicationbutton,divisionbutton,equalsbutton,substractionbutton,backspacebutton,clearbutton;
	JButton pointbutton,squarerootbutton;
	JLabel DisplayLabel;
	String recievedtext="",operator="nothing",lastvalue="";
	double firstinputint=0,doubleloop,i;
	JFrame jf;
	
	
	 public MiniCalculator()
		
	
	{
		
		//JFRAME CREATION
		
		jf=new JFrame("MiniCalculator");
		jf.setLayout(null);
		jf.setSize(570,560);
		jf.setVisible(true);
		jf.setLocation(100, 100);
		
		//JLABEL BOX CREATION
		
		DisplayLabel=new JLabel("Enter The Numbers  ");
		DisplayLabel.setBounds(12,12,542,60);
		jf.add(DisplayLabel);	
		DisplayLabel.setBackground(Color.white);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.black);
		DisplayLabel.setFont(new Font("Arial", Font.BOLD, 15));
		//JFRAME BG-COLOUR
		
		jf.getContentPane().setBackground(Color.black);
		
		//BUTTON CREATION
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(12,82,100,100);
		jf.add(sevenbutton);
		sevenbutton.addActionListener(this);
	
		eightbutton=new JButton("8");
		eightbutton.setBounds(122,82,100,100);
		jf.add(eightbutton);
		eightbutton.addActionListener(this);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(233,82,100,100);
		jf.add(ninebutton);
		ninebutton.addActionListener(this);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(12,192,100,100);
		jf.add(fourbutton);
		fourbutton.addActionListener(this);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(122,192,100,100);
		jf.add(fivebutton);
		fivebutton.addActionListener(this);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(233,192,100,100);
		jf.add(sixbutton);
		sixbutton.addActionListener(this);
		
		onebutton=new JButton("1");
	    onebutton.setBounds(12,302,100,100);
		jf.add(onebutton);
		onebutton.addActionListener(this);
		
		twobutton=new JButton("2");
		twobutton.setBounds(122,302,100,100);
		jf.add(twobutton);
		twobutton.addActionListener(this);
		
		threebutton=new JButton("3");
		threebutton.setBounds(233,302,100,100);
		jf.add(threebutton);
		threebutton.addActionListener(this);
		
		//OPERATORS
		
		squarerootbutton=new JButton("√");
		squarerootbutton.setBounds(455,192,100,100);
		jf.add(squarerootbutton);
		squarerootbutton.addActionListener(this);
		
		additionbutton=new JButton("+");
		additionbutton.setBounds(344,82,100,100);
		jf.add(additionbutton);
		additionbutton.addActionListener(this);
		
		substractionbutton=new JButton("-");
		substractionbutton.setBounds(344,192,100,100);
		jf.add(substractionbutton);
		substractionbutton.addActionListener(this);
		
		multiplicationbutton=new JButton("x");
		multiplicationbutton.setBounds(344,302,100,100);
		jf.add(multiplicationbutton);
		multiplicationbutton.addActionListener(this);
		
		equalsbutton=new JButton("=");
		equalsbutton.setBounds(233,412,100,100);
		jf.add(equalsbutton);
		equalsbutton.addActionListener(this);
		
		backspacebutton=new JButton("⌫");
		backspacebutton.setBounds(12,412,100,100);
		jf.add(backspacebutton);
		backspacebutton.addActionListener(this);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(122,412,100,100);
		jf.add(zerobutton);
		zerobutton.addActionListener(this);
		
		pointbutton=new JButton("•");
		pointbutton.setBounds(455,82,100,100);
		jf.add(pointbutton);
		pointbutton.addActionListener(this);
		
		
		divisionbutton=new JButton("÷");
		divisionbutton.setBounds(344,412,100,100);
		jf.add(divisionbutton);
		divisionbutton.addActionListener(this);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(16,20,45,45);
		jf.add(clearbutton);
		clearbutton.setBackground(Color.white);
		clearbutton.setBorder(null);
		clearbutton.setFont(new Font("Arial", Font. BOLD, 25));
		clearbutton.addActionListener(this);
  
		
		
        
		//BUTTON TEXT SIZE
		
		onebutton.setFont(new Font("Arial", Font. PLAIN, 40));
		twobutton.setFont(new Font("Arial", Font. PLAIN, 40));
		threebutton.setFont(new Font("Arial", Font. PLAIN, 40));
		fourbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		fivebutton.setFont(new Font("Arial", Font. PLAIN, 40));
		sixbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		sevenbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		eightbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		ninebutton.setFont(new Font("Arial", Font. PLAIN, 40));
		additionbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		substractionbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		multiplicationbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		equalsbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		divisionbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		zerobutton.setFont(new Font("Arial", Font. PLAIN, 40));
		backspacebutton.setFont(new Font("Arial", Font. PLAIN, 40));
		pointbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		squarerootbutton.setFont(new Font("Arial", Font. PLAIN, 40));
		//BUTTON COLOUR
		
		onebutton.setBackground(Color.red);
		twobutton.setBackground(Color.blue);
		threebutton.setBackground(Color.red);
		fourbutton.setBackground(Color.blue);
		fivebutton.setBackground(Color.red);
		sixbutton.setBackground(Color.blue);
		sevenbutton.setBackground(Color.red);
		eightbutton.setBackground(Color.blue);
		ninebutton.setBackground(Color.red);
		additionbutton.setBackground(Color.pink);
		substractionbutton.setBackground(Color.pink);
		multiplicationbutton.setBackground(Color.pink);
	    divisionbutton.setBackground(Color.pink);
	    backspacebutton.setBackground(Color.pink);
	    equalsbutton.setBackground(Color.pink);
	    zerobutton.setBackground(Color.red);
	    pointbutton.setBackground(Color.red);
	    squarerootbutton.setBackground(Color.blue);
		//TEXT-COLOUR ON BUTTONS
		
		onebutton.setForeground(Color.white);
		twobutton.setForeground(Color.white);
		threebutton.setForeground(Color.white);
		fourbutton.setForeground(Color.white);
		fivebutton.setForeground(Color.white);
		sixbutton.setForeground(Color.white);
		sevenbutton.setForeground(Color.white);
		eightbutton.setForeground(Color.white);
		ninebutton.setForeground(Color.white);
		zerobutton.setForeground(Color.white);
		equalsbutton.setForeground(Color.black);
		backspacebutton.setForeground(Color.black);
		divisionbutton.setForeground(Color.black);
		additionbutton.setForeground(Color.black);
		multiplicationbutton.setForeground(Color.black);
		substractionbutton.setForeground(Color.black);
		pointbutton.setForeground(Color.white);
		squarerootbutton.setForeground(Color.BLACK);
		//STATEMENT TO EXIT CODE WHEN CLOSING THE FRAME
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent button) {
		
		
		if(button.getSource() == sevenbutton)
		{
			
			recievedtext=recievedtext+7;
			DisplayLabel.setText(recievedtext);
			
		}
			
		
		else if(button.getSource()== eightbutton)
		{
			
			recievedtext=recievedtext+8;
			DisplayLabel.setText(recievedtext);
			
		}
		
		else if(button.getSource()== ninebutton)
		{
			
			recievedtext=recievedtext+9;
			DisplayLabel.setText(recievedtext);
			
		}
		
		else if(button.getSource()== sixbutton)
		{
			
			recievedtext=recievedtext+6;
			DisplayLabel.setText(recievedtext);
		
		}
		
		else if(button.getSource()== fivebutton)
		{
			
			recievedtext=recievedtext+5;
			DisplayLabel.setText(recievedtext);
			
		}
		
		else if(button.getSource()== fourbutton)
		{
			
			recievedtext=recievedtext+4;
			DisplayLabel.setText(recievedtext);
			
		}
		
		else if(button.getSource() == threebutton)
		{
			
			recievedtext=recievedtext+3;
			DisplayLabel.setText(recievedtext);
			
		}
		
		else if(button.getSource()== twobutton)
		{
			
			recievedtext=recievedtext+2;
			DisplayLabel.setText(recievedtext);
			
		}
		else if(button.getSource() == onebutton)
		{
			
			recievedtext=recievedtext+1;
			DisplayLabel.setText(recievedtext);
			
		}
		else if(button.getSource() == zerobutton)
		{
			
			recievedtext=recievedtext+0;
			DisplayLabel.setText(recievedtext);
			
		}
		else if(button.getSource()== pointbutton)
		{
			
			recievedtext=recievedtext+".";
			DisplayLabel.setText(recievedtext);
		}
		else if(button.getSource()== squarerootbutton)
		{
			
			DisplayLabel.setText("");
			if(operator.equals("nothing")||operator.equals("plus"))
			{
			firstinputint=firstinputint+Double.valueOf(recievedtext);
			}
			else if (operator.equals("minus")) {
				firstinputint=firstinputint-Double.valueOf(recievedtext);
			}
			else if (operator.equals("divide")) {
				firstinputint=firstinputint/Double.valueOf(recievedtext);
			}
			else if (operator.equals("multiply")) {
				firstinputint=firstinputint*Double.valueOf(recievedtext);
			}
			firstinputint=Math.sqrt(firstinputint);
			DisplayLabel.setText(String.valueOf(firstinputint));
			
			recievedtext="";
			operator="equal";
			
			
		}
		
		
		
		else if(button.getSource() == multiplicationbutton)
		{
			DisplayLabel.setText("");
			if(operator.equals("nothing")||operator.equals("plus"))
			{
			firstinputint=firstinputint+Double.valueOf(recievedtext);
			}
			else if (operator.equals("minus")) {
				firstinputint=firstinputint-Double.valueOf(recievedtext);
			}
			else if (operator.equals("divide")) {
				firstinputint=firstinputint/Double.valueOf(recievedtext);
			}
			else if (operator.equals("multiply")) {
				firstinputint=firstinputint*Double.valueOf(recievedtext);
			}
			
	
			recievedtext="";
			DisplayLabel.setText(recievedtext);
			operator="multiply";
		}
		else if(button.getSource() == divisionbutton)
		{
			DisplayLabel.setText("");
			if(operator.equals("nothing")||operator.equals("plus"))
			{
			firstinputint=firstinputint+Double.valueOf(recievedtext);
			}
			else if (operator.equals("minus")) {
				firstinputint=firstinputint-Double.valueOf(recievedtext);
			}
			else if (operator.equals("divide")) {
				firstinputint=firstinputint/Double.valueOf(recievedtext);
			}
			else if (operator.equals("multiply")) {
				firstinputint=firstinputint*Double.valueOf(recievedtext);
			}
	
		
			recievedtext="";
			DisplayLabel.setText(recievedtext);
			operator="divide";
		}
		else if(button.getSource() == substractionbutton)
		{
			DisplayLabel.setText("");
			if(operator.equals("nothing")||operator.equals("plus"))
			{
			firstinputint=firstinputint+Double.valueOf(recievedtext);
			}
			else if (operator.equals("minus")) {
				firstinputint=firstinputint-Double.valueOf(recievedtext);
			}
			else if (operator.equals("divide")) {
				firstinputint=firstinputint/Double.valueOf(recievedtext);
			}
			else if (operator.equals("multiply")) {
				firstinputint=firstinputint*Double.valueOf(recievedtext);
			}
			
			
			recievedtext="";
			DisplayLabel.setText(recievedtext);
			operator="minus";
		}
		else if(button.getSource() == additionbutton)
		{
			DisplayLabel.setText("");
			if(operator.equals("nothing")||operator.equals("plus"))
			{
			firstinputint=firstinputint+Double.valueOf(recievedtext);
			}
			else if (operator.equals("minus")) {
				firstinputint=firstinputint-Double.valueOf(recievedtext);
			}
			else if (operator.equals("divide")) {
				firstinputint=firstinputint/Double.valueOf(recievedtext);
			}
			else if (operator.equals("multiply")) {
				firstinputint=firstinputint*Double.valueOf(recievedtext);
			}
			recievedtext="";
			DisplayLabel.setText(recievedtext);
			operator="plus";
			
			
			
		}
		else if(button.getSource() == equalsbutton)
		{
			
			if(operator.equals("plus"))
			{
				
				firstinputint=firstinputint+Double.valueOf(recievedtext);
			}
			else if(operator.equals("minus") )
			{
			
				firstinputint=firstinputint-Double.valueOf(recievedtext);
			}
			else if(operator.equals("multiply"))
			{
				firstinputint=firstinputint*Double.valueOf(recievedtext);
			}
			else if(operator.equals("divide"))
			{
				firstinputint=firstinputint/Double.valueOf(recievedtext);
			}
			
			recievedtext="";
			DisplayLabel.setText(recievedtext);
			operator="equal";
			
			DisplayLabel.setText(String.valueOf(firstinputint));
			
		}
		else if(button.getSource() == backspacebutton)
		{
			recievedtext=recievedtext.substring(0,recievedtext.length()-1);
			DisplayLabel.setText(recievedtext);
		}
		else if(button.getSource() == clearbutton)
		{
			operator="nothing";
			recievedtext="";
			firstinputint=0;
			DisplayLabel.setText(recievedtext);
		}
	

	
}
	public static void main(String ar[])
	{
	    new MiniCalculator();
		
	}
}

