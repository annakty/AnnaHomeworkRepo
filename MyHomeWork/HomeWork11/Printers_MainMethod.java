package MyHomeWork.HomeWork11;

public class Printers_MainMethod {
    public static void main(String[] args) {

        Printers printer1 = new Printers();
        printer1.printerName = "0001SW-RD";
        printer1.printerSummary();

        printer1.print(10);
        printer1.printerSummary();


        printer1.print(10, true);
        printer1.printerSummary();

        printer1.print(9, true);
        printer1.printerSummary();

        printer1.print(10);
        printer1.printerSummary();

        printer1.addToner(10);
        printer1.printerSummary();

        printer1.addToner(30);

        printer1.addToner(-10);




    }
}
