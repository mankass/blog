package ru.sbrf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityUtils {

    /**
     * Загрузка данных о городах в массив
     *
     * @return массив с данными о городах
     */
    public static List<City> parse() {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("resources/city_ru.csv")); // Загрузка данных из файла
            while (scanner.hasNextLine()) { // Обработка данных и заполнение массива
                cities.add(parse(scanner.nextLine()));
            }
            scanner.close(); // Не забываем вызвать метод закрытия потока данных
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cities;
    }

    /**
     * Разбор строки с данными о городе
     *
     * @param line строка с данными
     * @return {@link City}
     */
    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(";"); // Задается разделитель в строке с данными
        scanner.skip("\\d*"); // Необходимо пропустить значение номера строки по условиям задачи
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population = scanner.nextInt();
        String foundation = null;
        if (scanner.hasNext()) { // В файле с городами возможно отсутствие данного значения
            foundation = scanner.next();
        }
        scanner.close();

        return new City(name, region, district, population, foundation);
    }
}
