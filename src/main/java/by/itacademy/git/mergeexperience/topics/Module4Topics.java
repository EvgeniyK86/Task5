package by.itacademy.git.mergeexperience.topics;

public enum Module4Topics {
    SPRING_BEANS(1, "Spring beans", "Понятие Spring beans, работа с ними"),

    SPRING_DATA(2, "Spring data", "Модуль для облегчения работы с БД"),
    SPRING_SECURITY(3, "Spring security", "Модуль предосталяет функционал для безопасных операций в веб-приложении"),
    SPRING_BOOT(4, "Spring boot", "Модуль Spring для облегчения разработки приложений");

    private final int order;
    private final String topic;
    private final String description;

    Module4Topics(int order, String topic, String description) {
        this.order = order;
        this.topic = topic;
        this.description = description;
    }

    public int getOrder() {
        return order;
    }

    public String getTopic() {
        return topic;
    }

    public String getDescription() {
        return description;
    }
}
