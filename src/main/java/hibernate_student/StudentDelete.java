package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDelete {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student student = manager.find(Student.class, 2);
		if(student!=null) {
			transaction.begin();
			manager.remove(student);
			transaction.commit();
		}
		else {
			System.out.println("Id Not Found!!");
		}
	}

}
