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
	//�ӵ���ɫ
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	//�ӵ�����
	private String type;
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	/*******************************************************************************/
	/**
	 * �ӵ��任����
	 * @param type �仯�������
	 * @param color �仯�����ɫ
	 * */
	public void change(String type,String color) {
		this.type = type;
		this.color = color;
	}
	/**
	 * �ӵ����ж�����
	 * δʵ��
	 * */
	public boolean collide() {
		return false;
	}
}
