package stg.ajian.util;

import java.util.Random;

import stg.ajian.base.Logger;


/**
 * ����ཫ��Random��������Ż������еķ�������Ϸ���������и�����ʹ��
 * */
public class Ran{
	private Ran() {}
	
	static Logger log = new Logger();
	static Random r = new Random();
	
	/**
	 * �ⲿ���ǻ�ȡ���������ط���
	 * Ĭ��Ϊ�������0~100֮��������
	 * */
	public static int ranInt() {
		int result;
		result = r.nextInt(101);
		log.logger("�����������:"+result);
		return result;
	}
	/**
	 * ����һ����ȡ�����������
	 * @param minNumber �������Сֵ
	 * @param maxNumber ��������ֵ
	 * @return ������ɵ������
	 * */
	public static int ranInt(int minNumber,int maxNumber) {
		int result;
		while(true) {
			result = r.nextInt(maxNumber);
			log.logger("�����������:"+result);
			if(result <= maxNumber && result >= minNumber){
				log.logger("�������������");
				break;
			}else {
				log.logger("���������������");
			}
		}
		return result;
	}
	/***********************************************************************/
	/**
	 * ��ȡ�������������
	 * Ĭ�Ϸ���0~1֮������������
	 * */
	public static float ranFloat() {
		float result = r.nextFloat();
		log.logger("�����������:"+result);
		return result;
	}
	/**
	 * ��ȡ�������������
	 * @param minNumber ��Сֵ
	 * @param maxNumber ���ֵ
	 * @return ���ɵ������
	 * */
	public static float ranFloat(float minNumber,float maxNumber) {
		float result;
		while(true) {
			result = maxNumber*r.nextFloat();
			log.logger("�����������:"+result);
			if(result <= maxNumber && result >= minNumber){
				log.logger("�������������");
				break;
			}else {
				log.logger("���������������");
			}
		}
		return result;
	}
	public static float ranFloat(int minNumber,int maxNumber) {
		float result;
		while(true) {
			result = maxNumber*r.nextFloat();
			log.logger("�����������:"+result);
			if(result <= maxNumber && result >= minNumber){
				log.logger("�������������");
				break;
			}else {
				log.logger("���������������");
			}
		}
		return result;
	}
	/********************************************************************/
	/**
	 * �����������������
	 * */
	public static boolean ranBoolean() {
		if(ranInt(0,2) == 0) {
			return true;
		}else {
			return false;
		}
	}
}
