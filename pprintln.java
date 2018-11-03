public class pprintln{
	
	//private static int a ;
	public static void main(String[] args){
		//System.out.println("Hello,Java!");
		//System.out.println("My name is:"+args[0]);
		// int num1 = 10;
		// int num2 = 10;
		// int sum = num1 + num2;
		// System.out.println(sum);
		// int maxValue = Integer.MAX_VALUE;
		// int minValue = Integer.MIN_VALUE;
		// System.out.println(maxValue);
		// System.out.println(minValue);
		// System.out.println(maxValue+1L);
		// System.out.println(minValue-1L);
		// System.out.println("6"+2);
		// int line = 10;
		// for(int x = 0;x < line;x++){
			// for(int y = 0; y < line -x;y++){
				// System.out.print(" ");
			// }
			// for(int z = 0;z < x;z++){
				// System.out.print("* ");
			// }
			// System.out.println();
		// }
		
		int a = 10;
		byte b = (byte)a;
		System.out.println(b);
		//小类型到大类型 直接转换
		//大类型到小类型 强制转换 若数据溢出则取数字二进制在该类型的数据位数
		double d = 12.1;
		System.out.println(d*2);
		float f = 10.2F;//默认浮点数为double类型,若想运用float类型则需加上 F 或 f;
		System.out.println(f);
		System.out.println(1.1 * 1.1);//计算精确值时不适用
		int num1 = 10;
		int num2 = 4;
		System.out.println(num1/(double)num2);
		char ch = 'A';
		int num = ch;
		num = num +32;
		ch = (char)num;
		System.out.println(ch);
		System.out.println(num);//char可以和int相互转换,char到int直接转,int到char强转
		//java使用16进制编码
		//无0表否1表是的规定,而是用true和false.
		System.out.println(10 == 10);//返回true
		System.out.println(11 == 10);//返回false
		////////////////string 类型:引用类型---通过某一个类new出来
		String strName = "Java is best";
		System.out.println(strName);//System可以打印各种数据类型
		string strMark = "coding";
		System.out.println(strName + strMark);
		//java中用 + 表示字符串拼接
		System.out.println("This is num" + 21 + person);
		//但凡使用 + 会将 + 两端自动变成 string 类型;
		//+ person时会调用引用类型 toString()
		int i = 10;
		double j = 12.1;
		string result = "运算结果是:"+i+j;
		System.out.println(result);
		//输出结果:运算结果是:1012.1;
		//需要运算则应将 i+j 用括号括起来
		System.out.print("a\t\n");//不想换行只需去掉ln
		System.out.print("\"Java6 666\"");//"\"转义
		System.out.print("'java6 666'");
		//八个数据类型
		//引用类型首字母大写
		//& |按位与或
		//&& ||逻辑与或
	}
		
}
		
