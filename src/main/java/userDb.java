package controller;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserController {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

//       addUser(factory,session);
//
//        findUser(factory,session,3);
//
//        updateUser(session,3);
//
//        deleteUser(session,4);

        factory.close();
        session.close();
    }
    String hqlSelect = "SELECT u FROM User u"; // Example of HQL to get all records of user class using select
    TypedQuery<User> query = session.createQuery(hqlFrom, User.class);


}

String hqlCount = "SELECT COUNT(*) FROM User U";
private Object session;
List<Object> results = session.createQuery(hqlCount,Object.class).getResultList();
System.out.println("Count:"+results);

}

