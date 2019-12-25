package Observer;

public class EmailSubscriber implements Subscriber {

    public String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String massage) {
        System.out.println("Рассылка на email (" + email + ") " + massage);
    }
}


