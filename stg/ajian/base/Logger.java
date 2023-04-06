package stg.ajian.base;

/**
 * 这个类用于打印日志
 * */
public class Logger {

	public Logger() {
		// TODO 自动生成的构造函数存根
		level = 2;
		type = 0;
	}
	/**
	 * @param type 日志输出类型,0打印输出,1保存为txt
	 * @param level 日志保存等级,未实现
	 * */
	public Logger(int level,int type) {
		this.level = level;
		this.type = type;
	}
	/**************************************************************************************/
	/**
	 * 日志级别
	 * 0 不保存日志
	 * 1 部分方法调用
	 * 2 全部方法调用
	 * 3 全部方法调用以及传入参数
	 * 默认为2
	 * */
	private  int level;
	public void setLevel(int newLevel){
		level = newLevel;
	}
	public int getLevel() {
		return  level;
	}
	
	/**
	 * 日志输出类型
	 * 0 打印输出
	 * 1 保存日志
	 * 默认0
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
