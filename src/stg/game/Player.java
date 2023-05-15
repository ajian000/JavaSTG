package stg.game;

import stg.base.Key;

/**
 * �����,
 * ����ƶ�,����,���,bomb
 * �����Ի���Ӧ������������
 * */
public class Player extends Object implements Runnable{

	public Player(float spawnX, float spawnY) {
		super(spawnX, spawnY);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/******************************************************************/
	public int x;
	public int y;
	
	/**
	 * �Ի����ƶ��ٶ�
	 * ��Ұ��¶�Ӧ����ʱ�Ի�ÿ֡�ƶ���������
	 * */
	private static int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	/**
	 * �Ի�����ʱ���ƶ��ٶ�
	 * ��Ұ��¶�Ӧ����ʱ�Ի�ÿ֡�ƶ���������
	 * */
	private static int speed_slow;
	public void setSpeed_slow(int speed) {
		this.speed_slow = speed;
	}
	public int getSpeed_slow() {
		return this.speed_slow;
	}
	/**
	 * �Ի����ڹ�����
	 * */
	private static int attackDamageMain;
	public void setAttackDamageMain(int attackDamageMain) {
		this.attackDamageMain = attackDamageMain;
	}
	private int getAttackDamageMain() {
		return attackDamageMain;
	}
	/**
	 * �Ի��ӻ�������
	 * */
	private static int attackDamageSub;
	public void setAttackDamageSub(int attackDamageSub) {
		this.attackDamageSub = attackDamageSub;
	}
	private int getAttackDamageSub() {
		return attackDamageSub;
	}
	/**��¼�ӻ�λ�õ�����,���ṩ��Ӧget,set����,��ֱ�ӶԸ�������в���*/
	public int[][] SubPosition = new int[4][2];/*{{0,0},{0,0},{0,0},{0,0}}*/
	/**
	 * �������ι�����ʱ����
	 * �����������뽫��������Ϊ0
	 * */
	private static int attackSpeedMain;
	public void setAttackSpeedMain(int attackSpeedMain) {
		this.attackSpeedMain = attackSpeedMain;
	}
	private int getAttackSpeedMain() {
		return attackSpeedMain;
	}
	/**
	 * �Ի����ι�����ʱ����
	 * �������Ի��뽫��������Ϊ0
	 * */
	private static int attackSpeedSub;
	public void setAttackSpeedSub(int attackSpeedSub) {
		this.attackSpeedSub = attackSpeedSub;
	}
	private int getAttackSpeedSub() {
		return attackSpeedSub;
	}
	/**
	 * ��¼����Ƿ��ڵ���״̬
	 * */
	private boolean slowMode = false;
	/*
	 *������ӵ�ƫת�Ǻ͵��ٵȱ��������ռ� 
	 * */
	/************************************************************/
	/**
	 * ����ɨ�跽��
	 * ��������Ҷ���ʱ�Զ�����
	 * */
	public void run() {
		while(true) {
			if(Key.up) {
				if(slowMode) {y += this.speed_slow;}else {y += this.speed;}
			}
			if(Key.down) {
				if(slowMode) {y -= this.speed_slow;}else {y -= this.speed;}
			}
			if(Key.left) {
				if(slowMode) {x -= this.speed_slow;}else {x -= this.speed;}
			}
			if(Key.right) {
				if(slowMode) {x += this.speed_slow;}else {x += this.speed;}
			}
			if(Key.shoot) {
				this.shoot();
			}
			if(Key.slow) {
				slowMode = true;
			}else {
				slowMode = false;
			}
			if(Key.skip) {
				
			}
		}
	}
	/**
	 * �������
	 * ��������Ի�ʱ��д�÷���
	 * */
	public void shoot() {}
	
}
