package stg.ajian.base;

/**
 * ��������ڴ�ӡ��־
 * */
public class Logger {

	public Logger() {
		// TODO �Զ����ɵĹ��캯�����
		level = 2;
		type = 0;
	}
	/**
	 * @param type ��־�������,0��ӡ���,1����Ϊtxt
	 * @param level ��־����ȼ�,δʵ��
	 * */
	public Logger(int level,int type) {
		this.level = level;
		this.type = type;
	}
	/**************************************************************************************/
	/**
	 * ��־����
	 * 0 ��������־
	 * 1 ���ַ�������
	 * 2 ȫ����������
	 * 3 ȫ�����������Լ��������
	 * Ĭ��Ϊ2
	 * */
	private  int level;
	public void setLevel(int newLevel){
		level = newLevel;
	}
	public int getLevel() {
		return  level;
	}
	
	/**
	 * ��־�������
	 * 0 ��ӡ���
	 * 1 ������־
	 * Ĭ��0
	 * */
	private int type;
	public void setType(int newType) {
		type = newType;
	}
	public int getType() {
		return type;
	}
	/***********************************************************************************/
	public void logger(String log){
		if(type == 0) {
			System.out.println(log);
		}else {
			LogIO.saveLog(log);
		}
	}
}
