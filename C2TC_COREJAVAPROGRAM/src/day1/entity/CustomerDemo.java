package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		int m,n;
		m=100;
		
        //customer1
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setCname("raja");
		c1.setCity("chennai");
		System.out.println(c1);//object printing
		
		//customer2
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setCname("suve");
		c2.setCity("puducherry");
		System.out.println(c2);//object printing
	}

}
