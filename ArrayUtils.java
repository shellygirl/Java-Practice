public class ArrayUtils{
	//计算数组中最大值:
	public static int arrayMaxElement(int [] data){
		int max = Integer.MIN_VALUE;
		if(data == null){
			//TODO
			throw new IllegalArgumentException("data must not be null");//参数异常
		}
		for(int i = 0;i < data.length;i++){
			if(data[i] > max){
				max = data[i];
			}
		}
				return max;
	}
	//计算数组中最小值
	public static int arrayMinElement(int [] data){
		if (data == null){
			throw new IllegalArgumentException("data must not be null");
		}
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
		if(a == null && b == null){
			throw new IllegalArgumentException("a or b must not be null");
		//TODO
		}
		
		int []c = new int [a.length+b.length];
		for(int i = 0; i < a.length;i++){
			c[i] = a[i];
		}
		for(int i = a.length; i < c.length;i++){
			c[i] = b[i - a.length];
		}
		return c;
	}
	//数组拼接的输出:
	public static 
	//数组截取
	//[start,end)
	public static int [] arraySub(int []a,int start,int end){
		if(a == null){
		//TODO
		throw new IllegalArgumentException(" a must be not null");
		}
		if(end > a.length && start > a.length){
			//end = a.length;
			throw new IllegalArgumentException("end or start must < a.length.");
		}
		if(start < 0 || end < 0){
			throw new IllegalArgumentException("start or end must > 0.");
		}
		if(end < start){
			throw new IllegalArgumentException(" end must > start.");
		}
		int len = end - start;
		int [] res = new int [len];
		for(int i = 0;i < len;i++){
			res[i] = a[start+i];
		}
			
		return res;
	}
	public static void printArray(int [] a){//数组截取的输出
		if(a == null){
			return;
			//throw new IllegalArgumentException("a nust be not null");
		}
		for(int i = 0; i < a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int [] arr1 = {22,4,55,644,345,324};
		int [] arr2 = {34,56,22,456};
		
		int max = arrayMaxElement(arr1);
		int min = arrayMinElement(arr1);
		int sum = arrayElementSum(arr1);
		int [] res1 = arrayJoin(arr1,arr2);
		int [] res2 = arraySub(arr2,1,3);
		printArray(res2);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(res1);
	}
}