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
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Station stationId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Substance substanceId;

//    @OneToOne(mappedBy = "sensor_measurement_id")
//    private SensorMeasurement sensorMeasurement;


}
