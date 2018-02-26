import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot a = new Robot();
a.hide();
		//2. Set the speed to 100
a.setSpeed(10);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color do you want?", "", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Orange","Yellow","Green","Blue","Purple"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if(colorChoice==0) {
			a.setPenColor(255, 0, 0);
		}
		if(colorChoice==1) {
			a.setPenColor(255, 132, 0);
		}
		if(colorChoice==2) {
			a.setPenColor(255, 255, 0);
		}
		if(colorChoice==3) {
			a.setPenColor(0, 255, 0);
		}
		if(colorChoice==4) {
			a.setPenColor(0, 0, 255);
		}
		if(colorChoice==5) {
			a.setPenColor(139, 0, 255);
		}
		//4. Ask the user how many polygons they want to be drawn.
		String polygon=JOptionPane.showInputDialog("How many polygons do you want to draw? (Maximum of 5)");
		int h = Integer.parseInt(polygon);
		//5. Use the robot to draw the number of polygons the user requested.
		if(h==1) {
Square(a);
		}
		if(h==2) {
Square(a);
Square(a);
		}
		if(h==3) {
Square(a);
Square(a);
Square(a);
		}
		if(h==4) {
Square(a);
Square(a);
Square(a);
Square(a);
		}
		if(h==5) {
Square(a);
Square(a);
Square(a);
Square(a);
Square(a);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
		
	

	}
	private static void Square(Robot a){
		a.penDown();
		a.move(30);
		a.turn(90);
		a.move(30);
		a.turn(90);
		a.move(30);
		a.turn(90);
		a.move(30);
		a.turn(180);
		a.penUp();
		a.move(60);
		a.turn(270);
	}
}

