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
		students.put("1", new Student("1","С��"));
		students.put("2", new Student("2","С��"));
		students.put("3", new Student("3","С��"));
		students.put("4", new Student("4","С��"));
		console = new Scanner(System.in);
	}
	/**
	 * ͨ��put��Ӻ��޸���Ϣ
	 */
	public void PutStudent(){	
		int i = 0;
		while(i<3){
			System.out.println("������ѧ��ID��");
			String ID = console.next();
			//�жϸ�ID�Ǳ�ռ��
			Student st = students.get(ID);
			if(st == null){
				//��ʾ����ѧ������
				System.out.println("������ѧ��������");
				String name = console.next();
				//�����µ�ѧ������
				Student newStudent = new Student(ID,name);
				//ͨ������students��put���������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);
			    i++;
			
			}else{
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}
			
	}
	public void ChangeStudent(){	

			System.out.println("������Ҫ�޸ĵ�ѧ��ID��");
			String ID = console.next();
			//�жϸ�ID�Ǳ�ռ��
			Student st = students.get(ID);
			if(st != null){
				//��ʾ����ѧ������
				System.out.println("������ѧ��������");
				String name = console.next();
				//�����µ�ѧ������
				Student newStudent = new Student(ID,name);
				//ͨ������students��put���������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.print("�ɹ��޸�ѧ����");
				System.out.print("ѧ��ID��"+ID+" ");
				System.out.println("������"+newStudent.name);
			
			}else{
				System.out.println("��ѧ��ID�����ڣ�");

		}
			
	}
	/**
	 * ͨ��KeySet����Map����
	 */
	public void KeySetStudent(){
		//ͨ��keySet����������Map�е����С�������Set����
		Set<String> keySet = students.keySet();
		//ȡ��students������
		System.out.println("�ܹ��У�"+students.size()+"��ѧ����");
		for(String id:keySet){
			Student st = students.get(id);
			if(st!=null)
				System.out.println("ѧ����"+st.name);
		}
	}
	/**
	 * ͨ��entrySet����������Map
	 */
	public void EntrySetStudent(){
		//ͨ��entrySet����������Map����ļ�ֵ��
		Set<Entry<String,Student>>entrySet = students.entrySet();
		for(Entry<String,Student> stu:entrySet){
			System.out.print("ѧ��ID��"+stu.getKey());
			System.out.println("������"+stu.getValue().name);
		}
	}
	public void RemoveStudent(){
		
		while(true){
			System.out.println("������Ҫɾ����ѧ��ID��");
			String ID = console.next();
			Student st = students.get(ID);
			if(st == null){
				System.out.println("��ID�����ڣ�");
				continue;
			}
			System.out.println("�ɹ�ɾ��ѧ����"+students.get(ID).name);
			students.remove(ID);	
			break;
				
		}
		
		
	}
	/**
	 * ����Map�У��Ƿ����ĳ��Keyֵ����ĳ��Valueֵ
	 * ��Map�У���containsKey()�������ж��Ƿ����ĳ��Keyֵ
	 * ��containsValue()���������ж��Ƿ����ĳ��Valueֵ
	 * @param args
	 */
	public void ContiansMap(){
		System.out.println("������Ҫ��ѯ��ѧ��ID��");
		String id = console.next();
		System.out.println("�������ѧ��IDΪ��"+id+",��ѧ��ӳ������Ƿ���ڣ�"+students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("��Ӧ��ѧ��Ϊ��"+students.get(id).name);
		System.out.println("������Ҫ��ѯ��ѧ��������");
		String name = console.next();
		System.out.println("�������ѧ������Ϊ��"+name+",��ѧ��ӳ������Ƿ���ڣ�"+students.containsValue(new Student(null,name)));

	}
	public void Index(){
		System.out.println("��ӭ����ѧ������ϵͳ");
          
        int flag = 1;
        int need =1;
        do{
        	System.out.println("���ɽ��еĲ����������£�");
    		System.out.println("1:��ѯѧ����Ϣ");
    		System.out.println("2:���ѧ����Ϣ");
    		System.out.println("3:ɾ��ѧ����Ϣ");
    		System.out.println("4:�޸�ѧ����Ϣ");
        	System.out.println("����������(1~4):"); 
        	need = console.nextInt();
			if(need ==1){
				System.out.println("ϵͳĿǰ���е�ѧ����Ϣ���£�");
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
			System.out.println("1:��������,2:�˳���������:");
			flag = console.nextInt();
        }while(flag==1);
        System.out.println("�ټ���");
			
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
