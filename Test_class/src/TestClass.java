
public class TestClass {
     int status;
     int size;
     int colour;
     TestClass(int Status,int Size,int Colour){
    	 status=Status;
    	 size=Size;
    	 colour=Colour;
     }
     public void SetVar(int Status,int Size,int Colour){
    	 status=Status;
    	 size=Size;
    	 colour=Colour;
     }
     public void ShowVar(){
    	 System.out.println("×´Ì¬£º"+status);
    	 System.out.println("³ß´ç£º"+size);
    	 System.out.println("ÑÕÉ«£º"+colour);
    	 
     }
}
