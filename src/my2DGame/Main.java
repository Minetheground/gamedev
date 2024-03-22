package my2DGame;

import javax.swing.JFrame;

public class Main {
	
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("New Game");
		
		GamePanel GamePanel = new GamePanel();
		frame.add(GamePanel);
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
