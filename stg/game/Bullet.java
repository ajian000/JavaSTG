package stg.game;


/**
 * �ӵ���
 * �ӵ���ͼ,�ƶ�,��ײ
 * */
public class Bullet extends Object {

	public Bullet(float spawnX, float spawnY) {
		super(spawnX, spawnY);
		// TODO �Զ����ɵĹ��캯�����
	}
	public Bullet(float spawnX,float spawnY,boolean collide) {
		super(spawnX,spawnY,collide);
	}
	
	/******************************************************************************/
	//�ӵ���ת�Ƕ�
	private float rox;
	public void setRox(float rox) {
		this.rox = rox;
	}
	public float getRox() {
		return this.rox;
	}
	/*******************************************************************************/
	
}
