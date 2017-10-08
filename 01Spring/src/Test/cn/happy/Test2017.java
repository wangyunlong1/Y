package cn.happy;


import cn.happy.day01.Y2166;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/9/28.
 */
public class Test2017 {

    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Y2166 service=(Y2166) context.getBean("service");
        System.out.println(service);
    }
}
