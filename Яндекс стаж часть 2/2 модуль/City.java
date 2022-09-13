package ru.sbrf;

public class City {
    // Наименование города
    private String name;
    // Регион
    private String region;
    // Федеральный округ
    private String district;
    // Население
    private int population;
    // Дата основания или первое упоминание
    private String foundation;

    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
