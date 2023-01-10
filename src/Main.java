public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int totalTime = 52374;
        byte schoolLessons = 44;
        short totalGameTime = 31232;
        long peopleInRussia = 142800000;
        float markForMaths = 4.75f;
        double markForPhysics = 3.5;
        System.out.println("Значение переменной с типом int равно " + totalTime);
        System.out.println("Значение переменной с типом byte равно " + schoolLessons);
        System.out.println("Значение переменной с типом short равно " + totalGameTime);
        System.out.println("Значение переменной с типом long равно " + peopleInRussia);
        System.out.println("Значение переменной с типом float равно " + markForMaths);
        System.out.println("Значение переменной с типом double равно " + markForPhysics);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("Число " + a + " имеет тип double");
        System.out.println("Число " + b + " имеет тип long");
        System.out.println("Число " + c + " имеет тип float");
        System.out.println("Число " + d + " имеет тип short");
        System.out.println("Число " + e + " имеет тип short");
        System.out.println("Число " + f + " имеет тип int");
        System.out.println("Число " + g + " имеет тип byte");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        short totalSheets = 480;
        int sheetsForOneStudent = totalSheets / (ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsForOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte twoMinuteMachineEfficiency = 16;
        int oneMinuteMachineEfficiency = twoMinuteMachineEfficiency / 2;
        int twentyMinuteMachineEfficiency = oneMinuteMachineEfficiency * 20;
        int oneDayMachineEfficiency = oneMinuteMachineEfficiency * 60 * 24;
        int threeDaysMachineEfficiency = oneDayMachineEfficiency * 3;
        int oneMonthMachineEfficiency = oneDayMachineEfficiency * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinuteMachineEfficiency + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDayMachineEfficiency + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDaysMachineEfficiency + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonthMachineEfficiency + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaintCans = 120;
        byte whitePaintCansForOneRoom = 2;
        byte brownPaintCansForOneRoom = 4;
        int paintCansForOneRoom = whitePaintCansForOneRoom + brownPaintCansForOneRoom;
        int totalRooms = totalPaintCans / paintCansForOneRoom;
        int totalWhitePaintCans = totalRooms * whitePaintCansForOneRoom;
        int totalBrownPaintCans = totalRooms * brownPaintCansForOneRoom;
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhitePaintCans + " банок белой краски и " + totalBrownPaintCans + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte oneBananaWeight = 80;
        int totalBananasWeight = bananas * oneBananaWeight;
        short totalMilk = 2;
        byte milkWeight = 105;
        int totalMilkWeight = totalMilk * milkWeight;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int totalIceCreamWeight = iceCream * iceCreamWeight;
        byte eggs = 4;
        byte eggWeight = 70;
        int grPerKg = 1000;
        int totalEggsWeight = eggs * eggWeight;
        int totalBreakfastWeight = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        float totalBreakfastWeightInKg = totalBreakfastWeight / (float)grPerKg;
        System.out.println("Вес такого спортзавтрака составляет " + totalBreakfastWeight + " грамм или " + totalBreakfastWeightInKg + " кг!");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weight = 7;
        int weightInGr = weight * 1000;
        short lossPerDayOne = 250;
        short lossPerDayTwo = 500;
        int daysOne = weightInGr / lossPerDayOne;
        int daysTwo = weightInGr / lossPerDayTwo;
        int avgDays = (daysOne + daysTwo) / 2;
        System.out.println("Тратя каждый день по 250 грамм спортсмен скинет вес через " + daysOne + " дней");
        System.out.println("Тратя каждый день по 500 грамм спортсмен скинет вес через " + daysTwo + " дней");
        System.out.println("Чтобы добиться результата похудения может потребоваться в среднем " + avgDays + " день");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int newMashaSalary = mashaSalary * 110 / 100;
        int newDenisSalary = denisSalary * 110 / 100;
        int newKristinaSalary = kristinaSalary * 110 / 100;
        int differenceBetweenMashaSalary = newMashaSalary * 12 - mashaSalary * 12;
        int differenceBetweendenisSalary = newDenisSalary * 12 - denisSalary * 12;
        int differenceBetweenKristinaSalary = newKristinaSalary * 12 - kristinaSalary * 12;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + differenceBetweenMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + differenceBetweendenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + differenceBetweenKristinaSalary + " рублей");
    }

}