import java.util.*;
public class CarSystem {
	public static Carinfo[] cars={new Carinfo("�µ�A4",4,2,3,0,10),new Carinfo("����һ��",10,5,3,0,5),
			        new Carinfo("����",6,5,3,0,12),new Carinfo("С����",10,7,3,100,10),	
			        new Carinfo("�еȻ���",6,6,1,500,20),new Carinfo("�󿨳�",6,6,1,1000,40)};
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		int result = isNeed();
		while(result==1)
		{
			System.out.println("�⳵�ɹ���1 �����⳵��2 �˳�����ѡ��");
			int rent = scan.nextInt();
			if(rent==1)
				result = isNeed();
		}
		System.out.println("ллʹ�ô���⳵ϵͳ���ټ���");
	}
	public static int isNeed(){
		System.out.println("���Ƿ�Ҫ�⳵��1 �ǣ�2 �����������֣�1/2��:");
		int input = scan.nextInt();
		if(input==1)
		{
			System.out.println("�����⳵�����ͼ����������");
			System.out.println("���"+'\t'+"�⳵����"+'\t'+"��������"+'\t'+"��������"+'\t'+"�ػ���/��"+'\t'+"����/h"+'\t');
			for(int i=0;i<cars.length;i++){
				System.out.print(i+1);
				cars[i].ShowCarInfo();
			}
			System.out.println("��ѡ���⳵���ͣ���������ţ�");
			int type = scan.nextInt()-1;
			System.out.println("��ѡ���⳵���������������֣�");
			int num = scan.nextInt();
			while(num>cars[type].RestNum)
			{
				System.out.println("������˼��Ŀǰֻ��"+cars[type].RestNum+"��������");
				System.out.println("1 ����ѡ��2 �˳������������֣�");
				int choice= scan.nextInt();
				if(choice==1)
				{
					System.out.println("��ѡ���⳵���ͣ���������ţ�");
					type = scan.nextInt()-1;
					System.out.println("��ѡ���⳵���������������֣�");
					num = scan.nextInt();
				}					
				else
					return 0;
			}
			System.out.println("�����⳵��Ϣ���£�");
			System.out.println("�⳵����"+'\t'+"����"+'\t'+"��������"+'\t'+"�ػ���/��"+'\t'+"Ӧ�����"+'\t');
			System.out.println(cars[type].Name+'\t'+num+'\t'+cars[type].People*num+'\t'+cars[type].Goods*num+'\t'+cars[type].Price*num+'\t');
		    System.out.println("1 ȷ���⳵��2 �����˳�����ѡ��");
			int choice=scan.nextInt();
			if(choice==2)
				return 0;
			if(choice==1)
				cars[type].RestNum=cars[type].RestNum-num;
				
		}
		else if(input==2)
			  return 0;
		else
		{
			System.out.println("�������벻��ȷ�����������룺");
			isNeed();
		}
		return 1;
	}

}

