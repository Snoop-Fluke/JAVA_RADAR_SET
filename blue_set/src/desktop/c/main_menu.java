//package desktop.c;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import com.java.blue_set.Form4;
//
//public class main_menu implements ActionListener {
//
//	private Form4 view;
//
//	public main_menu(Form4 view) {
//		this.view = view;
//		view.setVisible(true);
//		view.getBtnNewButton_1().setActionCommand("Show");
//		view.getBtnNewButton_1().addActionListener(this);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String command = e.getActionCommand();
//		if (command.equals("Show")) {
//			System.out.print("IM_SHOW");
//		} else {
//			System.out.print("Not_IM_SHOW");
//		}
//
//	}
//
// }
