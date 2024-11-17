package serialize;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 

	
	{
		List<Person> lsitOfPeople = new ArrayList<>();
        Person person = new Person(12345, "Broadband", "Bill", 60.0, 2022, 180.0);
        Person p2 = new Person(12346, "Mobile", "Bill", 40.0, 2021, 0.0);
        Person p3 = new Person(12347, "Mobile", "Top Up", 20.0, 2022, 0.0);
        Person p4 = new Person(12348, "Broadband", "Bill", 80.0, 2019, 0.0);
        Person p5 = new Person(12349, "Mobile", "Top Up", 60.0, 2017, 0.0);
        lsitOfPeople.add(person);
        lsitOfPeople.add(p2);
        lsitOfPeople.add(p3);
        lsitOfPeople.add(p4);
        lsitOfPeople.add(p5);
        double totalCost = 0.0;
        double avrgCost = 0.0;
        System.out.println("total number of customers "+lsitOfPeople.size());
        for(Person p:lsitOfPeople )
        {
        	totalCost += p.getContractCost();
        }
        
        System.out.println("Total Cost "+ totalCost);
        System.out.println("Average Cost "+(totalCost/lsitOfPeople.size()));
        System.out.println("Average Cost "+(totalCost/lsitOfPeople.size()));

        Person[] arr = {person,p2,p3,p4,p5};

        for(Person p :arr)
        {
        	System.out.println(p.getAccountNumber()+ " "+ p.getArreans()+" "+p.getContractType());
        }
        
        
        
        
//        Person[] pe  =  {person,p2,p3,p4,p5};
        
        
//        double totalCost = 0.0;
//        int totalNumbers = pe.length;
//        for(Person p : pe) {
//        	lsitOfPeople.add(p);
//        	totalCost += p.getContractCost();
//        }
//        for(Person p : lsitOfPeople) {
//        	System.out.println(p.getAccountNumber()+" "+ p.getPlanType()+" "+ p.getContractCost()+" "+ p.getContractCost()+" "+ p.getYearRegister()+" "+p.getAccountNumber());
//        }
//        double avrg  = totalCost/ totalNumbers;
//        
//        System.out.println("total customer = "+totalNumbers);
//        System.out.println("total cost = "+totalCost);
//        System.out.println("avrg = " + avrg);






		//		Customer c = new Customer("taha","taha@gmail.com");
//		serialized2(c);
//		System.out.println();
//
//		Customer c2 = deserialized2();
//		System.out.println("file has been deserialized: " + c2);

		
		
		
	}
	
	public static void serialize(Customer c) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customer.ser")))
		{
			out.writeObject(c);
			System.out.println("file has been created and saved as customer.ser");
		}
		catch(IOException e )
		{
			System.out.println("Error: "+e.getMessage());

		}
		
	}
	
	public static Customer deserialize()
	{
		Customer c = null;
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("customer.ser")))
		{
			c = (Customer) in.readObject();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error: "+e.getMessage());

		}
		catch(IOException e)
		{
			System.out.println("Error: "+e.getMessage());

		}

		return c;
	}

	
	
	public static void serialized2(Customer c)
	{
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("taha.ser")))
		{
			out.writeObject(c);

			
			
		}
		catch(IOException e)
		{
			System.out.println("Error: "+ e.getMessage());
		}
	}

	
	public static Customer deserialized2()
	{
		Customer c = null;
		
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("taha.ser")))
		{
			c = (Customer) in.readObject();
		} 
		catch (ClassNotFoundException e)
		{

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return c;
		
	}

	
	public static Customer deserializeing()
	
	{
		Customer c = null;

		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("customer.ser")))
		{
			c = (Customer) in.readObject();
			System.out.println("Done...");
		}
		
		
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException err) {
			err.printStackTrace();
		}
		
		return c;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void serializes(Customer c)
	{
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customer.ser")))
		{
			out.writeObject(c);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
