package cn.happy;

import cn.happy.day01.Y2166;
import cn.happy.day02.printer.Print;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/9/28.
 */
public class Test2017928 {
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Print print=(Print)context.getBean("printer");
        print.printSomething();
    }
}
