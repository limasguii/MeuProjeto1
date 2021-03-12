import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula02 extends JPanel {

	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lbResp;
	JButton btCalcular;
	JTextField tx1, tx2, tx3, tx4, tx5, tx6;
	ImageIcon img1, img2;

	public Aula02() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setLayout(null);

		lb1 = new JLabel("Nome:");
		tx1 = new JTextField("");

		img1 = new ImageIcon("C:\\Users\\sidne\\Downloads\\lapis.png");
		lb7 = new JLabel(img1);

		lb2 = new JLabel("Número:");
		tx2 = new JTextField("");

		lb3 = new JLabel("Turma:");
		tx3 = new JTextField("");

		lb4 = new JLabel("Nota 1:");
		tx4 = new JTextField("");

		lb5 = new JLabel("Nota 2:");
		tx5 = new JTextField("");

		lb6 = new JLabel("Nota 3:");
		tx6 = new JTextField("");

		btCalcular = new JButton("Calcular");

		lbResp = new JLabel("");
		lbResp.setVisible(false);

		img2 = new ImageIcon("");
		lb8 = new JLabel(img2);

		lb1.setBounds(0, 10, 50, 30);
		lb2.setBounds(0, 45, 50, 25);
		lb3.setBounds(180, 45, 50, 25);
		lb4.setBounds(0, 80, 50, 25);
		lb5.setBounds(140, 80, 50, 25);
		lb6.setBounds(275, 80, 50, 25);

		lb7.setBounds(300, 0, 90, 40);
		lb8.setBounds(150, 200, 90, 70);
		lb8.setVisible(false);

		tx1.setBounds(40, 10, 250, 25);
		tx2.setBounds(50, 45, 120, 25);
		tx3.setBounds(225, 45, 155, 25);
		tx4.setBounds(45, 80, 75, 25);
		tx5.setBounds(185, 80, 75, 25);
		tx6.setBounds(320, 80, 60, 25);

		btCalcular.setBounds(150, 130, 100, 30);

		lbResp.setBounds(10, 170, 500, 25);

		lb1.setForeground(new Color(25, 25, 112));
		lb2.setForeground(new Color(25, 25, 112));
		lb3.setForeground(new Color(25, 25, 112));
		lb4.setForeground(new Color(25, 25, 112));
		lb5.setForeground(new Color(25, 25, 112));
		lb6.setForeground(new Color(25, 25, 112));

		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		add(lb7);
		add(lb8);
		add(lbResp);

		add(tx1);
		add(tx2);
		add(tx3);
		add(tx4);
		add(tx5);
		add(tx6);

		add(btCalcular);
	}

	public void definirEventos() {

		btCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lbResp.setVisible(true);

				double media1 = Double.parseDouble(tx4.getText());
				double media2 = Double.parseDouble(tx5.getText());
				double media3 = Double.parseDouble(tx6.getText());

				double media = media1 + media2 + media3;
				double mediaFinal = media / 3;
				if (mediaFinal >= 6.0) {
					String.valueOf(mediaFinal);
					lbResp.setText("O aluno(a) " + tx1.getText() + " da turma " + tx3.getText()
							+ " está APROVADO(A) com média " + mediaFinal);
					lb8.setVisible(true);
					img2 = new ImageIcon("C:\\Users\\sidne\\Downloads\\feliz.png");
					lb8.setIcon(img2);
				}
				if (mediaFinal <= 5.9 && mediaFinal >= 4.0) {
					String.valueOf(mediaFinal);
					lbResp.setText("O aluno(a) " + tx1.getText() + " da turma " + tx3.getText()
							+ " está de RECUPERAÇÃO com média " + mediaFinal);
					lb8.setVisible(true);
					img2 = new ImageIcon("C:\\Users\\sidne\\Downloads\\confuso.png");
					lb8.setIcon(img2);
				}
				if (mediaFinal <= 3.9) {
					String.valueOf(mediaFinal);
					lbResp.setText("O aluno(a) " + tx1.getText() + " da turma" + tx3.getText()
							+ " está REPROVADO(A) com média " + mediaFinal);
					lb8.setVisible(true);
					img2 = new ImageIcon("C:\\Users\\sidne\\Downloads\\bravo.png");
					lb8.setIcon(img2);
				}

			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Média do Aluno");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aula02());
		frame.setBounds(250, 250, 500, 330);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}