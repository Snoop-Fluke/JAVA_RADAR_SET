package desktop.c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import desktop.model.Login_;
import desktop_view.Login_page;
import desktop_view.Select_page;

public class Login_menu implements ActionListener {

	private Login_page view;
	private Login_ model;

	public Login_menu(Login_page view, Login_ model) {
		this.view = view;
		this.model = model;
		view.setVisible(true);
		view.getBtnNewButton_1().setActionCommand("LOGIN");
		view.getBtnNewButton_1().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if (command.equals("LOGIN")) {
			String user = view.getUser().getText();
			String password = view.getPass_word().getText();

			if (model.login_(user, password)) {
				view.setVisible(false);
				// Select_page view = new Select_page();
				// new select_menu(view);
				// System.out.print(user);
				Select_page view = new Select_page();
				new select_menu(view);
				// try {
				// model.startServer();
				// } catch (IOException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }

			}
		}

	}

}
