import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 1.测试Collections.sort()方法，对Integer泛型的List进行排序
 * 2.对String泛型的List进行排序
 * 3.对其他类型泛型的List进行排序，以Student为例
 * @author Administrator
 *
 */
public class CollectionTest {
/**
 * 1.生成10个100以内的不同随机整数，进行排序
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
		 System.out.println("成功添加整数："+k);
	   }
	   System.out.println("------------排序前-------------");
	   for(Integer integer: IntegerList){
		   System.out.println("元素："+integer);
	   }
	   Collections.sort(IntegerList);
	   System.out.println("------------排序后-------------");
	   for(Integer integer: IntegerList){
		   System.out.println("元素："+integer);
	   }
	}
	/**
	 * 2.对String泛型的List进行排序
	 * 创建String泛型的List，添加三个乱序的String元素
	 * 调用sort方法，进行排序
	 * 
	 * 随机生成字符串
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
		

		System.out.println("------------排序前-------------");
		   for(String str: StringList){
			   System.out.println("元素："+str);
		   }
		   Collections.sort(StringList);
		   System.out.println("------------排序后-------------");
		   for(String str: StringList){
			   System.out.println("元素："+str);
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
		System.out.println("----------------排序前---------------");
		for(Student studen:studentlist){
			System.out.println("学生："+studen.id+","+studen.name);
		}
		Collections.sort(studentlist);
		System.out.println("----------------排序后---------------");
		for(Student studen:studentlist){
			System.out.println("学生："+studen.id+","+studen.name);
		
		}
		Collections.sort(studentlist,new StudentComparator());
		System.out.println("----------------按照学生姓名排序后---------------");
		for(Student stude:studentlist){
			System.out.println("学生："+stude.id+","+stude.name);
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
