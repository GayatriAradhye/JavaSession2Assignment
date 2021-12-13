package overload.construcotr;

public class Box {
private double w;
private double h;
private double l;
private double v;/*to be used for the constructor to find volume.
If we declare this variable in the constructor, the method which returns the volume won't be able to access/identify v*/
//creating non parameterized constructor
Box() {
	w=0;
	h=0;
	l=0;
	};
public double getWidth() {
	return w;
	}
public double getHeight() {
	return h;
}
public double getLength() {	
	return l;
	}
//creating constructor with single parameter
Box(double cube) {
	w=cube;
	h=cube;
	l=cube;
}
public double cubeBox() {//method to calculate the cube
		return w*h*l;

	}
	
//creating Constructor with three arguments
Box (double l,double w,double h){//parameters can have same name as instance variables but variables in construcotrs or methods may not be the same asinstance variables.
v=l*w*h;
	}
Box (double a, double b, double c, double d){ //since the constructor is local, we don't need 4th instance variable for "d"
	v=a*b*c*d;
	}

public double volumeBox() {
	return v;
}
	
	
}


