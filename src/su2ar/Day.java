package su2ar;

import su2ar.actions.Actions;

public class Day {

    Actions actions = new Actions();

    public void start(Jack jack, Meals meals, Recreation recreation) throws Exception {

        actions.dying(jack);

        System.out.println("Mornin'");
        System.out.println();
        Thread.sleep(1000);
        
        actions.smoke(recreation, jack, meals);       
              
        actions.eat(meals, jack, recreation);
                
        actions.smoke(recreation, jack, meals);        
               
        actions.read(recreation, jack, meals);

        actions.binging(jack, recreation, meals);
                           
        actions.eat(meals, jack, recreation);     

      
        System.out.println("Good night");
        System.out.println();
        Thread.sleep(1000);
    }

}