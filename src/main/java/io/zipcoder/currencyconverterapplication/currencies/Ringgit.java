package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.RINGGIT.getRate();
            default:
                return 1d;
        }
    }
}
