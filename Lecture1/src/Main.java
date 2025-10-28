public class Main {
    public static void main(String[] args){
        Car c1 = new Car("CS61B-1");
        Car c2 = new Car("CS61B-2");
        c1.drive();
        c1.driveIntoDitch(1);
        System.out.println(c1.getWheels());
        c1.drive();

        //CS61B-1 go vroom
        //3
        //CS61B-1 no go vroom
    }




}

class Car{

    public String model;
    public int wheels;

    public Car(String m){
        this.model = m;
        this.wheels = 4;
    }

    public void drive(){
        if(this.wheels < 4){
            System.out.println(this.model+ " no go vroom");
            return;
        }
        System.out.println(this.model + " go vroom");

    }

    public int getWheels(){
        return this.wheels;
    }

    public void driveIntoDitch(int wheelsLost){
        this.wheels = this.wheels - wheelsLost;
    }


}
// ------- CS61B Lecture 1 : -------

// In Java, all code must be part of a class
// Classes are defined with public class CLASSNAME

// Reflection on Java:
// Before Java variables can be used , they must be declared
// Java is statically typed!
// The compiler checks that all that types in your program are compatible before
// the program ever run! (that is the difference from Python)
//
//

// Hello.java -> javac -> Hello.class -> java -> stuff happens

// The bad:
// Code is more verbose
// Code is less general


// Object-Oriented Programming:
// A model for organizing programs

// Objects

// Classes


// HW0:Due Friday
//