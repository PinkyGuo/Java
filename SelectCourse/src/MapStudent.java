import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapStudent {

	public Map<String,Student>students;
	private Scanner console;
	public MapStudent(){
		students = new HashMap<String,Student>();
		students.put("1", new Student("1","小明"));
		students.put("2", new Student("2","小红"));
		students.put("3", new Student("3","小新"));
		students.put("4", new Student("4","小蓝"));
		console = new Scanner(System.in);
	}
	/**
	 * 通过put添加和修改信息
	 */
	public void PutStudent(){	
		int i = 0;
		while(i<3){
			System.out.println("请输入学生ID：");
			String ID = console.next();
			//判断该ID是被占用
			Student st = students.get(ID);
			if(st == null){
				//提示输入学生姓名
				System.out.println("请输入学生姓名：");
				String name = console.next();
				//创建新的学生对象
				Student newStudent = new Student(ID,name);
				//通过调用students的put方法，添加ID-学生映射
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);
			    i++;
			
			}else{
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
			
	}
	public void ChangeStudent(){	

			System.out.println("请输入要修改的学生ID：");
			String ID = console.next();
			//判断该ID是被占用
			Student st = students.get(ID);
			if(st != null){
				//提示输入学生姓名
				System.out.println("请输入学生姓名：");
				String name = console.next();
				//创建新的学生对象
				Student newStudent = new Student(ID,name);
				//通过调用students的put方法，添加ID-学生映射
				students.put(ID, newStudent);
				System.out.print("成功修改学生：");
				System.out.print("学生ID："+ID+" ");
				System.out.println("姓名："+newStudent.name);
			
			}else{
				System.out.println("该学生ID不存在！");

		}
			
	}
	/**
	 * 通过KeySet遍历Map对象
	 */
	public void KeySetStudent(){
		//通过keySet方法，返回Map中的所有“键”的Set集合
		Set<String> keySet = students.keySet();
		//取得students的容量
		System.out.println("总共有："+students.size()+"个学生！");
		for(String id:keySet){
			Student st = students.get(id);
			if(st!=null)
				System.out.println("学生："+st.name);
		}
	}
	/**
	 * 通过entrySet方法来遍历Map
	 */
	public void EntrySetStudent(){
		//通过entrySet方法，返回Map对象的键值对
		Set<Entry<String,Student>>entrySet = students.entrySet();
		for(Entry<String,Student> stu:entrySet){
			System.out.print("学生ID："+stu.getKey());
			System.out.println("姓名："+stu.getValue().name);
		}
	}
	public void RemoveStudent(){
		
		while(true){
			System.out.println("请输入要删除的学生ID：");
			String ID = console.next();
			Student st = students.get(ID);
			if(st == null){
				System.out.println("该ID不存在！");
				continue;
			}
			System.out.println("成功删除学生："+students.get(ID).name);
			students.remove(ID);	
			break;
				
		}
		
		
	}
	/**
	 * 测试Map中，是否包含某个Key值或者某个Value值
	 * 在Map中，用containsKey()方法，判断是否包含某个Key值
	 * 用containsValue()方法，来判断是否包含某个Value值
	 * @param args
	 */
	public void ContiansMap(){
		System.out.println("请输入要查询的学生ID：");
		String id = console.next();
		System.out.println("您输入的学生ID为："+id+",在学生映射表中是否存在："+students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("对应的学生为："+students.get(id).name);
		System.out.println("请输入要查询的学生姓名：");
		String name = console.next();
		System.out.println("您输入的学生姓名为："+name+",在学生映射表中是否存在："+students.containsValue(new Student(null,name)));

	}
	public void Index(){
		System.out.println("欢迎进入学生管理系统");
          
        int flag = 1;
        int need =1;
        do{
        	System.out.println("您可进行的操作功能如下：");
    		System.out.println("1:查询学生信息");
    		System.out.println("2:添加学生信息");
    		System.out.println("3:删除学生信息");
    		System.out.println("4:修改学生信息");
        	System.out.println("请输入数字(1~4):"); 
        	need = console.nextInt();
			if(need ==1){
				System.out.println("系统目前已有的学生信息如下：");
				EntrySetStudent();
				
			}
			if(need ==2){
				PutStudent();
			}
			if(need ==3){
				RemoveStudent();
			}
			if(need ==4){
				ChangeStudent();
			}
			System.out.println("1:继续操作,2:退出。请输入:");
			flag = console.nextInt();
        }while(flag==1);
        System.out.println("再见！");
			
	}
	public static void main(String[] args){		
		MapStudent mt = new MapStudent();
		mt.Index();
//		mt.PutStudent();
//		mt.EntrySetStudent();
//		mt.RemoveStudent();
//		mt.KeySetStudent();
//		mt.ContiansMap();
	}
}
