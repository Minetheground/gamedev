package my2DGame;

import javax.swing.JFrame;



public class Main {
	
	//Beginning of main class

	public static void main(String[] args) {
		
		// Beginning of main method
		
		JFrame frame = new JFrame();  // We plugin a class called JFrame to assing a variable called frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // we begin to add some properies 
		frame.setResizable(false);
		frame.setTitle("New Game");   
		
		GamePanel GamePanel = new GamePanel();
		frame.add(GamePanel);
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
