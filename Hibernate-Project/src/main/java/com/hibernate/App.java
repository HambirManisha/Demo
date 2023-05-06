package com.hibernate;

import java.util.List;

import com.hibernate.criteria.Employee;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
     //  Configuration configuration = new Configuration();
    //	configuration.configure("hibernate.cfg.xml");
       
       
       Configuration conf=new Configuration();
       SessionFactory sf=conf.configure("hibernate.cfg.xml").buildSessionFactory();
       
       
       Employee e1=new Employee(1,"Manisha","Hambir",22,"Msc",2000);
       Employee e2=new Employee(2,"Ashwini","Dope",21,"Msc",4000);
       Employee e3=new Employee(3,"Yuvraj","Hambir",20,"BCA",6000);
       Employee e4=new Employee(4,"Dhananjay","Kutte",26,"MA",7000);

       
       Session session=sf.openSession();
       
       Criteria criteria = session.createCriteria(Employee.class);
       
       
       
       
       // Retrieve All the Employees using Criteria
       System.out.println("All the empoyees retrieved using Criteria");
      // displayEmployeeDetails(criteria.list());
       
       Criterion employeeIdCriterion = Restrictions.eq("employeeId", 2);
       criteria.add(employeeIdCriterion);
       System.out.println("Employee record whose id is 2");
       
       Criteria empList = session.createCriteria(Employee.class).
    		   add(Restrictions.eq("employeeId",2));
       session.beginTransaction();
      // session.merge(s1);
      // session.merge(s2);
       
       // save object
      // session.persist();
      session.save(e1);
       session.save(e2);
       session.save(e3);
       session.save(e4);
       
       session.getTransaction().commit();
       session.close();
       

       
    }
}
