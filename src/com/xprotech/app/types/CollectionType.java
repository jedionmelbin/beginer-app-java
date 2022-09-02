package com.xprotech.app.types;

import com.xprotech.app.domain.Customer;

import java.util.*;

public class CollectionType {
    public CollectionType() {

    }

    public void runApp() {
        List<Customer> list1 = new ArrayList<>();
        List<Customer> list2 = new LinkedList<>();
        List<Customer> list3 = new Vector<>();
        List<Customer> list4 = new Stack<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(10);
        arrayList.add(50);
        Iterator<Integer> i = arrayList.iterator();
        while (i.hasNext()) {
            System.out.println(i.hasNext());
        }

    }


}
