import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alanna on 05/03/2016.
 */
public class App {

    public static void main(String[] args) {

        //The dog bit
        Dog spike = new Dog(4);
        spike.bark();
        spike.run(30);
        int spikeAge = spike.getAge();
        System.out.println("Your dog is " + spikeAge + " years old.");
        spike.healthCheck(spikeAge);
        spike.checkStatus();

        //The cat bit
        Cat felix = new Cat(2);
        felix.meow();
        int felixAge = felix.getAge();
        System.out.println("Your cat is " + felixAge + " years old.");
        felix.healthCheck(felixAge);
        felix.checkStatus();

        //Create an array called petToys that holds string values
        ArrayList<String> petToys = new ArrayList<String>();
        petToys.add("ball");
        petToys.add("chew toy");
        petToys.add("rope");
        petToys.add("scratch post");
        petToys.add("hanging ball thingy");

        //For loop iterates through the array indexes assigned to variable toy
        for (int toy = 0; toy < petToys.size(); toy++) {
            System.out.println("The following toy is available for your pet: " + petToys.get(toy) );
        }

        //Create a hashmap called animalsChecked and add values to it
        HashMap<String, Integer> animalsChecked = new HashMap<String, Integer>();
        animalsChecked.put("cats", 13);
        animalsChecked.put("dogs", 43);
        animalsChecked.put("turtles", 1);
        animalsChecked.put("hamsters", 6);

        //For each item in the animalsChecked hashmap use the variable animal and iterate through the hashmap
        for(String animal : animalsChecked.keySet() ) {
            System.out.println("The number of " + animal + " checked was " + animalsChecked.get(animal));
        }
    }
}
