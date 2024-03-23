package my2DGame;

import javax.swing.JFrame;



public class Main {
	
	//Beginning of main class

	public static void main(String[] args) {
		
		// Beginning of main method
		
		JFrame frame = new JFrame();  // We plugin a class called JFrame to assign a variable called frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // we begin to add some basic properties, here we tell the program to stop when the window is closed.
		frame.setResizable(false);	//Then we disallow the user to resize our game as this could possibly break assets. 
		frame.setTitle("New Game");   //Then of course the most important thing about the window is the title, so that you know what kind of game your playing.
		
		//so then we create a new class called GamePanel
		
		GamePanel GamePanel = new GamePanel();
		frame.add(GamePanel);
		frame.pack();
		
		frame.setLocationRelativeTo(null); //this sets the relative location of the window, to which is null
		frame.setVisible(true); // and this simply displays the window on the shell.

	}

}
