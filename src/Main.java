public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Бонусных миль " + miles);
    }
}



/*public class Main {
    public static void main(String[] args) {
        int summa = 13_676;
        int miles = 20;
        int bonus = summa / miles;


        System.out.println("Бонусных миль равно " + bonus);
    }
}*/