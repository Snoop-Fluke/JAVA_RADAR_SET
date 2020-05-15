package main_run;

import desktop.c.Login_menu;
import desktop.model.Login_;
import desktop_view.Login_page;

public class main_run {

	public static void main(String[] args) {
		Login_page view = new Login_page();
		Login_ model = new Login_();
		new Login_menu(view, model);

	}
}
