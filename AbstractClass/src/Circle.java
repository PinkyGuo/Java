
public class Circle extends Shape {
   private double r;
   public Circle(double r){
	   this.r = r;
   }
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
     System.out.println("Բ�ε��ܳ���"+2*3.14*r);
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
     System.out.println("Բ�ε������"+2*3.14*r*r);
	}

}
