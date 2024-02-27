// Class for Bird
class Bird extends Animal {
    // Flee method for Bird.
    @Override
    void flee() {
        System.out.println("The bird is flying away.");
    }

    //  Hunt method for Bird.
    @Override
    void hunt() {
        System.out.println("The bird is searching for worms.");
    }
}


