public class ArrayUtils{
	//计算数组中最大值:
	public static int arrayMaxElement(int [] data){
		int max = Integer.MIN_VALUE;
		if(data == null){
		}
		for(int i = 0;i < data.length;i++){
			if(data[i] > max){
				max = data[i];
			}
		return max;
		}
	}
	//计算数组中最小值
	public static int arrayMinElement(int [] data){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < data.length;i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}
	//计算数组值之和
	public static int arrayElementSum(int [] data){
		int sum = 0;
		for(int i = 0;i < data.length;i++){
			sum = sum + data[i];
		}
		return sum;
	}
	//数组拼接
	public static int[] arrayJoin(int [] a,int [] b){
		int []c = new int [a.length+b.length];
		for(int i = 0; i < a.length;i++){
			c[i] = a[i];
		}
		for(int i = a.length; i < c.length;i++){
			c[i] = b[i - a.length];
		}
		return c;
	}
	//数组截取
	//[start,end)
	public static int [] arraySub(int []a,int start,int end){
		if(end > a.length){
			end = a.length;
		}
		if(start < 0){
			start = 0;
		}
		int len = end - start;
		int []res = new int [len];
		for(int i = 0;i < len;i++){
			res[i] = a[start+i];
		}
			
		return res;
	}