package com.java.blue_set;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class test_java extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_java window = new test_java();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test_java() {

		super("LayeredPane Example");
		setSize(200, 200);
		JLayeredPane pane = getLayeredPane();
		// creating buttons
		JButton top = new JButton();
		top.setBackground(Color.white);
		top.setBounds(20, 20, 50, 50);
		JButton middle = new JButton();
		middle.setBackground(Color.red);
		middle.setBounds(40, 40, 50, 50);
		JButton bottom = new JButton();
		bottom.setBackground(Color.cyan);
		bottom.setBounds(60, 60, 50, 50);
		// adding buttons on pane
		pane.add(bottom, new Integer(1));
		pane.add(middle, new Integer(2));
		pane.add(top, new Integer(3));
	}

	/**
	 * Initialize the contents of the frame.
	 */

}
