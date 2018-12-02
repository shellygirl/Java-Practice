//static 关键字//

public class java1110class{
	static String country = "中国";
	//静态属性(类属性):共享属性
	//调用时最好用 java1110class.country(类名.属性名 or 类名.方法名)
	//在静态方法中不能调用非静态变量
	//而在非静态方法中可以直接调用 静态static 变量
	private String name;
	private int age;
	void java1110class(String name ,int age){
		java1110class.country = "美国";
	}
	void static print(String message){
		System.out.print(message);
	}
	//类方法
	public static void main(String [] args){
		//在一个源文件中 public 类有且只能有一个