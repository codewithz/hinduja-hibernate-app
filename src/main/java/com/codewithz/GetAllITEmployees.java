package com.codewithz;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetAllITEmployees {
    public static void main(String[] args) {

        try {
            Configuration cfg=new Configuration().configure();
            SessionFactory sessionFactory=cfg.buildSessionFactory();
            Session session=sessionFactory.openSession();

            String hql="from Employee where dept='IT'";
            Query<Employee> query=session.createQuery(hql,Employee.class);
            List<Employee> employees=query.list();

            for(Employee e:employees){
                System.out.println(e);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
