public class PetManager {
    private int contador;
    private Pet[] pets;

    public PetManager(int numbersOfPets) {
        pets = new Pet[numbersOfPets];
    }

    public boolean addPet(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                ++contador;
                return true;
            }
        }
        return false;
    }
}
