package ua.com.sourceit;

import ua.com.sourceit.animals.Animal;
import ua.com.sourceit.animals.AnimalType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {

    private List<Animal> animalList;

    Zoo(){
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void removeAnimal(Animal animal){
        animalList.remove(animal);
    }

    public List<Animal> getAllAnimals(){
        return new ArrayList(animalList);
    }

    public List<Animal> findAnimalByType(AnimalType type){

        if (type == null)
            return null;

        List<Animal> animals = new ArrayList<>();
        for (Animal animal : animalList){
            if (animal.getType().equals(type)){
                animals.add(animal);
            }
        }
        return animals;
    }

    public List<Animal> findAnimalByTypeStream(AnimalType type){
        return animalList.stream().filter(animal -> animal.getType().equals(type)).collect(Collectors.toList());
    }

    public int getTotalCount(){
        return animalList.size();
    }
}
