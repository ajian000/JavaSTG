package stg.game;

import stg.base.Key;

/**
 * 玩家类,
 * 玩家移动,被弹,射击,bomb
 * 所有自机都应是这个类的子类
 * */
public class Player extends Object implements Runnable{

	public Player(float spawnX, float spawnY) {
		super(spawnX, spawnY);
		// TODO 自动生成的构造函数存根
	}
	
	/******************************************************************/
	public int x;
	public int y;
	
	/**
	 * 自机的移动速度
	 * 玩家按下对应按键时自机每帧移动的像素数
	 * */
	private static int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	/**
	 * 自机低速时的移动速度
	 * 玩家按下对应按键时自机每帧移动的像素数
	 * */
	private static int speed_slow;
	public void setSpeed_slow(int speed) {
		this.speed_slow = speed;
	}
	public int getSpeed_slow() {
		return this.speed_slow;
	}
	/**
	 * 自机主炮攻击力
	 * */
	private static int attackDamageMain;
	public void setAttackDamageMain(int attackDamageMain) {
		this.attackDamageMain = attackDamageMain;
	}
	private int getAttackDamageMain() {
		return attackDamageMain;
	}
	/**
	 * 自机子机攻击力
	 * */
	private static int attackDamageSub;
	public void setAttackDamageSub(int attackDamageSub) {
		this.attackDamageSub = attackDamageSub;
	}
	private int getAttackDamageSub() {
		return attackDamageSub;
	}
	/**记录子机位置的数组,不提供对应get,set方法,请直接对该数组进行操作*/
	public int[][] SubPosition = new int[4][2];/*{{0,0},{0,0},{0,0},{0,0}}*/
	/**
	 * 主炮两次攻击的时间间隔
	 * 激光类主炮请将该项设置为0
	 * */
	private static int attackSpeedMain;
	public void setAttackSpeedMain(int attackSpeedMain) {
		this.attackSpeedMain = attackSpeedMain;
	}
	private int getAttackSpeedMain() {
		return attackSpeedMain;
	}
	/**
	 * 自机两次攻击的时间间隔
	 * 激光类自机请将该项设置为0
	 * */
	private static int attackSpeedSub;
	public void setAttackSpeedSub(int attackSpeedSub) {
		this.attackSpeedSub = attackSpeedSub;
	}
	private int getAttackSpeedSub() {
		return attackSpeedSub;
	}
	/**
	 * 记录玩家是否处于低速状态
	 * */
	private boolean slowMode = false;
	/*
	 *这里给子弹偏转角和弹速等变量留出空间 
	 * */
	/************************************************************/
	/**
	 * 按键扫描方法
	 * 当存在玩家对象时自动调用
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
	 * 射击方法
	 * 请在设计自机时重写该方法
	 * */
	public void shoot() {}
	
}
