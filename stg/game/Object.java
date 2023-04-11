package stg.game;


/**
 * Object��
 * �򿪷����ṩ�߶��Զ���Ĺ���
 * ��Ϸ���������嶼Ӧ���������������ʵ��,
 * */
public class Object {
	/**
	 * Object��Ĺ��췽��,���಻�ṩ�ղι���
	 * @param spawnX �ӵ����ɵ�x����
	 * @param spawnY �ӵ����ɵ�y����
	 * */
	public Object(float spawnX,float spawnY) {
		x = spawnX;
		y = spawnY;
		vx = vy =0;
	}
	/***************************************************/
	//����x,y���ṩ��Ӧ��set����,��Ҫ�ı�������������ʹ��move����
	private float x;
	private float y;
	public float getX(){
		return x;
	}
	public float getY() {
		return y;
	}
	
	private float vx;
	private float vy;
	public float getVx() {
		return vx;
	}
	public float getVy() {
		return vy;
	}
	public void setVx(float vx) {
		this.vx = vx;
	}
	public void setVy(float vy) {
		this.vy = vy;
	}
	/***********************************************************/
	/**
	 * �ƶ���ĳλ��
	 * @param moveToX �ƶ����x����
	 * @param moveToY �ƶ����y����
	 * */
	public void moveTo(float moveToX,float  moveToY) {
		x = moveToX;
		y = moveToY;
	}
	public void moveTo(int moveToX,int moveToY) {
		x = (float)moveToX;
		y = (float)moveToY;
	}
	/**
	 * �ƶ�����
	 * @param moveByX ��x����ƽ�ƶ�Ӧ����
	 * @param moveByY ��y����ƽ�ƶ�Ӧ����
	 * */
	public void moveBy(float moveByX,float moveByY) {
		x += moveByX;
		y += moveByY;
	}
	public void moveBy(int moveByX,int moveByY) {
		x += (float)moveByX;
		x += (float)moveByY;
	}
	/**
	 * ���������ķ���
	 * @param obj ��Ҫɾ���Ķ���
	 * */
	public static void kill(Object obj) {
		obj = null;
	}
	
	/**
	 * ���������ٶȷ���
	 * @param v �ٶȴ�С
	 * @param angle �ٶȷ���,ˮƽ����Ϊ0
	 * */
	public void setV(float v,float angle) {
		vx = (float) (v * Math.cos(angle));
		vy = (float) (v * Math.sin(angle));
	}
	public void setV(int v,float angle) {
		vx = (float) (v * Math.cos(angle));
		vy = (float) (v * Math.sin(angle));
	}
	public void setV(int v,int angle) {
		vx = (float) (v * Math.cos(angle));
		vy = (float) (v * Math.sin(angle));
	}public void setV(float v,int angle) {
		vx = (float) (v * Math.cos(angle));
		vy = (float) (v * Math.sin(angle));
	}
	
}
