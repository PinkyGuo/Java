package pinky;

//�ⲿ��
public class test {
  
  private String name = "��Ľ��";
  
  // �ⲿ���е�show����
  public void show() { 
		// ���巽���ڲ���
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
      
		// ���������ڲ���Ķ���
      MInner mi=new MInner();
      
      // �����ڲ���ķ���
		int newScore=mi.getScore();
      
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
	}
  
	// ���Է����ڲ���
	public static void main(String[] args) {
      
		// �����ⲿ��Ķ���
      test mo= new test();
      
      // �����ⲿ��ķ���
		mo.show();
	}
}
