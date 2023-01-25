public class Main {
    public static void main(String[] args) {
        Cow[] cow = new Cow[]{new Cow(123, 4, "sing along", "Holstein"),
                new Cow(125, 4, "sing along", "Holstein"),
                new Cow(126, 5, "sing along", "Holstein"),
                new Cow(135, 6, "sing along", "Holstein"),
                new Cow(119, 4, "sing along", "Holstein")};

        Sheep[] sheep = new Sheep[]{new Sheep(60, 4, "sing along", "Cartoon"),
                new Sheep(65, 5, "sing along", "Cartoon"),
                new Sheep(62, 4, "sing along", "Cartoon")};
        Horse[] horse = new Horse[]{new Horse(150, 7, "male", "Skakun"),
                new Horse(158, 9, "male", "Skakun")};

        Farm farm = new Farm("ул.Раззаков, дом 19", cow, sheep, horse, "Asan");
        System.out.println(farm.toString());
        System.out.println("_______________________________________________________________________________");

        Cow cow1 = new Cow(115, 4, "sing along", "Holstein");
        Sheep sheep1 = new Sheep(55, 3, "sing along", "Cartoon");
        Horse horse1 = new Horse(167, 7, "male", "Skakun");
        Farm2 farm2 = new Farm2("ул.Манас, дом 13", cow1, horse1, sheep1, "Эрмек");
        System.out.println(farm2.toString());
    }
}