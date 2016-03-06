import java.util.ArrayList;

/**
 * Created by alanna on 05/03/2016.
 */
public class Dog extends Animal{

    int age;
    //This below bit is run when the dog is created. This is a constructor, it has the same name as the class.
    public Dog(int dogsAge) {
        age = dogsAge;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void run(int feet){
        System.out.println("Your dog ran " + feet + " feet!");
    }

    public int getAge() {
        return age;
    }

}