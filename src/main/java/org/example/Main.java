package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
//
/*
        Employee employee = new Employee();
        employee.setName("husen");
        employee.setPhone("+9");
        employee.setCreatedDate(LocalDate.parse("1999-06-28"));
        employee.setEmail("h@u.com");
        employee.setRole(Role2.valueOf(Role2.MANAGERS.name()));
        session.save(employee);

        Employee employee2 = new Employee();
        employee2.setName("hasan");
        employee2.setPhone("+7");
        employee2.setCreatedDate(LocalDate.parse("1999-06-28"));
        employee2.setEmail("h@asan.com");
        employee2.setRole(Role2.valueOf(Role2.TECHNICIAN.name()));
        employee2.setCertificateNum(UUID.randomUUID());
        session.persist(employee2);

        Vocation vocation = new Vocation();
        vocation.setStartDate(LocalDate.parse("2023-12-27"));
        vocation.setEndDate(LocalDate.parse("2024-01-06"));
        vocation.setEmployee(employee);
        session.save(vocation);
        Vocation vocation2 = new Vocation();
        vocation2.setStartDate(LocalDate.parse("2023-12-27"));
        vocation2.setEndDate(LocalDate.parse("2024-01-06"));
        vocation2.setEmployee(employee2);
        session.save(vocation2);
        transaction.commit();

//        Query query = session.createQuery("from Vocation where employee='93b91fc7-d3ec-4597-856b-e2598a62218b'");
        Query query = session.createQuery("from Vocation where id=1");
        List<Vocation> resultList = query.getResultList();
        Vocation post = resultList.get(0);
        System.out.println(post);*/
        /*Substance substance = new Substance();
        substance.setName("a");
        substance.setDescription("hidi o'tkir");
        substance.setMeasurementUnit("C");
        substance.setCause("mashinalar");
        session.save(substance);

        Station station = new Station();
        station.setLongitude(128);
        station.setLatitude(100);
        session.save(station);

        Sensor sensor = new Sensor();
        sensor.setName("sensor1");
        sensor.setStationId(station);
        sensor.setSubstanceId(substance);
        session.save(sensor);

        SensorMeasurement sensorMeasurement = new SensorMeasurement();
        sensorMeasurement.setQuantity(20);
        sensorMeasurement.setMeasuredDate(LocalDateTime.now());
        sensorMeasurement.setSensor(sensor);
        session.save(sensorMeasurement);
        transaction.commit();

        Query query = session.createQuery("from Sensor where id=1");
        List<Sensor> resultList = query.getResultList();
        Sensor post = resultList.get(0);
        System.out.println(post);

        Query query = session.createQuery("from SensorMeasurement where id=1");
        List<SensorMeasurement> resultList = query.getResultList();
        SensorMeasurement post = resultList.get(0);
        System.out.println(post);*/
 /*
        Employee employee = new Employee();
        employee.setName("ab");
        employee.setCreatedDate(LocalDate.now());
        employee.setPhone("+4");
        employee.setEmail("@#$.com");
        employee.setRole(Role2.ANALYST);
        employee.setCertificateNum(UUID.randomUUID());
        session.save(employee);

        Employee employee2 = new Employee();
        employee2.setName("abaf");
        employee2.setCreatedDate(LocalDate.now());
        employee2.setPhone("+5");
        employee2.setEmail("123.com");
        employee2.setCertificateNum(UUID.randomUUID());
        session.save(employee2);

        Report report = new Report();
        report.setPublishDate(LocalDate.now());
        report.setEmployee(employee);
        session.save(report);

        Report report2 = new Report();
        report2.setPublishDate(LocalDate.now().minusDays(2));
        report2.setEmployee(employee2);
        session.save(report2);
        transaction.commit();



        Query query = session.createQuery("from Report where id=2");
        List reports = query.getResultList();
        Report report1 = (Report) reports.get(0);
        System.out.println(report1);*/

       /* Substance substance = new Substance();
        substance.setName("a");
        substance.setDescription("hidi o'tkir");
        substance.setMeasurementUnit("C");
        substance.setCause("mashinalar");
        session.save(substance);

        Station station = new Station();
        station.setLongitude(128);
        station.setLatitude(100);
        session.save(station);

        Sensor sensor = new Sensor();
        sensor.setName("sensor1");
        sensor.setStationId(station);
        sensor.setSubstanceId(substance);
        session.save(sensor);

        SensorMeasurement sensorMeasurement = new SensorMeasurement();
        sensorMeasurement.setQuantity(20);
        sensorMeasurement.setMeasuredDate(LocalDateTime.now());
        sensorMeasurement.setSensor(sensor);
        session.save(sensorMeasurement);


        Employee employee = new Employee();
        employee.setName("ab");
        employee.setCreatedDate(LocalDate.now());
        employee.setPhone("+4");
        employee.setEmail("@#$.com");
        employee.setRole(Role2.ANALYST);
        employee.setCertificateNum(UUID.randomUUID());
        session.persist(employee);

        Employee employee2 = new Employee();
        employee2.setName("abaf");
        employee2.setCreatedDate(LocalDate.now());
        employee2.setPhone("+5");
        employee2.setEmail("123.com");
        employee2.setCertificateNum(UUID.randomUUID());
        session.persist(employee2);

        Report report = new Report();
        report.setPublishDate(LocalDate.now());
        report.setEmployee(employee);
        session.save(report);

        Report report2 = new Report();
        report2.setPublishDate(LocalDate.now().minusDays(2));
        report2.setEmployee(employee2);
        session.save(report2);

        ReportSensorMeasurement reportSensorMeasurement = new ReportSensorMeasurement();
        reportSensorMeasurement.setSensor(sensor);
        reportSensorMeasurement.setMeasurement(sensorMeasurement);
        reportSensorMeasurement.setReport(report2);
        session.save(reportSensorMeasurement);
        transaction.commit();

        Query query = session.createQuery("from ReportSensorMeasurement where id=1");
        List resultList = query.getResultList();
        ReportSensorMeasurement result = (ReportSensorMeasurement) resultList.get(0);
        System.out.println(result);*/


        Employee employee = new Employee();
        employee.setName("husen");
        employee.setPhone("+98");
        employee.setCreatedDate(LocalDate.parse("1999-06-28"));
        employee.setEmail("h@use.com");
        employee.setRole(Role2.valueOf(Role2.MANAGERS.name()));
        session.save(employee);

        Employee employee2 = new Employee();
        employee2.setName("hasan");
        employee2.setPhone("+75");
        employee2.setCreatedDate(LocalDate.parse("1999-06-28"));
        employee2.setEmail("h@as.com");
        employee2.setRole(Role2.valueOf(Role2.TECHNICIAN.name()));
        employee2.setCertificateNum(UUID.randomUUID());
        session.persist(employee2);

        Employee employee3 = new Employee();
        employee3.setName("ali");
        employee3.setCreatedDate(LocalDate.now().minusYears(12));
        employee3.setPhone("+55");
        employee3.setEmail("127@.com");
        session.persist(employee3);

        Vocation vocation = new Vocation();
        vocation.setStartDate(LocalDate.parse("2023-12-27"));
        vocation.setEndDate(LocalDate.parse("2024-01-06"));
        vocation.setEmployee(employee);
        session.save(vocation);

        Vocation vocation2 = new Vocation();
        vocation2.setStartDate(LocalDate.parse("2023-12-28"));
        vocation2.setEndDate(LocalDate.parse("2024-01-07"));
        vocation2.setEmployee(employee2);
        session.save(vocation2);

        Substance substance = new Substance();
        substance.setName("a");
        substance.setDescription("hidi o'tkir");
        substance.setMeasurementUnit("C");
        substance.setCause("mashinalar");
        session.save(substance);

        Station station = new Station();
        station.setLongitude(128);
        station.setLatitude(100);
        session.save(station);

        Station station2 = new Station();
        station2.setLatitude(156);
        station2.setLatitude(120);
        session.save(station2);

        Sensor sensor = new Sensor();
        sensor.setName("sensor1");
        sensor.setStationId(station);
        sensor.setSubstanceId(substance);
        session.save(sensor);

        SensorMeasurement sensorMeasurement = new SensorMeasurement();
        sensorMeasurement.setQuantity(20);
        sensorMeasurement.setMeasuredDate(LocalDateTime.now());
        sensorMeasurement.setSensor(sensor);
        session.save(sensorMeasurement);

        Report report = new Report();
        report.setPublishDate(LocalDate.now());
        report.setEmployee(employee);
        session.save(report);

        Report report2 = new Report();
        report2.setPublishDate(LocalDate.now().minusDays(2));
        report2.setEmployee(employee2);
        session.save(report2);

        ReportSensorMeasurement reportSensorMeasurement = new ReportSensorMeasurement();
        reportSensorMeasurement.setSensor(sensor);
        reportSensorMeasurement.setMeasurement(sensorMeasurement);
        reportSensorMeasurement.setReport(report2);
        session.save(reportSensorMeasurement);


        TechnicalService technicalService = new TechnicalService();
        technicalService.setStartDate(LocalDate.now());
        technicalService.setStartTime(LocalTime.now().minusHours(5));
        technicalService.setEndTime(LocalTime.now());
        technicalService.setDescription("asdfghjkljhgfdsa");
        technicalService.setStation(station);
        technicalService.setEmployee(employee);
        session.persist(technicalService);

        transaction.commit();


//        Query query = session.createQuery("from TechnicalService where id=1");
//        List resultList = query.getResultList();
//        TechnicalService result = (TechnicalService) resultList.get(0);
//        System.out.println(result);

        Query query = session.createQuery("from ReportSensorMeasurement where id=1");
        List resultList = query.getResultList();
        ReportSensorMeasurement result = (ReportSensorMeasurement) resultList.get(0);
        System.out.println(result);

        System.out.println("Hello world!");
    }
}