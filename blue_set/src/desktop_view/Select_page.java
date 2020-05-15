package desktop_view;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Select_page extends JFrame {

	private JButton con_mode;
	private JButton config_mode;

	public Select_page() {
		initialize();
	}

	public JButton getCon_mode() {
		return con_mode;
	}

	public JButton getConfig_mode() {
		return config_mode;
	}

	private void initialize() {

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		con_mode = new JButton("Config Port");
		con_mode.setBounds(142, 138, 97, 25);
		getContentPane().add(con_mode);

		config_mode = new JButton("Config Mode");
		config_mode.setBounds(142, 176, 97, 25);
		getContentPane().add(config_mode);
	}

}
