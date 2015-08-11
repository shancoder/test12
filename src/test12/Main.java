package test12;

import java.util.ArrayList;
import java.util.List;

class Base {
	public Base() {
		System.out.println("Base");
	}
}

class Sub extends Base {
	public Sub() {
	//	super();
		System.out.println("Sub");
	}
}


public class Main {

	
	
	public void Main() {
		System.out.println("this is nomal mothed");
	}
	
	public int Main(int a) {
		System.out.println("a = " + a);
		return a;
	}
	public static void main(String[] args) {
		Base b = new Sub();
		Main m = new Main();
		m.Main();
		m.Main(2);
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		cout(list);
		
		list.remove(0);
		list.add("4");
		cout(list);
	}
	
	public static void cout(List<String> list) {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("i " + i + list.get(i));
		}
	}
}
