package cn.happy.day03.service;

import cn.happy.day03.dao.ISomeDAO;

/**
 * Created by lenovo on 2017/10/7.
 */
public class SomeServiceImpl implements ISomeService{
    private ISomeDAO dao;
    public void doSome() {
        dao.doSome();
    }
    public ISomeDAO getDao(){
        return dao;
    }
    public void setDao(ISomeDAO dao){
        this.dao=dao;
    }
}
