package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {

	public double x, y;
	public int width, height;

	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}

	public void tick() {
		x+= (Game.ball.x - x - 6)* 0.09;
		
		Rectangle rect1 = new Rectangle((int)x,(int)y, width,height);
	}

	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) x, (int) y, width, height);
	}
}
