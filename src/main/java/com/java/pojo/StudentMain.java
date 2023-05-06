package com.java.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
public static void main(String[] args) {
	Student st=new Student();
	st.setId(11);
	st.setName("Manisha");
	System.out.println("Student========>" +st);
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Student stud=(Student) context.getBean("student1");
	System.out.println(stud);
	
}
}
