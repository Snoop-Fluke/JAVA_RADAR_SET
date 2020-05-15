package desktop_view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class connectport_view extends JFrame {

	private JButton btn_connect;
	private JButton btn_refresh;
	private JButton btn_disconnect;
	private JLabel show_port;

	public JButton getBtn_refresh() {
		return btn_refresh;
	}

	public JButton getBtn_connect() {
		return btn_connect;
	}

	public JButton getBtn_disconnect() {
		return btn_disconnect;
	}

	public void setShow_port(String settext) {
		show_port.setText(settext);
	}

	public connectport_view() {
		initialize();
	}

	private void initialize() {

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		btn_connect = new JButton("connect");
		btn_connect.setBounds(77, 178, 97, 25);
		getContentPane().add(btn_connect);

		btn_disconnect = new JButton("disconnect");
		btn_disconnect.setBounds(271, 178, 97, 25);
		getContentPane().add(btn_disconnect);
		show_port = new JLabel("TEXT");
		show_port.setBounds(181, 79, 157, 16);
		getContentPane().add(show_port);

		btn_refresh = new JButton("refresh");
		btn_refresh.setBounds(77, 75, 97, 25);
		getContentPane().add(btn_refresh);

	}
}
