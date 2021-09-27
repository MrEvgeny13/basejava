package com.evgeny13.basejava;

import com.evgeny13.basejava.model.*;

import java.time.LocalDate;
import java.util.*;

public class ResumeTestData {

    public static final String PHONE_NUMBER = "+7(921)855-0482";
    public static final String SKYPE = "grigory.kislin";
    public static final String EMAIL = "gkislin@yandex.ru";
    public static final String LINKEDIN = "https://www.linkedin.com/in/gkislin";
    public static final String GITHUB = "https://github.com/gkislin";
    public static final String STACKOVERFLOW = "https://stackoverflow.com/users/548473";
    public static final String HOMEPAGE = "http://gkislin.ru/";
    public static final String OBJECTIVE_CONTENT = "Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям";
    public static final String PERSONAL_CONTENT = "Аналитический склад ума, сильная логика, креативность, инициативность. " +
            "Пурист кода и архитектуры.";

    // Блок "Достижкения"
    private static final List<String> ACHIEVEMENT_CONTENT = new ArrayList<>(Arrays.asList(
            "С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\", " +
                    "\"Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). " +
                    "Удаленное взаимодействие (JMS/AKKA)\". Организация онлайн стажировок и ведение проектов. " +
                    "Более 1000 выпускников.",
            "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция " +
                    "с Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.", "Налаживание процесса разработки " +
                    "и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, Bonita BPM, CMIS, LDAP. " +
                    "Разработка приложения управления окружением на стеке: Scala/Play/Anorm/JQuery. Разработка " +
                    "SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера.",
            "Реализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, " +
                    "GWT, ExtGWT (GXT), Commet, HTML5, Highstock для алгоритмического трейдинга.",
            "Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base " +
                    "архитектура, JAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о состоянии " +
                    "через систему мониторинга Nagios. Реализация онлайн клиента для администрирования и " +
                    "мониторинга системы по JMX (Jython/ Django).",
            "Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, " +
                    "Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа."
    ));

    // Блок "Квалификация"
    private static final List<String> QUALIFICATIONS_CONTENT = new ArrayList<>(Arrays.asList(
            "JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, WebLogic, WSO2",
            "Version control: Subversion, Git, Mercury, ClearCase, Perforce",
            "DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle,",
            "MySQL, SQLite, MS SQL, HSQLDB",
            "Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy,",
            "XML/XSD/XSLT, SQL, C/C++, Unix shell scripts,",
            "XML/XSD/XSLT, SQL, C/C++, Unix shell scripts,",
            "Java Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, " +
                    "Security, Data, Clouds, Boot), JPA (Hibernate, EclipseLink), Guice, GWT(SmartGWT, " +
                    "ExtGWT/GXT), Vaadin, Jasperreports, Apache Commons, Eclipse SWT, JUnit, Selenium " +
                    "(htmlelements).",
            "Python: Django.",
            "JavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js",
            "Scala: SBT, Play2, Specs2, Anorm, Spray, Akka",
            "Технологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, " +
                    "MDB, JMX, JDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, " +
                    "OAuth1, OAuth2, JWT.",
            "Инструменты: Maven + plugin development, Gradle, настройка Ngnix,",
            "администрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport," +
                    " OpenCmis, Bonita, pgBouncer.",
            "Отличное знание и опыт применения концепций ООП, SOA, шаблонов проектрирования, архитектурных " +
                    "шаблонов, UML, функционального программирования",
            "Родной русский, английский \"upper intermediate\""
    ));

    // Блок "Опыт работы"
    private static final List<Experience> EXPERIENCE_CONTENT = new ArrayList<>(Arrays.asList(
            new Experience("Java Online Projects", "http://javaops.ru",
                    LocalDate.of(2013, 10, 1), LocalDate.now(),
                    "Автор проекта", "Создание, организация и проведение Java онлайн проектов и стажировок."),
            new Experience("Wrike", "http://www.wrike.com/",
                    LocalDate.of(2014, 10, 1), LocalDate.of(2016, 1, 1),
                    "Старший разработчик (backend)", "Проектирование и разработка онлайн платформы управления проектами Wrike" +
                    "(Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, PostgreSQL, Redis). Двухфакторная " +
                    "аутентификация, авторизация по OAuth1, OAuth2, JWT SSO."),
            new Experience("RIT Center", null,
                    LocalDate.of(2012, 4, 1), LocalDate.of(2014, 10, 1),
                    "Java архитектор", "Организация процесса разработки системы ERP для разных окружений: релизная " +
                    "политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), " +
                    "конфигурирование системы (pgBoucer, Nginx), AAA via SSO. Архитектура БД и серверной " +
                    "части системы. Разработка интергационных сервисов: CMIS, BPMN2, 1C (WebServices), " +
                    "сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco " +
                    "JLAN для online редактирование из браузера документов MS Office. Maven + plugin " +
                    "development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat,WSO2, xcmis, " +
                    "OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, " +
                    "PL/Python"),
            new Experience("Luxoft (Deutche Bank)", "http://luxoft.com",
                    LocalDate.of(2010, 12, 1), LocalDate.of(2012, 4, 1),
                    "Ведущий программист", "Участие в проекте Deutsche Bank CRM (WebLogic, Hibernate, Spring, " +
                    "Spring MVC, SmartGWT, GWT, Jasper, Oracle). Реализация клиентской и серверной " +
                    "части CRM. Реализация RIA-приложения для администрирования, мониторинга и анализа " +
                    "результатов в области алгоритмического трейдинга. JPA, Spring, Spring-MVC, GWT, " +
                    "ExtGWT (GXT), Highstock, Commet, HTML5."),
            new Experience("Yota", "http://www.yota.ru/",
                    LocalDate.of(2008, 6, 1), LocalDate.of(2012, 10, 1),
                    "Ведущий специалист", "Дизайн и имплементация Java EE фреймворка для отдела " +
                    "\"Платежные Системы\" (GlassFish v2.1, v3, OC4J, EJB3, JAX-WS RI 2.1, Servlet 2.4, " +
                    "JSP, JMX, JMS, Maven2). Реализация администрирования, статистики и мониторинга " +
                    "фреймворка. Разработка online JMX клиента (Python/ Jython, Django, ExtJS)")
    ));

    // Блок "Образование"
    public static final List<Experience> EDUCATION_CONTENT = new ArrayList<>(Arrays.asList(
            new Experience("Coursera", "https://www.coursera.org/learn/progfun1",
                    LocalDate.of(2013, 3, 1), LocalDate.of(2013, 5, 1),
                    "\"Functional Programming Principles in Scala\" by Martin Odersky", null),
            new Experience("Luxoft", "http://www.luxoft-training.ru/training/catalog/course.html?ID=22366",
                    LocalDate.of(2011, 3, 1), LocalDate.of(2011, 4, 1),
                    "Курс \"Объектно-ориентированный анализ ИС. Концептуальное моделирование на UML.\"", null),
            new Experience("Siemens AG", "http://siemens.ru/",
                    LocalDate.of(2005, 1, 1), LocalDate.of(2005, 4, 1),
                    "3 месяца обучения мобильным IN сетям (Берлин)", null),
            new Experience("Alcatel", "http://www.alcatel.ru",
                    LocalDate.of(1997, 9, 1), LocalDate.of(1998, 3, 1),
                    "6 месяцев обучения цифровым телефонным сетям (Москва)", null),
            new Experience("Санкт-Петербургский национальный исследовательский университет " +
                    "информационных технологий, механики и оптики", null,
                    LocalDate.of(1993, 9, 1), LocalDate.of(1996, 7, 1),
                    "Аспирантура (программист С, С++)", null),
            new Experience("Заочная физико-техническая школа при МФТИ", "http://school.mipt.ru",
                    LocalDate.of(1984, 9, 1), LocalDate.of(1987, 6, 1),
                    "Закончил с отличием", null)
    ));


    // метод для вывода всех секций резюме на консоль
    public static void printResume(Resume testResume, Map<ContactType, String> contacts,
                                   Map<SectionType, AbstractSection> sections) {
        System.out.println("Section with main information:");
        System.out.print("\n");
        System.out.println(testResume);
        System.out.println("--------------");
        System.out.print("\n");

        System.out.println("Section with Contacts:");
        System.out.print("\n");
        for (Map.Entry<ContactType, String> entry : contacts.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("--------------");
        System.out.print("\n");

        System.out.println("Section with other information:");
        System.out.print("\n");
        for (Map.Entry<SectionType, AbstractSection> entry : sections.entrySet()) {
            System.out.println(entry);
        }
    }


    public static void main(String[] args) {
        Resume testResume = new Resume("Григорий Кислин");

        final Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
        final Map<SectionType, AbstractSection> sections = new EnumMap<>(SectionType.class);

        // заполняем enum'ы из Контактов
        contacts.put(ContactType.PHONE, PHONE_NUMBER);
        contacts.put(ContactType.SKYPE, SKYPE);
        contacts.put(ContactType.MAIL, EMAIL);
        contacts.put(ContactType.LINKEDIN, LINKEDIN);
        contacts.put(ContactType.GITHUB, GITHUB);
        contacts.put(ContactType.STACKOVERFLOW, STACKOVERFLOW);
        contacts.put(ContactType.SITE, HOMEPAGE);

        // заполняем enum'ы из секций после Контактов
        sections.put(SectionType.PERSONAL, new TextSection(PERSONAL_CONTENT));
        sections.put(SectionType.OBJECTIVE, new TextSection(OBJECTIVE_CONTENT));
        sections.put(SectionType.ACHIEVEMENT, new ListSection(ACHIEVEMENT_CONTENT));
        sections.put(SectionType.QUALIFICATIONS, new ListSection(QUALIFICATIONS_CONTENT));
        sections.put(SectionType.EXPERIENCE, new Organization(EXPERIENCE_CONTENT));
        sections.put(SectionType.EDUCATION, new Organization(EDUCATION_CONTENT));

        // выводим все секции резюме на консоль
        printResume(testResume, contacts, sections);
    }
}
