import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ʹ��format()����������ת��Ϊָ����ʽ���ı�
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		// ����Date���󣬱�ʾ��ǰʱ��
        Date now = new Date();
        
        // ����format()������������ת��Ϊ�ַ��������
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));

    	// ʹ��parse()�������ı�ת��Ϊ����
		String a ="2017-05-03 17:19:28";
		SimpleDateFormat type = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       try{
        // ����parse()���������ַ���ת��Ϊ����
		Date date = type.parse(a);
		System.out.println(date);
       }catch(ParseException e)	
       {
    	   System.out.println("�ı����ڸ�ʽ��ƥ�䣬�޷�תΪ����");
       }
        
		
	}

}
