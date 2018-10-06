package ua.com.sourceit.animals.insect;

import ua.com.sourceit.animals.AnimalType;
import ua.com.sourceit.animals.BaseAnimal;

/**
 * Этот класс описывает насекомых
 */
public class Insect extends BaseAnimal {


    public Insect(String name, int weight, int height, boolean gender) {
        super(name, weight, height, gender);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.TYPE_INSECTS;
    }
}
