public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double height = 1.68;
        double index = service.calculate(weight, height);
        System.out.printf("Индекс массы тела %.1f", index);
    }
}
