package object_class;

public class First_pgm {
	int rollno;
	String name;
	char grade;
	void display()
	{
		System.out.println("Display the data");
	}

	public static void main(String[] args) {
		First_pgm pg=new First_pgm();
		pg.display();
		System.out.println(pg.rollno=2);
		System.out.println(pg.name="Sush");
		System.out.println(pg.grade='A');
		
		

	}

}
