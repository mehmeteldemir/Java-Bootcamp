package ders.day4.interfaces;

public class EmailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Email gönderildi " + message);
    }
}
