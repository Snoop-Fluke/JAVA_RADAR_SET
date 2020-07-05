package desktop.c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import desktop.model.config_port;
import desktop_view.Select_page;
import desktop_view.config_page;

public class select_menu implements ActionListener {
	private Select_page view;

	public select_menu(Select_page view) {
		this.view = view;
		view.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if (command.equals("port")) {
			view.setVisible(false);

		} else {
			view.setVisible(false);
			config_page view_ = new config_page();
			config_port model_ = new config_port();
			new config_menu(view_, model_);
			String hex_commend = model_.hex_callback("01", "6a"); // send
																	// command
																	// to set
																	// controller
			System.out.print(hex_commend);

			model_.start_set("MO0a");// setdata in string
			System.out.print("SENDDDDDD");
		}
	}

}
