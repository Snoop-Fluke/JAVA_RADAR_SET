package desktop_view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import desktop.c.config_menu;
import desktop.c.tcp_mnt_menu;
import desktop.model.config_port;
import desktop.model.tcp_mnt_model;

public class Select_page extends JFrame {

	// parameter for view
	private JLabel lblBack;
	private JPanel panel;
	private JPanel panel_serial;
	private JPanel panel_Tcp;
	int xx, xy;
	private JLabel lblX;
	private JLabel Serial_;
	private JLabel Tcp_;
	private JPanel panel_1;

	// parameter for view

	public Select_page() {
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.WHITE);
		initialize();
	}

	private void initialize() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 510);
		setTitle("ThaiCreate.Com Java GUI Tutorial");
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 727, 78);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblX = new JLabel("X");
		lblX.setBounds(691, 0, 36, 45);
		panel.add(lblX);
		lblX.setForeground(Color.RED);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		// ScrollPane for Table
		JLabel lblMonitor = new JLabel("Select Mode");
		lblMonitor.setForeground(Color.WHITE);
		lblMonitor.setBounds(276, 13, 293, 60);
		panel.add(lblMonitor);
		lblMonitor.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 48));

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(354, 77, 10, 433);
		getContentPane().add(panel_1);

		Serial_ = new JLabel("Tcp/IP");
		Serial_.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tcp_mnt_view view_ = new tcp_mnt_view();
				tcp_mnt_model model_ = new tcp_mnt_model();
				new tcp_mnt_menu(view_, model_);

			}
		});
		Serial_.setForeground(Color.BLACK);
		Serial_.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 80));
		Serial_.setBounds(455, 260, 272, 60);
		getContentPane().add(Serial_);

		Tcp_ = new JLabel("Serial");
		Tcp_.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				config_page view_ = new config_page();
				config_port model_ = new config_port();
				new config_menu(view_, model_);
				String hex_commend = model_.hex_callback("01", "6a"); // send
				System.out.print(hex_commend);
				model_.start_set("MO0a");// setdata in string
				System.out.print("SENDDDDDD");

			}
		});
		Tcp_.setForeground(Color.BLACK);
		Tcp_.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 80));
		Tcp_.setBounds(95, 260, 272, 60);
		getContentPane().add(Tcp_);

		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

				int y = e.getYOnScreen();
				Select_page.this.setLocation(x - xx, y - xy);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();

				xy = e.getY();
			}
		});

	}
}
