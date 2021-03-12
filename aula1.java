import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
public class Licao1 extends JPanel{
	
	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;  //label é uma ferramenta que permite acrescentar texto ou imagem à janela
	JButton bt1, bt2,bt3; //botões para janela
	ImageIcon img1, img2, img3;

	public Licao1(){
		InicializarComponentes();}
	
	public void InicializarComponentes(){
		setLayout(null);
		setBackground(Color.black);
		img1 = new ImageIcon("C:\\Users\\luisf\\Desktop\\onibus-escolar.png");
		img2 = new ImageIcon("C:\\Users\\luisf\\Desktop\\brinquedo-de-trem.png");
		img3 = new ImageIcon("C:\\Users\\luisf\\Desktop\\carro-de-brinquedo.png");
		lb1 = new JLabel (img1);
		lb2 = new JLabel (img2);
		lb3 = new JLabel (img3);
		lb4 = new JLabel("Caminhão");
		lb5 = new JLabel("Trem");
		lb6 = new JLabel("Carro");
		lb7 = new JLabel("Escolha o meio de Transporte Ferroviário");
		bt1 = new JButton("A");
		bt2 = new JButton("B");
		bt3 = new JButton("C");
		lb4.setForeground(Color.orange);
		lb5.setForeground(Color.red);
		lb6.setForeground(Color.cyan);
		lb7.setForeground(Color.white);
		
		
		
		
		
		
		lb1.setBounds(50, 0, 200, 250);
		lb2.setBounds(265, 0, 200, 250);
		lb3.setBounds(470, 0, 200, 250);
		lb4.setBounds(140, 200, 150, 50);
		lb5.setBounds(325, 200, 150, 50);
		lb6.setBounds(540, 200, 150, 50);
		lb7.setBounds(200, 0,300,30);
		bt1.setBounds(75, 250, 150, 25);
		bt2.setBounds(290, 250, 150, 25);
		bt3.setBounds(500, 250, 150, 25);
		
		
		
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb5);
		add(lb6);
		add(lb7);
		add(bt1);
		add(bt2);
		add(bt3);
		add(lb4);
	}
		public static void main(String args[]){
			 JFrame frame = new JFrame("Lição 1"); //declara a classe para criar uma janela
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//método para fechar a janela
			 frame.getContentPane().add(new Licao1()); //adiciona o construtor na janela
			 frame.setBounds(400, 250, 700, 400);// define tamanho e posição da janela
			 frame.setVisible(true);//define se a janela irá ser visivel ou não
			 frame.setResizable(false);
	}
}
