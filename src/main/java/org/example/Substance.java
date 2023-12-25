package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table
public class Substance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    @Column()
    private String measurementUnit;
    @Column(columnDefinition = "text")
    private String cause;

//    @OneToOne(mappedBy = "substanceId")
//    private Sensor sensor;
}
