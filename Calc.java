package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Calc {

	private JFrame frmCalculator;
	private JTextField textField;
	double fnum, snum;
	double result;
	String oper,answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setForeground(SystemColor.desktop);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 261, 377);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 225, 75);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(10, 97, 50, 35);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = textField.getText() +btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(70, 97, 50, 35);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(130, 97, 50, 35);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(10, 143, 50, 35);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(70, 143, 50, 35);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(130, 143, 50, 35);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(10, 189, 50, 35);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(70, 189, 50, 35);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(130, 189, 50, 35);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String EnterNumber = textField.getText() +btnPoint.getText();
					textField.setText(EnterNumber);
			}
		});
		btnPoint.setBounds(10, 235, 50, 35);
		frmCalculator.getContentPane().add(btnPoint);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(70, 235, 50, 35);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(190, 97, 50, 35);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "/";
			}
		});
		btnDiv.setBounds(190, 143, 50, 35);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnMull = new JButton("*");
		btnMull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "*";
			}
		});
		btnMull.setBounds(190, 189, 50, 35);
		frmCalculator.getContentPane().add(btnMull);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "-";
			}
		});
		btnSub.setBounds(130, 235, 50, 35);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "+";
			}
		});
		btnAdd.setBounds(190, 235, 50, 35);
		frmCalculator.getContentPane().add(btnAdd);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				snum = Double.parseDouble(textField.getText());
				switch(oper)
				{
					case "+":
						fnum = fnum +snum;
						answer = String.format("%.2f", fnum);
						textField.setText(answer);
					break;
					case "-":
						fnum = fnum - snum;
						answer = String.format("%.2f", fnum);
						textField.setText(answer);
					break;
					case "*":
						fnum = fnum * snum;
						answer = String.format("%.2f", fnum);
						textField.setText(answer);
					break;
					case "/":
						fnum = fnum / snum;
						answer = String.format("%.2f", fnum);
						textField.setText(answer);
					break;
				}
			}
		});
		btnEquals.setBounds(146, 281, 89, 23);
		frmCalculator.getContentPane().add(btnEquals);
		
		JButton btnBack = new JButton("Delete");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Bksp = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() -1);
					Bksp = str.toString();
					textField.setText(Bksp);
				}
			}
		});
		btnBack.setBounds(10, 281, 89, 23);
		frmCalculator.getContentPane().add(btnBack);
	}
}
