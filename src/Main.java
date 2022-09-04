public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int pen = 1111111111;
        System.out.println("Значение переменной pen с типом int равно 1111111111");
        byte book = 100;
        System.out.println("Значение переменной book с типом byte равно 100");
        short fox = 22222;
        System.out.println("Значение переменной fox с типом short равно 22222");
        long sea = 322224862315795231L;
        System.out.println("Значение переменной sea с типом long равно 322224862315795231L");
        float sky = 1.62F;
        System.out.println("Значение переменной sky с типом float равно 1.62F");
        double sun = 5.999999;
        System.out.println("Значение переменной sun с типом double равно 5.999999");

        //Задача 2
        System.out.println("Задача 2");
        float a = 27.12F;
        long s = 987678965549L;
        double d = 2.786;
        boolean f = false;
        char g = 569;
        short h = -159;
        int j = 27897;
        byte k = 67;

        //Задача 3
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " + totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna) + " листов бумаги.");

        //Задача 4
        System.out.println("Задача 4");
        byte productionTime = 2;
        byte bottle = 16;
        byte month = 30;
        System.out.println("За 20 минут машина произвела бутылок " + (20 / productionTime * bottle) + " штук.");
        System.out.println("В сутки машина произвела бутылок " + ((60*24) / productionTime * bottle) + " штук.");
        System.out.println("За 3 дня машина произвела бутылок " + ((60*24*3) / productionTime * bottle) + " штук.");
        System.out.println("За 1 месяц машина произвела бутылок " + ((60*24*month) / productionTime * bottle) + " штук.");

        //Задача 5
        System.out.println("Задача 5");
        byte white = 2;
        byte brown = 4;
        byte total = 120;
        System.out.println("В школе, где " + (total / (white+brown)) + " классов, нужно " + ((total / (white+brown)) * white) + " банок белой краски и " + ((total / (white+brown)) * brown) + " банок коричневой краски.");

        //Задача 6
        System.out.println("Задача 6");
        short bananas = 5 * 800;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        System.out.println("Вес спорт-завтрака " + (bananas+milk+iceCream+egg) + " грамм.");
        System.out.println("Вес спорт-завтрака " + ((bananas+milk+iceCream+egg) / (float) 1000) + " кг.");

        //Задача 7
        System.out.println("Задача 7");
        short weight = 7000;
        short diet1 = 250;
        short diet2 = 500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то " + weight / diet1 + " дней уйдёт на похудение.");
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то " + weight / diet2 + " дней уйдёт на похудение.");
        System.out.println("В среднем, может потребоваться " + ((weight / diet1) + (weight / diet2)) / 2 + " день на похудение.");

        //Задача 8
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int christening = 76230;
        System.out.println("Маша теперь получает " + ((masha * 10 / 100) + masha) + " рублей. Годовой доход вырос на " + ((masha * 10 / 100) + masha) % masha * 12 + " рублей.");
        System.out.println("Денис теперь получает " + ((denis * 10 / 100) + denis) + " рублей. Годовой доход вырос на " + ((denis * 10 / 100) + denis) % denis * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + ((christening * 10 / 100) + christening) + " рублей. Годовой доход вырос на " + ((christening * 10 / 100) + christening) % christening * 12 + " рублей.");

    }
}