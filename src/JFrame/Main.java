package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
	        AlgoFrame frame=new AlgoFrame("welcome");
		});
		

	}
}
