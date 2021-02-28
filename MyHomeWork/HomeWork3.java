package MyHomeWork;

public class HomeWork3 {

    public static void main(String[] args) {

        // C ->> F
        double cTemp = 15;
        double fTemp = cTemp*9/5 + 32;
        System.out.println(cTemp + " °C --> " + fTemp + " °F");

        // C ->> K
        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + " °C --> " + kTemp + " °K");

        // F ->> C
        fTemp =9;
        cTemp = (fTemp-32) * 5/9;
        System.out.println(fTemp+ " °F --> " + cTemp+ " °C");

        // F ->> K
        kTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp + " °F --> " + kTemp + " °K");

        // K ->> F
        kTemp = 30;
        fTemp = kTemp * 9/5 - 459.67;
        System.out.println(kTemp + " °K --> " + fTemp + " °F");

        // K ->> C
        kTemp =30;
        cTemp = kTemp - 273.15;
        System.out.println(kTemp + " °K --> " + cTemp + "° C");









    }

}
