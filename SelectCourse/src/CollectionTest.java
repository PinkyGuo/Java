import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 1.����Collections.sort()��������Integer���͵�List��������
 * 2.��String���͵�List��������
 * 3.���������ͷ��͵�List����������StudentΪ��
 * @author Administrator
 *
 */
public class CollectionTest {
/**
 * 1.����10��100���ڵĲ�ͬ�����������������
 */
	public void TestSortInt(){
	   List<Integer> IntegerList = new ArrayList<Integer>();
	   Random random = new Random();
	   Integer k;
	   for(int i=0;i<10;i++){
		 do{
			 k = random.nextInt(100);
		 }while(IntegerList.contains(k));
		 IntegerList.add(k);
		 System.out.println("�ɹ����������"+k);
	   }
	   System.out.println("------------����ǰ-------------");
	   for(Integer integer: IntegerList){
		   System.out.println("Ԫ�أ�"+integer);
	   }
	   Collections.sort(IntegerList);
	   System.out.println("------------�����-------------");
	   for(Integer integer: IntegerList){
		   System.out.println("Ԫ�أ�"+integer);
	   }
	}
	/**
	 * 2.��String���͵�List��������
	 * ����String���͵�List��������������StringԪ��
	 * ����sort��������������
	 * 
	 * ��������ַ���
	 */
	public void TestSortStr(){
		List<String> StringList = new ArrayList<String>();
		String base="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuffer string = new StringBuffer();
		int k = 0;
		Random random = new Random();
		for(int j=0;j<10;j++){
			string.delete(0,10);
			for(int i=0;i<10;i++){
				k=random.nextInt(base.length());
				string.append(base.charAt(k));
			}
			StringList.add(string.toString());
		}
		

		System.out.println("------------����ǰ-------------");
		   for(String str: StringList){
			   System.out.println("Ԫ�أ�"+str);
		   }
		   Collections.sort(StringList);
		   System.out.println("------------�����-------------");
		   for(String str: StringList){
			   System.out.println("Ԫ�أ�"+str);
		   }
	}
	public void TestSortStudent(){
		List<Student> studentlist=new ArrayList<Student>();
		Random random = new Random();
		Integer[] ID=new Integer[3];
		for(int i=0;i<3;i++){
			ID[i]=random.nextInt(100);
		}
		studentlist.add(new Student(ID[0]+"","Mike"));
		studentlist.add(new Student(ID[1]+"","Angela"));
		studentlist.add(new Student(ID[2]+"","Lucy"));
		System.out.println("----------------����ǰ---------------");
		for(Student studen:studentlist){
			System.out.println("ѧ����"+studen.id+","+studen.name);
		}
		Collections.sort(studentlist);
		System.out.println("----------------�����---------------");
		for(Student studen:studentlist){
			System.out.println("ѧ����"+studen.id+","+studen.name);
		
		}
		Collections.sort(studentlist,new StudentComparator());
		System.out.println("----------------����ѧ�����������---------------");
		for(Student stude:studentlist){
			System.out.println("ѧ����"+stude.id+","+stude.name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest it=new CollectionTest();
		it.TestSortInt();
		it.TestSortStr();
		it.TestSortStudent();
		
	}

}
