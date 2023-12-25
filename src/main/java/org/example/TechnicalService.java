package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@ToString
@Entity
@Table(name = "technical_service")
public class TechnicalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "date")
    private LocalDate startDate;
    @Column(columnDefinition = "time")
    private LocalTime startTime;
    @Column(columnDefinition = "time")
    private LocalTime endTime;
    @Column(columnDefinition = "text")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Station station;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Employee employee;

}
