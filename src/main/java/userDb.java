package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

