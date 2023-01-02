package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        String name1 = "Mleko";
        String producer1 = "Mlekowita";
        double price1 = 2.5;

        String name2 = "Czekolada";
        String producer2 = "Wedel";
        double price2 = 2.19;

        System.out.println("\u001B[31m" + name1 + " " + producer1 + " " + "\u001B[30m" + price1 + "zł");
        System.out.println("\u001B[31m" + name2 + " " + producer2 + " " + "\u001B[30m" + price2 + "zł");
    }
}
