import java.util.Scanner;
/**
 * ö�����ʹ��
 * @author Administrator
 *
 */
enum Size{ 
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	private String abbreviation;
	private Size(String abbreviation){this.abbreviation = abbreviation;}
	
	public String getAbbreviation(){return abbreviation;}//���Է���ö�������д
};
public class test {
//	public enum Size{ SMALL,MEDIUM,LARGE,EXTRA_LARGE};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
    String input = in.next().toUpperCase();
    Size size = Enum.valueOf(Size.class, input);
    System.out.println("size="+size);
    System.out.println("abbreviation="+size.getAbbreviation());
    if(size == Size.EXTRA_LARGE)
    	System.out.println("GOOD_job!");
	}

	
}
