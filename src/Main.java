public class Main {
    public static void main(String[] args) {

        //Task 1
        byte aA = 111;
        short bB = 111;
        int cC = 111;
        long dD = 111L;
        float eE = 1.11f;
        double fF = 1.11;
        System.out.println("Значение переменной aA с типом byte равно " + aA);
        System.out.println("Значение переменной bB с типом short равно " + bB);
        System.out.println("Значение переменной cC с типом int равно " + cC);
        System.out.println("Значение переменной dD с типом long равно " + dD);
        System.out.println("Значение переменной eE с типом float равно " + eE);
        System.out.println("Значение переменной fF с типом double равно " + fF);

//Task 2
        float ab = 27.12f;
        long cd = 987678965549L;
        double ef = 2.786;
        short gh = 569;
        short kl = -159;
        int mn = 27897;
        byte op = 67;
        System.out.println("Перечислены все типы, инициализированы переменные и к ним присвоены значения: " + ab + ", " + cd + ", " + ef + ", " + gh + ", " + kl + ", " + mn + ", " + op);

//Task 3
        byte pupLp = 23;
        byte pupAs = 27;
        byte pupEa = 30;
        short paper = 480;
        int pupils = pupLp + pupAs + pupEa;
        int papFor1 = paper / pupils;
        System.out.println("На каждого ученика расчитано " + papFor1 + " листов бумаги");

//Task 4
        int botP2min = 16;
        int botP1min = botP2min / 2;
        int botP20min = botP1min * 20;
        int minAday = 60 * 24;
        int botAday = minAday * botP1min;
        int botA3day = botAday * 3;
        int botAmon = botAday * 30;
        System.out.println("За 20 минут машина произвела " + botP20min + " штук бутылок");
        System.out.println("За одни сутки машина произвела " + botAday + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + botA3day + " штук бутылок");
        System.out.println("За один месяц машина произвела " + botAmon + " штук бутылок");

//Task 5
        int paintSchool = 120;
        int whPaintClass = 2;
        int brPaintClass = 4;
        int paintClass = whPaintClass + brPaintClass;
        int classSchool = paintSchool / paintClass;
        int whPaintSchool = classSchool * whPaintClass;
        int brPaintSchool = classSchool * brPaintClass;
        System.out.println("В школе, где " + classSchool + " классов, нужно " + whPaintSchool + " банок белой краски и " + brPaintSchool + " банок коричневой краски");

//Task 6
        int banana = 5;
        int oneBanana = 80;
        int sumBanana = banana * oneBanana;

        int oneMilk = 100;
        int milk = 200;
        int portion = milk / oneMilk;
        int mgOneMilk = 105;
        int sumMilk = mgOneMilk * portion;

        int iceCream = 2;
        int oneIceCream = 100;
        int sumIceCream = iceCream * oneIceCream;

        int egg = 4;
        int oneEgg = 70;
        int sumEgg = egg * oneEgg;

        int breakfast = sumBanana + sumMilk + sumIceCream + sumEgg;
        System.out.println("Вес завтака в граммах составит " + breakfast);

        float kg = 1000f;
        float kgBreakfast = breakfast / kg;
        System.out.println("Вес завтрака в килограммах составит " + kgBreakfast);

//Task 7
        double loseAday1 = 250 / kg;
        double loseAday2 = 500 / kg;
        int planLose = 7;
        int totalDayLose1 = (int) (planLose / loseAday1);
        int totalDayLose2 = (int) (planLose / loseAday2);

        System.out.println("Если спортсмен будет терять каждый день " + loseAday1 + " килограмм, то на похудение уйдет " + totalDayLose1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день " + loseAday2 + " килограмм, то на похудение уйдет " + totalDayLose2 + " дней");

        double avrgLoseAday = (loseAday1 + loseAday2) / 2;
        double avrgTotalDay = planLose / avrgLoseAday;
        System.out.println("В среднем, если спортсмен будет терять каждый день " + avrgLoseAday + " килограмм, то на похудение уйдет " + avrgTotalDay + " дней");

//Task 8
        int months = 12;
        int masha = 67760;
        int mashaYear = masha * months;
        int denis = 83690;
        int denisYear = denis * months;
        int krist = 76230;
        int kristYear = krist * months;

        int mashaNew = masha + (masha * 10 / 100);
        int mashaYearNew = mashaNew * months;
        int denisNew = denis + (denis * 10 / 100);
        int denisYearNew = denisNew * months;
        int kristNew = krist + (krist * 10 / 100);
        int kristYearNew = kristNew * months;

        float diffMashaYear = mashaYearNew - mashaYear;
        float diffDenisYear = denisYearNew - denisYear;
        float diffKristYear = kristYearNew - kristYear;

        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + diffMashaYear + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + diffDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + kristNew + " рубля. Годовой доход вырос на " + diffKristYear + " рублей");

    }
}