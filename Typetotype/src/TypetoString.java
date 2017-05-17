
public class TypetoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = 78.5;
		//将基本类型转换为字符串
//		String str1 =  Double.toString(m);
		String str2 =  String.valueOf(m);
		System.out.println("m 转换为String型后与整数20的求和结果为： "+(str2+20));
		
		String str = "180.20";
	    // 将字符串转换为基本类型
		Double a = Double.valueOf(str)                       ;
	
		System.out.println("str 转换为double型后与整数20的求和结果为： "+(a+20));
	}

}
