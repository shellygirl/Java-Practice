
public class Person{
	
	private String name;
	
	private int age ;//先保护,后开放
	
	//封装性//
	private String secret = "xxx";
	
	private String gender;
	
	//private 可以保护 属性 不被外部随意访问
	
	
	//若想要对特定人员开放则需新建一个 get 方法:
	String getSecret(){
		return secret+"!!";//此处secret可修改
	}
	int getAge (){
		return age;
	}
	//若想要对外部程序进行修改操作的开放,则需建立一个 set 方法
	//在实际项目中,希望修改则加 set 方法
	//不希望修改则将该 set 方法注释掉
	void setName(String name ){
		this.name = name ;
	}
	void setAge(){
		this.age = age;
	}
	void setSecret(String secret){
		this secret = secret;
	}
	
	String personInfo(){
		return "这个人叫"+name",年龄"+age;
	}
	//具体对象//
	//重载构造方法-----
	//方法名:与类名相同
	//返回值:无 (不能加上 int 或其他数据类型的声明,否则就只是一个普通方法)
	//同时也不能运用 void 声明( void 并非无返回值而是返回值为空)
	//若未定义一个构造方法,java会自动创建一个构造方法
	public Person(){
		//仅用于举例,无实用
	}
	public Person(String name ,int age ){
		//我的名字等于你给赋值的名字
		this.name = name ;
		this.age = age;
	}
	public Person(String name,String gender,int age){
		// this.name = name ;
		// this.gender = gender;
		//在构造方法中调用构造方法:必须放在第一行语句
		this(name,gender);
		this.gender = gender;
	}
	public Person(String name ,String gender,int age ,String secret){
		this(name,gender,age);
		this.secret = secret;
	}
	
	
	
	
	public static void main (String [] arges){
		
		
		//对象1
		Person person = new Person();
		person.name = "jack";
		person.age = 21;
		//创建对象
		//引用传递
		//将person的内存地址赋给person4
		Person person4 = new person();
		Person person2 = new person();
		person2.name = "mike";
		person2.age = 35;
		//对象2
		Person person3 = new person("alice",22);
		//person变量引用指向空
		person = null;
		person4 = null;
		person2 = null;
		//此时person对象已经没有 变量 指向它
		//但person对象依旧存在于堆内存中,不做内存回收,
		//但java虚拟机自动回收,若堆内存中的对象没有变量去引用,
		//则可能就会被回收
		//调用对象的行为:
		System.out.println(person.personInfo());
		System.out.println(person4.personInfo());
		
		//匿名对象//
		
		System.out.println(new Person("Alice","女",18).personInfo());
	
	}
}