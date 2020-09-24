package abc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import java.awt.Window.Type;

public class MyCalc extends JFrame {

	private JPanel contentPane;
    public String s="";
    private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc frame = new MyCalc();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MyCalc() 
	{
		setType(Type.POPUP);
		setTitle("CALCULATOR");
		setResizable(false);
		
		setBackground(new Color(175, 238, 238));
	    setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 438);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton button = new JButton("7");
		button.setBackground(new Color(240, 255, 240));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			s+="7";
			textField.setText(s);
			}
		});
		button.setBounds(10, 154, 63, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.setBackground(new Color(240, 255, 240));
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="8";
				textField.setText(s);
				}
		});
		button_1.setBounds(96, 154, 63, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBackground(new Color(240, 255, 240));
		button_2.setForeground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="9";
				textField.setText(s);
				}
		});
		button_2.setBounds(169, 154, 63, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="+";
				textField.setText(s);
				}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_3.setBackground(new Color(240, 255, 240));
		button_3.setForeground(Color.BLACK);
		button_3.setBounds(242, 154, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_4.setBackground(new Color(240, 255, 240));
		button_4.setForeground(Color.BLACK);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="4";
				textField.setText(s);
				}
		});
		button_4.setBounds(10, 209, 63, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="5";
				textField.setText(s);
				}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_5.setBackground(new Color(240, 255, 240));
		button_5.setForeground(Color.BLACK);
		button_5.setBounds(96, 209, 63, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="6";
				textField.setText(s);
				}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_6.setBackground(new Color(240, 255, 240));
		button_6.setForeground(Color.BLACK);
		button_6.setBounds(169, 209, 63, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="-";
				textField.setText(s);}
		});
		button_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_7.setBackground(new Color(240, 255, 240));
		button_7.setForeground(Color.BLACK);
		button_7.setBounds(242, 209, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="1";
				textField.setText(s);}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_8.setBackground(new Color(240, 255, 240));
		button_8.setForeground(Color.BLACK);
		button_8.setBounds(12, 259, 63, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="2";
				textField.setText(s);}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_9.setBackground(new Color(240, 255, 240));
		button_9.setForeground(Color.BLACK);
		button_9.setBounds(98, 259, 63, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="3";
				textField.setText(s);}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_10.setBackground(new Color(240, 255, 240));
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(171, 259, 63, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="*";
				textField.setText(s);}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_11.setBackground(new Color(240, 255, 240));
		button_11.setForeground(Color.BLACK);
		button_11.setBounds(244, 259, 89, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("C");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			s="";
			textField.setText(s);}
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_12.setBackground(new Color(240, 255, 240));
		button_12.setForeground(Color.BLACK);
		button_12.setBounds(10, 311, 63, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.setFont(new Font("Dialog", Font.PLAIN, 13));
		button_13.setBackground(new Color(240, 255, 240));
		button_13.setForeground(Color.BLACK);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="0";
				textField.setText(s);}
		});
		button_13.setBounds(96, 311, 63, 23);
		contentPane.add(button_13);
		
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i;
				for(i=0;i<s.length();i++)
				{
				if(s.charAt(i)=='/')
				{
				operation(i,'/');
				}}
				for(i=0;i<s.length();i++)
				{
				if(s.charAt(i)=='*')
				{
				operation(i,'*');
				}}
				for (i = 0; i < s.length(); i++) 
				{	
				
				if(s.charAt(i)=='+')
				{
				operation(i,'+');
				}
				}

				for(i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='-')
				{
				operation(i,'-');
				}}
			
				textField.setText(s);}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_14.setBackground(new Color(240, 255, 240));
		button_14.setForeground(Color.BLACK);
		button_14.setBounds(169, 311, 63, 23);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="/";
				textField.setText(s);}
		});
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_15.setBackground(new Color(240, 255, 240));
		button_15.setForeground(Color.BLACK);
		button_15.setBounds(242, 311, 89, 23);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("\u0008");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_16.setBackground(new Color(240, 255, 240));
		button_16.setForeground(Color.BLACK);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s.substring(0, s.length()-1);
				
			textField.setText(s);}
		});
		button_16.setBounds(10, 363, 96, 23);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+=".";
				textField.setText(s);}
		});
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_17.setBackground(new Color(240, 255, 240));
		button_17.setForeground(Color.BLACK);
		button_17.setBounds(130, 363, 89, 23);
		contentPane.add(button_17);
		
		JButton btnOn = new JButton("OFF");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		if(btnOn.getText()=="OFF")
			
		{
			button.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(false);
			button_3.setEnabled(false);
			button_4.setEnabled(false);
			button_5.setEnabled(false);
			button_6.setEnabled(false);
			button_7.setEnabled(false);
			button_8.setEnabled(false);
			button_9.setEnabled(false);
			button_10.setEnabled(false);
			button_11.setEnabled(false);
			button_12.setEnabled(false);
			button_13.setEnabled(false);
			button_14.setEnabled(false);
			button_15.setEnabled(false);
			button_16.setEnabled(false);
			button_17.setEnabled(false);
			btnOn.setText("ON");
		}
		else if(btnOn.getText()=="ON")
			
		{
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			button_6.setEnabled(true);
			button_7.setEnabled(true);
			button_8.setEnabled(true);
			button_9.setEnabled(true);
			button_10.setEnabled(true);
			button_11.setEnabled(true);
			button_12.setEnabled(true);
			button_13.setEnabled(true);
			button_14.setEnabled(true);
			button_15.setEnabled(true);
			button_16.setEnabled(true);
			button_17.setEnabled(true);
			btnOn.setText("OFF");
		}
			}
		});
		
		btnOn.setBounds(227, 364, 104, 23);
		contentPane.add(btnOn);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial",1,30));
		textField.setBounds(10, 11, 321, 132);
		contentPane.add(textField);
		textField.setColumns(10);
	}


	protected void operation(int index, char ch) {
		int x,y;
	  float a,b,c=0f;
		for(x=index-1;x>=0;x--)
		{
		if(s.charAt(x)=='+'||s.charAt(x)=='-'||s.charAt(x)=='*'||s.charAt(x)=='/')
		break;
		}

		for(y=index+1;y<s.length();y++)
		{
		if(s.charAt(y)=='+'||s.charAt(y)=='-'||s.charAt(y)=='*'||s.charAt(y)=='/')
		break;
		}
		a=Float.parseFloat(s.substring(x+1,index));
		b=Float.parseFloat(s.substring(index+1,y));

		if(ch=='/')
		{
		c=a/b;
		}
		else if(ch=='+')
		{
		c=a+b;
		}
		else if(ch=='-')
		{
		c=a-b;
		}
		else if(ch=='*')
		{
		c=a*b;
		}
		s=s.replace(s.substring(x+1,y),Float.toString(c));
		
		// TODO Auto-generated method stub
		
	}
}
