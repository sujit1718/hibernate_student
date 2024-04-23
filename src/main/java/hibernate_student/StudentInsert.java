package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentInsert {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(2);
		student.setName("Aditya");
		student.setMark(82.15);
		student.setPhone(1234567765L);
		student.setAddress("Beed");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}

}
