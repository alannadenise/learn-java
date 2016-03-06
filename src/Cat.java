/**
 * Created by alanna on 05/03/2016.
 */
public class Cat extends Animal {

    int age;
    //This below bit is run when the cat is created. This is a constructor, it has the same name as the class.
    public Cat(int catsAge){
        age = catsAge;
    }

    public void meow(){
        System.out.println("Meow!");
    }

    public int getAge() {
        return age;
    }

}
