package cn.happy.day05;

/**
 * Created by lenovo on 2017/10/7.
 */
public class Car {
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    private String names;

    @Override
    public String toString() {
        return "Car{" +
                "names='" + names + '\'' +
                '}';
    }
}
