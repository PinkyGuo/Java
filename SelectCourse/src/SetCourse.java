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
    	Course cr1=new Course("1","数据结构");
    	selectedcourse.add(cr1);
//    	Course lt1=(Course)selectedcourse.get(0);
//    	System.out.println("添加课程"+":"+lt1.id+' '+lt1.name);
    	
        Course cr2=new Course("2","C语言");
        selectedcourse.add(1,cr2);
//        Course lt2=(Course)selectedcourse.get(1);
//    	System.out.println("添加课程"+":"+lt2.id+' '+lt2.name);
    	
        Course[] course = {new Course("3","信号处理"), new Course("4","汇编语言")};
        selectedcourse.addAll(Arrays.asList(course));
        /*Course lt3=(Course)selectedcourse.get(2);
        Course lt4=(Course)selectedcourse.get(3);
        System.out.println("添加2门课程"+":"+lt3.id+" "+lt3.name+";"+lt4.id+" "+lt4.name);*/
    
        Course[] course2 = {new Course("5","通信原理"), new Course("6","高等数学")};
        selectedcourse.addAll(2,Arrays.asList(course2));
        /*Course lt5=(Course)selectedcourse.get(2);
        Course lt6=(Course)selectedcourse.get(3);
        System.out.println("添加2门课程"+":"+lt5.id+" "+lt5.name+";"+lt6.id+" "+lt6.name);*/
    }
	public void CourseIterator()
    {
    	Iterator lt = selectedcourse.iterator();
    	System.out.println("有如下课程待选（通过迭代器访问）：");
    	while(lt.hasNext()){
    		Course cr = (Course)lt.next();
    		System.out.println("课程："+cr.id+" "+cr.name);
    	}
    }
	/**
	 * contains方法测试List中是否包含某个对象
	 * containsAll方法测试List中是否包含几个对象
	 * indexOf方法来取得某元素的第一个索引位置
	 * lastIndexOf方法获取某个元素的最后一个索引位置
	 */
	public void ContainsCourse(){
		System.out.println("请输入课程名称：");
		String name = console.next();	
		Course course = new Course();
		course.name=name;
		System.out.println("课程列表中是否包含"+course.name+":"+selectedcourse.contains(course));
	    if(selectedcourse.contains(course))
	    	System.out.println(course.name+"在备选课程中的索引位置："+selectedcourse.indexOf(course));
	}
	public void CreateStuAndSelectCour(){
	     student=new Student("1","小张");
	     System.out.println("欢迎"+student.name+"同学来选课！");
	     Scanner input=new Scanner(System.in);
	     for(int i=0;i<3;i++)
	     {
	    	 System.out.println("请输入课程ID");
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
	 * contains方法测试Set中是否包含某个对象
	 * containsAll方法测试Set中是否包含几个对象
	 */
	public void ContainsSetCourse(){
		System.out.println("请输入已选课程名称：");
		String name = console.next();	
		Course course = new Course();
		course.name=name;
		System.out.println("学生课程列表中是否包含"+course.name+":"+student.courses.contains(course));
	    
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
		 System.out.println(stu.name+"同学选择了以下几门课：");
		 for(Course cr:stu.courses){
			 System.out.println(cr.id+":"+cr.name);
		 }
	} 
}
