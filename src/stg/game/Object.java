package stg.game;


/**
 * Object类
 * 向开发者提供高度自定义的功能
 * 游戏中所有物体都应是这个类或其子类的实例,
 * */
public class Object {
	/**
	 * Object类的构造方法,该类不提供空参构造
	 * @param spawnX 子弹生成的x坐标
	 * @param spawnY 子弹生成的y坐标
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
	//这里x,y不提供对应的set方法,需要改变这两个变量请使用move方法
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
	*游戏采用圆形判定,size为物体半径
	*/
	private float size;
	public float getSize() {
		return size;
	}
	public void setSize(float size){
		this.size = size;
	}
	//物体有无碰撞体积
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
	 * 移动到某位置
	 * @param moveToX 移动后的x坐标
	 * @param moveToY 移动后的y坐标
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
	 * 移动方法
	 * @param moveByX 在x方向平移对应距离
	 * @param moveByY 在y方向平移对应距离
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
	 * 用于消弹的方法
	 * @param obj 需要删除的对象
	 * */
	public static void kill(Object obj) {
		obj = null;
	}
	
	/**
	 * 简易设置速度方法
	 * @param v 速度大小
	 * @param angle 速度方向,水平向右为0
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
	 * 检测物体与玩家是否有碰撞的方法
	 * 若需判断物体间有无碰撞可重载该方法
	 * @param player 玩家
	 * @return 玩家和物体有无碰撞,有碰撞返回true,否则返回false
	 * */
	public boolean collide(Player player){
		if((player.getX()-x)*(player.getX()-x)+(player.getY()-y)*(player.getY()-y) >= size+player.getSize() && this.collide){
			return true;
		}else{
			return false;
		}
	}
}
