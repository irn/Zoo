package ua.com.sourceit.animals.reptiles;

import ua.com.sourceit.animals.AnimalType;
import ua.com.sourceit.animals.BaseAnimal;

/**
 * Этот класс описывает пресмыкающихся
 */
public class Reptile extends BaseAnimal {

    public Reptile(String name, int weight, int height, boolean gender) {
        super(name, weight, height, gender);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.TYPE_REPTILES;
    }
}
