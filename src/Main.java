public class Main {
    public static void main(String[] args){
        // int[] numbers = {10, 20, 30, 40, 50};
        // String[] fruits = new String[3];

        // System.out.println(numbers[2]);
        // System.out.println(fruits[2]);
        
        // System.out.println(persona.getPets());

        // for (Pet pet : persona.getPets()) {
        //     System.out.println(pet.getPetName());
        // } 

        Pet pet1 = new Pet("Goldie", "Fish");
        Pet pet2 = new Pet("Max", "Dog");
        Pet pet3 = new Pet("Ernesto", "Bird");

        Persona person = new Persona("Josue", 19, 2);

        if (person.addPet(pet1)) {
            IOManager.printMessage("Pet added successfully");
        }else{
            IOManager.printMessage("Failed to add pet");
        }

        for (Pet pet : person.getPetManager().getPets()) {
            if (pet != null) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        if (person.removePet(pet1)) {
            IOManager.printMessage("Pet remove successfully");
        }else{
            IOManager.printMessage("Failed to remove pet");
        }

        if (person.addPet(pet1)) {
            IOManager.printMessage("Pet added successfully");
        }else{
            IOManager.printMessage("Failed to add pet");
        }

        if (person.addPet(pet2)) {
            IOManager.printMessage("Pet added successfully");
        }else{
            IOManager.printMessage("Failed to add pet");
        }

        if (person.getPets().length == 0) {
            IOManager.printMessage("No pets foud");
        }else{
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        person.updatePets(pet3, 1);

        if (person.getPets().length == 0) {
            IOManager.printMessage("No pets foud");
        }else{
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }
    }
}
