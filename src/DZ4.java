public class DZ4 {
    public static void main(String[] args){
        System.out.println("Задание 1 ");
        int mouse = 25;
        System.out.println("Значение переменной mouse с типом int равно " + mouse);
        byte corn = 127;
        System.out.println("Значение переменной corn с типом byte равно " + corn);
        short horse = 439;
        System.out.println("Значение переменной horse с типом short равно " + horse);
        long hearts = 30222;
        System.out.println("Значение переменной hearts с типом long равно " + hearts);
        float girls = 22;
        System.out.println("Значение переменной girls с типом float равно " + girls);
        double rice = 56.45;
        System.out.println("Значение переменной rice с типом double равно " + rice);

        //{System.out.println("Задание 2 ");
        //double finger = 27.12;
        //long train = 987678965549;
        //double head = 2.786;
       //boolean eyes = 'false';
        //short jeans = 569;
        //short rain = -159;
        //int ring = 27897;
        //byte tip = 67;

        System.out.println("Задание 3 ");
        byte pupilsLP = 23;
        byte pupilsAN = 27;
        byte pupilsEA = 30;
        short allPapers = 480;
        int allPupils = pupilsLP + pupilsAN + pupilsEA;
        int pieceOfPaper = allPapers / allPupils;
        System.out.println("На каждого ученика рассчитано " +pieceOfPaper+ " листов бумаги");

        System.out.println("Задание 4 ");
        byte efficiencyCarFor2Min = 16;
        int efficiencyCarFor20Min = efficiencyCarFor2Min * 10;
        System.out.println("За 20 минут машина произвела бутылок " +efficiencyCarFor20Min+ " штук");
        int efficiencyCarForOneHour = efficiencyCarFor20Min * 3;
        int efficiencyCarForOneDay = efficiencyCarForOneHour * 24;
        System.out.println("За сутки машина произвела бутылок " +efficiencyCarForOneDay+ " штук");
        int efficiencyCarForThreeDay = efficiencyCarForOneDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " +efficiencyCarForThreeDay+ " штук");
        int efficiencyCarForOneMonth = efficiencyCarForThreeDay * 10;
        System.out.println("За 1 месяц машина произвела бутылок " +efficiencyCarForOneMonth+ " штук");

        System.out.println("Задание 5 ");
        int allPaints = 120;
        int whitePaintFor1Class = 2;
        int brownPaintFor1Class = 4;
        int allPaintsFor1Class = whitePaintFor1Class + brownPaintFor1Class;
        int allClass = allPaints / allPaintsFor1Class;
        int whitePaintForAllClass = allClass * whitePaintFor1Class;
        int brownPaintForAllClass = allClass * brownPaintFor1Class;
        System.out.println("В школе, где " +allClass+ " классов, нужно " +whitePaintForAllClass+ " банок белой краски и "
                +brownPaintForAllClass+ " банок коричневой краски");

        System.out.println("Задание 6 ");
        int oneBananWeight = 80;
        int quantityBananas = 5;
        int allBananasWeight = oneBananWeight * quantityBananas;
        int oneMilkWeight = 105;
        int quantityMilk = 2;
        int allMilkWeight = oneMilkWeight * quantityMilk;
        int oneIceCreamWeight = 100;
        int quantityIceCream = 2;
        int allIceCreamWeight = oneIceCreamWeight * quantityIceCream;
        int oneEggWeight = 70;
        int quantityEggs = 4;
        int allEggsWeight = oneEggWeight * quantityEggs;
        double WeightSportBreakfast = allBananasWeight + allMilkWeight + allEggsWeight + allIceCreamWeight;
        double WeightSportBreakfastKG = WeightSportBreakfast / 1000;
        System.out.println("Вес Спорт-Завтрака равен " +WeightSportBreakfastKG+ " кг");

        System.out.println("Задание 7 ");
        int ultimateGoal = 7;
        int ultimateGoalGramm = ultimateGoal * 1000;
        int goalEveryDay1 = 250;
        int goalEveryDay2 = 500;
        int quantityDay1 = ultimateGoalGramm / goalEveryDay1;
        System.out.println("Кол-во дней, если терять каждый день по 250 грамм: " +quantityDay1);
        int quantityDay2 = ultimateGoalGramm / goalEveryDay2;
        System.out.println("Кол-во дней, если терять каждый день по 500 грамм: " +quantityDay2);
        int averageQuantityDay = (quantityDay1 + quantityDay2) / 2;
        System.out.println("Среднее кол-во дней: " +averageQuantityDay);

        System.out.println("Задание 8 ");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int year = 12;
        double salaryMashaAfterIncrease = salaryMasha + (salaryMasha * 10 / 100);
        double salaryYearMashaNow = salaryMasha * year;
        double salaryYearMashaAfterIncrease = salaryMashaAfterIncrease * year;
        double differenceYearIncomeMasha = salaryYearMashaAfterIncrease - salaryYearMashaNow;
        System.out.println("Маша теперь получает " +salaryYearMashaAfterIncrease+ " рублей. Годовой доход вырос на " + differenceYearIncomeMasha + " рублей");
        double salaryDenisAfterIncrease = salaryDenis+ (salaryDenis * 10/100);
        double salaryYearDenisNow = salaryDenis * year;
        double salaryYearDenisAfterIncrease = salaryDenisAfterIncrease * year;
        double differenceYearIncomeDenis = salaryYearDenisAfterIncrease - salaryYearDenisNow;
        System.out.println("Денис теперь получает " +salaryYearDenisAfterIncrease+ " рублей. Годовой доход вырос на " + differenceYearIncomeDenis + " рублей");
        double salaryKristinaAfterIncrease = salaryKristina + (salaryKristina * 10/100);
        double salaryYearKrisNow = salaryKristina * year;
        double salaryYearKrisAfterIncrease = salaryKristinaAfterIncrease * year;
        double differenceYearIncomeKris = salaryYearKrisAfterIncrease - salaryYearKrisNow;
        System.out.println("Кристина теперь получает " +salaryYearDenisAfterIncrease+ " рублей. Годовой доход вырос на " + differenceYearIncomeKris + " рублей");


    }
}
