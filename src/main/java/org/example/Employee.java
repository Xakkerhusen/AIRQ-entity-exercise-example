package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@ToString
@Entity
@Table(name = "employee_AIRQ")
public class Employee {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ssn")
    private UUID SSN;
    @Column
    private String name;
    @Column(name = "created_date", columnDefinition = "date")
    private LocalDate createdDate;
    @Column(unique = true)
    private String phone;
    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "certificate_num")
    private UUID certificateNum;

    @Enumerated(EnumType.STRING)
    @Column
    private Role2 role;

//    @OneToMany(mappedBy = "employee")
//    private List<Vocation> vocation;

//    @OneToMany(mappedBy = "employee")
//    private List<Report> report;


}
