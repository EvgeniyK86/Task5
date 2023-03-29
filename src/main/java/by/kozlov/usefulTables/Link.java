package by.kozlov.usefulTables;

import java.util.ArrayList;
import java.util.List;

public record Link(String description, String link) {

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public static List<Link> getLinksOfTheme(String nameOfTheme) {
        List<Link> links = new ArrayList<>();
        switch (nameOfTheme) {
            case "JAKARTA" -> links.add(new Link("Download Jakarta", "https://jakarta.apache.org/site/downloads/index.html"));
            case "MAVEN" -> {
                links.add(new Link("Download Maven", "https://maven.apache.org/download.cgi"));
                links.add(new Link("Manual Maven", "https://maven.apache.org/what-is-maven.html"));
            }
            case "TOMCAT" -> {
                links.add(new Link("Download Apache Tomcat", "https://tomcat.apache.org/download-90.cgi"));
                links.add(new Link("How to use","https://www.baeldung.com/tomcat"));
            }
            case "SERVLET" -> {
                links.add(new Link("Manual here", "https://metanit.com/java/javaee/4.1.php"));
            }
            case "GIT" -> {
                links.add(new Link("Download Git", "https://git-scm.com/downloads"));
            }
            case "SQL" -> {
                links.add(new Link("About SQL", "https://www.w3schools.com/sql/sql_intro.asp"));
            }
            case "JDBC" -> {
                links.add(new Link("About JDBC", "https://habr.com/ru/post/326614/"));
            }
            case "DAO" -> {
                links.add(new Link("About Dao", "https://ru.wikipedia.org/wiki/Data_Access_Object"));
            }
            case "COOKIE" -> {
                links.add(new Link("Manual here", "https://metanit.com/java/javaee/4.9.php"));
            }
            case "JSP" -> {
                links.add(new Link("About JSP here", "https://metanit.com/java/javaee/3.1.php"));
                links.add(new Link("About JSTL here", "https://metanit.com/java/javaee/3.11.php"));
                links.add(new Link("About EL here", "https://metanit.com/java/javaee/3.9.php"));
            }
            case "HIBERNATE" -> {
                links.add(new Link("Download Hibernate", "https://hibernate.org/orm/releases/"));
                links.add(new Link("Manual here", "https://hibernate.org/orm/"));
                links.add(new Link("More useful info here", "https://javarush.com/groups/posts/hibernate-java"));
            }
            default -> {
                links.add(new Link("Spring initializr", "https://start.spring.io/"));
                links.add(new Link("Manual here", "https://spring.io/"));
                links.add(new Link("More useful info here", "https://javarush.com/groups/posts/spring-framework-java-1"));
            }
        }
        return links;
    }
}
