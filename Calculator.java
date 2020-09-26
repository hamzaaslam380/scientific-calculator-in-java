import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Calculator extends JFrame implements ActionListener {
    JTextField tf1;
    JMenu edit,view,help;
    JMenuItem i1, i2, i6,i7,i9,i10;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp, fac, plus, min, div, log, rec, mul, eq, dot, sqrt, sin, cos, tan;
    Container con;
    JPanel text,scientific,standard;
    char ch;
    double temp = 0;
    double temp1 = 0;
    double result, a;
    static double sd1;
    int num = 1;
    int x = 0;
    int y = 0;
    int z = 0;
    
    public Calculator() {
        con = getContentPane(); 
        con.setLayout(new BorderLayout());
        text = new JPanel();
        text.setLayout(new GridLayout(2,2));
        scientific = new JPanel();
        scientific.setLayout(new GridLayout(4,3));
        standard = new JPanel();
        standard.setLayout(new GridLayout(4,4));
        
        TitledBorder border = BorderFactory.createTitledBorder("Scientific");
        TitledBorder border1 = BorderFactory.createTitledBorder("Standard");
        scientific.setBorder(border);
        standard.setBorder(border1);
            
            b1 = new JButton("1");
            standard.add(b1);
            b1.addActionListener(this);
            
            b2 = new JButton("2");
            standard.add(b2);
            b2.addActionListener(this);
            
            b3 = new JButton("3");
            standard.add(b3);
            b3.addActionListener(this);

            b4 = new JButton("4");
            standard.add(b4);
            b4.addActionListener(this);
            
            b5 = new JButton("5");
            standard.add(b5);
            b5.addActionListener(this);
            
            b6 = new JButton("6");
            standard.add(b6);
            b6.addActionListener(this);

            b7 = new JButton("7");
            standard.add(b7);
            b7.addActionListener(this);
            
            b8 = new JButton("8");
            standard.add(b8);
            b8.addActionListener(this);
            
            b9 = new JButton("9");
            standard.add(b9);
            b9.addActionListener(this);

            zero = new JButton("0");
            standard.add(zero);
            zero.addActionListener(this);

            plus = new JButton("+");
            standard.add(plus);
            plus.addActionListener(this);

            min = new JButton("-");
            standard.add(min);
            min.addActionListener(this);

            mul = new JButton("*");
            standard.add(mul);
            mul.addActionListener(this);

            div = new JButton("/");
            standard.add(div);
            div.addActionListener(this);
            
            eq = new JButton("=");
            standard.add(eq);
            eq.addActionListener(this);

            dot = new JButton(".");
            standard.add(dot);
            dot.addActionListener(this);

            rec = new JButton("1/x");
            scientific.add(rec);
            rec.addActionListener(this);
            
            sqrt = new JButton("Sqrt");
            scientific.add(sqrt);
            sqrt.addActionListener(this);
            
            log = new JButton("log");
            scientific.add(log);
            log.addActionListener(this);

            sin = new JButton("SIN");
            scientific.add(sin);
            sin.addActionListener(this);
            
            cos = new JButton("COS");
            scientific.add(cos);
            cos.addActionListener(this);
            
            tan = new JButton("TAN");
            scientific.add(tan);
            tan.addActionListener(this);
            
            pow2 = new JButton("x^2");
            scientific.add(pow2);
            pow2.addActionListener(this);
            
            pow3 = new JButton("x^3");
            scientific.add(pow3);
            pow3.addActionListener(this);

            exp = new JButton("Exp");
            scientific.add(exp);
            exp.addActionListener(this);
            
            fac = new JButton("n!");
            scientific.add(fac);
            fac.addActionListener(this);
            
            clr = new JButton("AC");
            scientific.add(clr);
            clr.addActionListener(this);
            
        JMenuBar editMenu=new JMenuBar();  
        edit = new JMenu("Edit"); 
        i1=new JMenuItem("edit1");  
        i2=new JMenuItem("edit2");    
        edit.add(i1); edit.add(i2);
        editMenu.add(edit);
        text.add(editMenu);
        
        JMenuBar viewMenu=new JMenuBar();  
        view = new JMenu("View"); 
        i6=new JMenuItem("view1");  
        i7=new JMenuItem("view2");    
        view.add(i6); view.add(i7);
        viewMenu.add(view);
        editMenu.add(viewMenu);
        
        JMenuBar helpMenu=new JMenuBar();  
        help = new JMenu("Help"); 
        i9=new JMenuItem("help1");  
        i10=new JMenuItem("help2");    
        help.add(i9); help.add(i10);
        helpMenu.add(help);
        editMenu.add(helpMenu);
        
        tf1 = new JTextField(20);
        text.add(tf1);
        
        con.add("North", text);
        con.add("West", scientific);
        con.add("Center",standard);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
	String s = e.getActionCommand();
		if (s.equals("1")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "1");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "1");
				z = 0;
			}
		}
		if (s.equals("2")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "2");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "3");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "4");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "5");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "6");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "7");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "8");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "9");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				tf1.setText(tf1.getText() + "0");
			} else {
				tf1.setText("");
				tf1.setText(tf1.getText() + "0");
				z = 0;
			}
		}
		if (s.equals("AC")) {
			tf1.setText("");
			x = 0;
			y = 0;
			z = 0;
		}
		if (s.equals("log")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.log(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("1/x")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = 1 / Double.parseDouble(tf1.getText());
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("Exp")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.exp(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("x^2")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.pow(Double.parseDouble(tf1.getText()), 2);
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("x^3")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.pow(Double.parseDouble(tf1.getText()), 3);
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals(".")) {
			if (y == 0) {
				tf1.setText(tf1.getText() + ".");
				y = 1;
			} else {
				tf1.setText(tf1.getText());
			}
		}
		if (s.equals("+")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
				temp = 0;
				ch = '+';
			} else {
				temp = Double.parseDouble(tf1.getText());
				tf1.setText("");
				ch = '+';
				y = 0;
				x = 0;
			}
			tf1.requestFocus();
		}
		if (s.equals("-")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
				temp = 0;
				ch = '-';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(tf1.getText());
				tf1.setText("");
				ch = '-';
			}
			tf1.requestFocus();
		}
		if (s.equals("/")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
				temp = 1;
				ch = '/';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(tf1.getText());
				ch = '/';
				tf1.setText("");
			}
			tf1.requestFocus();
		}
		if (s.equals("*")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
				temp = 1;
				ch = '*';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(tf1.getText());
				ch = '*';
				tf1.setText("");
			}
			tf1.requestFocus();
		}
		if (s.equals("MC")) {
			sd1 = 0;
			tf1.setText("");
		}
		if (s.equals("MR")) {
			tf1.setText("");
			tf1.setText(tf1.getText() + sd1);
		}
		if (s.equals("M+")) {
			if (num == 1) {
				sd1 = Double.parseDouble(tf1.getText());
				num++;
			} else {
				sd1 += Double.parseDouble(tf1.getText());
				tf1.setText("" + sd1);
			}
		}
		if (s.equals("M-")) {
			if (num == 1) {
				sd1 = Double.parseDouble(tf1.getText());
				num++;
			} else {
				sd1 -= Double.parseDouble(tf1.getText());
				tf1.setText("" + sd1);
			}
		}
		if (s.equals("Sqrt")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.sqrt(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("SIN")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.sin(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("COS")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.cos(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		if (s.equals("TAN")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = Math.tan(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
                if (s.equals("=")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				temp1 = Double.parseDouble(tf1.getText());
				switch (ch) {
				case '+':
					result = temp + temp1;
					break;
				case '-':
					result = temp - temp1;
					break;
				case '/':
					result = temp / temp1;
					break;
				case '*':
					result = temp * temp1;
					break;
				}
				tf1.setText("");
				tf1.setText(tf1.getText() + result);
				z = 1;
			}
		}
		if (s.equals("n!")) {
			if (tf1.getText().equals("")) {
				tf1.setText("");
			} else {
				a = factorial(Double.parseDouble(tf1.getText()));
				tf1.setText("");
				tf1.setText(tf1.getText() + a);
			}
		}
		tf1.requestFocus();
	}
        double factorial(double x) {
		int tem = 0;
		if (x < 0) {
			tem = 20;
			return 0;
		}
		double i, s = 1;
		for (i = 2; i <= x; i += 1.0)
			s *= i;
		return s;
        }
}