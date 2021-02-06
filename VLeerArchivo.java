import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class VLeerArchivo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VLeerArchivo window = new VLeerArchivo();
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
	public VLeerArchivo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JTextPane textPane = new JTextPane();
		textPane.setBounds(22, 22, 242, 209);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 240, 242, 198);
		textArea.setLineWrap(true);
		frame.getContentPane().add(textArea);
	
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("Leer Archivo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearArchivo3 o = new CrearArchivo3();
				
					try {
						textPane.setText(o.leerArchivo2());
						textArea.setText(o.leerArchivo2());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		btnNewButton.setBounds(309, 21, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
	}
}
