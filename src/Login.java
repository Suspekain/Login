import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 181);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea: ");
		lblErabiltzailea.setBounds(20, 20, 75, 14);
		frame.getContentPane().add(lblErabiltzailea);
		
		textField = new JTextField();
		textField.setBounds(105, 17, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPasahitza = new JLabel("Pasahitza: ");
		lblPasahitza.setBounds(20, 50, 75, 14);
		frame.getContentPane().add(lblPasahitza);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(105, 48, 86, 14);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(186, 85, 89, 23);
		frame.getContentPane().add(btnLogIn);
	}
}
