package by.kozlov.usefulTables;

import java.util.List;

public enum Modules {

    MODULE1("MODULE_1",Theme.getThemes("1")),
    MODULE2("MODULE_2",Theme.getThemes("2")),
    MODULE3("MODULE_3",Theme.getThemes("3")),
    MODULE4("MODULE_4",Theme.getThemes("4"));

    private final String nameOfModule;
    private final List<Theme> themesOfModule;

    Modules(String nameOfModule, List<Theme> themesOfModule) {
        this.nameOfModule = nameOfModule;
        this.themesOfModule = themesOfModule;
    }

    public String getNameOfModule() {
        return nameOfModule;
    }
    public List<Theme> getThemesOfModule() {
        return themesOfModule;
    }
}
