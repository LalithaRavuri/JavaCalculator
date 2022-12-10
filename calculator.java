package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b0 = new JButton();
	
	JButton badd = new JButton();
	JButton bsub = new JButton();
	JButton bmul = new JButton();
	JButton bdiv = new JButton();
	JButton bclear = new JButton();
	JButton bdot = new JButton();
	JButton bequal = new JButton();
	
	double number1,number2,result;
	int add=0,mul=0,div=0,sub=0;
	
	public calculator() {
		
		frame.setSize(350,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
//		frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED,4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.WHITE);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.BLACK);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		b1.setPreferredSize(new Dimension(100,38));
		b1.setIcon(new ImageIcon("d:\\calculator\\imgs\\button1.png"));
		
		b2.setPreferredSize(new Dimension(100,38));
		b2.setIcon(new ImageIcon("d:\\calculator\\imgs\\button2.png"));
		
		b3.setPreferredSize(new Dimension(100,38));
		b3.setIcon(new ImageIcon("d:\\calculator\\imgs\\button3.png"));
		
		b4.setPreferredSize(new Dimension(100,38));
		b4.setIcon(new ImageIcon("d:\\calculator\\imgs\\button4.png"));
		
		b5.setPreferredSize(new Dimension(100,38));
		b5.setIcon(new ImageIcon("d:\\calculator\\imgs\\button5.png"));
		
		b6.setPreferredSize(new Dimension(100,38));
		b6.setIcon(new ImageIcon("d:\\calculator\\imgs\\button6.png"));
		
		b7.setPreferredSize(new Dimension(100,38));
		b7.setIcon(new ImageIcon("d:\\calculator\\imgs\\button7.png"));
		
		b8.setPreferredSize(new Dimension(100,38));
		b8.setIcon(new ImageIcon("d:\\calculator\\imgs\\button8.png"));
		
		b9.setPreferredSize(new Dimension(100,38));
		b9.setIcon(new ImageIcon("d:\\calculator\\imgs\\button9.png"));
		
		b0.setPreferredSize(new Dimension(100,38));
		b0.setIcon(new ImageIcon("d:\\calculator\\imgs\\button0.png"));
		
		bdot.setPreferredSize(new Dimension(100,38));
		bdot.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttondot.jpg"));
		
		badd.setPreferredSize(new Dimension(100,38));
		badd.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttonadd.jpg"));
		
		bsub.setPreferredSize(new Dimension(100,38));
		bsub.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttonsub.jpg"));
		
		bmul.setPreferredSize(new Dimension(100,38));
		bmul.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttonmul.png"));
		
		bdiv.setPreferredSize(new Dimension(100,38));
		bdiv.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttondiv.jpg"));
		
		bequal.setPreferredSize(new Dimension(100,38));
		bequal.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttonequal.jpg"));
		
		bclear.setPreferredSize(new Dimension(100,38));
		bclear.setIcon(new ImageIcon("d:\\calculator\\imgs\\buttonclear.png"));
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b0);
		panel.add(bdot);
		panel.add(badd);
		panel.add(bsub);
		panel.add(bmul);
		panel.add(bdiv);
		panel.add(bequal);
		panel.add(bclear);
		
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
		b8.addActionListener((ActionListener) this);
		b9.addActionListener((ActionListener) this);
		b0.addActionListener((ActionListener) this);
		bdot.addActionListener((ActionListener) this);
		badd.addActionListener((ActionListener) this);
		bsub.addActionListener((ActionListener) this);
		bmul.addActionListener((ActionListener) this);
		bdiv.addActionListener((ActionListener) this);
		bequal.addActionListener((ActionListener) this);
		bclear.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source =  e.getSource();
		if(source==buttonclear)
		{
			number1=0.0;
			number2=0.0;
			textarea.setText("");
		}
		if(source==b1) {
			textarea.append("1");
		}
		if(source==b2) {
			textarea.append("2");
		}
		if(source==b3) {
			textarea.append("3");
		}
		if(source==b4) {
			textarea.append("4");
		}
		if(source==b5) {
			textarea.append("5");
		}
		if(source==b6) {
			textarea.append("6");
		}
		if(source==b7) {
			textarea.append("7");
		}
		if(source==b8) {
			textarea.append("8");
		}
		if(source==b9) {
			textarea.append("9");
		}
		if(source==b0) {
			textarea.append("0");
		}
		if(source==bdot) {
			textarea.append(".");
		}
		if(source==badd) {
			number1 = number_reader();
			textarea.setText("+");
			add=1;
			div=0;
			sub=0;
			mul=0;
		}
		if(source==bdiv) {
			number1 = number_reader();
			textarea.setText("/");
			add=0;
			div=1;
			sub=0;
			mul=0;
		}
		if(source==bmul) {
			number1 = number_reader();
			textarea.setText("x");
			add=0;
			div=0;
			sub=0;
			mul=1;
		}
		if(source==bsub) {
			number1 = number_reader();
			textarea.setText("-");
			add=0;
			div=0;
			sub=1;
			mul=0;
		}
		if(source==bequal) {
			number2 = number_reader();
			if(add>0) {
				result=number1+number2;
				textarea.setText(Double.toString(result));
			}
			if(sub>0) {
				result=number1-number2;
				textarea.setText(Double.toString(result));
			}
			if(mul>0) {
				result=number1*number2;
				textarea.setText(Double.toString(result));
			}
			if(div>0) {
				result=number1/number2;
				textarea.setText(Double.toString(result));
			}
		}
		
	}
	
	public double number_reader() {
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}
}
