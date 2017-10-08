package cn.happy.day03.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/7.
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    private Map properties;
    private Object[] array;

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("记录日志");
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }

    public Map getProperties() {
        return properties;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public Object[] getArray() {
        return array;
    }
}
