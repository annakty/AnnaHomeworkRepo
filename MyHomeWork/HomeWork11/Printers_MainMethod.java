package MyHomeWork.HomeWork11;

public class Printers_MainMethod {
    public static void main(String[] args) {

        Printers printer1 = new Printers();
        printer1.printerName = "0001SW-RD";
        printer1.printerSummary();

        printer1.print(20);
        printer1.printerSummary();


        printer1.print(30, true);
        printer1.printerSummary();


        printer1.addPaper(30);
        printer1.printerSummary();

        printer1.addToner(100);
        printer1.printerSummary();

        printer1.print(2);
        printer1.printerSummary();

        printer1.print(100,true);
        printer1.printerSummary();
    }
}
