package models;

import lombok.*;

import javax.persistence.*;

@Table (name = "workers")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Workers {

    @Id // Показатель
    @GeneratedValue(strategy = GenerationType.AUTO) // База данных генерирует показатель

    // Общие данные о машине
    @Column(name = "id")
    private Integer id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private Integer age;
}