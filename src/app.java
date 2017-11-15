import finalproj.models.StudentEntity;
import finalproj.models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
public class app {
    public static void main(String args[]){
      StudentEntity se1 = new StudentEntity();
      se1.setStudentEmail("ab");
      se1.setStudentId("12");
      se1.setStudentName("hj");
      se1.setStudentPhno("123");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(se1);
        em.getTransaction().commit();
        em.close();
    }

}
