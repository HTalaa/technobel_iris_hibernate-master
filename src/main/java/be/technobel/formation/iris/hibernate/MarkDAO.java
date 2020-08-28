package be.technobel.formation.iris.hibernate;

import be.technobel.formation.iris.hibernate.model.Car;
import be.technobel.formation.iris.hibernate.model.Mark;
import org.hibernate.Session;

public class MarkDAO {
    public void insert(Mark mark){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(mark);

        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();


    }
}
