package main.java;

public class DIfactory {


    public MessageService getBean(Class classname) {
        if (classname.equals(MessageService.class))
            return new MessageService();
        else
            return null;
    }
}
