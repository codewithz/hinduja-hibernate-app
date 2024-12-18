package com.codewithz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddEmployee {

    public static void main(String[] args) {
        try {
            Configuration cfg=new Configuration().configure();
            SessionFactory sessionFactory=cfg.buildSessionFactory();
            Session session=sessionFactory.openSession();

        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
