package thread;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class BallComponent extends JPanel{
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 350;
	
	private List<Ball> balls = new ArrayList<Ball>();
	public void add(Ball ball){
		balls.add(ball);
	}
	
	public void paintComponnet(Graphics g){
		super.paintComponent(g);//erase background
		Graphics2D g2 = (Graphics2D) g;
		for (Ball ball : balls) {
			g2.fill(ball.getShape());
		}
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

}
