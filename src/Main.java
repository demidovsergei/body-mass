public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98;
        double h= 1.87;
        System.out.println(service.calculate(m,h));

    }
}