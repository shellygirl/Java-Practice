public class Cartoon1{
	static String type = "国漫";
	private String name;
	private String protagonist;
	private int protagonistNum;
	static{
		System.out.println("静态块,类"
		//属于类,仅执行一次
	}
	{
		System.out.println("构造块,非静态块");
		
		//构造块(非静态块),执行顺序在构造方法 Cartoon1 之前
		//当初始化工作过于复杂,可运用构造块进行
	}
	public Cartoon1(String name){
		this.name = name;
		System.out.println("Cartoon1 构造方法执行");
	}
	
	public Cartoon1(String protagonist){
		this.protagonist = protagonist;
	}
	public Cartoon1(String name ,int protagonistNum){
		this(name);
		this protagonistNum = protagonistNum;
	}
    static String printInfo(String message,int Num){
		return System.out.print("分类"+Cartoon.type+"
	}
	public static void main(String [] args){
		Cartoon1 cartoon1 = new Cartoon1;
		Cartoon2 cartoon2 = new Cartoon1;
	}