package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {

    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.YEN.getRate();
            default:
                return 1d;
        }
    }
}
