import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CourseList {
    public List<Course> courselist;
    public CourseList(){
    	this.courselist = new ArrayList<Course>();
    }
    public void CourseAdd(){
    	Course cr1=new Course("1","���ݽṹ");
    	courselist.add(cr1);
    	Course lt1=(Course)courselist.get(0);
    	System.out.println("��ӿγ�"+":"+lt1.id+' '+lt1.name);
    	
        Course cr2=new Course("2","C����");
        courselist.add(1,cr2);
        Course lt2=(Course)courselist.get(1);
    	System.out.println("��ӿγ�"+":"+lt2.id+' '+lt2.name);
    	
        Course[] course = {new Course("3","�źŴ���"), new Course("4","�������")};
        courselist.addAll(Arrays.asList(course));
        Course lt3=(Course)courselist.get(2);
        Course lt4=(Course)courselist.get(3);
        System.out.println("���2�ſγ�"+":"+lt3.id+" "+lt3.name+";"+lt4.id+" "+lt4.name);
    
        Course[] course2 = {new Course("5","ͨ��ԭ��"), new Course("6","�ߵ���ѧ")};
        courselist.addAll(2,Arrays.asList(course2));
        Course lt5=(Course)courselist.get(2);
        Course lt6=(Course)courselist.get(3);
        System.out.println("���2�ſγ�"+":"+lt5.id+" "+lt5.name+";"+lt6.id+" "+lt6.name);
    }
    public void CourseGet(){
    	int size = courselist.size();
    	System.out.println("�����¼��Ŵ�ѡ�γ�");
    	for(int i=0;i<size;i++)
    	{
    		Course cr=(Course)courselist.get(i);
    		System.out.println("�γ�"+":"+cr.id+" "+cr.name);
    	}
    }
    /**
     * ͨ��������������List
     * @param args
     */
    public void CourseIterator()
    {
    	Iterator lt = courselist.iterator();
    	System.out.println("�����¿γ̴�ѡ��ͨ�����������ʣ���");
    	while(lt.hasNext()){
    		Course cr = (Course)lt.next();
    		System.out.println("�γ̣�"+cr.id+" "+cr.name);
    	}
    }
    public void CourseForeach(){
    	System.out.println("�����¿γ̴�ѡ��ͨ��foreach��������");
    	for(Object obj:courselist){
    		Course cr = (Course)obj;
    		System.out.println("�γ̣�"+cr.id+" "+cr.name);
    	}
    }
    
    public static void main(String[] args)
    {
    	CourseList course1=new CourseList();
    	course1.CourseAdd();
    	course1.CourseGet();
    	course1.CourseIterator();
    	course1.CourseForeach();
    	
    }
}
