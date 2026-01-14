public class Persona {
    private String name;
    private int age;
    private PetManager petManager;

    public Persona(String name, int age, int numbersOfPets) {
        this.name = name;
        this.age = age;
        petManager = new PetManager(numbersOfPets);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public PetManager getPetManager() {
        return petManager;
    }
    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
    }

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }

    public boolean removePet(Pet pet){
        return petManager.removePet(pet);
    }

    public Pet[] getPets(){
        return petManager.getPets();
    }

    public boolean updatePets(Pet pet, int index){
        return petManager.updatePets(pet, index);
    }

}
