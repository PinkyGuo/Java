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
    	Course cr1=new Course("1","数据结构");
    	courselist.add(cr1);
    	Course lt1=(Course)courselist.get(0);
    	System.out.println("添加课程"+":"+lt1.id+' '+lt1.name);
    	
        Course cr2=new Course("2","C语言");
        courselist.add(1,cr2);
        Course lt2=(Course)courselist.get(1);
    	System.out.println("添加课程"+":"+lt2.id+' '+lt2.name);
    	
        Course[] course = {new Course("3","信号处理"), new Course("4","汇编语言")};
        courselist.addAll(Arrays.asList(course));
        Course lt3=(Course)courselist.get(2);
        Course lt4=(Course)courselist.get(3);
        System.out.println("添加2门课程"+":"+lt3.id+" "+lt3.name+";"+lt4.id+" "+lt4.name);
    
        Course[] course2 = {new Course("5","通信原理"), new Course("6","高等数学")};
        courselist.addAll(2,Arrays.asList(course2));
        Course lt5=(Course)courselist.get(2);
        Course lt6=(Course)courselist.get(3);
        System.out.println("添加2门课程"+":"+lt5.id+" "+lt5.name+";"+lt6.id+" "+lt6.name);
    }
    public void CourseGet(){
    	int size = courselist.size();
    	System.out.println("有以下几门待选课程");
    	for(int i=0;i<size;i++)
    	{
    		Course cr=(Course)courselist.get(i);
    		System.out.println("课程"+":"+cr.id+" "+cr.name);
    	}
    }
    /**
     * 通过迭代器来遍历List
     * @param args
     */
    public void CourseIterator()
    {
    	Iterator lt = courselist.iterator();
    	System.out.println("有如下课程待选（通过迭代器访问）：");
    	while(lt.hasNext()){
    		Course cr = (Course)lt.next();
    		System.out.println("课程："+cr.id+" "+cr.name);
    	}
    }
    public void CourseForeach(){
    	System.out.println("有如下课程待选（通过foreach遍历）：");
    	for(Object obj:courselist){
    		Course cr = (Course)obj;
    		System.out.println("课程："+cr.id+" "+cr.name);
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
