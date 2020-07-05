package desktop_view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_page extends JFrame {

	private JTextField user;
	private JTextField pass_word;
	// //
	private JButton btnNewButton_1;
	private JPanel panel;
	private JLabel lblNewLabel;
	int xx, xy;
	private JLabel lblX;

	public Login_page() {
		setBackground(Color.WHITE);
		getContentPane().setForeground(Color.RED);
		initialize();
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public JTextField getUser() {
		return user;
	}

	public JTextField getPass_word() {
		return pass_word;
	}

	private void initialize() {

		setUndecorated(true);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(SystemColor.textHighlightText);
		setSize(new Dimension(850, 550));
		setTitle("TEST_JAVA");
		getContentPane().setLayout(null);
		JLabel lblDjfdfdf = new JLabel("LOGIN");
		lblDjfdfdf.setBounds(553, 35, 267, 60);
		lblDjfdfdf.setFont(new Font("JasmineUPC", Font.PLAIN, 48));
		getContentPane().add(lblDjfdfdf);
		user = new JTextField();
		user.setForeground(SystemColor.textHighlight);
		user.setBounds(471, 132, 267, 40);
		getContentPane().add(user);
		user.setColumns(10);
		pass_word = new JTextField();
		pass_word.setBounds(471, 214, 267, 40);
		getContentPane().add(pass_word);
		pass_word.setColumns(10);
		btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBackground(new Color(240, 147, 43));
		// btnNewButton_1.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// textField.getText();
		// boolean sucess = log_in.login_(textField.getText(),
		// textField_1.getText());
		// if (sucess) {
		// Form4 form4 = new Form4();
		// form4.setVisible(true);
		// frame.setVisible(false);
		// } else {
		//
		// }
		// System.out.println(textField.getText());
		// System.out.println(textField_1.getText());
		// }
		// });
		btnNewButton_1.setBounds(528, 326, 170, 40);
		getContentPane().add(btnNewButton_1);

		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 345, 550);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

				int y = e.getYOnScreen();
				Login_page.this.setLocation(x - xx, y - xy);
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();

				xy = e.getY();
			}
		});
		lblNewLabel.setBounds(0, 0, 416, 353);
		panel.add(lblNewLabel);
		// lblNewLabel.setIcon(new ImageIcon(Login_page.class
		// .getResource("/image/settings.png")));

		lblX = new JLabel("X");
		lblX.setForeground(Color.RED);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblX.setBounds(814, 0, 36, 45);
		getContentPane().add(lblX);

		// System.out.println(config_para.get_Json[0]);
		// System.out.println("check");
	}
}
