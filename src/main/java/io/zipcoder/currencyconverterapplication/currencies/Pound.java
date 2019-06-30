package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.POUND.getRate();
            default:
                return 1d;
        }
    }
}
