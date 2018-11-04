//Java中的JDK用 import 来引用
public class JDK{
	public static int [] circulate(String[] args){//返回值为数组
		int [] data = {};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int avg = 0;
		int sum = 0;
		for(int i = 0;i < data.length;i++){
			if(data[i] > max){
				max = data[i];
			}
			if(data[i] < min){
				min = data[i];
			}
		    sum = sum +data[i];
			avg = sum / data.length;
			return [max,min,avg,sum] 
			
			
	