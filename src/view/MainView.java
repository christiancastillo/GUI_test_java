package view;

import java.awt.EventQueue;
import javax.swing.JFrame;

import controller.MainController;


public class MainView extends JFrame{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new MainView().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}
}
