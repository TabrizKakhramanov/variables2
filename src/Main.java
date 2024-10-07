
public class Main {
    public static void main(String[] args) {
        //1
        byte one =1;
        short two=2;
        int three=3;
        long four=4;
        float five=5f;
        double six=6.0;

        //2
        float first=27.12f;
        long second = 987_678_965_549l;
        double third= 2.786;
        int forth = 569;
        short fifth= -159;
        int sixth = 27897;
        byte seventh= 67;

        //3
        int numberLP = 23;
        int numberAS = 27;
        int numberEA = 30;
        int numberOfSheets= 480;
        int numberOfStudents = numberAS+numberEA+numberLP;
        int sheetsPerStudent = numberOfSheets/numberOfStudents;
        System.out.println("На каждого ученика рассчитано " +sheetsPerStudent+ " листов бумаги");

        //4
        int numberOfBottles=16;
        int time=2;
        int bottlesPerMinute=numberOfBottles/time;
        time=20;
        numberOfBottles = bottlesPerMinute*time;
        System.out.println("За 20 минут машина произвела "+numberOfBottles+" штук бутылок.");
        time = 1440;
        numberOfBottles=bottlesPerMinute*time;
        System.out.println("За сутки машина произвела "+numberOfBottles+" штук бутылок.");
        time = time*3;
        numberOfBottles=bottlesPerMinute*time;
        System.out.println("За 3 дня машина произвела "+numberOfBottles+" штук бутылок.");
        time = 1440*31;
        numberOfBottles=bottlesPerMinute*time;
        System.out.println("За 1 месяц машина произвела "+numberOfBottles+" штук бутылок.");

        //5
        int numberOfCans = 120;
        int whiteCansPerRoom = 2;
        int brownCansPerRoom = 4;
        int cansPerRoom=whiteCansPerRoom+brownCansPerRoom;
        int numberOfRooms=numberOfCans/cansPerRoom;
        int numberOfWhiteCans = numberOfRooms*whiteCansPerRoom;
        int numberOfBrownCans = numberOfRooms*brownCansPerRoom;
        System.out.println("В школе, где "+numberOfRooms+" классов, нужно "+numberOfWhiteCans+" банок белой краски и "+numberOfBrownCans+" банок коричневой краски»");

        //6
        int bananasWeight = 80*5;
        int milkWeight = 105*2;
        int icecreamWeight = 100*2;
        int eggWeight = 70*4;
        int weightInGrams= bananasWeight+milkWeight+icecreamWeight+eggWeight;
        double weightInKilos=weightInGrams/1000.0;
        System.out.println("Вес завтрака составляет "+weightInGrams+" грамм или "+weightInKilos+" килограмм");

        //7
        int lostWeight=7000;
        int lostPerDay=250;
        int days=lostWeight/lostPerDay;
        System.out.println("Если спортсмен будет терять по "+lostPerDay+" грамм в день, то ему понадобится "+days+" дней.");
        lostPerDay=500;
        days=lostWeight/lostPerDay;
        System.out.println("Если спортсмен будет терять по "+lostPerDay+" грамм в день, то ему понадобится "+days+" дней.");

        //8
        double salaryBoost=1.1;
        int mashaSalary=67760;
        double mashaSalaryAfterBoost=mashaSalary*salaryBoost;
        int mashaYearSalary=mashaSalary*12;
        double mashaYearSalaryAfterBoost=mashaSalaryAfterBoost*12;
        double mashaYearSalaryDiff=mashaYearSalaryAfterBoost-mashaYearSalary;
        System.out.println("Маша теперь получает "+mashaSalaryAfterBoost+" рублей. Годовой доход вырос на "+mashaYearSalaryDiff+" рублей");

        int denisSalary= 83690;
        float denisSalaryAfterBoost=(float)(denisSalary*salaryBoost);
        int denisYearSalary=denisSalary*12;
        double denisYearSalaryAfterBoost=denisSalaryAfterBoost*12;
        double denisYearSalaryDiff=denisYearSalaryAfterBoost-denisYearSalary;
        System.out.println("Денис теперь получает "+denisSalaryAfterBoost+" рублей. Годовой доход вырос на "+denisYearSalaryDiff+" рублей");

        int kristinaSalary=76230;
        double kristinaSalaryAfterBoost=kristinaSalary*salaryBoost;
        int kristinaYearSalary=kristinaSalary*12;
        double kristinaYearSalaryAfterBoost=kristinaSalaryAfterBoost*12;
        double kristinaYearSalaryDiff=kristinaYearSalaryAfterBoost-kristinaYearSalary;
        System.out.println("Кристина теперь получает "+kristinaSalaryAfterBoost+" рублей. Годовой доход вырос на "+kristinaYearSalaryDiff+" рублей");









    }
}