package iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	public static void testItorator()
	{
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        // Accessing an Iterator
        Iterator<String> iterator = list.iterator();

        // Using Iterator Methods
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
            
        }
	}
	
	public static void test()
	{
		List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("taha");
		list.add("samer");
		list.add("Hadi");
		
		Iterator<String> iterator = list.iterator()	;
		while(iterator.hasNext())
		{
			String element = iterator.next();
			System.out.println(element);
		}
	}
public static void testIterator2()
{

	List<Integer> list = new ArrayList<>();
	for(int i  = 0 ; i < 10; i++)
	{
		list.add(i);
	}
	System.out.println(list);
	
	Iterator<Integer> iterator = list.iterator();
	
	while(iterator.hasNext())
	{
		int element = iterator.next();
		System.out.println(element);
	}
	
}

public static void testIterator3()
{
	List<Boolean> list = new ArrayList<>();
	
	
	for(int i = 0; i <= 5;i++)
	{

		list.add(false);

		list.add(true);
		
	}
	
	System.out.println(list);
	
	
	Iterator<Boolean> iterator  = list.iterator();
	
	while(iterator.hasNext())
	{
		boolean element = iterator.next();
		System.out.println("Element is :"+ element);
	}
	
}
    public static void main(String[] args) {
//    	testIterator3();
    	test();
    }
}
