package main.java;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

public class DIfactory {

    /**
     * IoC container, we can invoke methods from this map of beans
     */
    ArrayList<Object> container;

    public DIfactory() {
        this.container = new ArrayList<Object>();
    }

    /**
     * here we can instantiate bean with parameters (and possibly inject dependency to the another bean)
     * @param classname
     * @return
     */
    public MessageService getBean(Class classname) {

        if (classname.equals(MessageService.class)) {

            Class<MessageService> obj = MessageService.class;
            MessageService messageService = null;

            if(obj.isAnnotationPresent(MyCustom.class)){

                Annotation annotation = obj.getAnnotation(MyCustom.class);
                MyCustom myCustom = (MyCustom) annotation;

                for(int i = 0; i < myCustom.number(); i++){
                    messageService = new MessageService();
                    System.out.println("creating new bean");
                    container.add(messageService);
                }
            }
            System.out.println("container size: " + container.size());
            return messageService;
        }
        else
            return null;
    }
}
