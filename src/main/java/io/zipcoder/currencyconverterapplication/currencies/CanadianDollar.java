package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
            default:
                return 1d;
        }
    }
}
