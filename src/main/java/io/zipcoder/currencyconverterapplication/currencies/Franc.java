package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.FRANC.getRate();
            default:
                return 1d;
        }
    }
}
