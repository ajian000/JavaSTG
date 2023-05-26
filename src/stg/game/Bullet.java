

/**
 * 子弹类
 * 子弹贴图,移动,碰撞
 * */
public class Bullet extends Object {

	public Bullet(float spawnX, float spawnY) {
		super(spawnX, spawnY);
		// TODO 自动生成的构造函数存根
	}
	public Bullet(float spawnX,float spawnY,boolean collide) {
		super(spawnX,spawnY,collide);
	}
	
	/******************************************************************************/
	//子弹旋转角度
	private float rox;
	public void setRox(float rox) {
		this.rox = rox;
	}
	public float getRox() {
		return this.rox;
	}
	//子弹颜色
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	//子弹的弹种,决定子弹判定和贴图
	private String type;
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	/*******************************************************************************/
	/**
	 * 子弹变换方法
	 * @param type 变化后的类型
	 * @param color 变化后的颜色
	 * */
	public void change(String type,String color) {
		this.type = type;
		this.color = color;
	}
	/**
	 * 子弹的判定方法
	 * 需要,根据弹型来实现判定方法
	 * 未实现
	 * */
	public boolean collide() {
		return false;
	}
}
