package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    ArrayList<Pet> pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = new ArrayList<>();

        if (pets != null) {
            for (Pet eachPet : pets) {
                eachPet.setOwner(this);
                this.pets.add(eachPet);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < this.pets.size(); i++) {
            Pet eachPet = this.pets.get(i);
            if (eachPet.name.equals(pet.name)) {
                this.pets.set(i, null);
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if(pet.getOwner() == null){
            return false;
        }
        return pet.getOwner().name.equals(this.name);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngestAge = Integer.MAX_VALUE;
        for (Pet eachPet : this.pets) {
            if (eachPet.getAge() < youngestAge) {
                youngestAge = eachPet.getAge();
            }
        }

        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldestAge = 0;
        for (Pet eachPet : this.pets) {
            if (eachPet.getAge() > oldestAge) {
                oldestAge = eachPet.getAge();
            }
        }

        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;
        for (Pet eachPet : this.pets) {
            sum += eachPet.getAge();
        }

        return sum / this.pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets.toArray(Pet[]::new);
    }
}
