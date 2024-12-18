package com.codewithz;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.script.ScriptEngine;
import java.util.List;

public class MaxSalaryInIT {
    public static void main(String[] args) {
        try {
            Configuration cfg=new Configuration().configure();
            SessionFactory sessionFactory=cfg.buildSessionFactory();
            Session session=sessionFactory.openSession();

           Criteria criteria=session.createCriteria(Employee.class);
           criteria.add(Restrictions.eq("dept","IT"));
           criteria.setProjection(Projections.max("salary"));

           double maxSalary= (double)criteria.uniqueResult();

            System.out.println("Max Salary in IT is:"+maxSalary);




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
