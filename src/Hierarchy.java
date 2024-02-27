//----------------------------------------------------------------------------------------------------------------------
// Project Animal Hierarchy: Estefani Rivera   02/25/2024
//
//--------------------------------------------------------------------------------------------------------------------

public class Hierarchy {
    public static void main(String[] args) {
        // Creating instances of each class
        Bird bird = new Bird();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        // Animals flee() and hunt() methods for each subclass
        bird.flee();
        bird.hunt();

        cat.flee();
        cat.hunt();

        wolf.flee();
        wolf.hunt();
    }
}



