/**
 * Created by alanna on 05/03/2016.
 */
public class Animal {

    public void checkStatus() {
        System.out.println("Your pet is healthy and happy!");
    }

    public void healthCheck(int age) {
        if (age <= 3) {
            System.out.println("Your pet is eligible for a free health check.");
        }
        else {
            System.out.println("There is a £3 charge for a healthcheck.");
        }
    }

}
