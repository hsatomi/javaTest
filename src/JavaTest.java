import java.awt.Graphics;
import java.util.TimerTask;

import javax.swing.JFrame;


public class JavaTest extends JFrame{

	public static void main(String[] args){

		new JavaTest();



	}


	public JavaTest(){

		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);




		Graphics g = this.getGraphics();
//		g.setColor(Color.red);
		g.fillOval(20, 20, 100, 100);
		g.dispose();


	}


	class Review extends TimerTask {

		@Override
		public void run() {
			// TODO 自動生成されたメソッド・スタブ

		}

	}



}
