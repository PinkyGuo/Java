
public class TypetoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = 78.5;
		//����������ת��Ϊ�ַ���
//		String str1 =  Double.toString(m);
		String str2 =  String.valueOf(m);
		System.out.println("m ת��ΪString�ͺ�������20����ͽ��Ϊ�� "+(str2+20));
		
		String str = "180.20";
	    // ���ַ���ת��Ϊ��������
		Double a = Double.valueOf(str)                       ;
	
		System.out.println("str ת��Ϊdouble�ͺ�������20����ͽ��Ϊ�� "+(a+20));
	}

}
