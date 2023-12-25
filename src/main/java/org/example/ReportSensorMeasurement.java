package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table()
public class ReportSensorMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne/*(fetch = FetchType.LAZY)*/
    @JoinColumn()
    private Report report;
    @ManyToOne/*(fetch = FetchType.LAZY)*/
    @JoinColumn()
    private Sensor sensor;
    @ManyToOne/*(fetch = FetchType.LAZY)*/
    @JoinColumn()
    private SensorMeasurement measurement;


}
