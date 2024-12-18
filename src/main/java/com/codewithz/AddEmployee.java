package com.codewithz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

public class AddEmployee {

    public static void main(String[] args) {
        try {
            Configuration cfg=new Configuration().configure();
            SessionFactory sessionFactory=cfg.buildSessionFactory();
            Session session=sessionFactory.openSession();

            Transaction tx=session.beginTransaction();

            Employee employee=new Employee();
            employee.setName("Tom");
            employee.setSalary(5000);
            employee.setDept("IT");
            employee.setDesignation("Developer");
            employee.setDateOfJoin(new Date(2023, Calendar.FEBRUARY,23));

            session.save(employee);
            tx.commit();
            System.out.println("Employee added successfully");
            session.close();

        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
