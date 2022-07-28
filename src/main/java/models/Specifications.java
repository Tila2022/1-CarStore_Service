package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Data
@Entity // Эти данные привязываются к базе
public class Specifications {

    @Id // Показатель
    @GeneratedValue(strategy = GenerationType.IDENTITY)// База данных генерирует показатель
    @Column(name = "indicators_number")
    private int indicatorNumbers; // Номер характеристик

    @Column(name = "colour")
    private String colour; // Цвет
    @Column(name = "engine", precision = 8, scale = 2)
    private String engine; // Двигатель
    @Column(name = "power")
    private int power; // Мощность
    @Column(name = "transmission")
    private String transmission; // Коробка передач
    @Column(name = "drive")
    private String drive; // Привод
    @Column(name = "pendant")
    private String pendant; // Подвеска
    @Column(name = "kit")
    private String kit; // Комплектация

    @ManyToOne // У одной машины много характеристик
    @JoinColumn(name = "carId") // За выполнение отвечает эта строка
    private Car car; // Ссылка на текущую машину
}