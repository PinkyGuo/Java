
public class Test {
    
    String name; // ��������name
	String sex; // ��������sex
	static int age;// ������̬����age
    
    // ���췽��
	public    Test    () { 
		System.out.println("ͨ�����췽����ʼ��name");
		name = "tom";
	}
    
    // ��ʼ����
	{ 
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex = "��";
		age = 21 ;
	}
    
    // ��̬��ʼ����
	   static   { 
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
		age = 20;
	}
    
	public void show() {
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
    
	public static void main(String[] args) {
        
        // ��������
		Test hello = new Test();
		// ���ö����show����
        hello.show();
        
	}
}
