public class PetManager {
    private int contador  = 0;
    private Pet[] pets;

    public PetManager(int numbersOfPets) {
        pets = new Pet[numbersOfPets];
    }

    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }

    public Pet[] getPets() {
        Pet[] petsList = new Pet[this.contador];
        for (int i = 0; i < this.contador; i++) {
            petsList[i] = this.pets[i];
        }
        return petsList;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
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

    public boolean removePet(Pet pet){
        for (int i = 0; i < pets.length; i++){
            if (pets[i] != null && pets[i].equals(pet)) {
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[pets.length - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public boolean updatePets(Pet pet, int index){
        if (index < 0 || index >= pets.length) {
            return false;
        }
        if (pet == null) {
            return false;
        }
        pets[index] = pet;
        return true;
    }
}
