package com.company;

public class ConverterApplication {
    public static void main(String[] args) {

        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("ConverterIf - Converting Numbered Days to Written Days");
        System.out.println(converterIf.convertDay(4));
        System.out.println(converterIf.convertDay(-1));
        System.out.println(converterIf.convertDay(15));

        System.out.println("=======================================");
        System.out.println("ConverterIf - Converting Numbered Months to Written Months");
        System.out.println(converterIf.convertMonth(4));
        System.out.println(converterIf.convertMonth(-1));
        System.out.println(converterIf.convertMonth(15));

        System.out.println("=======================================");
        System.out.println("ConverterSwitch - Converting Numbered Days to Written Days");
        System.out.println(converterSwitch.convertDay(4));
        System.out.println(converterSwitch.convertDay(-1));
        System.out.println(converterSwitch.convertDay(15));

        System.out.println("=======================================");
        System.out.println("ConverterSwitch - Converting Numbered Months to Written Months");
        System.out.println(converterSwitch.convertMonth(4));
        System.out.println(converterSwitch.convertMonth(-1));
        System.out.println(converterSwitch.convertMonth(15));

    }
}
