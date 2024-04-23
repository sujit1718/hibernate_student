package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {
	
    public static void main(String[] args) {
		
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
	    EntityManager manager = factory.createEntityManager();
	
        Student student = manager.find(Student.class, 1);
    	if (student!=null) {
	     	student.setAddress("Jewari");
	        EntityTransaction transaction = manager.getTransaction();
	        transaction.begin();
	        manager.merge(student);
	        transaction.commit();
	    }else {
	    	System.out.println("Id Not Found!!!");
	    }
	
    }
  }

