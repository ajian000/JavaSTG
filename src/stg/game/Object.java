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
		this.collide = true; 
	}
	public Object(float spawnX,float spawnY,boolean collide) {
		x = spawnX;
		y = spawnY;
		vx = vy = 0;
		this.collide  = collide;
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
	/**
	*��Ϸ����Բ���ж�,sizeΪ����뾶
	*/
	private float size;
	public float getSize() {
		return size;
	}
	public void setSize(float size){
		this.size = size;
	}
	//����������ײ���
	private boolean collide;
	public void setCollide(boolean collide) {
		this.collide = collide;
	}
	public void setCollide() {
		collide = !collide;
	}
	public boolean getCollide() {
		return collide;
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
	/**
	 * �������������Ƿ�����ײ�ķ���
	 * �����ж������������ײ�����ظ÷���
	 * @param player ���
	 * @return ��Һ�����������ײ,����ײ����true,���򷵻�false
	 * */
	public boolean collide(Player player){
		if((player.getX()-x)*(player.getX()-x)+(player.getY()-y)*(player.getY()-y) >= size+player.getSize() && this.collide){
			return true;
		}else{
			return false;
		}
	}
}
