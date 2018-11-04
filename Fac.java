import java.util.Arrays;

public class Fac{
	public static int Factor(int num){
		if(num == 1){
			return 1;
		}else{
			return num * Factor(num - 1);
		}
	}
	public static void Array(String [] args)
	{
		// long result = Factor(60);
		// System.out.println(result);
		int [] cus = {1,0,1,0,1,1,0};
		//数组是引用类型
		for(int i = 0; i < cus.length; i++){//.length表示得到数组的长度
				System.out.print(cus[i]);
		}
		String[] s = new String[8];
		for(int j = 0; j < 7; j++){
			System.out.println(s[j]);
		}
		boolean[] b = new boolean[8];
		for(int k = 0; k < 7; k++){
			System.out.println(b[k]);
		}
		int [] a = null;//NPE:空指针异常
	}
	public static void Array2(String [] args){
		int [] x = null;
		x = new int [3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		for(int i = 0;i<x.length;i++){
			System.out.println(x[i]);
		}
		int y = x;
		for(int i = 0;i <y.length;y++){
			System.out.println(y[i]);
		}
		x = null;
		//栈内存(存变量名)与堆内存(存变量值)
		y = x;//表示将x的地址传给了y;
		//匿名数组
		System.out.println(new int[]{1,2,3}.length);//计算该匿名数组的长度
		//表示在堆内存中开辟三个空间但在栈内存中没有姓名.
	}
	public static void Copy(String[] args){
		//将两个数组中的内容拷贝到一个数组之中:
		int [] a = new int []{1,2,3,4};
		int [] b = new int []{5,6,7};
		int [] c = new int [a.length + b.length];
		for(int i = 0; i < a.length ;i++){
			c[i] = a[i];
		}
		for(int i = a.length; i < c.length;i++){
			c[i] = b[i - a.length];
		}
		return c;
	}
	public static void C(String [] args){
		
		for(int i = 0; i < c.length;i++){
		System.out.println(c[i]);
		}
	}
	public static void twoArray(String [] args){
		int[][]a = new int [2][];
		a[0][0] = 1;
		a[1][2] = 6;
		for(int i = 0;i <a.length;i++){//注意.length的正确使用方式
			for(int j = 0; j <a[i].length;j++){
			    System.out.print(a[i][j] + "\t");
			}
			System.out.print();
		}
	}
	public static void main(String [] args){
		int[] a = new int[]{2,5,44,56,334};
		Arrays.sort(a);
		
}
		
		