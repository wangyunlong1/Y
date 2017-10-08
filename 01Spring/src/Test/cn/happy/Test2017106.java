package cn.happy;

import cn.happy.day03.service.ISomeService;
import cn.happy.day04.MyCollection;

import cn.happy.day05.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by lenovo on 2017/10/7.
 */
public class Test2017106 {
    @Test
    public void Test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext03aop.xml");
        ISomeService service = (ISomeService) context.getBean("someService");

        service.doSome();

    }

    @Test
    public void Test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");
        Student stu = (Student) context.getBean("stu");
        System.out.println(stu);

    }

    @Test
    public void Test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");
        MyCollection MyCollection = (MyCollection) context.getBean("MyCollection");
        System.out.println(MyCollection);

    }
    @Test
    public void Test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext05autowire.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

    }

}