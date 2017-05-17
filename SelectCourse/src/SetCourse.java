import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SetCourse {
	public List<Course> selectedcourse;
	public Student student;
	private Scanner console;
	public SetCourse(){
		this.selectedcourse = new ArrayList<Course>(); 
		this.console = new Scanner(System.in);
	}
	public void CourseAdd(){
    	Course cr1=new Course("1","���ݽṹ");
    	selectedcourse.add(cr1);
//    	Course lt1=(Course)selectedcourse.get(0);
//    	System.out.println("��ӿγ�"+":"+lt1.id+' '+lt1.name);
    	
        Course cr2=new Course("2","C����");
        selectedcourse.add(1,cr2);
//        Course lt2=(Course)selectedcourse.get(1);
//    	System.out.println("��ӿγ�"+":"+lt2.id+' '+lt2.name);
    	
        Course[] course = {new Course("3","�źŴ���"), new Course("4","�������")};
        selectedcourse.addAll(Arrays.asList(course));
        /*Course lt3=(Course)selectedcourse.get(2);
        Course lt4=(Course)selectedcourse.get(3);
        System.out.println("���2�ſγ�"+":"+lt3.id+" "+lt3.name+";"+lt4.id+" "+lt4.name);*/
    
        Course[] course2 = {new Course("5","ͨ��ԭ��"), new Course("6","�ߵ���ѧ")};
        selectedcourse.addAll(2,Arrays.asList(course2));
        /*Course lt5=(Course)selectedcourse.get(2);
        Course lt6=(Course)selectedcourse.get(3);
        System.out.println("���2�ſγ�"+":"+lt5.id+" "+lt5.name+";"+lt6.id+" "+lt6.name);*/
    }
	public void CourseIterator()
    {
    	Iterator lt = selectedcourse.iterator();
    	System.out.println("�����¿γ̴�ѡ��ͨ�����������ʣ���");
    	while(lt.hasNext()){
    		Course cr = (Course)lt.next();
    		System.out.println("�γ̣�"+cr.id+" "+cr.name);
    	}
    }
	/**
	 * contains��������List���Ƿ����ĳ������
	 * containsAll��������List���Ƿ������������
	 * indexOf������ȡ��ĳԪ�صĵ�һ������λ��
	 * lastIndexOf������ȡĳ��Ԫ�ص����һ������λ��
	 */
	public void ContainsCourse(){
		System.out.println("������γ����ƣ�");
		String name = console.next();	
		Course course = new Course();
		course.name=name;
		System.out.println("�γ��б����Ƿ����"+course.name+":"+selectedcourse.contains(course));
	    if(selectedcourse.contains(course))
	    	System.out.println(course.name+"�ڱ�ѡ�γ��е�����λ�ã�"+selectedcourse.indexOf(course));
	}
	public void CreateStuAndSelectCour(){
	     student=new Student("1","С��");
	     System.out.println("��ӭ"+student.name+"ͬѧ��ѡ�Σ�");
	     Scanner input=new Scanner(System.in);
	     for(int i=0;i<3;i++)
	     {
	    	 System.out.println("������γ�ID");
	    	 String courseid=input.next();
		     for(Course cr:selectedcourse)
		     {
		    	 if(cr.id.equals(courseid))
		    	 {
		    		 student.courses.add(cr);
		    	 }
		     }
	     }
	     PrintCourse(student);
	}
	/**
	 * contains��������Set���Ƿ����ĳ������
	 * containsAll��������Set���Ƿ������������
	 */
	public void ContainsSetCourse(){
		System.out.println("��������ѡ�γ����ƣ�");
		String name = console.next();	
		Course course = new Course();
		course.name=name;
		System.out.println("ѧ���γ��б����Ƿ����"+course.name+":"+student.courses.contains(course));
	    
	}
	public static void main(String[] args)
	{
		 SetCourse lt=new SetCourse();
	     lt.CourseAdd();
	     lt.CourseIterator();
         lt.ContainsCourse();
//	     lt.CreateStuAndSelectCour();
//	     lt.ContainsSetCourse();

	    	
	 }
	 public void PrintCourse(Student stu)
	 {
		 System.out.println(stu.name+"ͬѧѡ�������¼��ſΣ�");
		 for(Course cr:stu.courses){
			 System.out.println(cr.id+":"+cr.name);
		 }
	} 
}
