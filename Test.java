

public class Test{
	public static void main(String [] args){
		Outer outer = new Outer();
		System.out.println(outer.getName());
		System.out.println(outer.getAge());
		//非静态内部类要在其他地方使用时,创建对象的方式
		
		
	}
}
class A{
	private String name = "张三";
	public String getName (){
		return this.name ;
	}
}
class B{
	private int age = 33;
	public String getAge(){
		return this.age;
	}
}
class Outer{
	
	//成员内部类//
	
	class InnerA extends A{//extends :继承
		public String name(){
			return this.getName();
		}
		//父类方法重写
	}
	class InnerB extends B{
		public int age(){
			return this.getAge();
		}
	}
	//外部类访问内部类的方法或属性,通过创建内部类的实例化对象
	//或者必须持有内部类的实例化对象的引用
	
	//静态内部类//
	
	public static class InnerC{
		public getNum(){
			return 33;
		}
	}
	
	public String getName(){
		return new InnerA().name();
	}
	public int getAge(){
		return new InnerB().age();
	}
}
		
