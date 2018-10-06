package ua.com.sourceit;

import ua.com.sourceit.animals.Animal;
import ua.com.sourceit.animals.AnimalType;
import ua.com.sourceit.animals.insect.Insect;
import ua.com.sourceit.animals.mammals.Mammal;
import ua.com.sourceit.animals.reptiles.Reptile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        System.out.println("Вы директор зоопарка");
        System.out.println("Вы можете добавлять различных животных");
        System.out.println("Формат добавления: тип, имя, вес, рост, пол");
        System.out.println("Где тип: 0-насекомое, 1-пресмыкающееся, 2-млекопитающее");
        System.out.println("Где пол: 0-самец, 1-самка");
        System.out.println("Пример: 1, лягушка, 20, 20, 0");
        System.out.println("Введите команду - выход, для выхода из приложения");

        getDataFromConsole(zoo);

        int totalCount = zoo.getTotalCount();
        if (totalCount > 0){
            System.out.println("\nКолличество животных в зоопарке " + zoo.getTotalCount());
            System.out.println("Вы ввели таких животных:");
            for (Animal animal : zoo.getAllAnimals()) {
                System.out.println(animal);
            }

        } else {
            System.out.println("Увы, животных в зоопарке нет");
        }

    }

    static void getDataFromConsole(Zoo zoo){
        Scanner in = new Scanner(System.in);

        boolean isClosed = false;
        while (!in.hasNext("выход")){
            String inputString = in.nextLine();
            String[] params = inputString.split(",");
            if (params.length == 5){
                String name;
                Integer type = 0;
                Integer weight = 0;
                Integer height = 0;
                boolean gender = false;
                try {
                    type = Integer.parseInt(params[0].trim());
                } catch (NumberFormatException ex){
                    System.out.println("Не правильно указан тип животного");
                }
                name = params[1].trim();
                try {
                    weight = Integer.parseInt(params[2].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Вес животного должен быть целым числом");
                }
                try {
                    height = Integer.parseInt(params[3].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Рост животного должен быть целым числом");
                }

                try {
                    gender = Boolean.parseBoolean(params[4].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Пол животного должен быть целым числом");
                }

                Animal animal = null;

                switch (type){
                    case 0:
                        animal = new Insect(name, weight, height, gender);
                        break;

                    case 1:
                        animal = new Reptile(name, weight, height, gender);
                        break;

                    case 2:
                        animal = new Mammal(name, weight, height, gender);
                        break;

                    default:
                        System.out.println("Не верно указан тип животного. Тип должен быть от 0 до 2");
                }

                if (animal != null){
                    zoo.addAnimal(animal);
                }
            } else {
                System.out.println("Не правильный ввод данных!!!");
            }
        }

        in.close();
    }
}
