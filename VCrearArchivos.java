import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class VCrearArchivos {

	private JFrame frame;
	private JTextField Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCrearArchivos window = new VCrearArchivos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VCrearArchivos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Nombre = new JTextField();
		Nombre.setBounds(41, 53, 130, 26);
		frame.getContentPane().add(Nombre);
		Nombre.setColumns(10);
		JTextArea Contenido = new JTextArea();
		Contenido.setBounds(41, 91, 117, 127);
		frame.getContentPane().add(Contenido);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearArchivo3 obj = new CrearArchivo3();
				try {
					obj.creaArchivo(Nombre.getText(), Contenido.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(232, 53, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(232, 109, 1, 16);
		frame.getContentPane().add(textPane);
		
		
	}
}
