public class HelloWorld {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {

        byte happyValue = 8;
        short cold = -50;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 350;
        long longerThanLife = 214748364669l;
        float tooBigToFail = 1500f;
        double muchBiggerThanTooBig = -28000.0;
        char englishA = 'A';
        char anyRuLetter = 'д';
        char codeName70 = 'F';

        System.out.println("Hello World!");

        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
        System.out.println("longerThanLife = " + longerThanLife);
        System.out.println("tooBigToFail = " + tooBigToFail);
        System.out.println("muchBiggerThanTooBig = " + muchBiggerThanTooBig);
        System.out.println("englishA = " + englishA);
        System.out.println("anyRuLetter = " + anyRuLetter);
        System.out.println("codeName70 = " + codeName70);

        byte allMonthCountButNotWinter = 9;   // true
        short february1996DayCount = 29;      // true
        int halfOfTotalSpringDayCount = 46;   // true
        long yearSecondCount = 31536000l;     // true
        float quarterOfMayDayCount = 7.80f;   // true
        double dayCountOfLongMonths = 217.0;  // true
        char springLetter = 'r';              // true
        boolean isLeap1900 = true;

        System.out.println("allMonthCountButNotWinter: " + allMonthCountButNotWinter);
        System.out.println("february1996DayCount: " + february1996DayCount);
        System.out.println("halfOfTotalSpringDayCount: " + halfOfTotalSpringDayCount);
        System.out.println("yearSecondCount: " + yearSecondCount);
        System.out.println("quarterOfMayDayCount: " + quarterOfMayDayCount);
        System.out.println("dayCountOfLongMonths: " + dayCountOfLongMonths);
        System.out.println("springLetter: " + springLetter);
        System.out.println("isLeap1900: " + isLeap1900);

        HelloWorld math = new HelloWorld();

        //Should be 5
        System.out.println("math.sum(3, 2) = " + math.sum(3, 2));

        //Should be 1
        System.out.println("math.sub(3, 2) = " + math.sub(3, 2));
    }
}
