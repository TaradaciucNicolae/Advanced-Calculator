package L07;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Stack;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.awt.Font;

public class CalculatorAvansatFaraIcons {

	private JFrame FrameCalculator;
	private JTextField rezultate;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorAvansatFaraIcons window = new CalculatorAvansatFaraIcons();
					window.FrameCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public CalculatorAvansatFaraIcons() {
		initialize();
	}

	public void CustomCursor() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("resources/Cursor.png"); // Extragerea imaginea
		Point pnt = new Point(0, 0); // punctul / click-ul va fi varful sagetii ( coltul din stanga sus, adica coordonatele 0,0)

		Cursor cursor = toolkit.createCustomCursor(img, pnt, "Cursor"); // crearea cursorului custom cu parametrii anteriori

		FrameCalculator.setCursor(cursor); // setarea cursorului

	}

	private void initialize() {
		FrameCalculator = new JFrame(); // Crearea frame-ului cu parametrii acestuia
		FrameCalculator.getContentPane().setBackground(new Color(64, 128, 128));
		FrameCalculator.setBounds(100, 100, 468, 347);
		FrameCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		rezultate = new JTextField(""); // Crearea unui JTextField cu parametrii acestuia
		rezultate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		rezultate.setBackground(new Color(255, 255, 255));
		rezultate.setBounds(10, 28, 324, 31);
		rezultate.setEditable(false);
		FrameCalculator.getContentPane().setLayout(null);
		FrameCalculator.getContentPane().add(rezultate);

		CustomCursor();

//		Icon icon1 = new ImageIcon("resources/delete.PNG"); // Extragerea iconitelor
//		Icon icon2 = new ImageIcon("resources/backspace.PNG");
//		Icon icon3 = new ImageIcon("resources/equal.PNG");
//		Icon icon4 = new ImageIcon("resources/paraleft.PNG");
//		Icon icon5 = new ImageIcon("resources/pararight.PNG");
//		Icon icon6 = new ImageIcon("resources/add.PNG");
//		Icon icon7 = new ImageIcon("resources/dot.PNG");
//		Icon icon8 = new ImageIcon("resources/minus.PNG");
//		Icon icon9 = new ImageIcon("resources/percent.PNG");
//		Icon icon10 = new ImageIcon("resources/slash.PNG");
//		Icon icon11 = new ImageIcon("resources/x.PNG");
//
//		Icon zero = new ImageIcon("resources/zero.PNG");
//		Icon one = new ImageIcon("resources/one.PNG");
//		Icon two = new ImageIcon("resources/two.PNG");
//		Icon three = new ImageIcon("resources/three.PNG");
//		Icon four = new ImageIcon("resources/four.PNG");
//		Icon five = new ImageIcon("resources/five.PNG");
//		Icon six = new ImageIcon("resources/six.PNG");
//		Icon seven = new ImageIcon("resources/seven.PNG");
//		Icon eight = new ImageIcon("resources/eight.PNG");
//		Icon nine = new ImageIcon("resources/nine.PNG");

		JButton button = new JButton("0"); // Crearea butoanelor si asignarea fiecarui buton cu o iconita + coordonatele si parametrii
		button.setBackground(new Color(192, 192, 192));
		button.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
		button.setBounds(118, 250, 108, 48);
		FrameCalculator.getContentPane().add(button);
		JButton button_2 = new JButton(".");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_2.setBounds(226, 250, 108, 48);
		FrameCalculator.getContentPane().add(button_2);
		JButton button_3 = new JButton("=");
		button_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		button_3.setBackground(new Color(159, 253, 216));
		button_3.setBounds(334, 250, 108, 47);
		FrameCalculator.getContentPane().add(button_3);
		JButton button_4 = new JButton("+");
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_4.setBounds(334, 202, 108, 48);
		FrameCalculator.getContentPane().add(button_4);
		JButton button_5 = new JButton("3");
		button_5.setBackground(new Color(192, 192, 192));
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_5.setBounds(226, 202, 108, 48);
		FrameCalculator.getContentPane().add(button_5);
		JButton button_6 = new JButton("2");
		button_6.setBackground(new Color(192, 192, 192));
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_6.setBounds(118, 202, 108, 48);
		FrameCalculator.getContentPane().add(button_6);
		JButton button_7 = new JButton("1");
		button_7.setBackground(new Color(192, 192, 192));
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_7.setBounds(10, 202, 108, 48);
		FrameCalculator.getContentPane().add(button_7);
		JButton button_8 = new JButton("4");
		button_8.setBackground(new Color(192, 192, 192));
		button_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_8.setBounds(10, 154, 108, 48);
		FrameCalculator.getContentPane().add(button_8);
		JButton button_9 = new JButton("5");
		button_9.setBackground(new Color(192, 192, 192));
		button_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_9.setBounds(118, 154, 108, 48);
		FrameCalculator.getContentPane().add(button_9);
		JButton button_10 = new JButton("6");
		button_10.setBackground(new Color(192, 192, 192));
		button_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_10.setBounds(226, 154, 108, 48);
		FrameCalculator.getContentPane().add(button_10);
		JButton button_11 = new JButton("/");
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_11.setBounds(334, 58, 108, 48);
		FrameCalculator.getContentPane().add(button_11);
		JButton button_12 = new JButton("x");
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_12.setBounds(334, 106, 108, 48);
		FrameCalculator.getContentPane().add(button_12);
		JButton button_13 = new JButton("-");
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_13.setBounds(334, 154, 108, 48);
		FrameCalculator.getContentPane().add(button_13);
		JButton button_14 = new JButton("9");
		button_14.setBackground(new Color(192, 192, 192));
		button_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_14.setBounds(226, 106, 108, 48);
		FrameCalculator.getContentPane().add(button_14);
		JButton button_15 = new JButton("%");
		button_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_15.setBounds(10, 250, 108, 48);
		FrameCalculator.getContentPane().add(button_15);
		JButton button_16 = new JButton(")");
		button_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_16.setBounds(226, 58, 108, 48);
		FrameCalculator.getContentPane().add(button_16);

		JButton button_17 = new JButton("(");
		button_17.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_17.setBounds(118, 58, 108, 48);
		FrameCalculator.getContentPane().add(button_17);
		JButton button_18 = new JButton("7");
		button_18.setBackground(new Color(192, 192, 192));
		button_18.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_18.setBounds(10, 106, 108, 48);
		FrameCalculator.getContentPane().add(button_18);
		JButton button_19 = new JButton("8");
		button_19.setBackground(new Color(192, 192, 192));
		button_19.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_19.setBounds(118, 106, 108, 48);
		FrameCalculator.getContentPane().add(button_19);

		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnClear.setBackground(new Color(255, 204, 204));
		btnClear.setBounds(10, 58, 108, 48);
		FrameCalculator.getContentPane().add(btnClear);

		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBackground(new Color(192, 192, 192));
		label.setBounds(10, 11, 324, 19);
		FrameCalculator.getContentPane().add(label);
		label.setOpaque(true);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBackground(new Color(253, 232, 213));
		btnBack.setBounds(334, 11, 108, 48);
		FrameCalculator.getContentPane().add(btnBack);

		ActionListener a = new ActionListener() {
			int countp = 0; // il vom folosi pentru a detecta numarul de paranteze

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == button) { // cand se apasa 0

					rezultate.setText(rezultate.getText() + "0"); 
					ParantezaNumar("0");// acoperim cazul )nr

					if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('/')) { // eroare in caz de impartire la 0
						JOptionPane.showMessageDialog(null, "Nu se poate face impartirea la 0 !", "Eroare",
								JOptionPane.ERROR_MESSAGE);
						rezultate.setText("");

					}

				}

				else if (e.getSource() == button_2) { // cand se apasa .
					try {
						comutare(); // functia de comutare
						rezultate.setText(rezultate.getText() + ".");

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introducere eronata a variabilelor !", "Eroare",
								JOptionPane.ERROR_MESSAGE); // eroare pt cazurile cand variabilele au fost introduse gresit
						rezultate.setText("");
					}

				} else if (e.getSource() == button_3) {//cand se apasa =
					try {
						label.setText(rezultate.getText() + "="); // setarea label-ului cu textul scris anterior apasarii butonului =
						String egal = calculavansat(rezultate.getText());
						rezultate.setText(egal);

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introducere eronata a variabilelor !", "Eroare",
								JOptionPane.ERROR_MESSAGE); // daca au fost introdus gresit anumite variabile, apare o eroare si se reseteaza rezultate si label
						rezultate.setText("");
						label.setText("");
					}

				} else if (e.getSource() == button_4) { // cand se apasa +

					try {
						comutare(); // se face comutare
					} catch (Exception ex) {
					}
					rezultate.setText(rezultate.getText() + "+");

					if (rezultate.getText().indexOf('+') == 0) { // daca se detecteaza + ca primul element de sir, acesta este transformat in 0+

						rezultate.setText("0+");

					}

				} else if (e.getSource() == button_5) { //cand se apasa 3 + acoperirea cazului )nr
					rezultate.setText(rezultate.getText() + "3");
					ParantezaNumar("3");
				} else if (e.getSource() == button_6) {
					rezultate.setText(rezultate.getText() + "2");
					ParantezaNumar("2");
				} else if (e.getSource() == button_7) {
					rezultate.setText(rezultate.getText() + "1");
					ParantezaNumar("1");
				} else if (e.getSource() == button_8) {
					rezultate.setText(rezultate.getText() + "4");
					ParantezaNumar("4");
				} else if (e.getSource() == button_9) {
					rezultate.setText(rezultate.getText() + "5");
					ParantezaNumar("5");
				} else if (e.getSource() == button_10) {
					rezultate.setText(rezultate.getText() + "6");
					ParantezaNumar("6");
				} else if (e.getSource() == button_11) { // cand se apasa butonul /

					try {
						comutare();
						rezultate.setText(rezultate.getText() + "/");

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introducere eronata a variabilelor !", "Eroare",
								JOptionPane.ERROR_MESSAGE);
						rezultate.setText("");
					}

				} else if (e.getSource() == button_12) { // cand se apasa butonul *

					try {
						comutare();
						rezultate.setText(rezultate.getText() + "*");

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introducere eronata a variabilelor !", "Eroare",
								JOptionPane.ERROR_MESSAGE);
						rezultate.setText("");
					}

				} else if (e.getSource() == button_13) { // cand se apasa butonul -

					try {
						comutare();
					} catch (Exception ex) {
					}
					rezultate.setText(rezultate.getText() + "-");

					if (rezultate.getText().indexOf('-') == 0) {// daca se detecteaza - ca primul element de sir, acesta este transformat in 0-

						rezultate.setText("0-");
					}

				} else if (e.getSource() == button_14) { //cand se apasa 9 + acoperirea cazului )nr
					rezultate.setText(rezultate.getText() + "9");
					ParantezaNumar("9");
				} else if (e.getSource() == button_15) {//cand se apasa %

					try {
						comutare();
						rezultate.setText(rezultate.getText() + "%");

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introducere eronata a variabilelor !", "Eroare",
								JOptionPane.ERROR_MESSAGE);
						rezultate.setText("");
					}

				} else if (e.getSource() == button_16) { //cand se se apasa )

					if (countp >= 1 && rezultate.getText().charAt(rezultate.getText().length() - 1) != ('(')) {// se verifica daca a fost pusa o paranteza anterior prin countp
																											   // se verifica daca ultimul caracter nu este (
						rezultate.setText(rezultate.getText() + ")");
						countp--;

					} else {
						JOptionPane.showMessageDialog(null, "Operator ) a folosit gresit !", "Eroare",
								JOptionPane.ERROR_MESSAGE);

					}
				} else if (e.getSource() == button_17) { // cand se apasa (

					rezultate.setText(rezultate.getText() + "(");
					countp++;

					try {
						if (Character.isDigit(rezultate.getText().charAt(rezultate.getText().length() - 2)) //daca apare cazul nr(
								|| rezultate.getText().charAt(rezultate.getText().length() - 2) == (')'))

						{
							rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1)); // de sterge ( si se introduce *(, avand ca rezultat final nr*(
							rezultate.setText(rezultate.getText() + "*(");
						}
					} catch (Exception x) {
					}

				} else if (e.getSource() == button_18) {
					rezultate.setText(rezultate.getText() + "7");//cand se apasa 7 + acoperirea cazului )nr
					ParantezaNumar("7");
				} else if (e.getSource() == button_19) {
					rezultate.setText(rezultate.getText() + "8");
					ParantezaNumar("8");
				} else if (e.getSource() == btnClear) { // cand se apasa Butonul "Clear", rezultate si label si countp sunt resetate
					rezultate.setText("");
					label.setText("");
					countp = 0;
				} else if (e.getSource() == btnBack) { // cand se apasa butonul " Back "

					try {
						if (rezultate.getText().charAt(rezultate.getText().length() - 1) == (')')) {//daca se sterge ) adaugam +1 la countp pentu a mentine numerotarea parantezelor corecta
							countp++;

						} else if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('(')) { // daca se sterge (, scadem 1 din countp
							countp--;

						}
						rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1));//daca nu este ( sau ), doar stergem

					} catch (Exception ex) {

						rezultate.setText("");// Cand se foloseste "Back" desi Stringul nu are elemente, vom folosi acest catch si resetarea "rezultate" pentru a evita erorile
					}
				}

				if (rezultate.getText().length() >= 35) { // daca lungimea sirului depaseste nr 35, vom primi un mesaj de atentionare
					JOptionPane.showMessageDialog(null, "Nr maxim de caractere a fost depasit !", "Eroare",
							JOptionPane.ERROR_MESSAGE);
					// rezultate.setText("");
				}
			}
		};

		button.addActionListener(a);
		button_2.addActionListener(a);
		button_3.addActionListener(a);
		button_4.addActionListener(a);
		button_5.addActionListener(a);
		button_6.addActionListener(a);
		button_7.addActionListener(a);
		button_8.addActionListener(a);
		button_9.addActionListener(a);
		button_10.addActionListener(a);
		button_11.addActionListener(a);
		button_12.addActionListener(a);
		button_13.addActionListener(a);
		button_14.addActionListener(a);
		button_15.addActionListener(a);
		button_16.addActionListener(a);
		button_17.addActionListener(a);
		button_18.addActionListener(a);
		button_19.addActionListener(a);
		btnClear.addActionListener(a);
		btnBack.addActionListener(a);

	}

	public static int prioritate(char op) { // ordinea prioritatilor pentru operatiile matematice
		if (op == '+') {
			return 1;

		} else if (op == '-') {
			return 1;

		} else if (op == '*') {
			return 2;

		} else {
			return 2;
		}
	}

	public static double operatii(double v1, double v2, char op) {
		if (op == '+') {
			return v1 + v2; // operatia matematica de adunare

		} else if (op == '-') {
			return v1 - v2;  // operatia matematica de scadere

		} else if (op == '*') {
			return v1 * v2;  // operatia matematica de inmultire

		} else {
			if (v2 == 0) {

				JOptionPane.showMessageDialog(null, "Nu se poate face impartirea la 0", "Eroare",
						JOptionPane.ERROR_MESSAGE); // Mesaj de eroare pentru cazul impartirii la 0

			} else
				return v1 / v2; // operatia matematica de impartire
		}

		return v1 / v2;
	}

	public static String calculavansat(String sir) {
		int count = 0; // va detecta daca numarul este de o cifra sau mai multe
		int countpunct=1; // va detecta daca numarul de dupa virgual mai are sau nu caractere

		Stack<Double> stivanumere = new Stack<>(); // stiva numere
		Stack<Character> stivasemne = new Stack<>(); // stiva semne

		for (int i = 0; i < sir.length(); i++) {
			char ch = sir.charAt(i); // ch este caracterul curent
			if (ch == '(') {   // daca este detectat '(', va fi pus in stiva de semne
				stivasemne.push(ch);

			} else if (ch == ')') { // daca este detectat inseamna ca numarul nu mai are cifre ( count 0 )
				count = 0;
				while (stivasemne.size() > 0 && stivasemne.peek() != '(') { // cat timp stiva mai are elemente si ultimul element nu este (
					double v2 = stivanumere.pop();
					double v1 = stivanumere.pop();

					char op = stivasemne.pop();

					double res = operatii(v1, v2, op); // operatia op cu numerele v2 si v1 ce au extrase anterior din stive
					stivanumere.push(res); // rezultatul este pus in stiva de numere

				}
				stivasemne.pop(); // este scos ultimul semn de pe stiva

			} else if (Character.isDigit(ch)) {  // daca caracterul curent este un numar

				stivanumere.push((double) (ch - '0')); // coonvertirea din caracter in numar
				if (count != 0) { //daca count !=0 inseamna ca numarul detectat are mai multe cifre
					Double a = stivanumere.pop();
					Double b = stivanumere.pop();

					if (b >= 0) {
						Double c = b * 10 + a; // in cazul in care numarul e pozitiv

						stivanumere.push(c); // se pune rezultatul pe stiva
					} else if (b < 0) {

						Double c = b * 10 - a; // in cazul in care numarul e negativ

						stivanumere.push(c); // se pune rezultatul pe stiva

					}

				}
				count++;

				while (i <= 2) { // cat timp i<=2
					if (sir.charAt(0) == '-' && Character.isDigit(sir.charAt(1))) { // daca primele caractere reprezinta un numar negativ
																					// atunci se va transfora numarul in nr negativ si va fi urcat pe stiva
						double a = stivanumere.pop();
						stivasemne.pop();
						a = -1 * a;
						stivanumere.push(a);
						break;

					} else if (sir.charAt(0) == '(' && sir.charAt(1) == '-') { // daca primele caractere reprezinta '(' si '-' 
																			
						double a = stivanumere.pop();// numarul ce urma dupa expresia (- va fi transformat in numar negativ
						stivasemne.pop();
						a = -1 * a;
						stivanumere.push(a);
						break;

					} else
						break;
				}

				while (i >= 3) { // cat timp i>=3 , daca se detecteaza (-, numarul urmator este transformat in nunmar negativ

					if (sir.charAt(i - 1) == '-' && sir.charAt(i - 2) == '(') {

						double a = stivanumere.pop();
						stivasemne.pop();
						a = -1 * a;
						stivanumere.push(a);
						break;

					} else
						break;
				}

			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') { // daca se detecteaza un semn al unei operatii
																		   
				count = 0;
				while (stivasemne.size() > 0 && stivasemne.peek() != '(' // daca stiva se semne nu e goala si ultimul element nu e (
						&& prioritate(ch) <= prioritate(stivasemne.peek())) {  // si daca prioritatea semnului curent nu e mai mare decat a ultimului semn de pe stiva
					double v2 = stivanumere.pop();
					double v1 = stivanumere.pop();

					char op = stivasemne.pop();

					double res = operatii(v1, v2, op);// operatia op cu numerele v2 si v1 ce au extrase anterior din stive
					stivanumere.push(res);  // rezultatul este pus in stiva de numere

				}

				stivasemne.push(ch);

			} else if (ch == '.') {  // daca caracterul curent este un punct
				Double a = stivanumere.pop();

				double b = Double.parseDouble(Character.toString(sir.charAt(i + 1))); // urmatorul caracter din sir care este o un numar
				double val = a + b / 10; // se face calculul pentru a se afla valoarea numarului cu virgula
				stivanumere.push(val);
				i++;
				countpunct++;
				while (Character.isDigit(sir.charAt(i + 1)))// daca caracterul urmatorul este numar, acesta va fi calculat si adaugat 
				{
					i++;

					Double c = stivanumere.pop();

					double d = Double.parseDouble(Character.toString(sir.charAt(i))) /Math.pow(10,countpunct);
					
					double val2=c+d;
			
					stivanumere.push(val2);
					countpunct++;
				}
				countpunct=1;
				

			} else if (ch == '%') { // daca caracterul % se ia nr anterior si se imparte la 100
				count = 0;
				Double a = stivanumere.pop();
				Double b = a / 100;
				stivanumere.push(b);

			}
		}

		while (stivasemne.size() > 0) { //daca stiva se semne nu este goala, se calculeaza in continuare
			Double v2 = stivanumere.pop();
			Double v1 = stivanumere.pop();

			char op = stivasemne.pop();

			double res = operatii(v1, v2, op); // operatia op cu numerele v2 si v1 ce au extrase anterior din stive
			stivanumere.push(res);         // rezultatul este pus in stiva de numere
		}

		double finalres = stivanumere.pop(); // ultimul element ramas in stiva de numere este rezultatul final

		String rezfinal = String.valueOf(finalres); // rezultatul este convertit din Double in String

		if (rezfinal == "Infinity" || rezfinal == "NaN")  // In cazul in care se imparte la 0 va aparea o eroare 
			rezfinal = "";                                // si vom inlocui Infinity din text field cu "", al fel si pentru cazul impartirii lui 0

		return rezfinal;

	}

	public void comutare() { //aceasta functie permite comutarea dintre semne
		//Daca am pus + si am vrut *, putem apasa *, nu e nevoie sa stergem

		if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('*')) { // la actionarea butonului unui semn, daca detecteaza * ca ultim element
			rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1)); // va sterge semnul si va fi altul introdus ulterior
		} else if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('-')) {
			rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1));
		} else if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('/')) {
			rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1));
		} else if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('+')) {
			rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1));
		}
//		else if(rezultate.getText().charAt(rezultate.getText().length()-1)==('%'))
//		{
//			rezultate.setText(rezultate.getText().substring(0, rezultate.getText ().length() - 1));
//		}
		else if (rezultate.getText().charAt(rezultate.getText().length() - 1) == ('.')) {
			rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1));
		}

	}

	public void ParantezaNumar(String s) { // aceasta functie, la momentul detectarii cazului )5, inlocuieste 5 cu *5, rezultand )*5
		try {
			if (Character.isDigit(rezultate.getText().charAt(rezultate.getText().length() - 1)) //in cazul in care ultima cifra este un numar
					&& rezultate.getText().charAt(rezultate.getText().length() - 2) == (')'))  //si penultima este  o paranteza inchisa
																							   

			{
				rezultate.setText(rezultate.getText().substring(0, rezultate.getText().length() - 1)); // vom sterge numarul
				rezultate.setText(rezultate.getText() + "*" + s); // si vom adauga semnul * si apoi numarul s

			}
		} catch (Exception x) { 
		}
	}
}
