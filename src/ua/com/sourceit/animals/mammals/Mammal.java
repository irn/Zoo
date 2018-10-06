package ua.com.sourceit.animals.mammals;

import ua.com.sourceit.animals.AnimalType;
import ua.com.sourceit.animals.BaseAnimal;

public class Mammal extends BaseAnimal {

    public Mammal(String name, int weight, int height, boolean gender) {
        super(name, weight, height, gender);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.TYPE_MAMMALS;
    }
}
