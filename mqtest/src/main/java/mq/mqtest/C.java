package mq.mqtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C {
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			arr.add(i);
		}
		
		Iterator<Integer>   iterator=arr.iterator();
		while(iterator.hasNext()) {
			Integer obj=iterator.next();
			if(obj.equals(7)) {
				iterator.remove();
			}
		}
		
		System.out.println(arr);
		
	}
}
