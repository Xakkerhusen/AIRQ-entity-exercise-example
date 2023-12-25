package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
@Table
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "double precision")
    private double latitude;
    @Column(columnDefinition = "double precision")
    private double longitude;

//    @OneToMany(mappedBy = "stationId")
//    private Set<Sensor> sensor;

}
