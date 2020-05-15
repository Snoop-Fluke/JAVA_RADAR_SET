package desktop_view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login_page extends JFrame {

	private JTextField user;
	private JTextField pass_word;
	private JLabel la1, la2;
	private JButton btnNewButton_1;

	public Login_page() {
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

		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(Color.WHITE);
		setSize(new Dimension(500, 500));
		setTitle("TEST_JAVA");
		getContentPane().setLayout(null);
		// la1 = new JLabel(config_para.get_Json[0]);
		la1 = new JLabel();
		la1.setBounds(56, 53, 86, 20);
		getContentPane().add(la1);
		// la2 = new JLabel(config_para.get_Json[1]);
		la2 = new JLabel();
		la2.setBounds(76, 73, 106, 40);
		getContentPane().add(la2);
		JLabel lblDjfdfdf = new JLabel("Radar_Speed_Set");
		lblDjfdfdf.setBounds(110, 39, 267, 60);
		lblDjfdfdf.setFont(new Font("JasmineUPC", Font.PLAIN, 48));
		getContentPane().add(lblDjfdfdf);
		user = new JTextField();
		user.setBounds(163, 156, 116, 22);
		getContentPane().add(user);
		user.setColumns(10);
		pass_word = new JTextField();
		pass_word.setBounds(163, 213, 116, 22);
		getContentPane().add(pass_word);
		pass_word.setColumns(10);
		btnNewButton_1 = new JButton("New button");
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
		btnNewButton_1.setBounds(171, 289, 97, 25);
		getContentPane().add(btnNewButton_1);

		// System.out.println(config_para.get_Json[0]);
		// System.out.println("check");
	}

}
