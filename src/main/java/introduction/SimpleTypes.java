package introduction;

public class SimpleTypes {
    public static void main(String[] args) {
        int age;
        age = 0;
        System.out.println("Wiek to " + age);

        long lottoReward =  32_000_000L;
        System.out.println("Wygrana w lottto to " + lottoReward);

        short dayOfMonth = 29;
        System.out.println("Dzień miesiąca " + dayOfMonth );
        dayOfMonth = 23;
        System.out.println("Dzień miesiąca " + dayOfMonth );

        final float PI_PI = 3.14F ;
        System.out.println("Liczba PI to " + PI_PI);

        double rozmiar = 52.234567890D;
        System.out.println(rozmiar);

        boolean isPaid = false;
        System.out.println("Czy zapłacono rachunek? " + isPaid);
        isPaid = true;
        System.out.println("a może teraz jest zapłacone? " + isPaid);




    }
}
