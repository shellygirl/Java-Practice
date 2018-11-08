public class Cartoon{
	private String name;
	private String protagonist;
	private int protagonistNum;
	private String type;
	private String level;
	public Cartoon(String name){
		this.name = name ;
	}
	public Cartoon(String name ,String protagonist){
		this(name);
		this.protagonist = protagonist;
	}
	public Cartoon(String name ,int protagonistNum){
		this(name);
		this.protagonistNum = protagonistNum;
	}
	public Cartoon(String name, String protagonist,int protagonistNum){
		this(name,protagonist);
		this.protagonistNum = protagonistNum;
	}
	public Cartoon(String name ,String protagonist,int protagonistNum,String type){
		this(name,protagonist,protagonistNum);
		this.type = type;
	}
	public Cartoon(String name ,String protagonist,int protagonistNum,String type,String level){
		this(name ,protagonist,protagonistNum,type);
		this.level = level;
	}
	String printInfo(){
		return ("Cartoon's name :"+name+"\n" +"Cartoon's protagonist :"+protagonist+"\n"
		+"Cartoon's protagonistNum :"+protagonistNum+"\n"+"Cartoon's type:"+type+"\n"
		+"Cartoon's level:"+level+"\n");
	}
	public static void main(String [] args){
	Cartoon cartoon = new Cartoon("世界第一初恋","小野寺律,高野政宗",2,"bl","15X");
	Cartoon cartoon1 = new Cartoon("独占我的英雄",2);
	System.out.print(cartoon.printInfo());
	System.out.print(cartoon1.printInfo());
	}
}

		