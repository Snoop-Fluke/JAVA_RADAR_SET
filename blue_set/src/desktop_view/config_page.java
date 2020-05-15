package desktop_view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
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
	private JButton btn_back;
	String color[] = { "RED", "GREEN", "YELLOW" };
	String text_al[] = { "Slow Down", "Please Slow", "Slow Slow" };

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

	public JButton getBtn_back() {
		return btn_back;
	}

	public config_page() {
		initialize();
	}

	private void initialize() {

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		blink_set = new JTextField();
		blink_set.setBounds(64, 102, 116, 22);
		getContentPane().add(blink_set);
		blink_set.setColumns(10);

		tm_mnt = new JTextField();
		tm_mnt.setBounds(64, 197, 116, 22);
		getContentPane().add(tm_mnt);
		tm_mnt.setColumns(10);

		sp_lm = new JTextField();
		sp_lm.setBounds(302, 50, 116, 22);
		getContentPane().add(sp_lm);
		sp_lm.setColumns(10);

		sp_st = new JTextField();
		sp_st.setBounds(302, 124, 116, 22);
		getContentPane().add(sp_st);
		sp_st.setColumns(10);

		btn_write = new JButton("WRITE");
		btn_write.setBounds(64, 366, 97, 25);
		getContentPane().add(btn_write);

		btn_read = new JButton("READ");
		btn_read.setBounds(264, 366, 97, 25);
		getContentPane().add(btn_read);

		cbb_txt_al = new JComboBox(text_al);
		cbb_txt_al.setBounds(299, 197, 97, 22);
		getContentPane().add(cbb_txt_al);

		cbb_color = new JComboBox(color);
		cbb_color.setBounds(64, 50, 103, 22);
		getContentPane().add(cbb_color);

		btn_back = new JButton("Back");
		btn_back.setBounds(0, 428, 97, 25);
		getContentPane().add(btn_back);

	}
}
