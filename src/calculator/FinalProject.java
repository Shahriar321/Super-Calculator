
package calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FinalProject extends JFrame implements ActionListener{
    private Container c;
    private Cursor cr;
    private ImageIcon icon;
    JTextField tfield,tfield2;
    JPanel buttonpanel,buttonpanel2,extrapanel;
    int k = 1, x = 0, y = 0, z = 0;
    static double m1, m2;
    char ch,cha;
    int b;
    String n;
    double temp2, temp1, result, a;
     private Font f;
     JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp,
			fac, plus, min, div, log, rec, mul, eq, addSub, dot, mr, mc, mp,
			mm, sqrt, sin, cos, tan,hex,numa,charr,Infix;
      JComboBox cb,cb1,temp,DCB;
       private String[] money={"Currecy","$_to_taka","Taka_to_$"};
       private String [] length={"Length","Mile_to_km","NouticMi_to_km"};
       private String[] tempa={"Tempareture","C_to_K","F_to_C"};
       private String [] DCM={"Deci_to_Binary","Binary_to_Deci"};
  
    FinalProject()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SuperCal");
        this.setBounds(100, 100, 500, 800);
        
        c=this.getContentPane();
        c.setLayout(null);
        
        cr=new Cursor(Cursor.HAND_CURSOR);
        f=new Font("Arial",Font.BOLD,22);
        icon=new ImageIcon(getClass().getResource("corona.jpg"));
        this.setIconImage(icon.getImage());
       
        tfield = new JTextField();
        tfield.setBounds(5, 5, 470, 40);
        tfield.setFont(f);
        tfield.setBackground(Color.BLUE);
        tfield.setForeground(Color.white);
        tfield.setHorizontalAlignment(SwingConstants.RIGHT);
        
        c.add(tfield);
        
        buttonpanel = new JPanel();
        buttonpanel.setBounds(5,50,470,200);
        buttonpanel.setLayout(new GridLayout(5, 4, 4, 4));
        
                mr = new JButton("MR");
                mr.setFont(f);
                mr.setCursor(cr);
                mr.setForeground(Color.red);
		mr.addActionListener(this);
                buttonpanel.add(mr);
                
		mc = new JButton("MC");
                mc.setFont(f);
                mc.setCursor(cr);
                mc.setForeground(Color.red);
		mc.addActionListener(this);
                buttonpanel.add(mc);

		mp = new JButton("M+");
                mp.setFont(f);
                mp.setCursor(cr);
                mp.setForeground(Color.red);
		mp.addActionListener(this);
                buttonpanel.add(mp);

		mm = new JButton("M-");
                mm.setFont(f);
                mm.setCursor(cr);
                mm.setForeground(Color.red);
		mm.addActionListener(this);
                buttonpanel.add(mm);
                
                b1 = new JButton("1");
                b1.setFont(f);
                b1.setCursor(cr);
                b1.setForeground(Color.blue);
		b1.addActionListener(this);
                buttonpanel.add(b1);
                
		b2 = new JButton("2");
		buttonpanel.add(b2);
                b2.setFont(f);
                b2.setCursor(cr);
                b2.setForeground(Color.blue);
		b2.addActionListener(this);
                
		b3 = new JButton("3");
		buttonpanel.add(b3);
                b3.setFont(f);
                b3.setCursor(cr);
                b3.setForeground(Color.blue);
		b3.addActionListener(this);
                
                plus = new JButton("+");
		buttonpanel.add(plus);
                plus.setFont(f);
                plus.setCursor(cr);
                plus.setForeground(Color.red);
		plus.addActionListener(this);

		b4 = new JButton("4");
		buttonpanel.add(b4);
                b4.setFont(f);
                b4.setCursor(cr);
                b4.setForeground(Color.blue);
		b4.addActionListener(this);
                
		b5 = new JButton("5");
		
                b5.setFont(f);
                b5.setCursor(cr);
                b5.setForeground(Color.blue);
            
		b5.addActionListener(this);
                buttonpanel.add(b5);
                
		b6 = new JButton("6");
		buttonpanel.add(b6);
                b6.setFont(f);
                b6.setCursor(cr);
                b6.setForeground(Color.blue);
		b6.addActionListener(this);
                
                min = new JButton("-");
		buttonpanel.add(min);
                min.setFont(f);
                min.setCursor(cr);
                min.setForeground(Color.red);
		min.addActionListener(this);

		b7 = new JButton("7");
		buttonpanel.add(b7);
                b7.setFont(f);
                b7.setForeground(Color.blue);
                b7.setCursor(cr);
		b7.addActionListener(this);
                
		b8 = new JButton("8");
		buttonpanel.add(b8);
                b8.setFont(f);
                b8.setCursor(cr);
                b8.setForeground(Color.blue);
		b8.addActionListener(this);
                
		b9 = new JButton("9");
		buttonpanel.add(b9);
                b9.setFont(f);
                b9.setCursor(cr);
                b9.setForeground(Color.blue);
		b9.addActionListener(this);
                
		mul = new JButton("*");
		buttonpanel.add(mul);
                mul.setFont(f);
                mul.setCursor(cr);
                mul.setForeground(Color.red);
		mul.addActionListener(this);

		zero = new JButton("0");
		buttonpanel.add(zero);
                zero.setFont(f);
                zero.setCursor(cr);
                zero.setForeground(Color.blue);
		zero.addActionListener(this);
                
                dot = new JButton(".");
		buttonpanel.add(dot);
                dot.setFont(f);
                dot.setCursor(cr);
                dot.setForeground(Color.blue);
		dot.addActionListener(this);
                
                eq = new JButton("=");
		buttonpanel.add(eq);
                eq.setFont(f);
                eq.setCursor(cr);
                eq.setForeground(Color.red);
		eq.addActionListener(this);

		div = new JButton("/");
		div.addActionListener(this);
                div.setFont(f);
                div.setCursor(cr);
                div.setForeground(Color.red);
		buttonpanel.add(div);
                c.add( buttonpanel);

        buttonpanel2 = new JPanel();
        
        buttonpanel2.setBounds(5,265,470,100);
        buttonpanel2.setLayout(new GridLayout(3, 4, 4, 4));
		
                addSub = new JButton("+/-");        
		buttonpanel2.add(addSub);
                addSub.setFont(f);
                addSub.setCursor(cr);
		addSub.addActionListener(this);

		rec = new JButton("1/x");
		buttonpanel2.add(rec);
                rec.setFont(f);
                rec.setCursor(cr);
		rec.addActionListener(this);
                
		sqrt = new JButton("Sqrt");
		buttonpanel2.add(sqrt);
                sqrt.setFont(f);
                sqrt.setCursor(cr);
		sqrt.addActionListener(this);
                
		log = new JButton("log");
		buttonpanel2.add(log);
                log.setFont(f);
                log.setCursor(cr);
		log.addActionListener(this);

		sin = new JButton("SIN");
		buttonpanel2.add(sin);
                sin.setFont(f);
                sin.setCursor(cr);
		sin.addActionListener(this);
                
		cos = new JButton("COS");
		buttonpanel2.add(cos);
                cos.setFont(f);
                cos.setCursor(cr);
		cos.addActionListener(this);
                
		tan = new JButton("TAN");
		buttonpanel2.add(tan);
                tan.setFont(f);
                tan.setCursor(cr);
		tan.addActionListener(this);
                
		pow2 = new JButton("x^2");
		buttonpanel2.add(pow2);
                pow2.setFont(f);
                pow2.setCursor(cr);
		pow2.addActionListener(this);
                
		pow3 = new JButton("x^3");
		buttonpanel2.add(pow3);
                pow3.setFont(f);
                pow3.setCursor(cr);
		pow3.addActionListener(this);
                
		exp = new JButton("Exp");            
                exp.setFont(f);
                exp.setCursor(cr);
		exp.addActionListener(this);
		buttonpanel2.add(exp);
                
		fac = new JButton("n!");
                fac.setFont(f);
                fac.setCursor(cr);
		fac.addActionListener(this);
		buttonpanel2.add(fac);

		clr = new JButton("AC");
		buttonpanel2.add(clr);
                clr.setFont(f);
                clr.setCursor(cr);
                clr.setForeground(Color.red);
		clr.addActionListener(this);
                
                c.add( buttonpanel2);
                
        extrapanel = new JPanel();
        extrapanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        extrapanel.setBounds(5,375,470,800);
        //buttonpanel2.setLayout(new GridLayout(3, 4, 4, 4))
        
        cb=new JComboBox(money);
        cb.setBounds(5,395,100,50);
        cb.setFont(f);
        cb.setCursor(cr);
        cb.setForeground(Color.red);
        cb.setEditable(true);
        cb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //combo box
                String s = cb.getSelectedItem().toString();
                if (s.equals("$_to_taka")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Taka(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                else if(s.equals("Taka_to_$")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a =Doller(Double.parseDouble(tfield.getText())) ;
				tfield.setText("");
				tfield.setText(tfield.getText() +a);
			}
		}
                
            }
        
        });
        extrapanel.add(cb);
        
        cb1=new JComboBox(length);
        cb1.setBounds(5,450,100,50);
        cb1.setFont(f);
        cb1.setForeground(Color.red);
        cb1.setEditable(true);
        cb1.setCursor(cr);
        cb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //combo box
                String s = cb1.getSelectedItem().toString();
                if (s.equals("Mile_to_km")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a =MitKm(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                else if(s.equals("NouticMi_to_km")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a =Ntkm(Double.parseDouble(tfield.getText())) ;
				tfield.setText("");
				tfield.setText(tfield.getText() +a);
			}
		}
                
            }});
        extrapanel.add(cb1);
        
        temp=new JComboBox(tempa);
        temp.setBounds(5,510,100,50);
        temp.setFont(f);
        temp.setCursor(cr);
        temp.setForeground(Color.red);
        temp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //combo box
                String s = temp.getSelectedItem().toString();
                if (s.equals("C_to_K")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a =Double.parseDouble(tfield.getText());
				tfield.setText("");
                                a=a+ 273.15;//fomula

				tfield.setText(tfield.getText() + a);
			}
		}
                if(s.equals("F_to_C")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a =Double.parseDouble(tfield.getText()) ;
				tfield.setText("");
                                double d=((5*(a-32))/9);
				tfield.setText(tfield.getText() +d);
			}
		}
                
            }});
        temp.setEditable(true);
        extrapanel.add(temp);
        
        DCB=new JComboBox(DCM);
        DCB.setBounds(5,560,100,50);
        DCB.setFont(f);
        DCB.setCursor(cr);
        DCB.setForeground(Color.red);
        DCB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //combo box
                String s = DCB.getSelectedItem().toString();
                if (s.equals("Deci_to_Binary")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
                                b=Integer.parseInt(tfield.getText());		
				tfield.setText("");
                                 n=Integer.toBinaryString(b); 
				tfield.setText(tfield.getText() + n);
			}
		}
                else if(s.equals("Binary_to_Deci")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				n =tfield.getText() ;
				tfield.setText("");
                                b=Integer.parseInt(n,2);
				tfield.setText(tfield.getText() +b);
			}
		}
                
            }});
        DCB.setEditable(true);
        extrapanel.add(DCB);
        
          numa= new JButton("Numaric_to_Char");
          numa.setBounds(5,615,100,100);
          numa.setFont(f);
          numa.setCursor(cr);
          numa.setForeground(Color.red);
          numa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //combo box
                String s = e.getActionCommand();
                if (s.equals("Numaric_to_Char")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
                                b=Integer.parseInt(tfield.getText());
                               
				tfield.setText("");
                                cha=(char)b;
				tfield.setText(tfield.getText() + cha);
			}
		}
                
            }});
          extrapanel.add(numa);
          
          Infix= new JButton("Infix_to_Postfix");
          Infix.setBounds(5,615,100,100);
          Infix.setFont(f);
          Infix.setCursor(cr);
          Infix.setForeground(Color.red);
          Infix.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //combo box
                String s = e.getActionCommand();
                if (s.equals("Infix_to_Postfix")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
                                
				//tfield.setText("");
                                String exp=infixToPostfix(tfield.getText());
				tfield.setText(exp) ;
			}
		}
                
            }});
          extrapanel.add(Infix);
          
          c.add( extrapanel);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
                //The action command identifies the button. Thus, when using two or more buttons within the same application, 
                //the action command gives you an easy way to determine which button was pressed.
                if (s.equals("1")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "1");
			} 
                        else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "1");
				z = 0;
			}
                }
                if (s.equals("2")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "2");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "3");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "4");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "5");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "6");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "7");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "8");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "9");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "0");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "0");
				z = 0;
			}
		}
                if (s.equals("AC")) {
			tfield.setText("");
			x = 0;
			y = 0;
			z = 0;
		}
                if (s.equals("log")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.log(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("1/x")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = 1 / Double.parseDouble(tfield.getText());
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("Exp")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.exp(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("x^2")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.pow(Double.parseDouble(tfield.getText()), 2);
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("x^3")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.pow(Double.parseDouble(tfield.getText()), 3);
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("Sqrt")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.sqrt(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("SIN")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.sin(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                if (s.equals("COS")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.cos(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
		if (s.equals("TAN")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = Math.tan(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                
                if (s.equals("+/-")) {
			if (x == 0) {
				tfield.setText("-" + tfield.getText());
				x = 1;
			} else {
				tfield.setText(tfield.getText());
			}
		}
                if (s.equals(".")) {
			if (y == 0) {
				tfield.setText(tfield.getText() + ".");
				y = 1;
			} else {
				tfield.setText(tfield.getText());
			}
		}
                if (s.equals("+")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp2 = 0;
				ch = '+';
			} else {
				temp2 = Double.parseDouble(tfield.getText());
				tfield.setText("");
				ch = '+';
				y = 0;
				x = 0;
			}
			tfield.requestFocus();
		}
                if (s.equals("-")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp2 = 0;
				ch = '-';
			} else {
				x = 0;
				y = 0;
				temp2 = Double.parseDouble(tfield.getText());
				tfield.setText("");
				ch = '-';
			}
			tfield.requestFocus();
		}
                if (s.equals("/")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp2 = 1;
				ch = '/';
			} else {
				x = 0;
				y = 0;
				temp2 = Double.parseDouble(tfield.getText());
				ch = '/';
				tfield.setText("");
			}
			tfield.requestFocus();
		}
                if (s.equals("*")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp2 = 1;
				ch = '*';
			} else {
				x = 0;
				y = 0;
				temp2 = Double.parseDouble(tfield.getText());
				ch = '*';
				tfield.setText("");
			}
			tfield.requestFocus();
		}
                if (s.equals("=")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				temp1 = Double.parseDouble(tfield.getText());
				switch (ch) {
				case '+':
					result = temp2 + temp1;
					break;
				case '-':
					result = temp2 - temp1;
					break;
				case '/':
					result = temp2 / temp1;
					break;
				case '*':
					result = temp2 * temp1;
					break;
				}
				tfield.setText("");
				tfield.setText(tfield.getText() + result);
				z = 1;
			}
                        
		}
                if (s.equals("MC")) {
			m1 = 0;
			tfield.setText("");
		}
                if (s.equals("MR")) {
			tfield.setText("");
			tfield.setText(tfield.getText() + m1);
		}
                if (s.equals("M+")) {
			if (k == 1) {
				m1 = Double.parseDouble(tfield.getText());
				k++;
			} else {
				m1 += Double.parseDouble(tfield.getText());
				tfield.setText("" + m1);
			}
		}
                if (s.equals("M-")) {
			if (k == 1) {
				m1 = Double.parseDouble(tfield.getText());
				k++;
			} else {
				m1 -= Double.parseDouble(tfield.getText());
				tfield.setText("" + m1);
			}
		}
                
                
                if (s.equals("n!")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				a = fact(Double.parseDouble(tfield.getText()));
				tfield.setText("");
				tfield.setText(tfield.getText() + a);
			}
		}
                
		tfield.requestFocus();
                
    }
    double fact(double x) {
		
		if (x <= 0) {
			
			return 0;
		}
		double i, re = 1;
		for (i = 2; i <= x; i += 1.0)
			re *= i;
		return re;
    } 
    double Taka(double x)
    {
        //let 1$=80 taka
        return 80*x;
    }
    double Doller(double x)
    {
        return (x/80);
    }
    double MitKm(double x)
    {
        //1 mile=1.60 km
        return (1.60*x);
    }
    double Ntkm(double x)
    {
        //1 noutical mile =1.852km
        return (1.85*x);
    }
    String infixToPostfix(String exp) 
    {
        System.out.println(exp);
        // initializing empty String 
        String result = new String(""); 
          
        // initializing empty stack 
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
             
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            
            else if (c == '(') 
                stack.push(c); 
              
           
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression";                
                else
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        System.out.println(result);
        return result; 
    }
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
    
    public static void main(String[] args) {
        FinalProject fr=new FinalProject();
        fr.setVisible(true);
       
    }
    
}

