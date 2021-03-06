package com.company;

public class ConverterSwitch implements Converter {
    public String convertMonth(int numberedMonth) {

        String month = "";

        switch (numberedMonth) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = numberedMonth + " does not correspond with a month! Try a number between 1 - 12";
                break;
        }
        return month;
    }

    public String convertDay(int numberedDay) {
        String day = "";

        switch (numberedDay) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = numberedDay + " does not correspond with a day! Try a number between 1 - 7";
                break;
        }
        return day;
    }
}
