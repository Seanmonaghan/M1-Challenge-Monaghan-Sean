package com.company;

public class ConverterIf implements Converter {
    public String convertMonth(int numberedMonth) {
        String month = numberedMonth + " does not correspond with a month! Try a number between 1 - 12";

        if (numberedMonth == 1) {
            month = "January";
        } else if (numberedMonth == 2) {
            month = "February";
        } else if (numberedMonth == 3) {
            month = "March";
        } else if (numberedMonth == 4) {
            month = "April";
        } else if (numberedMonth == 5) {
            month = "May";
        } else if (numberedMonth == 6) {
            month = "June";
        } else if (numberedMonth == 7) {
            month = "July";
        } else if (numberedMonth == 8) {
            month = "August";
        } else if (numberedMonth == 9) {
            month = "September";
        } else if (numberedMonth == 10) {
            month = "October";
        } else if (numberedMonth == 11) {
            month = "November";
        } else if (numberedMonth == 12) {
            month = "December";
        }

        return month;
    }

    public String convertDay(int numberedDay) {
        String day = numberedDay + " does not correspond with a day! Try a number between 1 - 7";

        if (numberedDay == 1) {
            day = "Sunday";
        } else if (numberedDay == 2) {
            day = "Monday";
        } else if (numberedDay == 3) {
            day = "Tuesday";
        } else if (numberedDay == 4) {
            day = "Wednesday";
        } else if (numberedDay == 5) {
            day = "Thursday";
        } else if (numberedDay == 6) {
            day = "Friday";
        } else if (numberedDay == 7) {
            day = "Saturday";
        }
        return day;
    }

}
