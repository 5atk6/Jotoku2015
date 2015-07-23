import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.*;
import java.awt.Color;
import java.awt.geom.*;
import java.util.ArrayList;

public class GoBan extends JPanel implements MouseListener {

	private static final int goBanSize = 400;
	ArrayList<Point> pointList = new ArrayList<Point>();
	GameState gameState = new GameState();
	boolean flag = true;

	public GoBan() {
		// TODO Auto-generated constructor stub
		addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(219, 186, 86));
		g2.fillRect(5, 5, goBanSize, goBanSize);

		g2.setColor(Color.black);
		int i, w, h;

		for (i = 5; i <= goBanSize + 5; i += 50) {
			g2.draw(new Line2D.Double(5, i, goBanSize + 5, i));
			g2.draw(new Line2D.Double(i, 5, i, goBanSize + 5));
		}

		for (w = 0; w < 9; w++) {
			for (h = 0; h < 9; h++) {
				if (GameState.gameState[w][h] == 1) {
					g2.setColor(Color.black);
				} else if (GameState.gameState[w][h] == -1) {
					g2.setColor(Color.white);
				}
				if (GameState.gameState[w][h] != 0) {
					g2.fillOval(w * 50 - 10, h * 50 - 10, goBanSize / 10, goBanSize / 10);
					flag = !flag;
				}
			}
		}

	}

	// マウスをクリックしたとき呼ばれる
	public void mouseClicked(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();

		if (5 <= x && x <= goBanSize + 5 && 5 <= y && y <= goBanSize + 5) {
			x = x/50;
			y = y/50;
			System.out.println(x + " " + y);
			if(GameState.gameState[x][y] == 0){
				if(GameState.countStone%2 == 0)
					GameState.gameState[x][y] = 1;
				else
					GameState.gameState[x][y] = -1;
				GameState.countStone++;
			}
		}
		repaint();
	}

	// マウスがウィンドウ内に入ったとき呼ばれる
	public void mouseEntered(MouseEvent e) {
	}

	// マウスがウィンドウ外に出たとき呼ばれる
	public void mouseExited(MouseEvent e) {
	}

	// マウスボタンが押されたとき呼ばれる
	public void mousePressed(MouseEvent e) {
	}

	// マウスボタンが離されたとき呼ばれる
	public void mouseReleased(MouseEvent e) {
	}
}
