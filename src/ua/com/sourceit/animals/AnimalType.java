package ua.com.sourceit.animals;

public enum AnimalType {

    TYPE_INSECTS(0, "Насекомое"),
    TYPE_REPTILES(1, "Пресмыкающиеся"),
    TYPE_MAMMALS(2, "Млекопитающие");

    private String typeName;

    private int type;

    AnimalType(int type, String name) {
        this.type = type;
        typeName = name;
    }

    public String getTypeName(){
        return typeName;
    }

    public int getType(){
        return type;
    }

    public static AnimalType findByType(int type){
        for (AnimalType animalType : AnimalType.values()){
            if (animalType.getType() == type){
                return animalType;
            }
        }
        return null;
    }
}
