package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.RUPEE.getRate();
            default:
                return 1d;
        }
    }
}
