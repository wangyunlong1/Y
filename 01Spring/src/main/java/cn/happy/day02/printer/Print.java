package cn.happy.day02.printer;

import cn.happy.day02.ink.Ink;
import cn.happy.day02.paper.Paper;

/**
 * Created by lenovo on 2017/9/28.
 */
public class Print {
    private Ink ink;
    private Paper paper;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
    public void printSomething(){
        System.out.println("小孩在使用"+ink.getadd()+"我爱你"+paper.getfinall());
    }
}
