package stg.game;


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
	/*******************************************************************************/
	
}
