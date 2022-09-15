package org.example.design.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) {
        Employees emps = new Employees();
        emps.loadData();
        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Petro");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Mariia");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("emps New List: "+list);
        System.out.println("emps New1 List: "+list1);
    }

}