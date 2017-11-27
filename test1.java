import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class test1
{
	public void listfunc()
	{
        List<String> strList = new ArrayList<>();
        strList.add("karthik");
        strList.add("karthik1");
        strList.add("karthik2");
        strList.add("karthik3");
        strList.add("karthik4");
        strList.add("karthik5");
        strList.add("karthik6");
        strList.add("karthik7");
        
      //using for-each loop
      for(String obj : strList){
          System.out.println(obj);
      }

      //using iterator
      Iterator<String> it = strList.iterator();
      while(it.hasNext()){
          String obj = it.next();
          System.out.println(obj);
      }
	}
	
	public void fib(int number)
	{
		int a = 0;
		int temp = 0;
		int b = 1;
		
		while ( a < number)
		{
			System.out.println(a);
			temp = a;
			a = b;
			b = temp + b;
			
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "test2 calling" );
        test1 obj = new test1();
        //obj.listfunc();
        obj.fib(1000);
      
    }
}
