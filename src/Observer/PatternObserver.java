package Observer;

import java.util.ArrayList;
import java.util.List;

public class PatternObserver {
    public static void main(String[] args) {

        Provider provider = new Provider();

        EmailSubscriber user1 = new EmailSubscriber("user1@gmail.com");
        EmailSubscriber user2 = new EmailSubscriber("user2@mail.ru");
        EmailSubscriber user3 = new EmailSubscriber("user3@yandex.ru");

        List<EmailSubscriber> emailList = new ArrayList<>();
        emailList.add(user1);
        emailList.add(user2);
        emailList.add(user3);

        for (EmailSubscriber user : emailList) {
            provider.subscribe(user);
        }

        provider.promotion();
        System.out.println();
        provider.unsubscribe(user1);
        provider.promotion();
    }
}
