public class Main {
    public static void main(String[] args) {
        BonusMilesService service1 = new BonusMilesService();
        int price1 = 10_000;
        int miles1 = service1.calculate(price1);
        System.out.println(miles1);

        BonusMilesService service2 = new BonusMilesService();
        int price2 = 500;
        int miles2 = service2.calculate(price2);
        System.out.println(miles2);
    }
}
