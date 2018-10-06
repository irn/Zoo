package ua.com.sourceit.animals;

public interface Animal {

    /**
     * Функция возвращает название насекомого
     * @return
     */
    String getName();


    /**
     * Функция возвращает вес живого организма
     * @return
     */
    int getWeight();


    /**
     * Функция возвращает высоту живого организма
     * @return
     */
    int getHeight();

    /**
     * Возвращает вид живого организма
     * @return
     */
    AnimalType getType();

    /**
     * Возращает пол фового организма
     * @return 0 - организм мужского пола, 1 - организм женкского пола
     */
    boolean isMale();


}
