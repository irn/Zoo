package ua.com.sourceit.animals;

import ua.com.sourceit.animals.Animal;

public abstract class BaseAnimal implements Animal {

    private String name;

    private int weight;

    private int height;

    private boolean gender;

    public BaseAnimal(String name, int weight, int height, boolean gender) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public boolean isMale() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Это - ");
        sb.append(name);
        sb.append(", ");
        //TODO еще один вид конструкции if/else.  elvis operator
        sb.append(gender ? "самец" : "самка");
        sb.append(", ");
        sb.append("вес " + weight);

        sb.append(", ");
        sb.append("рост " + height);
        return sb.toString();
    }
}
