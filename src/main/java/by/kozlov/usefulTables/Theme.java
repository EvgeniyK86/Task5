package by.kozlov.usefulTables;

import java.util.ArrayList;
import java.util.List;

public enum Theme {

    JAKARTA("Jakarta",Link.getLinksOfTheme("JAKARTA")),
    MAVEN("Apache Maven",Link.getLinksOfTheme("MAVEN")),
    TOMCAT("Apache Tomcat",Link.getLinksOfTheme("TOMCAT")),
    SERVLET("HttpServlet",Link.getLinksOfTheme("SERVLET")),
    GIT("GIT",Link.getLinksOfTheme("GIT")),
    SQL("SQL",Link.getLinksOfTheme("SQL")),
    JDBC("Driver JDBC",Link.getLinksOfTheme("JDBC")),
    DAO("Pattern DAO",Link.getLinksOfTheme("DAO")),
    COOKIE("Cookie",Link.getLinksOfTheme("COOKIE")),
    JSP("JSP and JSTL",Link.getLinksOfTheme("JSP")),
    HIBERNATE("HIBERNATE",Link.getLinksOfTheme("HIBERNATE")),
    SPRING("SPRING",Link.getLinksOfTheme("SPRING"));

    private final String nameOfTheme;
    private final List<Link> links;

    Theme(String nameOfTheme, List<Link> links) {
        this.nameOfTheme = nameOfTheme;
        this.links = links;
    }

    public String getNameOfTheme() {
        return nameOfTheme;
    }

    public List<Link> getLinks() {
        return links;
    }

    public static List<Theme> getThemes(String numberOfModule) {
        List<Theme> out = new ArrayList<>();
        switch (numberOfModule) {
            case "1" -> {out.add(JAKARTA); out.add(MAVEN);out.add(TOMCAT); out.add(SERVLET); out.add(GIT);}
            case "2" -> {out.add(SQL);out.add(JDBC);out.add(DAO);out.add(COOKIE);out.add(JSP);}
            case "3" -> out.add(HIBERNATE);
            default -> out.add(SPRING);
        }
        return out;
    }
}
