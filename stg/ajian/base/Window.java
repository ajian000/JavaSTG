package stg.ajian.base;

//import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{
	Logger log = new Logger();

	public Window() {
		// TODO 自动生成的构造函数存根
		JFrame jf = new JFrame("JavaSTG");
		jf.setSize(1280,960);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
		log.logger("创建了一个窗口");
	}
	public Window(int[] size) {
		JFrame jf = new JFrame("JavaSTG");
		jf.setSize(size[0],size[2]);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
		log.logger("创建了一个窗口");
	}
	/*******************************************/
	//设置窗口大小相关方法,未使用
	int size[] = new int[2];
	public void setSize(int[] newSize) {
		size = newSize;
	}
	public int getSize(char l) {
		if(l == 'x') {
			return size[0];
		}else if(l == 'y') {
			return size[1];
		}else {
			System.out.print("Error");
			return 0;
		}
	}
}
