package models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // Эти данные привязываются к базе
public class Car {

    @Id // Показатель
    @GeneratedValue(strategy = GenerationType.IDENTITY) // База данных генерирует показатель

    // Общие данные о машине
    @Column(name = "carId")
    private int carId; // Номер машины
    @Column(name = "manufacturer")
    private String manufacturer; // Производитель
    @Column(name = "model")
    private String model; // Модель
    @Column(name = "year")
    private int year; // Год
    @Column(name = "mileage")
    private double mileage; // Пробег
    @Column(name = "price")
    private double price; // Цена
    @Column(name = "img")
    private String img; // Картинка

}