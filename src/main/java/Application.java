package main.java;


public class Application {

    public static void main(String[] args) {

        DIfactory context = new DIfactory();
        MessageService msg = context.getBean(MessageService.class);
        msg.getMessage();
        System.out.println(msg.getMessage());
    }
}
