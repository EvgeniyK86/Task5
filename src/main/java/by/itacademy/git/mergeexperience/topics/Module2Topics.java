package by.itacademy.git.mergeexperience.topics;

public enum Module2Topics {

    SQL(1, "Structured Query Language", "Изучение языка программирования для баз данных"),
    COOKIE(2, "Cookie и сессии","Обмен информацией"),
    JSP(3,"Java Server Pages","Создание динамических Web-страниц"),
    AUTHENTICATION(4,"Аунтенификация","Основы EL, JSTL, Фильтры");
    private int order;
    private String topic;
    private String desc;

    Module2Topics(int order, String topic, String desc) {
        this.order = order;
        this.topic = topic;
        this.desc = desc;
    }

    public int getOrder() {
        return order;
    }

    public String getTopic() {
        return topic;
    }

    public String getDesc() {
        return desc;
    }
}
