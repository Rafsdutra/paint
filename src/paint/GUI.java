package paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	public static String selectShap = "";
	public static Color selectColor = Color.black;
	public static ArrayList<Paint> paint = new ArrayList<Paint>();
	private JPanel contentPane;
	public static GUI frame;  
	
	public static void main(String[] args) 
    {
    	try{
    		frame = new GUI();
    		frame.setVisible(true);
        }catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Garbage Paint");
		setSize(1000, 600);
		setMinimumSize(getSize());
		
		/*
		 * Criar barra de menu
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		
		/*
		 * Criar menu de sair
		 */
		JMenuItem mntmNew_2 = new JMenuItem("Sair");
		mntmNew_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "Sair";
				System.exit(0);
			}
		});
		mnMenu.add(mntmNew_2);
		
		
		/*
		 * Painel principal (desenho)
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBackground(Color.darkGray);
		contentPane.add(panel, BorderLayout.NORTH);
		
		/*
		 * Botão desenhar ponto
		 */
		JButton btnPoint = new JButton("Ponto");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "ponto";
			}
		});
		panel.add(btnPoint);
		
		/*
		 * Botão desenhar linha
		 */
		JButton btnLine = new JButton("Linha");
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectShap = "linha";
			}
		});
		panel.add(btnLine);
		
		/*
		 * Botão desenhar retangulo
		 */
		JButton btnRect = new JButton("Retangulo");
		btnRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "retangulo";
			}
		});
		panel.add(btnRect);
		
		/*
		 * Botão desenhar elipse
		 */
		JButton btnOval = new JButton("Elipse");
		btnOval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectShap = "elipse";
			}
		});
		panel.add(btnOval);
		
		/*
		 * Botão desenhar quadrado
		 */
		JButton btnSquare = new JButton("Quadrado");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "quadrado";
			}
		});
		panel.add(btnSquare);
		
		/*
		 * Botão desenhar triangulo
		 */
		JButton btnTri = new JButton("Triangulo");
		btnTri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectShap = "triangulo";
			}
		});
		panel.add(btnTri);
		
		/*
		 * Botão desenhar circulo
		 */
		JButton btnCir = new JButton("Circulo");
		btnCir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "circulo";
			}
		});
		panel.add(btnCir);

		
		/*
		 * Botão transladar
		 */
		JButton btnMove = new JButton("Transladar");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "transladar";
			}
		});
		panel.add(btnMove);
		
		/*
		 * Botão deletar a forma ao seleciona-la
		 */
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "Delete";
			}
		});
		panel.add(btnDelete);
		
		
		/*
		 * Cria componente pra desenhar com mouse
		 */
		
		contentPane.add(new Paint_App(), BorderLayout.CENTER);
		validate();
	}
}
