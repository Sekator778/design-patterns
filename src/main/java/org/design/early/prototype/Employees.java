package org.design.early.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private final List<String> empList;

    public Employees(){
        empList = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Oleksa");
        empList.add("Petro");
        empList.add("Mariia");
        empList.add("Anna");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}