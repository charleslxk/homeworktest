package com.langsin.collection;

import java.util.List;

import org.junit.Test;

public class MyArrayList {
         private Object[] elementData;
         private int size;
         public MyArrayList() {
			// TODO Auto-generated constructor stub
		this(10);
		
         
         }
        public MyArrayList(int initnum) {
        	if(initnum<0){
        		try {
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
        	}
        	elementData=new Object[initnum];
        	
        }
        private void add(Object obj) {
			// TODO Auto-generated method stub
     //数组扩容和数据拷贝
        	if(size==elementData.length){
        		Object[] newarray=new Object[size*2+1];
        		System.arraycopy(elementData, 0, newarray, 0, elementData.length);
        	 elementData=newarray;
        	 
        	}
		elementData[size++]=obj;
		
        
        }
        
        private int size() {
			return size;
			// TODO Auto-generated method stub
   
		}
      private boolean  isEmpty(){
		return size==0;
        	
        }
      private Object get(int index){
    	  if(index<0||index>=size){
    		  try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		  
    	  }
    	  return elementData[index];
    	  
      }
        @Test
        public void run(){
        MyArrayList list=new MyArrayList(3);
        list.add("qqq");
        System.out.println(list.size());
        
        }     
}
