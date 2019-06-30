package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.EURO.getRate();
            default:
                return 1d;
        }
    }
}

