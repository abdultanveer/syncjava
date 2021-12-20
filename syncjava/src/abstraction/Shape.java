package abstraction;
abstract class Shape{  
	abstract void draw();  
	public void fillColor() {
		System.out.println("red color filled");
	}
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
	void draw(){System.out.println("drawing rectangle");
	}  
}  
class Circle1 extends Shape{  
	void draw(){System.out.println("drawing circle");
	}  
	
	@Override
	public void fillColor() {
		System.out.println("transparent filled");
	}
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
	public static void main(String args[]){  
		Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		s.fillColor();
	}  
}  