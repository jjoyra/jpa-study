package helloJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = enf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

//            Member member = new Member();
//
//            member.setId(2L);
//            member.setName("HelloB");
//
//            Member findMem8ber = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .getResultList();
//
//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        enf.close();
    }
}