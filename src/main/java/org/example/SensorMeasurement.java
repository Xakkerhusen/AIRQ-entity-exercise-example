package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Entity
@Table
public class SensorMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "double precision")
    private double quantity;
    @Column(columnDefinition = "timestamp")
    private LocalDateTime measuredDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Sensor sensor;

}
