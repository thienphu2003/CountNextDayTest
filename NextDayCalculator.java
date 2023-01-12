public class NextDayCalculator {
    public static String countNextDay(String day , String month , String year)
    {
        int Day = Integer.parseInt(String.valueOf(day));
        int Month =Integer.parseInt(String.valueOf(month));
        int Year = Integer.parseInt(String.valueOf(year));
        int maxDay =0;
        switch (Month) {
            case 1 -> maxDay = 31;
            case 2 -> {
                if (isLeapYear(Year)) {
                    maxDay = 29;
                } else
                    maxDay = 28;
            }
            case 3 -> maxDay = 31;
            case 4 -> maxDay = 30;
            case 5 -> maxDay = 31;
            case 6 -> maxDay = 30;
            case 7 -> maxDay = 31;
            case 8 -> maxDay = 31;
            case 9 -> maxDay = 30;
            case 10 -> maxDay = 31;
            case 11 -> maxDay = 30;
            case 12 -> maxDay = 31;
        }
        if(Day<maxDay)
        {
            Day++;
        }
        else if (Day==maxDay)
        {
            Day=1;
            if(Month==12)
            {
                Month=1;
                Year++;
            }else
                Month++;
        }
        else
        {
            Day++;
        }


        return Day+"/"+Month+"/"+Year;
    }
    public static boolean isLeapYear(int year)
    {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;

    }
}

