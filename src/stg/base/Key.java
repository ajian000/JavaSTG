package stg.base;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener{
	public static boolean up;
	public static boolean down;
	public static boolean left;
	public static boolean right;
	public static boolean slow;
	public static boolean shoot;
	public static boolean bonm;
	public static boolean skip;
	
	public static void main(String[] args) {
		while(true) {
			if(up) {
				System.out.println(1);
			}
		}
	}
	
	public static void keyDown() {
		
	}
	
	@Override
	public  void keyTyped(KeyEvent e) {
		// TODO �Զ����ɵķ������
		//����ĳ����ʱ����
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɵķ������
		//����ĳ����ʱ����
		int code = e.getKeyCode();
		if(code == 96) {
			up = true;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO �Զ����ɵķ������
		//�ͷ�ĳ����ʱ����
		
	}
}
