public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.67;
        double weight = 57.3;
        double imt = service.calculate(height, weight);
        System.out.println(imt);
    }
}