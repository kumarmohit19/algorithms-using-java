
public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        Test t = new Test();
        t = null;    
        System.gc(); 
        Thread.sleep(1000); 
        System.out.println("end main");
        
        int a = 6, b = 7;
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("a="+a+" b="+b);
    }
  
    @Override
    protected void finalize() 
    {
        System.out.println("finalize method called");
        System.out.println(10/0);
    }
      
}