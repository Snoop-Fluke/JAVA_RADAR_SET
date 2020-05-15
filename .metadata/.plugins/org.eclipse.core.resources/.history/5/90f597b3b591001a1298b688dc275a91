package desktop.c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import desktop.model.config_port;
import desktop_view.connectport_view;

public class connectport_menu implements ActionListener {

	private connectport_view view;
	private config_port model;

	public connectport_menu(connectport_view view, config_port model) {
		this.view = view;
		this.model = model;
		view.setVisible(true);
		view.getBtn_refresh().setActionCommand("refresh");
		view.getBtn_refresh().addActionListener(this);
		view.getBtn_connect().setActionCommand("connect");
		view.getBtn_disconnect().setActionCommand("disconnect");
		view.getBtn_connect().addActionListener(this);
		view.getBtn_refresh().addActionListener(this);
		view.getBtn_disconnect().addActionListener(this);
		view.setShow_port("Find_port" + model.init_port());

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if (command.equals("connect")) {
			// Select_page select = new Select_page();
			// new select_menu(select);
			model.initialize();
			System.out.println("Connect1:" + model.init_port());
		}
		if (command.equals("refresh")) {
			System.out.println("refresh");
			view.setShow_port("Find_port" + model.init_port());
		}
		if (command.equals("disconnect")) {
			model.close();
			System.out.print("Disconnect");
		}

	}

}
