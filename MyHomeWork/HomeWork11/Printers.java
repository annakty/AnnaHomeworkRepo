package MyHomeWork.HomeWork11;

public class Printers {
    /**
     * Create a Printer
     *
     * maxToner level =100
     * maxPaper in tray = 100
     *
     * with 1 page printing, 1 toner is being used
     *
     * after printing 5 pages
     * paper = 95
     * toner 95
     *
     * print a file which is having 5 pages; it's double sided
     *      paper -1 pg 1,2
     *      paper -2 pg 3,4
     *      paper -3 pg 5
     * paper used = 3
     * toner used = 5
     *
     * paper = 92
     * toner = 90
     *
     * 1.Create method 'print' which can be used to print single-sided or double-sided
     *      // if paper or toner is not enough to print, we display error message saying, Not enough paper or toner
     * 2. Create method 'addPaper' to add pages in the tray
     * 3. Create method 'addToner' to add toner
     * 4. Create method 'printerSummary'
     *          Toner level: YY
     *          Paper in tray: XX
     */

    /**
     * Create object of Printer class.
     * Printer p1=new Printer ();
     * <p>
     * p1.printerSummary();
     * Toner level: 100
     * Paper in tray: 100
     * <p>
     * p1.print(10);       // single page
     * p1.printerSummary();
     * Toner level: 90
     * Paper in tray: 90
     * <p>
     * <p>
     * p1.print(10, true); // double page
     * p1.printerSummary();
     * Toner level: 80
     * Paper in tray: 85
     * <p>
     * p1.print(9, true);
     * p1.printerSummary();
     * Toner level: 71
     * Paper in tray: 80
     * <p>
     * p1.print(90);
     * // if paper or toner is not enough to print, we display error message saying, Not enough paper or toner
     * <p>
     * p1.print(10);
     * p1.printerSummary();
     * Toner level: 61
     * Paper in tray: 70
     * <p>
     * addToner(10);
     * Toner level: 71
     * <p>
     * addToner(30)
     * //Invalid toner Value
     * <p>
     * addToner(-10);
     * //Invalid toner Value
     */

    String printerName = "N/A";
    private static int tonerLevel = 100;
    private static int maxTonerLevel = 100;
    private static int paperLevel = 100;
    private static int maxPaperInTray = 100;


    public void printerSummary() {
        System.out.println("\n Printer Summary: " +
                "\n Name: " + printerName +
                "\n Toner Level: " + tonerLevel +
                "\n Paper in Tray: " + paperLevel);
    }

    public int addPaper(int addPaper) {

        if (addPaper > 0 && maxPaperInTray >= paperLevel + addPaper) {
            paperLevel = paperLevel + addPaper;
        } else {
            System.out.println("Invalid paper value");
        }
        return paperLevel;
    }

    public int addToner(int addToner) {

        if (addToner > 0 && maxTonerLevel >= tonerLevel + addToner) {
            tonerLevel = tonerLevel + addToner;
        } else {
            System.out.println("You cannot add more Toner than maxToner Level.");
        }
        return paperLevel;
    }

    public void print(int printPages) {
        if (printPages > paperLevel) {
            System.out.println("Not enough paper in the tray.");
        } else if (printPages > tonerLevel) {
            System.out.println("Not enough Toner to print pages.");
        } else if (printPages < 0) {
            System.out.println("Invalid number of pages.");
        } else {
            paperLevel = paperLevel - printPages;
            tonerLevel = tonerLevel - printPages;
        }

    }

    public void print(int printPages, boolean doubleSidePage) {
        if (printPages / 2 > paperLevel) {
            System.out.println("Not enough paper in the tray.");

        } else if (printPages > tonerLevel) {
            System.out.println("Not enough Toner to print pages.");

        } else if (printPages / 2 < 0) {
            System.out.println("Invalid number of pages.");

        } else if (printPages / 2 <= 0) {
            paperLevel = paperLevel - printPages / 2;
            tonerLevel = tonerLevel - printPages;
        } else {
            paperLevel = paperLevel - printPages / 2;
            tonerLevel = tonerLevel - printPages;
        }
    }

}
