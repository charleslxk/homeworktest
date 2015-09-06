package com.langsin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class CollectionTest {
	Collection c=null;
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("aaaa");
		list.add(new Date());
        list.add(1234);
        System.out.println(list.size());
        List list2=new ArrayList();
        list2.add(list);
        
	}

}
