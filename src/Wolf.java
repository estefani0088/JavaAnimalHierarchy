// Class for Wolf
class Wolf extends Animal {
    // Flee  method for Wolf
    @Override
    void flee() {
        System.out.println("The wolf is retreating.");
    }

    // Hunt method for Wolf
    @Override
    void hunt() {
        System.out.println("The wolf is stalking its prey.");
    }
}
