package stg.ajian.util;

import java.util.Random;

import stg.ajian.base.Logger;


/**
 * 这个类将对Random类进行了优化是其中的方法在游戏开发过程中更容易使用
 * */
public class Ran{
	private Ran() {}
	
	static Logger log = new Logger();
	static Random r = new Random();
	
	/**
	 * 这部分是获取随机整数相关方法
	 * 默认为随机返回0~100之间的随机数
	 * */
	public static int ranInt() {
		int result;
		result = r.nextInt(101);
		log.logger("生成了随机数:"+result);
		return result;
	}
	/**
	 * 这是一个获取随机整数方法
	 * @param minNumber 随机数最小值
	 * @param maxNumber 随机数最大值
	 * @return 随机生成的随机数
	 * */
	public static int ranInt(int minNumber,int maxNumber) {
		int result;
		while(true) {
			result = r.nextInt(maxNumber);
			log.logger("生成了随机数:"+result);
			if(result <= maxNumber && result >= minNumber){
				log.logger("随机数符合条件");
				break;
			}else {
				log.logger("随机数不符合条件");
			}
		}
		return result;
	}
	/***********************************************************************/
	/**
	 * 获取随机浮点数方法
	 * 默认返回0~1之间的随机浮点数
	 * */
	public static float ranFloat() {
		float result = r.nextFloat();
		log.logger("生成了随机数:"+result);
		return result;
	}
	/**
	 * 获取随机浮点数方法
	 * @param minNumber 最小值
	 * @param maxNumber 最大值
	 * @return 生成的随机数
	 * */
	public static float ranFloat(float minNumber,float maxNumber) {
		float result;
		while(true) {
			result = maxNumber*r.nextFloat();
			log.logger("生成了随机数:"+result);
			if(result <= maxNumber && result >= minNumber){
				log.logger("随机数符合条件");
				break;
			}else {
				log.logger("随机数不符合条件");
			}
		}
		return result;
	}
	public static float ranFloat(int minNumber,int maxNumber) {
		float result;
		while(true) {
			result = maxNumber*r.nextFloat();
			log.logger("生成了随机数:"+result);
			if(result <= maxNumber && result >= minNumber){
				log.logger("随机数符合条件");
				break;
			}else {
				log.logger("随机数不符合条件");
			}
		}
		return result;
	}
	/********************************************************************/
	/**
	 * 返回随机布尔量方法
	 * */
	public static boolean ranBoolean() {
		if(ranInt(0,2) == 0) {
			return true;
		}else {
			return false;
		}
	}
}
