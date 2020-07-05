package desktop_view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class config_page extends JFrame {
	private JTextField blink_set;
	private JTextField tm_mnt;
	private JTextField sp_lm;
	private JTextField sp_st;
	private JButton btn_write;
	private JButton btn_read;
	private JComboBox cbb_color;
	private JComboBox cbb_txt_al;
	String color[] = { "RED", "GREEN", "YELLOW" };
	String text_al[] = { "Slow Down", "Please Slow", "Slow Slow" };

	private JLabel lblBack;
	private JPanel panel;
	int xx, xy;
	private JLabel lblX;
	private JLabel lblConfigColor;
	private JLabel lblTextAlert;
	private JLabel lblSpeedStart;
	private JLabel lblSpeedLimit;
	private JLabel lblBlink;
	private JLabel lblMonitorTime;
	private JLabel label;

	public JTextField getBlink_set() {
		return blink_set;
	}

	public JTextField getTm_mnt() {
		return tm_mnt;
	}

	public JTextField getSp_lm() {
		return sp_lm;
	}

	public JTextField getSp_st() {
		return sp_st;
	}

	public JButton getBtn_write() {
		return btn_write;
	}

	public JButton getBtn_read() {
		return btn_read;
	}

	public JComboBox getCbb_color() {
		return cbb_color;
	}

	public JComboBox getCbb_txt_al() {
		return cbb_txt_al;
	}

	public config_page() {
		getContentPane().setBackground(Color.WHITE);
		initialize();
		blink_set = new JTextField();
		blink_set.setBounds(185, 229, 116, 22);
		getContentPane().add(blink_set);
		blink_set.setColumns(10);

		tm_mnt = new JTextField();
		tm_mnt.setBounds(185, 280, 116, 22);
		getContentPane().add(tm_mnt);
		tm_mnt.setColumns(10);

		sp_lm = new JTextField();
		sp_lm.setBounds(486, 229, 116, 22);
		getContentPane().add(sp_lm);
		sp_lm.setColumns(10);

		sp_st = new JTextField();
		sp_st.setBounds(486, 177, 116, 22);
		getContentPane().add(sp_st);
		sp_st.setColumns(10);

		btn_write = new JButton("WRITE");
		btn_write.setBackground(new Color(240, 147, 43));
		btn_write.setBounds(185, 358, 116, 45);
		getContentPane().add(btn_write);

		btn_read = new JButton("READ");
		btn_read.setBounds(467, 358, 116, 45);
		btn_read.setBackground(new Color(240, 147, 43));
		getContentPane().add(btn_read);

		cbb_txt_al = new JComboBox(text_al);
		cbb_txt_al.setBounds(486, 280, 97, 22);
		getContentPane().add(cbb_txt_al);

		cbb_color = new JComboBox(color);
		cbb_color.setBounds(185, 177, 103, 22);
		getContentPane().add(cbb_color);

		lblConfigColor = new JLabel("Config Color");
		lblConfigColor.setBounds(96, 180, 77, 16);
		getContentPane().add(lblConfigColor);

		lblTextAlert = new JLabel("Text Alert");
		lblTextAlert.setBounds(418, 283, 56, 16);
		getContentPane().add(lblTextAlert);

		lblSpeedStart = new JLabel("Speed Start");
		lblSpeedStart.setBounds(404, 180, 87, 16);
		getContentPane().add(lblSpeedStart);

		lblSpeedLimit = new JLabel("Speed Limit");
		lblSpeedLimit.setBounds(404, 232, 70, 16);
		getContentPane().add(lblSpeedLimit);

		lblBlink = new JLabel("Blink");
		lblBlink.setBounds(123, 232, 56, 16);
		getContentPane().add(lblBlink);

		lblMonitorTime = new JLabel("Monitor Time");
		lblMonitorTime.setBounds(96, 283, 77, 16);
		getContentPane().add(lblMonitorTime);

	}

	private void initialize() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 510);
		setTitle("ThaiCreate.Com Java GUI Tutorial");
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 727, 75);
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
		JLabel lblMonitor = new JLabel("Dashboard Monitor");
		lblMonitor.setForeground(Color.WHITE);
		lblMonitor.setBounds(231, 13, 293, 60);
		panel.add(lblMonitor);
		lblMonitor.setFont(new Font("JasmineUPC", Font.PLAIN, 48));

		label = new JLabel("<");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label.setBounds(0, 4, 48, 41);
		panel.add(label);

		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

				int y = e.getYOnScreen();
				config_page.this.setLocation(x - xx, y - xy);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();

				xy = e.getY();
			}
		});

		lblBack = new JLabel("X");
		lblBack.setForeground(Color.RED);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// setVisible(false);
			}
		});
		lblBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblBack.setBounds(814, 0, 36, 45);
		getContentPane().add(lblBack);

	}
}
