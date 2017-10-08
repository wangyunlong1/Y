package cn.happy.day01;

/**
 * Created by lenovo on 2017/9/28.
 */
public class Y2166 {
    private String info;
    public void work(){
        System.out.println("Work"+info);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Y2166{" +
                "info='" + info + '\'' +
                '}';
    }
}
